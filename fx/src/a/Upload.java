package a;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
/**
 * @author zyn
 * @description : this class is to draw a sign of upload.
 * @date 2019-11-29 11:48
 */

public class Upload extends Application {
    //X is the distance between the point and the border of the scene. Set to 300.
     public static final int x=300;
    //y is the distance between the point and the border of the scene. Set to 300.
    public static final int y=300;
    @Override

    public void start(Stage stage) throws Exception {
        //draw the sign of bottom part.
        Polygon bottom=new Polygon(150 + x, 0 + y, 200 + x, 0 + y,
                200 + x, 200 + y, -200 + x, 200 + y, -200 + x, 0 + y, -150
                + x, 0 + y, -150 + x, 150 + y, 150 + x, 150 + y);
        //draw the sign of top part.
        Polygon top = new Polygon(0 + x, -100 + y, 75 + x, -50 + y,
                25 + x, -50 + y, 25 + x, 100 + y, -25 + x, 100 + y, -25
                + x, -50 + y, -75 + x, -50 + y);

        Group root=new Group(bottom,top);
        Scene scene=new Scene(root,600,600);
        stage.setTitle("Upload");
        stage.setScene(scene);
        stage.show();

    }
    /**
     * @param args
     * @return void
     * @description: launch javaFx to draw a sign of upload
     */
    public static void main(String[] args) {
        launch(args);
    }
}
