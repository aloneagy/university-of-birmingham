package Toturial;

public class BetterMethod {
    static List<Integer> remdupl(List<Integer>a){
        if(a.isEmpty()){
            return new List<>();
        }else{
            return new List<>(a.getHead(),remdupl(rem1(a.getHead(),a.getTail())));
        }
    }
    static List<Integer>rem1(int x,List<Integer>a){
        if(a.isEmpty()){
            return new List<>();
        }else if(a.getHead()==x){
            return rem1(x,a.getTail());
        }
        return a;
    }
    static List<Integer>rem2(int x,List<Integer>a){
        if(a.isEmpty()){
            return new List<>();
        }else if(a.getHead()==x){
            return rem1(x,a.getTail());
        }
        return new List<>(a.getHead(),rem2(x,a.getTail()));
    }
    //哪个方法更好
    //第二个方法更好
}
