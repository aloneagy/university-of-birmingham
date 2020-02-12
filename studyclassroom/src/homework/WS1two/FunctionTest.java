///*
//package homework.WS1two;
//
//import newclassroom.BankAccount;
//
//import java.util.ArrayList;
//import java.util.function.Function;
//
//import static java.util.Locale.filter;
//
//public class FunctionTest {
//    public static void main(String[] args) {
//        ArrayList<BankAccount>banklist=new ArrayList<BankAccount>();
//        banklist.add(new BankAccount(100.0));
//        banklist.add(new BankAccount(200.0));
//        banklist.add(new BankAccount(300.0));
//        banklist=filter(banklist,x->{
//            if(x.getBalance<300){return true;}
//            else {return false;}
//        });
//        for(int i=0;i<banklist.size();i++){
//            System.out.println(banklist.get(i).getBalance());
//        }
//
//
//    }
//    public static ArrayList<BankAccount>fiter(ArrayList<BankAccount>al, Function<BankAccount,Boolean>f){
//        for(int i=0;i<al.size();i++){
//            if(f.apply(al.get(i))){
//                al.remove(i);
//                i--;
//            }
//        }
//        return al;
//    }
//}
//*/
