
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.util.Arrays;
/**
 *  Class Pie is a class to represent expenditures as a pie chart.
 *  @version 2019-12-03
 *  @author TIANHE YANG
 */
public class Pie extends Application {

    // set the maximum number of the expenditure element
    private static int maximum = 8;
    // variable expenditures stores a list of Expenditure.
    private static Expenditure[] expenditures;
    // set x position of circle center 450.
    private static final int centerX = 450;
    // set y position of circle center 300
    private static final int centerY =300;
    // set the radius of circle 150
    private static final int radius= 150;
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
     * sumofExpenditure is to count the sum of expenditures' value.
     * @return the sum of expenditures' value.
     */
    public int sumofExpenditure(){
        int length = expenditures.length;
        int sum = 0;
        for (int i=0;i<length;i++){
            sum+=expenditures[i].getValue();
        }
        return sum;
    }

    /**
     * The method getMaximum is to return the value of maximum.
     * @return the maximum number of the expenditure elements.
     */
    public int getMaximum(){ return maximum;}
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
     * The method countTextX is to compute the x-axis of the text tag and return the x-axis.
     * @param textAngle the angle of the corresponding description text and start description text.
     * @param textRadius the distance of the text and the centre of the circle;
     * @param textString the content of the text tag
     * @return
     */
    public int countTextX(double textAngle,int textRadius,String textString){
        return (textAngle>Math.PI/2 && textAngle<3*Math.PI/2)?
                (int) (centerX + textRadius * Math.cos(-textAngle)-7*textString.length()):
                //(int) (centerX + textRadius * Math.cos(-textAngle)-7*textString.getBoundsInLocal().getWidth):
                (int) (centerX + textRadius * Math.cos(-textAngle));
    }

    /**
     * start to display the expenditures as a pie chart with the description placed next to the corresponding part of
     * the pie chart with text tags.
     * @param stage The window to be displayed.
     * @throws Exception the error of the method
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Create a Group (scene graph).
        Group root = new Group();
        // try to catch the error. If no error occurs, continue to draw a pie chart.
        try{
            // draw a circle with white fill and black stroke
            Circle circle = new Circle(centerX,centerY,radius);
            circle.setStroke(Color.BLACK);
            circle.setFill(Color.WHITE);
            root.getChildren().add(circle);

            // sort an array of type Expenditure from biggest to smallest
            Arrays.sort(expenditures, (exp1, exp2) ->
                    exp2.getValue() - exp1.getValue());

            /*
            * variable length stores the number of the expenditures element which needs to present.
            * If the expenditure list is larger than maximum, the length would be maximum.
            * Else the length would be the length of the expenditure list.
            */
            int length = (expenditures.length>=maximum)?maximum:expenditures.length;
            // variable sum is set to store the sum of all the values of expenditures.
            int sum = sumofExpenditure();
            // variable x represents the x-axis of the line end point which in the circle.
            int x;
            // variable y represents the y-axis of the line end point which in the circle.
            int y;
            // variable angle stores the angle of the corresponding line and start line.
            double angle = 0;
            // variable textX represents the x-axis of the description text.
            int textX;
            // variable textY represents the y-axis of the description text.
            int textY;
            // variable textString represents the text content of the description text.
            String textString;
            // set the textRadius radius+20;
            int textRadius = radius+20;
            // variable textAngle stores the angle of the corresponding description text and start description text.
            double textAngle;
            // draw the start line if length>1.
            if (length>1){
                Line firstLine = new Line(centerX,centerY,centerX+radius,centerY);
                root.getChildren().add(firstLine);
            }
            int i;
            // draw the line of a pie chart and the corresponding description text.
            for (i=0;i<length-1;i++){
                // generate new line which divides the pie chart.
                angle += 2*Math.PI*expenditures[i].getValue()/sum;
                x = (int) (centerX+radius*Math.cos(-angle));
                y = (int) (centerY+radius*Math.sin(-angle));
                Line newLine = new Line(centerX,centerY,x,y);
                root.getChildren().add(newLine);

                // generate the description text placed next to the corresponding part of the pie chart.
                Text newText;
                textAngle = angle-Math.PI*expenditures[i].getValue()/sum;
                textString = expenditures[i].getDescription();
                textX = countTextX(textAngle,textRadius,textString);
                textY = (int) (centerY + textRadius * Math.sin(-textAngle));
                newText = new Text(textX,textY,textString);
                root.getChildren().add(newText);
            }

            // generate the last description text to the corresponding part of the pie chart.
            Text newText;
            textAngle = angle+Math.PI*expenditures[i].getValue()/sum;
            textString = (expenditures.length>maximum && i==maximum-1)?
                    "Other":
                    expenditures[i].getDescription();
            textX = countTextX(textAngle,textRadius,textString);
            textY = (int) (centerY + textRadius * Math.sin(-textAngle));
            newText = new Text(textX,textY,textString);
            root.getChildren().add(newText);

        }
        // catch the error and print the error.
        catch (Exception e){
            System.out.println("The expenditures is null.");
        }
        // show the pie chart having been generated.
        Scene scene = new Scene(root,1000,1000);
        stage.setTitle("Pie");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * main method to launch the application.
     * @param args the parameter from the control console.
     */
    public static void main(String[] args){
        expenditures =
                new Expenditure[]
                        {new Expenditure("Salaries", 11000),
                                new Expenditure("Paper", 11000),
                                new Expenditure("Rent", 5000),
                                new Expenditure("Most popular books on Java etc.", 10000),
                                new Expenditure("Heating", 3000),
                                new Expenditure("Coffee/Tea", 7000),
                                new Expenditure("Biscuits", 8000),
                                new Expenditure("Travel", 18000),
                                new Expenditure("Electricity", 1000),
                                new Expenditure("Pencils", 3000)
                        };
        Pie newPie = new Pie();
        newPie.setExpenditures(expenditures);
        launch();
    }
}
