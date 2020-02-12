/**
 * @author ynz
 * create at 2020-02-10 23:08
 * @description:this is the class for test
 **/

package predictive;

import org.testng.annotations.Test;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Set;

import static org.testng.Assert.assertEquals;

public class PredictivePrototypeTest {

    // Testing wordToSignature method

    @Test
    public void test1() {

        String expected1 = "4663";
        String actual1 = PredictivePrototype.wordToSignature("home");
        assertEquals(expected1, actual1);
    }
    @Test
    public void test2(){
        String expected2 = "9";
        String actual2=PredictivePrototype.wordToSignature("z");
        assertEquals(expected2, actual2);
    }

    @Test
    public void test3(){
        String expected = "5282";
        String actual = PredictivePrototype.wordToSignature("java");
        assertEquals(expected, actual);
    }
    @Test
    public void test4(){
        String expected = "22222222222222333";
        String actual=PredictivePrototype.wordToSignature("aaaaabbbbbccccdde");
        assertEquals(expected, actual);
    }


    //test for signatureToWords
    @Test
    public void test5() throws FileNotFoundException {
        String signature = "3";
        HashSet<String> expected = new HashSet<>();
        expected.add("d");
        expected.add("e");
        expected.add("f");
        Set<String> result = PredictivePrototype.signatureToWords(signature);
        assertEquals(expected, result);
    }
    @Test
    public void test6() throws FileNotFoundException {
        String signature = "8";
        HashSet<String> expected = new HashSet<>();
        expected.add("t");
        expected.add("u");
        expected.add("v");
        Set<String> result = PredictivePrototype.signatureToWords(signature);
        assertEquals(expected, result);
    }
    @Test
    public void test7() throws FileNotFoundException {
        String signature = "9";
        HashSet<String> expected = new HashSet<>();
        expected.add("w");
        expected.add("x");
        expected.add("y");
        expected.add("z");
        Set<String> result = PredictivePrototype.signatureToWords(signature);
        assertEquals(expected, result);
    }
    // Testing isValidWord method
    @Test
    public void test8(){
        boolean expected = false;
        boolean actual = PredictivePrototype.isValidWord("()*!@(");
        assertEquals(expected, actual);
    }
    @Test
    public void test9(){
        boolean expected = true;
        boolean actual = PredictivePrototype.isValidWord("home");
        assertEquals(expected, actual);
    }
    @Test
    public void test10(){
        boolean expected = false;
        boolean actual = PredictivePrototype.isValidWord("9home");
        assertEquals(expected, actual);
    }
}