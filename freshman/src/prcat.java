public class prcat {
    public static void main(String[] args){
        operator();
    }
    public static void operator(){
        int i=0;
        i=(1==2 ? 100:200);
        System.out.println(i);
        int j=0;
        j=(3<=4 ? 500:600);
        System.out.println((j));
    }
}
