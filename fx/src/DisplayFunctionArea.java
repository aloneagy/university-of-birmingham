import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

import java.util.function.Function;

/**
 *  @version 2019-12-03
 *  @author TIANHE YANG
 */
public class DisplayFunctionArea extends Application{

    /** X_SIZE is the width of the panel in pixels. Set to 600.
     */
    public static final int X_SIZE = 600;

    /** Y_SIZE the height of the panel in pixels. Set to 600.
     */
    public static final int Y_SIZE = 600;

    /**
     *  f is the function to be displayed. We introduce it as a global
     *  variable so that it can be used in the start method, but be
     *  defined in the main method.
     */
    private static Function<Double,Double> f;

    /** 
      * a is the left border of the interval on which the function is
      * to be displayed. We introduce it as a global variable so that
      * it can be used in the start method, but be defined in the main
      * method.
      */
    private static double a;

    /**
      * b is the right border of the interval on which the function is
      * to be displayed. We introduce it as a global variable so that
      * it can be used in the start method, but be defined in the main
      * method.
      */
   private static double b;

    /** min is an approximation of the minimum of f in the interval
     * [a,b]. It is introduced as a global variable so that it does
     * not have to be recomputed.
     */
    private static double min;

    /** max is an approximation of the maximum of f in the interval
     * [a,b]. It is introduced as a global variable so that it does
     * not have to be recomputed.
     */
    private static double max;

    /** 
     *  n is the granularity. More concretely, the interval [a,b] will
     *  be subdivided in n parts and on each the function will be
     *  approximated by a straight line.
     */
    private static int n;

    /**
     *  The polyline will be the approximation of the function and be displayed.
     */
    private static Polyline polyline;

    /**
     *  The polygon will be the area between the function and the
     *  x-axis.
     */
    private static Polygon polygon;

    /**
     *  The colour in which the area is displayed.
     */
    public static Color areaColour = Color.YELLOW;


    /**
     *   The method generates a polygon corresponding to the area
     *   between the function f and the x-axis in the interval [a,b].
     *   @param f The function to be drawn.
     *   @param n The number of equidistant intervals to be drawn.
     *   @param a The minimal x-value in the interval. 
     *   @param b The maximal x-value in the interval. 
     *   @return The polygon corresponding to the area between the
     *   function f and the x-axis over the interval [a,b] with
     *   granularity n.
     */
    public static Polygon functionToPolygon(Function<Double,Double> f,
                                    int n, double a, double b) {
        if (a >= b) {
            throw new IllegalArgumentException();
        } else {
            // the points stores the x values and corresponding y values of the function f.
            double[] points = new double[2*(n+1)+4];
            // the xy stores the x-axis values and corresponding y-axis values.
            double[] xy = new double[2*(n+1)+4];
            double x, y;

            // max and min are initialized the corresponding value of f(a)
            max = f.apply(a);
            min = max;
            /* Loop: Add x and y values to the corresponding arrays
             * for a, b and n-1 equidistant values in between.
             * The (x_i,y_i) values are added to the points array in pairs.
             * max and min will also be computed.
             */
            int i;
            for (i = 0; i <= n ; i++){
                x = a + (b - a) * i / n;
                y = f.apply(x);
                if(max<y)max=y;
                if (min>y)min=y;
                xy[2*i] = x;
                xy[2*i+1] = y;
            }

            /* Loop: Add x-axis and y-axis values to the corresponding arrays
             * for a, b and n-1 equidistant values in between.
             * The (x_i,y_i) values are added to the points array in pairs.
             */
            for (i = 0; i <= n ; i++){
                x = xy[2*i];
                y = xy[2*i+1];
                points[2*i]   = Math.abs(x-a)*X_SIZE/(b-a);//
                points[2*i+1] = max* Y_SIZE/(max-min)-(y*Y_SIZE/(max-min));
            }
            // add the last two points to the array so that the polygon can be closed correctly.
            y = max* Y_SIZE/(max-min);
            points[2*i]   = X_SIZE;
            points[2*i+1] = y;
            i++;
            points[2*i]   = 0;
            points[2*i+1] = y;
            // Draw graph
            return new Polygon(points);
        }
    }

    /**
     *   The method generates a polyline corresponding to the graph of
     *   function f in the interval [a,b]
     *   @param f The function to be drawn.
     *   @param n The number of equidistant intervals to be drawn.
     *   @param a The minimal x-value in the interval. 
     *   @param b The maximal x-value in the interval. 
     *   @return The polyline corresponding to the function f over the
     *   interval [a,b] with granularity n.
     */
    public static Polyline functionToPolyline(Function<Double,Double> f,
                                    int n, double a, double b) {
        if (a >= b) {
            throw new IllegalArgumentException();
        } else {
            double[] points = new double[2*(n+1)];
            int num =  2*(n+1);
            for (int i = 0; i < num; i++){
                points[i] = polygon.getPoints().get(i);
            }
            Polyline result = new Polyline(points);
            result.setStrokeWidth(3);
            return result;
        }
    }

    /**
     *   The method draws the x-axis if 0 is in the interval ]min,max[.
     *   It is assumed that the function is not constant.
     *   @param root The group to which the x-axis is to be added.
     */
    public static void drawXAxis(Group root){

        if (min < 0 && 0 < max) {
            // compute the y-axis value
            double y= max* Y_SIZE/(max-min);
            Line line = new Line(0, y,
                                 X_SIZE, y);
            line.setStrokeWidth(2);
            root.getChildren().add(line);
        }
    }

    /**
     *   The method draws the y-axis if 0 is in the interval ]a, b[.
     *   @param root The group to which the y-axis is to be added.
     */
    public static void drawYAxis(Group root){
        if (a < 0 && 0 < b) {
            // compute the x-axis value
            double x = (0-a)* X_SIZE/(b-a);
            Line line = new Line(x, 0,
                    x, Y_SIZE);
            line.setStrokeWidth(2);
            root.getChildren().add(line);
        }
    }
    

    /**
     * start to display the area between a function and the x-axis.
     *  @param stage The window to be displayed.
     */
    @Override
    public void start(Stage stage) throws Exception {
        // Create a Group (scene graph) with the line as single element.
        Group root = new Group();
        // the max, min, x-axis and y-axis are computed in polygon firstly so swap polygon and polyline of original code;
        root.getChildren().add(polygon);
        root.getChildren().add(polyline);

        drawXAxis(root);
        drawYAxis(root);

        // The scene consists of just one group.
        Scene scene = new Scene(root, X_SIZE,Y_SIZE);

        // Give the stage (window) a title and add the scene.
        stage.setTitle("Function Graph");
        stage.setScene(scene);
        stage.show();
    }

    
    /**
     *  The method gives values to the static variables polygon and polyline.
     *  @param f The function to be displayed.
     *  @param numberOfValues The number of points on the polyline.
     *  @param left The left border of the interval to be displayed.
     *  @param right The right border of the interval to be displayed.
     */
    public static void displayFunctionArea(Function<Double, Double> f,
                                           double left, double right, int numberOfValues){

        /**
         *  n is the granularity. More concretely, the interval [a,b] will
         *  be subdivided in n parts and on each the function will be
         *  approximated by a straight line.
         */
        polygon = functionToPolygon(f, n, left, right);
        polyline = functionToPolyline(f, n, left, right);
        polygon.setFill(areaColour);
    }

    /**
     * main method to launch the application.
     * @param args the parameter from the control console.
     */
    public static void main(String[] args) {
        a = -2;
        b = 9;
        f = x -> x*x*x - 8 * x * x;
        /**
         *  n is the granularity. More concretely, the interval [a,b] will
         *  be subdivided in n parts and on each the function will be
         *  approximated by a straight line.
         */
        n = 500;
        displayFunctionArea(f, -2, 9, n);
        launch(args);
    }
}
