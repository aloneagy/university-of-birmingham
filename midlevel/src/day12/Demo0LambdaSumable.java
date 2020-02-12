package day12;

public class Demo0LambdaSumable {
    private static void ComputeSum(int x,int y,Sumable sum){
        sum.sum(x,y);
    }

    public static void main(String[] args) {

        ComputeSum(10,20,(m,n)->m+n);
    }
}
