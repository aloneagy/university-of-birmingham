//import javafx.application.Application;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.paint.Color;
//import javafx.scene.shape.Rectangle;
//import javafx.stage.Stage;
//import javafx.scene.text.Text;
//
//import java.util.Arrays;
//
//
///**
// * @author zyn
// * @description : the class is to draw and  represent expenditures as a Waffle chart
// * @date 2019-11-29 12:03
// */
//public class Waffle extends Application {
//    //Expenditure array which stores all expenditures
//    private static Expenditure[] expenditureArray;
//    //Expenditure array used for tests
//    private static Expenditure[] expenditureTestArray;
//    //maximum expenditures for Waffle
//    private static final int maximum = 8;
//    //X_OFFSET moves the board on the x-axis out of the left upper corner for waffle.
//    private static final int X_OFFSET = 200;
//    //Y_OFFSET moves the board on the y-axis out of the left upper corner for waffle.
//    private static final int Y_OFFSET = 200;
//    //SMALL_SIZE is the width and height of a small squares of the board.
//    private static final int SMALL_SIZE = 50;
//    //X-axis interval for each waffle square
//    private static int interval_x = 5;
//    //Y-axis interval for each waffle square
//    private static int interval_y = 5;
//    //X_OFFSET moves the board on the x-axis out of the left upper corner for annotation square.
//    private static final int X_OFFSET_ANNOTATOPN_SQUARE = X_OFFSET + 12 * SMALL_SIZE;
//    //Y_OFFSET moves the board on the y-axis out of the left upper corner for annotation square.
//    private static final int Y_OFFSET_ANNOTATOPN_SQUARE = Y_OFFSET;
//    //Y-axis interval for each annotation square
//    private static int annotation_interval_y = 5;
//    //X_OFFSET for each annotation text square
//    private static final int X_OFFSET_Text = X_OFFSET_ANNOTATOPN_SQUARE + SMALL_SIZE;
//    //Y_OFFSET for each annotation text square
//    private static final int Y_OFFSET_Text = Y_OFFSET_ANNOTATOPN_SQUARE + SMALL_SIZE / 2 + annotation_interval_y;
//    //Y-axis interval for each annotation text
//    private static int annotation_text_interval_y = 5;
//
//    //Color arr
//    Color[] colors;
//
//    @Override
//    public void start(Stage stage) throws Exception {
//        // Create a Group.
//        Group root = new Group();
//
//        //create waffle squares
//        Rectangle[][] waffle = makeSquares();
//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 10; j++) {
//                root.getChildren().add(waffle[i][j]);
//            }
//        }
//
//        //create annotation squares
//        Rectangle[] annotation = makeAnnotationSquare();
//        for (Rectangle rectangle : annotation) {
//            root.getChildren().add(rectangle);
//        }
//
//        //create annotation text
//        Text[] texts = makeAnnotationText();
//        for (Text text : texts) {
//            root.getChildren().add(text);
//        }
//
//        //set scene
//        int SCENE_WIDTH = X_OFFSET * 4 + SMALL_SIZE * (waffle[0].length);
//        int SCENE_HEIGHT = Y_OFFSET * 2 + SMALL_SIZE * (waffle.length);
//        Scene scene = new Scene(root, SCENE_WIDTH, SCENE_HEIGHT);
//        stage.setTitle("waffle");
//        stage.setScene(scene);
//        stage.show();
//
//    }
//
//    /**
//     * @return A two-dimensional array of squares forming the
//     * waffle given as the x-position, y-position, x-size,
//     * y-size. They are alternatingly coloured.
//     */
//    public Rectangle[][] makeSquares() {
//        //solve data first
//        expenditureArray = solveData(expenditureArray);
//        //declare array type of Rectangle to store 100 squares
//        Rectangle[][] squares = new Rectangle[10][10];
//        //declare array type of Color to store 8 colors
//        colors = new Color[]{Color.BLACK, Color.BLUE, Color.RED, Color.YELLOW, Color.GREEN, Color.ORANGE, Color.DARKBLUE, Color.LIGHTBLUE};
//        //control colors index
//        int color = 0;
//        //control row
//        int i=0;
//        int j=0;
//                //control which expenditure to draw
//                for (int k = 0; k < expenditureArray.length; k++) {
//                    //control how many squares to draw
//                    for (int h = 0; h < expenditureArray[k].getPercentage(); h++) {
//                        if (i < 10 && j < 10) {
//                            squares[i][j] =
//                                    new Rectangle(X_OFFSET + j * SMALL_SIZE + interval_x, Y_OFFSET + i * SMALL_SIZE + interval_y,
//                                            SMALL_SIZE, SMALL_SIZE);
//                            //set color for square
//                            squares[i][j].setFill(colors[color]);
//                            //interval_y add 5
//                            interval_x += 5;
//                            j++;
//                            //if column >10
//                            if (j > 9) {
//                                //change to next line
//                                i++;
//                                //reset column to the first position
//                                j = 0;
//                                //interval_y add 5
//                                interval_y += 5;
//                                //reset interval_x to 5
//                                interval_x = 5;
//                            }
//                        }
//                    }
//                    //when finishing drawing one expenditure,change the color to next
//                    color++;
//                }
//
//        return squares;
//    }
//
//    /*
//     * @return javafx.scene.shape.Rectangle[]
//     * @description: this method is to generate annotation square
//     */
//    public Rectangle[] makeAnnotationSquare() {
//        Rectangle[] annotationSquares = new Rectangle[expenditureArray.length];
//        for (int i = 0; i < expenditureArray.length; i++) {
//            annotationSquares[i] = new Rectangle(X_OFFSET_ANNOTATOPN_SQUARE,
//                    Y_OFFSET_ANNOTATOPN_SQUARE + i * SMALL_SIZE + annotation_interval_y,
//                    SMALL_SIZE, SMALL_SIZE);
//            annotationSquares[i].setFill(colors[i]);
//            annotation_interval_y += 5;
//        }
//        return annotationSquares;
//    }
//
//    /*
//     * @return javafx.scene.shape.Rectangle[]
//     * @description: this method is to generate annotation square
//     */
//    public Text[] makeAnnotationText() {
//        Text[] textSquares = new Text[expenditureArray.length];
//        for (int i = 0; i < expenditureArray.length; i++) {
//            textSquares[i] = new Text(X_OFFSET_Text,
//                    Y_OFFSET_Text + i * SMALL_SIZE + annotation_text_interval_y,
//                    expenditureArray[i].getDescription());
//            annotation_text_interval_y += 5;
//        }
//        return textSquares;
//    }
//
//
//    /*
//     * @return void
//     * @description:  solveData method is to sort and calculaye percentage of every expenditure
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
//            int sum07 = 0;
//            //calculate sum_Percentage_exclude_last_one
//            for (int i = 0; i < expenditureArray.length - 1; i++) {
//                sum07 += expenditureArray[i].getPercentage();
//            }
//            //reset persentage of the last element
//            expenditureArray[expenditureArray.length - 1].setPercentage(100 - sum07);
//        }
//        //else:ExpenditureList.size() > maximum, calculate and reset the date of index 7.
//        else {
//            //declare sum_Percentage
//            int sum_Percentage_1to7 = 0;
//            //calculate sum_Percentage_1to7
//            for (int i = 0; i < 7; i++) {
//                sum_Percentage_1to7 += expenditureArray[i].getPercentage();
//            }
//            int other_Sum_Percentage = 100 - sum_Percentage_1to7;
//            //remove other expenditures from ExpenditureList
//            expenditureArray[7] = new Expenditure(other_Sum_Percentage, "Other");
//            Expenditure[] expenditures = new Expenditure[8];
//            for (int i = 0; i < expenditures.length; i++) {
//                expenditures[i] = expenditureArray[i];
//            }
//            expenditureArray = expenditures;
//        }
//        return expenditureArray;
//    }
//
//    //main method for test
//    public static void main(String[] args) {
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
//        if(expenditureTestArray!=null){
//            expenditureArray = expenditureTestArray;
//        }
//        launch();
//    }
//
//    public void setExpenditureArray(Expenditure[] expenditureArray) {
//        this.expenditureArray = expenditureArray;
//    }
//}
