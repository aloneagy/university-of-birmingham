package predictive;


import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.HashSet;
import java.util.Set;


/**
 * @author
 * create at 2020-02-10 23:08
 * @description:this is the class for
 **/

public class ListDictionaryTest {

    //test for dictionary
    ListDictionary dictionary = new ListDictionary("/Users/zhangyongnan/IdeaProjects/freshman/src/predictive/words");

    @Test
    public void test1() {
            Set<String> actualWords1 = dictionary.signatureToWords("26746");
            Set<String> expectedWords1 = new HashSet<>();
            expectedWords1.add("cosin");
            expectedWords1.add("corin");
            assertEquals(actualWords1, expectedWords1);

    }

    @Test
    public void test2() {
        Set<String> actual1 = dictionary.signatureToWords("2");
        Set<String> expected1 = new HashSet<String>();
        expected1.add("a");
        expected1.add("b");
        expected1.add("c");


        assertEquals(expected1, actual1);
    }
    @Test
    public void test3(){
        Set<String> expected = new HashSet<String>();
        Set<String> actual = dictionary.signatureToWords("9999643866");
        expected.add("zyzzogeton");
        assertEquals(expected, actual);

    }
    @Test
    public void test4(){
        Set<String> expected = new HashSet<String>();
        expected.add("gekko");
        expected.add("hello");
        Set<String> actual = dictionary.signatureToWords("43556");
        assertEquals(expected, actual);
    }


}
