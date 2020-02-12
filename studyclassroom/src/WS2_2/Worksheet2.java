package WS2_2;

public class Worksheet2 implements Worksheet2Interface {
/**
 * @author <Yongnan zhang>
 * This class contains the solution for WS2_2.Worksheet2
 */


    /**
     * @param t WS2_2.Tree<Integer> the data which this method need to be applied when it compute the result.
     * @return a new tree containing every elements which this method compute ,
     * @description:get a new tree containing all the elements of a with their sign negated, ,
     * positive integers become negative and negative integers become positive.
     */

    static Tree<Integer> negateAll(Tree<Integer> t) {
        if (t.isEmpty()) {
            return t;
        } else {
            return new Tree<Integer>(-t.getValue(), negateAll(t.getLeft()), negateAll(t.getRight()));
        }
    }

    // Exercise 2

    /**
     * @param a WS2_2.Tree<Integer> the data which this method need to be applied when it compute the result.
     * @return if all of them are even numbers, it will give true,if not, it will return false.
     * @description:this method will prove whether every element in a is even number or not,
     */

    static boolean allEven(Tree<Integer> a) {
        if (a.isEmpty()) {
            return true;
        }
        if (a.getLeft().isEmpty()) {
            return allEven(a.getRight());
        }
        if (a.getRight().isEmpty()) {
            return allEven(a.getLeft());
        }
        if (a.getValue() % 2 == 0 && a.getLeft().getValue() % 2 == 0 && a.getRight().getValue() % 2 == 0) {
            return allEven(a.getLeft()) && allEven(a.getRight());
        }
        return false;
    }

    // Exercise 3

    /**
     * @param a WS2_2.Tree<Integer> the data which this method need to be applied when it compute the result.
     * @param x the element this method need to look for
     * @return the depth of the element in this tree.
     * @description:this method will go to look for a number in a, and it will give its depth in this tree.
     */

    static int depth(Tree<Integer> a, int x) {
        if (a.isEmpty()) {
            return -1;
        } else if (a.getValue().equals(x)) {
            return 0;
        } else {
            return Math.max(depth(a.left, x) == -1 ? -1 : depth(a.left, x) + 1, depth(a.right, x) == -1 ? -1 : depth(a.right, x) + 1);
        }
    }

    // Exercise 4

    /**
     * @param a WS2_2.Tree<Integer> the data which this method need to get to combine into a list.
     * @return a new list contain all elements from a, order by preorder.
     * @description: this method will be given a tree, and return a list containing the values
     * in a by traversing the nodes in preorder, i.e., for every node, its own value should be
     * listed first, followed by all the values in the left subtree and finally all the values
     * in the right subtree.
     */

    static <E> List<E> preorder(Tree<E> a) {

        if (a.isEmpty()) return new List<>();
        else return new List<>(a.getValue(), append(preorder(a.getLeft()), preorder(a.getRight())));
    }

    /**
     * append method is a helper method from the lecture 1B. It is to join 2 lists.
     *
     * @param left  a list
     * @param right a list
     * @param <E>   genetic type
     * @return a new list
     */
    static <E> List<E> append(List<E> left, List<E> right) {
        if (left.isEmpty()) return right;
        else return new List<>(left.getHead(), append(left.getTail(), right));
    }


    // Exercise 5

    /**
     * search method is the helper method for isSearchTree method. It returns the max value of a given tree if the flag equals -1;
     * It returns the min value of a given if flag equals 1.
     *
     * @param a    a given tree
     * @param flag an integer value
     * @return the max or min value of a given tree
     */
    static int search(Tree<Integer> a, int flag) {
        if (a.getLeft().isEmpty() && a.getRight().isEmpty()) return a.value;
        else {
            if (flag == -1 && !a.getRight().isEmpty()) return search(a.getRight(), -1);
            else if (flag == 1 && !a.getLeft().isEmpty()) return search(a.getLeft(), 1);
            else return a.getValue();
        }
    }

    /**
     * isSearchTree method returns a boolean value indicating whether a(a given tree) is a binary search tree.
     *
     * @param a a given tree
     * @return a boolean result
     */
    static boolean isSearchTree(Tree<Integer> a) {
        if (a.isEmpty()) return true;
        else if (!a.getLeft().isEmpty() && !a.getRight().isEmpty())
            return (a.getValue() >= search(a.getLeft(), -1)) && (a.getValue() <= search(a.getRight(), 1)) &&
                    isSearchTree(a.getLeft()) && isSearchTree(a.getRight());
        else if (!a.getLeft().isEmpty()) return (a.getValue() >= search(a.getLeft(), -1)) && isSearchTree(a.getLeft());
        else if (!a.getRight().isEmpty())
            return (a.getValue() <= search(a.getRight(), 1)) && isSearchTree(a.getRight());
        else return true;
    }

    // Exercise 6

    /**
     * @param a WS2_2.Tree<Integer> the data which this method need to be hand with.
     * @return no return.
     * @description:this method that prints the values stored in tree a in descending order and without
     * building a separate list of the values
     */
    static void printDescending(Tree<Integer> a) {
        if (!a.isEmpty()) {
            if (!a.getRight().isEmpty()) {
                printDescending(a.getRight());
            }
            System.out.println(a.getValue());
            if (!a.getLeft().isEmpty()) {
                printDescending(a.getLeft());
            }
        }
    }

    // Exercise 7

    /**
     * @param a WS2_2.Tree<Integer> the range where this method need to look for the max.
     * @return the max value in the tree of a.
     * @description:this method find the maximum value stored in the tree. this method
     * must not visit and compare all the nodes in the tree. Rather, it must traverse
     * at most one path in the tree from the root node. This should work in O(log n)
     * time for a balanced binary tree.
     */
    static int max(Tree<Integer> a) {
        if (a.isEmpty()) {
            throw new IllegalArgumentException();
        } else if (a.getRight().isEmpty()) {
            return a.getValue();
        }
        return max(a.getRight());
    }

    // Exercise 8

    /**
     * @param a WS2_2.Tree<Integer> the range where this method need to look for delete.
     * @return a new tree of integer.
     * @description:this method is looking for a number to delete in a tree.If it find
     * this number which need to delete,it will delete this number from this tree.
     */
    static Tree<Integer> delete(Tree<Integer> a, int x) {
        if (a.isEmpty()) {
            return new Tree<>();
        }
        if (a.getValue().equals(x)) {
            if (a.getLeft().isEmpty() && a.getRight().isEmpty()) {
                return new Tree();
            } else if (a.getLeft().isEmpty()) {
                return a.getRight();
            } else if (a.getRight().isEmpty()) {
                return a.getLeft();
            } else {
                return new Tree(max(a.getLeft()), delete(a.getLeft(), max(a.getLeft())), a.getRight());
            }
        } else {
            if (a.getValue() > x) {
                return new Tree<>(a.getValue(), delete(a.getLeft(), x), a.getRight());
            } else {
                return new Tree<>(a.getValue(), a.getLeft(), delete(a.getRight(), x));
            }
        }
    }

    // Exercise 9

    /**
     * @param a WS2_2.Tree<Integer> this method need to be confirmed whether this tree is a high balanced binary tree or not.
     * @return a boolean value to explain this tree whether is a high binary tree.
     * @description:this method will confirm the tree of a whether is a high balanced binary tree. if it is, it will give
     * true of boolean. if not, it will return false.
     */
    static <E> boolean isHeightBalanced(Tree<E> a) {
        if (a.isEmpty()) {
            return true;
        } else if (a.getLeft().getHeight() - a.getRight().getHeight() < 2 && -2 < a.getLeft().getHeight() - a.getRight().getHeight()) {
            return true && isHeightBalanced(a.getLeft()) && isHeightBalanced(a.getRight());
        } else {
            return false;
        }
    }

    // Exercise 10

    /**
     * LL method is a helper method to rebalance a binary search tree with LL-case to an AVL tree.
     *
     * @param a   a binary search tree
     * @param <E> a genetic type
     * @return an AVL tree
     */
    static <E> Tree<E> LL(Tree<E> a) {
        return new Tree(a.getLeft().getValue(), a.getLeft().getLeft(), new Tree(a.getValue(), a.getLeft().getRight(), a.getRight()));
    }

    /**
     * RR method is a helper method to rebalance a binary search tree with RR-case to an AVL tree.
     *
     * @param a   a binary search tree
     * @param <E> a genetic type
     * @return an AVL tree
     */
    static <E> Tree<E> RR(Tree<E> a) {
        return new Tree(a.getRight().getValue(), new Tree(a.getValue(), a.getLeft(), a.getRight().getLeft()), a.getRight().getRight());
    }

    /**
     * getBalance method is a helper method to rebalance a binary search tree to an AVL tree.
     *
     * @param a   a binary search tree
     * @param <E> a genetic type
     * @return an AVL tree
     */
    static <E> Tree<E> getBalance(Tree<E> a) {

        if (a.isEmpty()) {
            return a;
        } else {
            if (a.getRight().getHeight() - a.getLeft().getHeight() == -2) {
                // LL rotation
                if (a.getLeft().getRight().getHeight() - a.getLeft().getLeft().getHeight() == -1) {
                    assert isHeightBalanced(LL(a));
                    return LL(a);
                }
                // LR rotation
                else {
                    assert isHeightBalanced(LL(new Tree(a.getValue(), RR(a.getLeft()), a.getRight())));
                    return LL(new Tree(a.getValue(), RR(a.getLeft()), a.getRight()));
                }
            }
            // when bf == 2
            else if (a.getRight().getHeight() - a.getLeft().getHeight() == 2) {
                // RR rotation
                if (a.getRight().getRight().getHeight() - a.getRight().getLeft().getHeight() == 1) {
                    assert isHeightBalanced(RR(a));
                    return RR(a);
                }
                // RL rotation
                else {
                    assert isHeightBalanced(RR(new Tree(a.getValue(), a.getLeft(), LL(a.getRight()))));
                    return RR(new Tree(a.getValue(), a.getLeft(), LL(a.getRight())));
                }
            } else return new Tree<>(a.getValue(), getBalance(a.getLeft()), getBalance(a.getRight()));
        }
    }

    /**
     * insertHB method inserts an integer value to a given tree and returns an AVL tree.
     *
     * @param a a height-balanced binary search tree
     * @param x a integer value
     * @return an AVL tree
     */
    static Tree<Integer> insertHB(Tree<Integer> a, int x) {

        if (a.isEmpty()) return new Tree<>(x);
        else if (a.getValue().equals(x)) return a;
        else if (a.getValue() > x) return getBalance(new Tree<>(a.getValue(), insertHB(a.getLeft(), x), a.getRight()));
            // when a.getValue()<x
        else return getBalance(new Tree<>(a.getValue(), a.getLeft(), insertHB(a.getRight(), x)));
    }

    /**
     * deleteHB method deletes an integer value from a given tree and returns an AVL tree.
     *
     * @param a a height-balanced binary search tree
     * @param x a integer value
     * @return an AVL tree
     */
    static Tree<Integer> deleteHB(Tree<Integer> a, int x) {

        return getBalance(delete(a, x));
    }
}

