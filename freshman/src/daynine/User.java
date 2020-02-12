//package daynine;
//
//import java.util.ArrayList;
//import java.util.Random;
//
//public class User {
//    private String username;
//    private double leftMoney;
//
//    public User(){}
//
//    public User(String username, double leftMoney) {
//        this.username = username;
//        this.leftMoney = leftMoney;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public double getLeftMoney() {
//        return leftMoney;
//    }
//
//    public void setLeftMoney(double leftMoney) {
//        this.leftMoney = leftMoney;
//    }
//    public void show(){
//        System.out.println("用户名"+username+"余额为"+leftMoney+"元");
//    }
//}
//class QunZhu extends User{
//    public QunZhu(){
//
//    }
//
//    public QunZhu(String username, double leftMoney) {
//        super(username, leftMoney);
//    }
//    public Arraylist<Double> send(int money,int count){
//        double leftMoney=getLeftMoney();
//        if(money*count>leftMoney){
//            return null;
//        }
//        setLeftMoney(leftMoney-money*count);
//        ArrayList<Double> list =new ArrayList<>();
//
//        for(int i=0;i<count;i++){
//            list.add(money);
//        }
//        return list;
//    }
//}
//class Member extends User{
//    public Member(){
//
//    }
//
//    public Member(String username, double leftMoney) {
//        super(username, leftMoney);
//    }
//    public void openHongbao(ArrayList<Double> list){
//        if(list.size()==0){
//            System.out.println("手慢了");
//        }
//        Random r=new Random();
//        int index =r.nextInt(list.size());
//        Double moeny=list.remove(index);
//        double leftMoeny=getLeftMoney();
//        leftMoeny+=money;
//        setLeftMoney(money);
//    }
//}
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
