//package WS2_1;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//
///**
// * @author <PUT YOUR NAME HERE>
// * This class contains the test cases for WS2_2.Worksheet2 solutions.
// * <WRITE YOUR TEST CASES BELOW>
// */
//
//public class WS2_2.Worksheet2Test {
//
//    WS2_2.Tree<Integer> t1 = new WS2_2.Tree<>(255,
//            new WS2_2.Tree<>(100,
//                    new WS2_2.Tree<>(50), new WS2_2.Tree<>(200)),
//            new WS2_2.Tree<>(300,
//                    new WS2_2.Tree<>(280), new WS2_2.Tree<>(400)));
//
//    WS2_2.Tree<Integer> t2 = new WS2_2.Tree<>(-255,
//            new WS2_2.Tree<>(-100,
//                    new WS2_2.Tree<>(-50), new WS2_2.Tree<>(-200)),
//            new WS2_2.Tree<>(-300,
//                    new WS2_2.Tree<>(-280), new WS2_2.Tree<>(-400)));
//
//    WS2_2.Tree<Integer> t3 = new WS2_2.Tree<>(200,
//            new WS2_2.Tree<>(-100,
//                    new WS2_2.Tree<>(-50), new WS2_2.Tree<>(-200)),
//            new WS2_2.Tree<>(-300,
//                    new WS2_2.Tree<>(-280), new WS2_2.Tree<>(-400)));
//
//    WS2_2.Tree<Integer> t4 = new WS2_2.Tree<>(5,
//            new WS2_2.Tree<>(2,
//                    new WS2_2.Tree<>(1), new WS2_2.Tree<>(4, new WS2_2.Tree<>(3), new WS2_2.Tree<>())),
//            new WS2_2.Tree<>(6,
//                    new WS2_2.Tree<>(), new WS2_2.Tree<>(8, new WS2_2.Tree<>(7), new WS2_2.Tree<>(9))));
//
//    WS2_2.Tree<Integer> t5 = new WS2_2.Tree<>(5,
//            new WS2_2.Tree<>(2,
//                    new WS2_2.Tree<>(1), new WS2_2.Tree<>(4)),
//            new WS2_2.Tree<>(6));
//
//    WS2_2.Tree<Integer> t6 = new WS2_2.Tree<>(200, new WS2_2.Tree(100), new WS2_2.Tree());
//
//    WS2_2.Tree<Integer> t7 = new WS2_2.Tree(50,
//            new WS2_2.Tree(47, new WS2_2.Tree(45), new WS2_2.Tree()),
//            new WS2_2.Tree(100, new WS2_2.Tree(51), new WS2_2.Tree(200)));
//
//    WS2_2.Tree<Integer> t8 = new WS2_2.Tree(50,
//            new WS2_2.Tree(47, new WS2_2.Tree(45), new WS2_2.Tree()),
//            new WS2_2.Tree(100, new WS2_2.Tree(51), new WS2_2.Tree(200,new WS2_2.Tree(),new WS2_2.Tree(300))));
//
//    //Tests for exercise 1
//    @Test
//    public void test1() {
//        WS2_2.Tree<Integer> actualResult = WS2_2.Worksheet2.negateAll(t1);
//        WS2_2.Tree<Integer> expectResult = t2;
//        Assertions.assertEquals(expectResult, actualResult);
//    }
//
//    //Tests for exercise 2
//    @Test
//    public void test2() {
//        Assertions.assertTrue(WS2_2.Worksheet2.allEven(t3));
//    }
//
//    @Test
//    public void test3() {
//        Assertions.assertFalse(WS2_2.Worksheet2.allEven(t2));
//    }
//
//    //Tests for exercise 3
//    @Test
//    public void test4() {
//        int actualResult = WS2_2.Worksheet2.depth(t1, 255);
//        int expectResult = 0;
//        assertEquals(expectResult, actualResult);
//    }
//
//    @Test
//    public void test5() {
//        int actualResult = WS2_2.Worksheet2.depth(t1, 100);
//        int expectResult = 1;
//        assertEquals(expectResult, actualResult);
//
//    }
//
//    @Test
//    public void test6() {
//        int actualResult = WS2_2.Worksheet2.depth(t1, 200);
//        int expectResult = 2;
//        assertEquals(expectResult, actualResult);
//    }
//
//    @Test
//    public void test7() {
//        int actualResult = WS2_2.Worksheet2.depth(t1, 1000);
//        int expectResult = -1;
//        assertEquals(expectResult, actualResult);
//    }
//
//    //Tests for exercise 4
//    @Test
//    public void test8() {
//        List<Integer> actualResult = WS2_2.Worksheet2.preorder(t4);
//        List<Integer> expectResult = new List(5, new List(2, new List(1, new List(4,
//                new List(3, new List(6, new List(8, new List(7, new List(9, new List())))))))));
//        assertEquals(expectResult, actualResult);
//    }
//
//    //Tests for exercise 5
//    @Test
//    public void test9() {
//        Assertions.assertTrue(WS2_2.Worksheet2.isSearchTree(t4));
//    }
//
//    @Test
//    public void test10() {
//        Assertions.assertFalse(WS2_2.Worksheet2.isSearchTree(t3));
//    }
//
//    //Tests for exercise 6
//    @Test
//    public void test11() {
//        WS2_2.Worksheet2.printDescending(t4);
//    }
//
//    //Tests for exercise 7
//    @Test
//    public void test12() {
//        int actualResult = WS2_2.Worksheet2.max(t4);
//        int expectResult = 9;
//        assertEquals(expectResult, actualResult);
//    }
//
//    //Tests for exercise 8
//    @Test
//    public void test13() {
//        WS2_2.Tree<Integer> actualResult = WS2_2.Worksheet2.delete(t4, 8);
//        WS2_2.Tree<Integer> expectResult = new WS2_2.Tree<>(5,
//                new WS2_2.Tree<>(2,
//                        new WS2_2.Tree<>(1), new WS2_2.Tree<>(4, new WS2_2.Tree<>(3), new WS2_2.Tree<>())),
//                new WS2_2.Tree<>(6,
//                        new WS2_2.Tree<>(), new WS2_2.Tree<>(7, new WS2_2.Tree<>(), new WS2_2.Tree<>(9))));
//        Assertions.assertEquals(expectResult, actualResult);
//    }
//
//    //Tests for exercise 9
//    @Test
//    public void test14() {
//        Assertions.assertTrue(WS2_2.Worksheet2.isHeightBalanced(t1));
//    }
//
//    @Test
//    public void test15() {
//        Assertions.assertFalse(WS2_2.Worksheet2.isHeightBalanced(t4));
//    }
//
//    @Test
//    public void test16() {
//        Assertions.assertTrue(WS2_2.Worksheet2.isHeightBalanced(t5));
//    }
//
//    //Tests for exercise 10 insertHB
//    @Test
//    public void test17() {
//        WS2_2.Tree<Integer> t1 = WS2_2.Worksheet2.insertHB(t6, 50);
//        Assertions.assertTrue(WS2_2.Worksheet2.isHeightBalanced(t1));
//        WS2_2.Tree<Integer> t2 = WS2_2.Worksheet2.insertHB(t1, 45);
//        Assertions.assertTrue(WS2_2.Worksheet2.isHeightBalanced(t2));
//        WS2_2.Tree<Integer> t3 = WS2_2.Worksheet2.insertHB(t2, 47);
//        Assertions.assertTrue(WS2_2.Worksheet2.isHeightBalanced(t3));
//        WS2_2.Tree<Integer> t4 = WS2_2.Worksheet2.insertHB(t3, 51);
//        Assertions.assertTrue(WS2_2.Worksheet2.isHeightBalanced(t4));
//        Assertions.assertTrue(WS2_2.Worksheet2.isHeightBalanced(t4));
//        Assertions.assertTrue(t7.equals(t4));
//    }
//
//    //Tests for exercise 10 deleteHB
//    @Test
//    public void test18() {
//        WS2_2.Tree<Integer> actualResult = WS2_2.Worksheet2.deleteHB(t8, 47);
//        WS2_2.Tree<Integer> expectResult = new WS2_2.Tree(100,
//                new WS2_2.Tree(50,new WS2_2.Tree(45),new WS2_2.Tree(51))
//                ,new WS2_2.Tree(200,new WS2_2.Tree(),new WS2_2.Tree(300)));
//        Assertions.assertEquals(expectResult,actualResult);
//
//
//    }
//
//}
