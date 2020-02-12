import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

/**
 *  This is a test class for testing the Waffle class and Expenditure class.
 *  @version 2019-12-03
 *  @author TIANHE YANG
 */
public class WaffleTests {
    Expenditure expenditure = new Expenditure("Dinner",100);

    /**
     * getDescriptionTest is a test case for testing the getDescription method of getDescriptionTest.
     */
    @Test
    public void getDescriptionTest(){
        assertEquals("Dinner",expenditure.getDescription());
    }

    /**
     * getValueTest is a test case for testing the getValue method of getDescriptionTest.
     */
    @Test
    public void getValueTest(){
        assertEquals(100,expenditure.getValue());
    }

    /**
     * setExpendituresTest is to test the setExpenditures and getExpenditures method of Waffle class.
     */
    @Test
    public void setGetExpendituresTest(){
        Expenditure[] expenditures1 = new Expenditure[]
                {new Expenditure("Salaries", 11000),
                        new Expenditure("Paper", 2000),
                        new Expenditure("Rent", 5000),
                        new Expenditure(
                                "Most popular books on Java etc.",
                                10000),
                        new Expenditure("Heating", 3000),
                        new Expenditure("Coffee/Tea", 7000),
                        new Expenditure("Biscuits", 8000),
                        new Expenditure("Travel", 18000),
                        new Expenditure("Electricity", 1000),
                        new Expenditure("Pencils", 3000)
                };
        Waffle newWaffle = new Waffle();
        newWaffle.setExpenditures(expenditures1);
        assertEquals(11000,newWaffle.getExpenditures()[0].getValue());
        assertEquals("Salaries",newWaffle.getExpenditures()[0].getDescription());
        assertEquals(3000,newWaffle.getExpenditures()[9].getValue());
        assertEquals("Pencils",newWaffle.getExpenditures()[9].getDescription());
    }

    /**
     * setGetMaximumTest is to test getMaximum and setMaximumTest method of  Waffle class when
     * the maximum is not set; the maximum is set to 0;the maximum is set to 1;the maximum is set to 6;
     * the maximum is set to 100;the maximum is set to 103 which is larger than 100.
     */
    @Test
    public void setGetMaximumTest(){
        Waffle newWaffle = new Waffle();
        assertEquals(8,newWaffle.getMaximum());
        newWaffle.setMaximum(0);
        assertEquals(8,newWaffle.getMaximum());
        newWaffle.setMaximum(1);
        assertEquals(1,newWaffle.getMaximum());
        newWaffle.setMaximum(6);
        assertEquals(6,newWaffle.getMaximum());
        newWaffle.setMaximum(100);
        assertEquals(100,newWaffle.getMaximum());
        newWaffle.setMaximum(103);
        assertEquals(100,newWaffle.getMaximum());
    }

    /**
     * setColorsTest is to test the getColors and setColors method of Waffle class to check the first 8 colors are default colors
     * and other colors are different from each other.
     */
    @Test
    public void setGetColorsTest(){
        Waffle newWaffle = new Waffle();
        newWaffle.setColors();
        Color[] colors = newWaffle.getColors();
        assertEquals(Color.BLACK,colors[0]);
        assertEquals(Color.BLUE,colors[1]);
        assertEquals(Color.RED,colors[2]);
        assertEquals(Color.YELLOW,colors[3]);
        assertEquals(Color.GREEN,colors[4]);
        assertEquals(Color.BROWN,colors[5]);
        assertEquals(Color.PINK,colors[6]);
        assertEquals(Color.CYAN,colors[7]);
        assertFalse(colors[50].equals(colors[99]));
        assertFalse(colors[20].equals(colors[80]));
        assertFalse(colors[30].equals(colors[31]));
    }

    /**
     * sumofExpenditureTest is to test the sumofExpenditure method of Waffle class.
     */
    @Test
    public void sumofExpenditureTest(){
        Expenditure[] expenditures1 = new Expenditure[]
                {new Expenditure("Salaries", 11000),
                        new Expenditure("Paper", 2000),
                        new Expenditure("Rent", 5000),
                };
        Waffle newWaffle = new Waffle();
        newWaffle.setExpenditures(expenditures1);
        assertEquals(18000,newWaffle.sumofExpenditure());
    }
    /**
     * countSquaresTest is to test the countSquares method of Waffle class.
     */
    @Test
    public void countSquaresTest(){
        Expenditure[] expenditures1 = new Expenditure[]
                {new Expenditure("Salaries", 11000),
                        new Expenditure("Paper", 2000),
                        new Expenditure("Rent", 5000),
                        new Expenditure(
                                "Most popular books on Java etc.",
                                10000),
                };
        Waffle newWaffle = new Waffle();
        newWaffle.setExpenditures(expenditures1);
        int [] quares = newWaffle.countSquares(expenditures1.length);
        assertEquals(39,quares[0]);
        assertEquals(7,quares[1]);
        assertEquals(18,quares[2]);
        assertEquals(36,quares[3]);
    }

    /**
     * newSmallSquareTest is to test the newSmallSquare method of Waffle class.
     */
    @Test
    public void newSmallSquareTest(){
        Waffle newWaffle = new Waffle();
        newWaffle.setColors();;
        Rectangle newRectangle = newWaffle.newSmallSquare(2,5,2);
        assertEquals(410,(int)newRectangle.getX());
        assertEquals(244,(int)newRectangle.getY());
        assertEquals(20,(int)newRectangle.getWidth());
        assertEquals(20,(int)newRectangle.getHeight());
        assertEquals(Color.RED,newRectangle.getFill());
    }
    /**
     * newTextTest is to test newText method of Waffle class when expenditures.length<maximum, expenditures.length=maximum
     * and expenditures.length>maximum.
     */
    @Test
    public void newTextTest(){
        Expenditure[] expenditures1 = new Expenditure[]
                {new Expenditure("Salaries", 11000),
                        new Expenditure("Paper", 2000),
                        new Expenditure("Rent", 5000),
                        new Expenditure(
                                "Most popular books on Java etc.",
                                10000),
                };
        Waffle newWaffle = new Waffle();
        newWaffle.setColors();
        newWaffle.setExpenditures(expenditures1);
        // when expenditures.length<maximum
        newWaffle.setMaximum(5);
        Text newText = newWaffle.newText(2,3,3);
        assertEquals(344,(int)newText.getX());
        assertEquals(280,(int)newText.getY());
        assertEquals("Most popular books on Java etc.",newText.getText());
        // when expenditures.length=maximum
        newWaffle.setMaximum(4);
        Text newText1 = newWaffle.newText(1,3,3);
        assertEquals(322,(int)newText1.getX());
        assertEquals(280,(int)newText1.getY());
        assertEquals("Most popular books on Java etc.",newText1.getText());
        // when expenditures.length>maximum && m==maximum-1
        newWaffle.setMaximum(3);
        Text newText2 = newWaffle.newText(1,2,2);
        assertEquals(322,(int)newText2.getX());
        assertEquals(258,(int)newText2.getY());
        assertEquals("Other",newText2.getText());
    }
}
