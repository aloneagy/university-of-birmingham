package day5;

public class ThrowDemo {
    public static void main(String[] args) {
        int[] arr={2,4,52,2};
        int index=4;
        int element=getElement(arr,index);
        System.out.println(element);
        System.out.println("over");
    }

    private static int getElement(int[] arr, int index) {
        if(index<0||index>arr.length){
            throw new ArrayIndexOutOfBoundsException("chaoguo");
        }
        int element=arr[index];
        return element;
    }

}
