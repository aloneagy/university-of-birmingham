package lamda;

import java.util.function.Supplier;

public class SupplierTest {
    private static int getMax(Supplier<Integer>sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int[] arr={19,50,28,37,46};
        int maxValue=getMax(()->{
            int max=arr[0];
            for(int i=0;i<arr.length;i++){
                if(arr[i]>max){
                    max=arr[i];
                }
            }
            return max;
        });
        System.out.println(maxValue);
    }
}
