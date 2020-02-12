package day12;

import java.util.function.Supplier;

public class DemoArray {
    private static void SeekMax(Supplier<Integer>function){
        int max=function.get();
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] array={10,20,100,30,40,50};
        SeekMax(()->{
            int max=array[0];
            for (int i = 1; i <array.length ; i++) {
                if(array[i]>max){
                    max=array[i];
                }
            }
            return max;
        });
    }
}
