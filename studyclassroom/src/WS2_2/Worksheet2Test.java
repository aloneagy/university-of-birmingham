package WS2_2;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;


/**
 *  This class contains the test cases for WS2_2.Worksheet2 solutions.
 *  @version 2020-2-2
 *  @author yongnan zhang
 */

public class Worksheet2Test {
    Worksheet2 newWorksheet2 = new Worksheet2();
    /**
     * test cases for exercise 1.
     */
    @Test
    public void test1(){

        // a test case when original tree has several nodes.
        Tree originalTree = new Tree(1,new Tree(2),new Tree(-3));
        Tree resultTree = new Tree(-1,new Tree(-2),new Tree(3));
        Tree finalTree = newWorksheet2.negateAll(originalTree);
        assertEquals(resultTree,finalTree);
        // a test case when original tree has only one node.
        originalTree = new Tree(1);
        resultTree = new Tree(-1);
        finalTree = newWorksheet2.negateAll(originalTree);
        assertEquals(resultTree,finalTree);
        // a test case when original tree is empty.
        originalTree = new Tree();
        resultTree = new Tree();
        finalTree = newWorksheet2.negateAll(originalTree);
        assertEquals(resultTree,finalTree);
    }
    /**
     * test cases for exercise 2.
     */
    @Test
    public void test2(){
        // a test case when a tree has uneven value.
        Tree originalTree = new Tree(33,new Tree(222),new Tree(44));
        assertFalse(newWorksheet2.allEven(originalTree));
        // a test case when all values in a tree are even.
        originalTree = new Tree(88,new Tree(222),new Tree(44));
        assertTrue(newWorksheet2.allEven(originalTree));
        // a test case when a tree is empty.
        originalTree = new Tree();
        assertTrue(newWorksheet2.allEven(originalTree));
    }
    /**
     * test cases for exercise 3.
     */
    @Test
    public void test3(){
        Tree originalTree = new Tree(5,new Tree(3,new Tree(1),new Tree(4)),new Tree(8,new Tree(6),new Tree()));
        assertEquals(0,newWorksheet2.depth(originalTree,5));
        assertEquals(1,newWorksheet2.depth(originalTree,3));
        assertEquals(1,newWorksheet2.depth(originalTree,8));
        assertEquals(2,newWorksheet2.depth(originalTree,1));
        assertEquals(2,newWorksheet2.depth(originalTree,4));
        assertEquals(2,newWorksheet2.depth(originalTree,6));
        assertEquals(-1,newWorksheet2.depth(originalTree,9));
    }
    /**
     * test cases for exercise 4.
     */
    @Test
    public void test4(){
        // a test case when the original tree is not an empty tree.
        Tree originalTree = new Tree(5,new Tree(3,new Tree(1),new Tree(4)),new Tree(8,new Tree(6),new Tree()));
        List expectList = new List(5,new List(3,new List(1,new List(4,new List(8,new List(6,new List()))))));
        assertEquals(expectList,newWorksheet2.preorder(originalTree));
        // a test case when the original tree is an empty tree.
        originalTree = new Tree();
        expectList = new List();
        assertEquals(expectList,newWorksheet2.preorder(originalTree));
    }
    /**
     * test cases for exercise 5.
     */
    @Test
    public void test5(){
        // a test case when the original tree is empty.
        Tree originalTree = new Tree();
        assertTrue(newWorksheet2.isSearchTree(originalTree));
        // a test case when the original tree is a binary search tree.
        originalTree = new Tree(5,new Tree(3,new Tree(1),new Tree(4)),new Tree(8,new Tree(6),new Tree()));
        assertTrue(newWorksheet2.isSearchTree(originalTree));
        // a test case when the original tree is not a binary search tree.
        originalTree = new Tree(5,new Tree(1,new Tree(3),new Tree(4)),new Tree(8,new Tree(6),new Tree()));
        assertFalse(newWorksheet2.isSearchTree(originalTree));
        // a test case when the original tree is not a binary search tree.
        originalTree = new Tree<>(0,
                new Tree<>(-100,
                        new Tree<>(-200), new Tree<>(-50,
                        new Tree<>(-75),new Tree<>(100))),
                new Tree<>(100,
                        new Tree<>(), new Tree<>(200,new Tree<>(-150),new Tree<>(400))));
        assertFalse(newWorksheet2.isSearchTree(originalTree));
    }

    /**
     * test cases for exercise 7.
     */
    @Test
    public void test7(){
        // a test case when a tree has leftTree and rightTree;
        Tree originalTree = new Tree(5,new Tree(3,new Tree(1),new Tree(4)),new Tree(8,new Tree(6),new Tree()));
        assertEquals(8,newWorksheet2.max(originalTree));
        // a test case when a tree only has one node.
        originalTree = new Tree(5,new Tree(),new Tree());
        assertEquals(5,newWorksheet2.max(originalTree));
        // a test case when a tree only has leftTree
        originalTree = new Tree(5,new Tree(3,new Tree(1),new Tree()),new Tree());
        assertEquals(5,newWorksheet2.max(originalTree));
        // a test case when a tree only has rightTree
        originalTree = new Tree(5,new Tree(),new Tree(8,new Tree(6),new Tree()));
        assertEquals(8,newWorksheet2.max(originalTree));
    }
    /**
     * test cases for exercise 8.
     */
    @Test
    public void test8(){
        // a test case when the node to be deleted has leftTree and rightTree.
        Tree originalTree = new Tree(5,new Tree(3,new Tree(1),new Tree(4)),new Tree(8,new Tree(6),new Tree()));
        Tree expectTree =  new Tree(5,new Tree(1,new Tree(),new Tree(4)),new Tree(8,new Tree(6),new Tree()));
        assertEquals(expectTree,newWorksheet2.delete(originalTree,3));
        expectTree =  new Tree(4,new Tree(3,new Tree(1),new Tree()),new Tree(8,new Tree(6),new Tree()));
        assertEquals(expectTree,newWorksheet2.delete(originalTree,5));
        // a test case when the node to be deleted does not have both leftTree and rightTree.
        expectTree = new Tree(5,new Tree(3,new Tree(1),new Tree()),new Tree(8,new Tree(6),new Tree()));
        assertEquals(expectTree,newWorksheet2.delete(originalTree,4));
        // a test case when the node to be deleted does not have leftTree but has rightTree.
        originalTree = new Tree(5,new Tree(3,new Tree(1),new Tree(4)),new Tree(8,new Tree(),new Tree(6)));
        expectTree =  new Tree(5,new Tree(3,new Tree(1),new Tree(4)),new Tree(6));
        assertEquals(expectTree,newWorksheet2.delete(originalTree,8));
        // a test case when the node to be deleted does not have rightTree but has leftTree.
        originalTree = new Tree(5,new Tree(3,new Tree(1),new Tree(4)),new Tree(8,new Tree(6),new Tree()));
        expectTree =  new Tree(5,new Tree(3,new Tree(1),new Tree(4)),new Tree(6));
        assertEquals(expectTree,newWorksheet2.delete(originalTree,8));
        // a test case when x is not in the tree
        assertEquals(originalTree,newWorksheet2.delete(originalTree,100));
    }
    /**
     * test cases for exercise 9.
     */
    @Test
    public void test9(){
        // a test case when a tree is empty.
        Tree originalTree = new Tree();
        assertTrue(newWorksheet2.isHeightBalanced(originalTree));
        // a test case when a tree only has one node.
        originalTree = new Tree(5);
        assertTrue(newWorksheet2.isHeightBalanced(originalTree));
        // a test case when a tree is a AVL tree with BF -1.
        originalTree = new Tree(5,new Tree(3,new Tree(1),new Tree(4)),new Tree(8));
        assertTrue(newWorksheet2.isHeightBalanced(originalTree));
        // a test case when a tree is a AVL tree with BF 1.
        originalTree = new Tree(5,new Tree(3),new Tree(8,new Tree(6),new Tree(9)));
        assertTrue(newWorksheet2.isHeightBalanced(originalTree));
        // a test case when a tree is a AVL tree with BF 0.
        originalTree = new Tree(5,new Tree(3),new Tree(8));
        assertTrue(newWorksheet2.isHeightBalanced(originalTree));
        // a test case when a tree is not a AVL tree with BF less than -1.
        originalTree = new Tree(5,new Tree(3,new Tree(1),new Tree()),new Tree());
        assertFalse(newWorksheet2.isHeightBalanced(originalTree));
        // a test case when a tree is not a AVL tree with BF more then 1.
        originalTree = new Tree(5,new Tree(),new Tree(8,new Tree(6),new Tree()));
        assertFalse(newWorksheet2.isHeightBalanced(originalTree));
    }
    /**
     * test cases for insertHB method in exercise 10 .
     */
    @Test
    public void insertHBTest(){
        // a test case when the original tree is a empty tree.
        Tree originalTree = new Tree();
        Tree expectTree = new Tree(5);
        assertEquals(expectTree,newWorksheet2.insertHB(originalTree,5));
        // a test case when one node's value of the original tree equals to the parameter x.
        originalTree = new Tree(10,new Tree(6,new Tree(2),new Tree(8)),new Tree(16));
        expectTree = originalTree;
        assertEquals(expectTree,newWorksheet2.insertHB(originalTree,8));
        // a test case when the tree after being inserted doesn't need to balance again.
        expectTree = new Tree(10,new Tree(6,new Tree(2),new Tree(8)),new Tree(16,new Tree(15),new Tree()));
        assertEquals(expectTree,newWorksheet2.insertHB(originalTree,15));
        assertTrue(newWorksheet2.isHeightBalanced(expectTree));
        // a test case when the LL tree after being inserted  need to balance again.
        expectTree = new Tree(6,new Tree(2,new Tree(1),new Tree()),new Tree(10,new Tree(8),new Tree(16)));
        assertEquals(expectTree,newWorksheet2.insertHB(originalTree,1));
        assertTrue(newWorksheet2.isHeightBalanced(expectTree));
        // a test case when the LR tree after being inserted  need to balance again.
        expectTree = new Tree(8,new Tree(6,new Tree(2),new Tree()),new Tree(10,new Tree(9),new Tree(16)));
        assertEquals(expectTree,newWorksheet2.insertHB(originalTree,9));
        assertTrue(newWorksheet2.isHeightBalanced(expectTree));
        // a test case when the RR tree after being inserted  need to balance again.
        originalTree = new Tree(10,new Tree(8),new Tree(15,new Tree(12),new Tree(20)));
        expectTree = new Tree(15,new Tree(10,new Tree(8),new Tree(12)),new Tree(20,new Tree(),new Tree(25)));
        assertEquals(expectTree,newWorksheet2.insertHB(originalTree,25));
        assertTrue(newWorksheet2.isHeightBalanced(expectTree));
        // a test case when the RL tree after being inserted  need to balance again.
        expectTree = new Tree(12,new Tree(10,new Tree(8),new Tree(11)),new Tree(15,new Tree(),new Tree(20)));
        assertEquals(expectTree,newWorksheet2.insertHB(originalTree,11));
        assertTrue(newWorksheet2.isHeightBalanced(expectTree));
    }
    /**
     * test cases for deleteHB method in exercise 10 .
     */
    @Test
    public void deleteHBTest(){
        // a test case when the original tree is a empty tree.
        Tree originalTree = new Tree();
        Tree expectTree = new Tree();
        assertEquals(expectTree,newWorksheet2.deleteHB(originalTree,5));
        // a test case when the tree after deleting one node doesn't need to balance again.
        originalTree = new Tree(10,new Tree(8),new Tree(15,new Tree(12),new Tree(20)));
        expectTree = new Tree(10,new Tree(8),new Tree(15,new Tree(12),new Tree()));
        assertEquals(expectTree,newWorksheet2.deleteHB(originalTree,20));
        assertTrue(newWorksheet2.isHeightBalanced(expectTree));
        // a test case when the tree after deleting one node need to balance again.
        expectTree =  new Tree(12,new Tree(10),new Tree(15,new Tree(),new Tree(20)));
        assertEquals(expectTree,newWorksheet2.deleteHB(originalTree,8));
        assertTrue(newWorksheet2.isHeightBalanced(expectTree));
    }
}
