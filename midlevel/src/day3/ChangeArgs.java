package day3;

public class ChangeArgs {
    public static void main(String[] args) {
        int[] arr={1,4,62,431,2};
        int sum=getSum(arr);
        System.out.println(sum);


        int sum2=getSum(6,7,2,12,2121);
        System.out.println(sum2);
    }

    private static int getSum(int... arr) {
        int sum=0;
        for(int a:arr){
            sum+=a;
        }
        return sum;
    }
}
