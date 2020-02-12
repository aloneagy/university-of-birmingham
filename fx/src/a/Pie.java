//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Line;
//import javafx.scene.text.Text;
//import javafx.stage.Stage;
//
//import java.util.Arrays;
//
//
///**
// * @author zyn
// * @description The class is to represent expenditures as a pie chart
// * @date 2019-11-20 20:20
// */
//public class Pie extends Application {
//    //Expenditure array which stores all expenditures
//    private static Expenditure[] expenditureArray;
//    //maximum expenditures for Waffle and default value is 8;
//    private static int maximum = 8;
//    //X_OFFSET moves the board on the x-axis out of the left upper corner for waffle.
//    private static final int X_OFFSET = 400;
//    //Y_OFFSET moves the board on the y-axis out of the left upper corner for waffle.
//    private static final int Y_OFFSET = 400;
//    //radius for circle
//    private static final int radius = 150;
//    //sacling factor for TEXT_POSITION_FACTOR_X
//    private static final double TEXT_POSITION_FACTOR_X = 7.8;
//    //sacling factor for TEXT_POSITION_FACTOR_Y
//    private static final double TEXT_POSITION_FACTOR_Y = 3.5;
//
//
//    /**
//     * @param stage : stage to show
//     * @return void
//     * @description: the method is to draw a pie chart for expenditures
//     */
//    @Override
//    public void start(Stage stage) throws Exception {
//        // Create a Group.
//        Group root = new Group();
//
//        //draw a circle
//        Circle circle = new Circle(X_OFFSET, Y_OFFSET, radius);
//        circle.setFill(null);
//        circle.setStroke(Color.BLACK);
//        root.getChildren().add(circle);
//
//        //sort and calculate data
//        expenditureArray = solveData(expenditureArray);
//
//        //draw lines
//        Line[] lines = makeLine(expenditureArray);
//        for (Line line : lines) {
//            root.getChildren().add(line);
//        }
//
//        //draw texts
//        Text[] texts = makeText(expenditureArray);
//        for (Text text : texts) {
//            root.getChildren().add(text);
//        }
//
//        Scene scene = new Scene(root, 800, 800);
//        stage.setTitle("Pie");
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    /**
//     * @return javafx.scene.shape.Line[] : return line according to percentage of each expenditure
//     * @description: draw line according to percentage of each expenditure
//     */
//    public Line[] makeLine(Expenditure[] expenditureArray) {
//        if (expenditureArray.length == 1) {
//            return new Line[]{};
//        }
//        Line[] lines = new Line[expenditureArray.length];
//        Double[] coordinates = new Double[2 * expenditureArray.length];
//        double angle = 0;
//        for (int i = 0; i < expenditureArray.length; i++) {
//            coordinates[2 * i] = X_OFFSET +
//                    //2*Math.PI = 360°
//                    radius * Math.cos(2 * Math.PI * (angle + expenditureArray[i].getPercentage() / 100.0));
//            coordinates[2 * i + 1] = Y_OFFSET +
//                    radius * Math.sin(2 * Math.PI * (angle + expenditureArray[i].getPercentage() / 100.0));
//            angle += expenditureArray[i].getPercentage() / 100.0;
//        }
//        for (int i = 0; i < expenditureArray.length; i++) {
//            lines[i] = new Line(X_OFFSET, Y_OFFSET, coordinates[2 * i], coordinates[2 * i + 1]);
//        }
//        return lines;
//    }
//
//    /**
//     * @return javafx.scene.text.Text[] : return texts of each expenditure
//     * @description: draw texts of each expenditure
//     */
//    public Text[] makeText(Expenditure[] expenditureArray) {
//        Text[] texts = new Text[expenditureArray.length];
//        Double[] coordinates = new Double[2 * expenditureArray.length];
//        double angle = 0;
//        for (int i = 0; i < expenditureArray.length; i++) {
//            coordinates[2 * i] = X_OFFSET +
//                    //2*Math.PI = 360°
//                    (radius + expenditureArray[i].getDescription().length() * TEXT_POSITION_FACTOR_X) * Math.cos(2 * Math.PI * (angle + expenditureArray[i].getPercentage() / 200.0));
//            coordinates[2 * i + 1] = Y_OFFSET +
//                    (radius + expenditureArray[i].getDescription().length() * TEXT_POSITION_FACTOR_Y) * Math.sin(2 * Math.PI * (angle + expenditureArray[i].getPercentage() / 200.0));
//            angle += expenditureArray[i].getPercentage() / 100.0;
//        }
//        for (int i = 0; i < expenditureArray.length; i++) {
//            texts[i] = new Text(coordinates[2 * i], coordinates[2 * i + 1], expenditureArray[i].getDescription());
//        }
//        return texts;
//    }
//
//    /**
//     * @return void
//     * @description: solveData method is to sort and calculate percentage of every expenditure
//     */
//    public Expenditure[] solveData(Expenditure[] expenditureArray) {
//        //sort ExpenditureList from biggest to smallest value
//        Arrays.sort(expenditureArray, (exp1, exp2) -> exp2.getValue() - exp1.getValue());
//        //calculate the sum value of ExpenditureList
//        double sum = 0;
//        for (Expenditure expenditure : expenditureArray) {
//            sum += expenditure.getValue();
//        }
//        //calculate the percentage of every expenditure and store it percentage of expenditure
//        for (Expenditure expenditure : expenditureArray) {
//            expenditure.setPercentage((int) Math.round(expenditure.getValue() / sum * 100));
//        }
//
//        //if ExpenditureList.size() <= maximum, to avoid tolerance, percentage of the last element will be reset.
//        if (expenditureArray.length <= maximum) {
//            //declare sum_Percentage
//            int sum_Percentage_Exclude_Last_One = 0;
//            //calculate sum_Percentage_Exclude_Last_One
//            for (int i = 0; i < expenditureArray.length - 1; i++) {
//                sum_Percentage_Exclude_Last_One += expenditureArray[i].getPercentage();
//            }
//            //reset persentage of the last element
//            expenditureArray[expenditureArray.length - 1].setPercentage(100 - sum_Percentage_Exclude_Last_One);
//            return expenditureArray;
//        }
//        //else:ExpenditureList.size() > maximum, calculate and reset the data.
//        else {
//            //declare sum_Percentage_Exclude_Other
//            int sum_Percentage_Exclude_Other = 0;
//            //calculate sum_Percentage excluding other
//            for (int i = 0; i < maximum - 1; i++) {
//                sum_Percentage_Exclude_Other += expenditureArray[i].getPercentage();
//            }
//            int other_Sum_Percentage = 100 - sum_Percentage_Exclude_Other;
//            //remove other expenditures from ExpenditureList
//            expenditureArray[maximum - 1] = new Expenditure(other_Sum_Percentage, "Other");
//            Expenditure[] expenditures = new Expenditure[maximum];
//            for (int i = 0; i < expenditures.length; i++) {
//                expenditures[i] = expenditureArray[i];
//            }
//            return expenditures;
//        }
//    }
//
//    /**
//     * @param maximum
//     * @return void
//     * @description: Setter for maximum and the value can not greater than the length of color array which is 10.
//     */
//    public static void setMaximum(int maximum) {
//        Pie.maximum = maximum;
//    }
//
//    /**
//     * @param args
//     * @return void
//     * @description: launch javaFx to draw expenditures as a pie chart
//     */
//    public static void main(String[] args) {
//        setMaximum(8);
//        expenditureArray = new Expenditure[]{
//                new Expenditure("Salaries", 11000),
//                new Expenditure("Paper", 2000),
//                new Expenditure("Rent", 5000),
//                new Expenditure("Most popular books on Java etc.", 10000),
//                new Expenditure("Heating", 3000),
//                new Expenditure("Coffee/Tea", 7000),
//                new Expenditure("Biscuits", 8000),
//                new Expenditure("Travel", 18000),
//                new Expenditure("Electricity", 1000),
//                new Expenditure("Pencils", 3000)};
//
//        launch();
//    }
//}
