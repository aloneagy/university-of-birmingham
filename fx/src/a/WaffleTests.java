//
//
///**
// * @author zyn
// * @description : Tests for Pie class
// * @date 2019-11-29 23:33
// */
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class WaffleTests {
//
//    //Test getters and setters for Expenditure
//    @Test
//    public void test1() {
//        Expenditure  rent = new Expenditure("Rent", 3000);
//        int actualValue = rent.getValue();
//        int expectedValue = 3000;
//        assertEquals(actualValue, expectedValue, "FAULT");
//        String actualDescription = rent.getDescription();
//        String expectedDescription = "Rent";
//        assertEquals(actualDescription, expectedDescription, "FAULT");
//        rent.setPercentage(30);
//        int actualPercentage = rent.getPercentage();
//        int expectedPercentage = 30;
//        assertEquals(actualPercentage, expectedPercentage, "FAULT");
//    }
//
//    //test solveData method for 4 data
//    @Test
//    public void test2() {
//        Waffle waffle = new Waffle();
//        Expenditure[] expenditures = {
//                new Expenditure("Salaries", 1000),
//                new Expenditure("Rent", 3000),
//                new Expenditure("Paper", 2000),
//                new Expenditure("Heating", 4000),
//        };
//        waffle.setExpenditureArray(expenditures);
//        Expenditure[] expendituresSolved = waffle.solveData(expenditures);
//        int [] expectedPercentages = {40,30,20,10};
//        int actualLength = expendituresSolved.length;
//        int expectedLength = 4;
//        assertEquals(actualLength, expectedLength, "FAULT");
//        for (int i = 0; i < expectedPercentages.length; i++) {
//            assertEquals(expectedPercentages[i],expendituresSolved[i].getPercentage(),"FAULT");
//        }
//    }
//
//    //test solveData method for more than 8 data
//    @Test
//    public void test3() {
//        Waffle waffle = new Waffle();
//        Expenditure[] expenditures = {
//                new Expenditure("Salaries", 1000),
//                new Expenditure("Rent", 2500),
//                new Expenditure("Paper", 2000),
//                new Expenditure("Heating", 4000),
//                new Expenditure("Most popular books on Java etc.", 500),
//                new Expenditure("Gas", 3000),
//                new Expenditure("Coffee/Tea", 7000),
//                new Expenditure("Biscuits", 8000),
//                new Expenditure("Travel", 6000),
//                new Expenditure("Electricity", 1000),
//                new Expenditure("Pencils", 3500)
//        };
//        waffle.setExpenditureArray(expenditures);
//        Expenditure[] expendituresSolved = waffle.solveData(expenditures);
//        int actualLength = expendituresSolved.length;
//        int expectedLength = 8;
//        assertEquals(actualLength, expectedLength, "FAULT");
//        int [] expectedPercentages = {21,18,16,10,9,8,6,12};
//        for (int i = 0; i < expectedPercentages.length; i++) {
//            assertEquals(expectedPercentages[i],expendituresSolved[i].getPercentage(),"FAULT");
//        }
//        String[] expectedDescription = {"Biscuits","Coffee/Tea","Travel","Heating","Pencils","Gas","Rent","Other"};
//        for (int i = 0; i < expectedDescription.length; i++) {
//            String actualDescription = expendituresSolved[i].getDescription();
//            assertEquals(actualDescription, expectedDescription[i], "FAULT");
//
//        }
//
//    }
//
//
//}
