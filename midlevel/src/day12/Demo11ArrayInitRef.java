package day12;

public class Demo11ArrayInitRef {
    private static int[] initArray(int length,ArrayBuilder builder){
        return builder.builderArray(length);
    }

    public static void main(String[] args) {
        int[] array=initArray(10,int[]::new);
    }
}
