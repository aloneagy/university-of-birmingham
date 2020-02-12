public class twoargs {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0] = 5;
        arr[1] = 6;
        arr[2] = 7;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int[] arr2 = arr;
        System.out.println(arr2[0]);
        arr2[1] = 9;
        System.out.println(arr[1]);



    }

}