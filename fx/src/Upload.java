import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
/**
 *  Class Upload is a class to represent a picture where there are an arrow in the middle upper
 *  and a hollow in the middle lower.
 *  @version 2019-12-03
 *  @author TIANHE YANG
 */
public class Upload extends Application {
    // width is the thickness of arrow and hollow
    private static double width = 30;
    //  x_size is the width of the panel in pixels. Set to 40*width.
    private static double x_size = width*40;
    //  y_size is the width of the panel in pixels. Set to 30*width.
    private static double y_size = width*30;
    // bounder is the distance of the top of an arrow and the top of the panel, which will be bounder*width
    private static double bounder = 8;

    /**
     * setWidth is to set the width to new one
     * update x_size and y_size.
     */
    public void setWidth(double width){
        this.width = width;
        this.x_size = width*40;
        this.y_size = width*30;
    }

    
    @Override
    public void start(Stage stage) throws Exception {
        // Create a Group (scene graph).
        Group root = new Group();
        // draw an arrow.
        Polygon arrow =  new Polygon();
        arrow.getPoints().addAll(
                x_size/2,bounder*width,
                x_size/2-1.5*width,bounder*width+width,
                x_size/2-0.5*width,bounder*width+width,
                x_size/2-0.5*width,bounder*width+4*width,
                x_size/2+0.5*width,bounder*width+4*width,
                x_size/2+0.5*width,bounder*width+width,
                x_size/2+1.5*width, bounder*width+width
        );
        root.getChildren().add(arrow);

        // draw a hollow.
        Polygon hollow = new Polygon(
                x_size/2-3.5*width,bounder*width+2*width,
                x_size/2-2.5*width,bounder*width+2*width,
                x_size/2-2.5*width,bounder*width+5*width,
                x_size/2+2.5*width,bounder*width+5*width,
                x_size/2+2.5*width,bounder*width+2*width,
                x_size/2+3.5*width,bounder*width+2*width,
                x_size/2+3.5*width,bounder*width+6*width,
                x_size/2-3.5*width,bounder*width+6*width
        );
        root.getChildren().add(hollow);

        // show the picture having been generated.
        Scene scene = new Scene(root, x_size, y_size);
        stage.setTitle("Polygons");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * main method to launch the application.
     * @param args
     */
    public static void main(String[] args){ launch(args);}
}
