package WS2_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Worksheet1Test {

    //Tests for exercise 1
    @Test
    public void test1() {
        int actualResult = Worksheet1.power(1, 5);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test2() {
        int actualResult = Worksheet1.fastPower(1, 5);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test3() {
        int actualResult = Worksheet1.fastPower(2, 2);
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test4() {
        int actualResult = Worksheet1.fastPower(2, 2);
        int expectedResult = 4;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test5() {
        int actualResult = Worksheet1.fastPower(0, 100);
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test6() {
        int actualResult = Worksheet1.fastPower(100, 0);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test7() {
        int actualResult = Worksheet1.power(1, 100);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test8() {
        int actualResult = Worksheet1.power(0, 100);
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test9() {
        int actualResult = Worksheet1.power(100, 0);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test10() {
        int actualResult = Worksheet1.power(0, 0);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void test11() {
        int actualResult = Worksheet1.power(0, 0);
        int expectedResult = 1;
        assertEquals(expectedResult, actualResult);
    }

    //Tests for exercise 2
    @Test
    public void test12() {
        List testList = new List(2, new List(3, new List(0, new List(1, new List()))));
        List resultList = Worksheet1.negateAll(testList);
        List expectedList = new List(-2, new List(-3, new List(0, new List(-1, new List()))));
        Assertions.assertEquals(resultList.toString(), expectedList.toString());
    }

    //Tests for exercise 3
    @Test
    public void test13() {
        List testList = new List(10, new List(100, new List(300, new List(5, new List()))));
        int actualResult = Worksheet1.find(5, testList);
        int expectedResult = 3;
        assertEquals(expectedResult, actualResult);
        System.out.println(actualResult);
    }

    @Test
    public void test14() {
        List testList = new List(10, new List(9, new List(-100, new List(5, new List()))));
        assertThrows(IllegalArgumentException.class, () -> {
            Worksheet1.find(1, testList);
        });
    }

    //Tests for exercise 4
    @Test
    public void test15() {
        List testList = new List(20, new List(30, new List(2, new List())));
        boolean actualResult = Worksheet1.allEven(testList);
        assertTrue(actualResult);
    }

    //Tests for exercise 4
    @Test
    public void test16() {
        List testList = new List(8000, new List(800, new List(80, new List())));
        boolean actualResult = Worksheet1.allEven(testList);
        assertTrue(actualResult);
    }

    //Tests for exercise 5
    @Test
    public void test17() {
        List testList = new List(2, new List(19, new List(-7, new List(8, new List(-2, new List())))));
        List actualResult = Worksheet1.evenNumbers(testList);
        List expectedResult = new List(2, new List(8, new List(-2, new List())));
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }


    //Tests for exercise 6
    @Test
    public void test18() {
        List testList = new List(15, new List(14, new List(13, new List(12, new List(11, new List())))));
        boolean actualResult = Worksheet1.sorted(testList);
        assertTrue(actualResult);
    }

    @Test
    public void test19() {
        List testList = new List(5, new List(5, new List(4, new List(2, new List(1, new List())))));
        boolean actualResult = Worksheet1.sorted(testList);
        assertTrue(actualResult);
    }

    @Test
    public void test20() {
        List testList = new List(95, new List(94, new List(96, new List(92, new List(91, new List())))));
        boolean actualResult = Worksheet1.sorted(testList);
        assertFalse(actualResult);
    }

    //Tests for exercise 7
    @Test
    public void test21() {
        List a = new List(8, new List(5, new List(5, new List(2, new List()))));
        List b = new List(9, new List(8, new List(7, new List(5, new List()))));
        List actualResult = Worksheet1.merge(a, b);
        List expectedResult = new List(9, new List(8, new List(8, new List(7,
                new List(5, new List(5, new List(5, new List(2, new List()))))))));
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    public void test22() {
        List a = new List(8, new List(5, new List(5, new List(2, new List()))));
        List b = new List(9, new List());
        List actualResult = Worksheet1.merge(a, b);
        List expectedResult = new List(9, new List(8, new List(5, new List(5,
                new List(2, new List())))));
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }


    //Tests for exercise 8
    @Test
    public void test23() {
        List testList = new List(9, new List(8, new List(8, new List(7,
                new List(5, new List(5, new List(5, new List(2, new List()))))))));
        List actualResult = Worksheet1.removeDuplicates(testList);
        List expectedResult = new List(9, new List(8, new List(7, new List(5,
                new List(2, new List())))));
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }

    @Test
    public void test24() {
        List testList = new List(9, new List(9, new List(8, new List(7,
                new List(7, new List(5, new List(2, new List(2, new List()))))))));
        List actualResult = Worksheet1.removeDuplicates(testList);
        List expectedResult = new List(9, new List(8, new List(7, new List(5,
                new List(2, new List())))));
        Assertions.assertEquals(expectedResult.toString(), actualResult.toString());
    }
	
}


