package lamda;

public class fangfayinyongfuDemo {
    public static void main(String[] args) {
       usePrintable(System.out::println);
    }
    private static void usePrintable(fangfayinyongfu f){
        f.printin(666);
    }
}
