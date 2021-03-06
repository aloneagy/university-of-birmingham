import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;

/**
 *  Class Waffle is a class to represent expenditures as a Waffle chart.
 *  @version 2019-12-03
 *  @author TIANHE YANG
 */
public class Waffle extends Application {

    // set the maximum number of the expenditure elements a default value 10.
    private static int maximum = 8;
    // set the small square number in each row of a Waffle chart 20.
    private static final int squareNum = 10;
    // variable expenditures stores a list of Expenditure.
    private static Expenditure[] expenditures;
    // set x position of the upper left of a Waffle chart 300.
    private static final int x_offset = 300;
    // set y position of the upper left of a Waffle chart 200.
    private static final int y_offset = 200;
    // set the small square width in a Waffle chart 20.
    private static final int squareWidth = 20;
    // set the distance between 2 small squares 2.
    private static final int squareDistance = 2;
    // colors stores the color list which is used for the color of small squares.
    private static Color[] colors = new Color[100];

    /**
     * The method getExpenditures is to return expenditures of type Expenditure[];
     * @return  a list of Expenditure.
     */
    public Expenditure[] getExpenditures(){ return expenditures;}
    /**
     * The method setExpenditures is to set the expenditure list to new expenditure list.
     * @param expenditures the expenditure list.
     */
    public void setExpenditures(Expenditure[] expenditures) {
        this.expenditures = expenditures;
    }
    /**
     * The method setMaximum is to set the maximum number of the expenditure elements to new one.
     * The new maximum must is between 1-100.
     * @param maximum the maximum number of the expenditure elements.
     */
    public void setMaximum(int maximum){
        if (maximum >=1 && maximum<=100){
            this.maximum = maximum;
        }
    }

    /**
     * The method getMaximum is to return the value of maximum.
     */
    public int getMaximum(){ return maximum;}

    /**
     * The method setColors is to generate 100 different colors and assign the global variables colors.
     * The first 8 colors are set the default colors,other following colors are generated by random.
     */
    public void setColors() {
        colors[0]= Color.BLACK;
        colors[1] = Color.BLUE;
        colors[2] = Color.RED;
        colors[3] = Color.YELLOW;
        colors[4] = Color.GREEN;
        colors[5] = Color.BROWN;
        colors[6] = Color.PINK;
        colors[7] = Color.CYAN;
        for(int i = 8; i < 100; i ++) {

            double hue = i*(360/100);
            double saturation = Math.random();
            double lightness = Math.random();
            Color newColor = Color.hsb(hue,saturation,lightness);
            colors[i] = newColor;
        }
    }

    /**
     * The method getColors is to return the list of colors.
     */
    public Color[] getColors(){ return colors;}



    /**
     * The method sumofExpenditure is to count the sum of expenditures' value.
     * @return the sum of expenditures' value.
     */
    public int sumofExpenditure(){
        int sum = 0;
        int length = expenditures.length;

        for (int i=0;i<length;i++){
            sum+=expenditures[i].getValue();
        }
        return sum;
    }

    /**
     * countSquares is to the number of small squares of each expenditure type.
     * the number of last expenditure type will be the result of the sum of total value subtracting the sum of total value
     * except the value of last one.
     */
    public int[] countSquares(int length){
        int[] quares;
        int number = squareNum*squareNum;
        int sum = sumofExpenditure();
        int sum1 = 0;
        quares = new int[length];
        for (int i=0;i<length-1;i++){
            float count = (float)expenditures[i].getValue()/sum*number;
            quares[i]= Math.round(count);
            sum1+=quares[i];
        }
        quares[length-1] = number-sum1;
        return quares;
    }

    /**
     * newSmallSquare is to generate a small rectangle with x-axis, y-axis and the color.
     * @param i representing the i row of a waffle chart.
     * @param j representing the j column of a waffle chart.
     * @param m representing the m element of an expenditure list.
     */
    public Rectangle newSmallSquare(int i,int j,int m){
        Rectangle rectangle = new Rectangle(x_offset +j*(squareDistance+squareWidth),
                y_offset +i*(squareDistance+squareWidth),squareWidth,squareWidth);
        rectangle.setFill(colors[m]);
        return rectangle;
    }

    /**
     * newText is to generate a Text with x-axis, y-axis and the description.
     * if expenditures's length>maximum && m is the last element, the description of this Text would be "Other".
     * @param i representing the i column of a waffle chart.
     * @param j representing the j row of a waffle chart
     * @param m representing the m element of an expenditure list.
     */
    public Text newText(int i,int j,int m){

        return (expenditures.length>maximum && m==maximum-1)?
                new Text(x_offset +i*(squareDistance+squareWidth),
                y_offset +j*(squareDistance+squareWidth)+14,"Other")
                :new Text(x_offset +i*(squareDistance+squareWidth),
                y_offset +j*(squareDistance+squareWidth)+14,expenditures[m].getDescription());
    }

    /**
     * start to draw a waffle chart representing expenditures with color tag and text tag.
     * @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Create a Group (scene graph).
        Group root = new Group();
        // Firstly, initialize the colors.
        setColors();
        // try to catch the error. If no error occurs, continue to draw a waffle chart.
        try{
            // try to catch the error. If no error occurs, continue to draw a pie chart.
            Arrays.sort(expenditures, (exp1, exp2) ->
                    exp2.getValue() - exp1.getValue());

            // variable l is set to store the number of small squares having been drawn.
            int l = 0;
            // variable m is set to store the index of squares.
            int m = 0;
            // variable length stores the number of the expenditures element which needs to present.
            // If the expenditure list is larger than maximum, the length would be maximum.
            // Else the length would be the length of the expenditure list.
            int length = (expenditures.length>=maximum)?maximum:expenditures.length;
            // counting the number of small squares of each expenditure type.
            int[] squaresList = countSquares(length);
            // variable sum is set to store the sum of the number of small squares.
            int sum = squaresList[0];
            // draw the main part of a waffle chart.
            for(int i=0;i<squareNum;i++){
                for (int j=0;j<squareNum;j++){
                    l=i*squareNum+j;
                    if (sum<=l){
                        m++;
                        sum+=squaresList[m];
                    }
                    root.getChildren().add(newSmallSquare(i,j,m));
                }
            }
            // draw color tag squares of expenditures and tag text of expenditures
            for (int i=0;i<length;i++){
                root.getChildren().add(newSmallSquare(i+1,squareNum+2,i));
                root.getChildren().add(newText(squareNum+3,i+1,i));
            }
        }
        // catch the error and print the error.
        catch (Exception e){
            System.out.println("The expenditures is null.");
        }
        // show the waffle chart having been generated.
        Scene scene = new Scene(root,1200,1200+(squareWidth+squareDistance)*maximum);
        stage.setTitle("Waffle");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * main method to launch the application.
     * @param args the parameter from the control console.
     */
    public static void main(String[] args) {
        expenditures =
                new Expenditure[]
                        {new Expenditure("Salaries", 11000),
                                new Expenditure("Paper", 2000),
                                new Expenditure("Rent", 5000),
                                new Expenditure("Most popular books on Java etc.", 10000),
                                new Expenditure("Heating", 3000),
                                new Expenditure("Coffee/Tea", 7000),
                                new Expenditure("Biscuits", 8000),
                                new Expenditure("Travel", 18000),
                                new Expenditure("Electricity", 1000),
                                new Expenditure("Pencils", 3000)
                        };
        Waffle newWaffle = new Waffle();
        newWaffle.setExpenditures(expenditures);
        launch();
    }
}
