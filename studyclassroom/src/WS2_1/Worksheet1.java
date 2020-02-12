package WS2_1;

/**
 * @author <PUT YOUR NAME HERE> This class contains the solution for WS2_1.WS2_1.Worksheet1
 */

public class Worksheet1 {

    // Exercise 1

/**
 * @param n the number which this method need to be applied when it compute the result.
 * @param m the number which this method need to be applied when it compute the result.
 * @description:this method will compute the result of n the power of m,this method uses the
 * recursion, it will be operated until its conditions are satisfied.
 * @return the value of this method of m,and n substract one ,
 * */
    static int power(int m, int n) {
        if (m == 0 && n == 0) {
            return 1;
        }
        if (n == 0) {
            return 1;
        }
        return m * power(m, n - 1);
    }
    /**
     * @param n the number which this method need to be applied when it compute the result.
     * @param m the number which this method need to be applied when it compute the result.
     * @description:this method will compute the result of n the power of m, and this method
     * is more efficient to compute the value.
     * @return the value of this method of m,and n substract one ,
     * */
    static int fastPower(int m, int n) {
        if (n == 0 && m == 0) {
            return 1;
        }
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return fastPower(m, n / 2) * fastPower(m, n / 2);
        } else {
            return m * fastPower(m, n - 1);
        }
    }
    /**
     * @param  a</Integer> the data which this method need to translate.
     * @description:this method will get the data of list. in this method,positive integers become
     * negatives and negative integers become positives. finally, return the data of list.
     * @return a new WS2_1.List<Integer> contains the first position of the list of a,and this method
     * with the parameters of the tail of a.
     * */
    static List<Integer> negateAll(List<Integer> a) {
        if (a.isEmpty()) {
            return a;
        } else
            return new List(-a.getHead(), negateAll(a.getTail()));
    }

    /**
     * @param  a</Integer> the range where the method need to find a.
     * @param  x the number need to be found in list a.
     * @description:this method need to find the position of x in list of a, if the list has x, then it
     * will give the position of the first occurrence of x in a,if not, it will throw an IllegalArgumentException
     * @return 1 plus the method with the parameter of x,and the tail of a.
     * */

    static int find(int x, List<Integer> a) {
        if (a.isEmpty()) {
            throw new IllegalArgumentException();
        } else if (a.getHead().equals(x))
            return 0;
        else
            return 1 + find(x, a.getTail());
    }
    /**
     * @param  a</Integer> the data which this method need to confirm.
     * @description:this method is to check every element in list of a is even number.
     * @return  if the number is the even number, it will return true.
     * if not, it will return the method with the parameter of the tail of a.
     * */

    static boolean allEven(List<Integer> a) {
        if(a.isEmpty()){
            return true;
        }
        if (a.getHead() % 2 == 0) {
            return true&&allEven(a.getTail());
        }else{
            return false;
        }
    }
    /**
     * @param  a</Integer> the data which this method need to confirm.
     * @description:this method is to get all even number in the list of a.
     * @return  if the number is even number, it will return a new list add this number,
     * if not, it will return this method with the parameter of the tail of a.
     * */

    static List<Integer> evenNumbers(List<Integer> a) {
        if (a.isEmpty()) {
            return a;
        }
        if (a.getHead() % 2 == 0) {
            return new List(a.getHead(), evenNumbers(a.getTail()));
        }
        return evenNumbers(a.getTail());
    }
    /**
     * @param  a</Integer> the data which this method need to confirm.
     * @description:this method is to check every element in the list of a is sorted.
     * @return  if the number is sorted, it will return the method with the parameter of the tail of a
     * if not, it will return false.
     * */
        static boolean sorted(List<Integer> a) {
        if (a.isEmpty() || a.getTail().isEmpty()) {
            return true;
        }
        if (a.getHead() >= a.getTail().getHead()) {
            return sorted(a.getTail());
        }


        return false;
    }

    /**
     * @param  a</Integer> the origin list this method need to sort and combine.
     * @param  b</Integer> the origin list this method need to sort and combine.
     * @description:this method need to combine two original lists and sorted every
     * element in both of them.at the same time,any duplicate copies of elements in
     * a or b or their combination are retained.
     * @return if the head of a is bigger than or equal that of b,return a new list with
     * parameter of the head of a, and this method with parameter with the tail of a, and b.
     * if the head of a is smaller than that of b,return a new list with
     * parameter of the head of b, and this method with parameter with a,and the tail of a, .
     */

    static List<Integer> merge(List<Integer> a, List<Integer> b) {
        if (a.isEmpty()) {
            return b;
        }
        if (b.isEmpty()) {
            return a;
        }
        if (a.getHead() >= b.getHead()) {
            return new List(a.getHead(), merge(a.getTail(), b));
        } else {
            return new List(b.getHead(), merge(a, b.getTail()));
        }
    }
    /**
     * @param  a</Integer> the data which this method need to handle.
     * @description:this method is to remove the duplications in the list of a.
     * @return   if this list has the duplication, it will return a new list with the
     * parameter of head of a and the method with parameter of the tail of a.
     * if not, it will return the method with parameter of the tail of a.
     * */
    static List<Integer> removeDuplicates(List<Integer> a) {
        if (a.isEmpty() || a.getTail().isEmpty()) {
            return a;
        }

        if (!a.getHead().equals( a.getTail().getHead())) {
            return new List(a.getHead(), removeDuplicates(a.getTail()));
        }
        return removeDuplicates(a.getTail());
    }

}
