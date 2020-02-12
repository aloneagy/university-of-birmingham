//import javafx.scene.shape.Line;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
///**
// * @author zyn
// * @description : Tests for Pie class
// * @date 2019-11-29 23:33
// */
//public class PieTests {
//    //Test for makeLine method
//    @Test
//    public void test1() {
//        Pie pie = new Pie();
//        Expenditure[] expenditures = {
//                new Expenditure("a", 11000),
//                new Expenditure("b", 2000),
//                new Expenditure("c", 5000),
//                new Expenditure("d", 10000),
//        };
//        expenditures = pie.solveData(expenditures);
//        Line[] actualLines = pie.makeLine(expenditures);
//        Line[] expectedLines = {new Line(400.0, 400.0, 284.4, 495.6),
//                new Line(400.0, 400.0, 400.0, 250.0),
//                new Line(400.0, 400.0, 535.7, 336.1),
//                new Line(400.0, 400.0, 550.0, 400)
//        };
//        int actualLength = actualLines.length;
//        int expectedLength = expectedLines.length;
//        assertEquals(actualLength, expectedLength, "FAULT");
//        for (int i = 0; i < actualLines.length; i++) {
//            assertEquals(actualLines[i].getStartX(), expectedLines[i].getStartX(), 0.1, "Fault");
//            assertEquals(actualLines[i].getStartY(), expectedLines[i].getStartY(), 0.1, "Fault");
//            assertEquals(actualLines[i].getEndX(), expectedLines[i].getEndX(), 0.1, "Fault");
//            assertEquals(actualLines[i].getEndY(), expectedLines[i].getEndY(), 0.1, "Fault");
//
//        }
//    }
//
//
//
//}
