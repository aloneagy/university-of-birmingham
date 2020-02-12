import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 *  This is a test class to test the Pie class.
 *  @version 2019-12-03
 *  @author TIANHE YANG
 */
public class PieTests {

    /**
     * setExpendituresTest is to test the setExpenditures and getExpenditures method of Waffle class.
     */
    @Test
    public void setGetExpendituresTest() {
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
        Pie newPie = new Pie();
        newPie.setExpenditures(expenditures1);
        assertEquals(11000, newPie.getExpenditures()[0].getValue());
        assertEquals("Salaries", newPie.getExpenditures()[0].getDescription());
        assertEquals(3000, newPie.getExpenditures()[9].getValue());
        assertEquals("Pencils", newPie.getExpenditures()[9].getDescription());
    }

    /**
     * setMaximumTest is to test setMaximumTest method of  Waffle class when
     * the maximum is not set; the maximum is set to 0;the maximum is set to 1;the maximum is set to 6;
     * the maximum is set to 100;the maximum is set to 103 which is larger than 100.
     */
    @Test
    public void setMaximumTest() {
        Pie newPie = new Pie();
        assertEquals(8, newPie.getMaximum());
        newPie.setMaximum(0);
        assertEquals(8, newPie.getMaximum());
        newPie.setMaximum(1);
        assertEquals(1, newPie.getMaximum());
        newPie.setMaximum(6);
        assertEquals(6, newPie.getMaximum());
        newPie.setMaximum(100);
        assertEquals(100, newPie.getMaximum());
        newPie.setMaximum(103);
        assertEquals(100, newPie.getMaximum());
    }

    /**
     * test Pie when expenditures list is larger than 8. In this test case, the length of the expenditures list is 10.
     */
    @Test
    public void test1() {
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
        Pie newPie = new Pie();
        newPie.setMaximum(10);

        newPie.setExpenditures(expenditures1);
        newPie.main(null);
    }
}
