package homework.WS1two;

public class Good {
    private String name;
    private double NetPrice;
    final static double VAT_RATE=20;
    public Good(String name,double NetPrice) {// creat a approach to creat object,if you would like to use it,you need get two aprameters.
        this.name = name;//the object will get the name from class Good;
        this.NetPrice = NetPrice;//the object will get the NetPrice from class Good;
    }

    public String getName() {
        return name;//the object will get the value of name
    }

    public void setName(String name) {//the object can set the value of name
        this.name = name;
    }

    public double getNetPrice() {//the object will get the value of netprice;
        return NetPrice;
    }

    public void setNetPrice(double NetPrice) {//the object can set the value of netprice
        this.NetPrice = NetPrice;
    }

    @Override
    public String toString() {
        return "The " + name  + " has a gross price of " + "\u00A3" + String.format("%.2f",grossPrice())+".";
    }


    public double grossPrice() {//creat a method, which the value of the answer is the netprice *(1+VAT_rate/100);
      return NetPrice*(1+VAT_RATE/100);

    }
    public void discount(double VAT_RATE){//creat a method, which the value of the answer is the netprice *(1-VAT_rate/100);
        NetPrice=NetPrice*(1-VAT_RATE/100);

    }

    public static void main(String[] args) {
        Good milk = new Good("Milk",0.5);//creat an object,whose name is Milk and whose netprice is 0.5
        System.out.println(milk);
        milk.discount(20);//use the method of discount and the value of the VAT_RATE is 20.
        System.out.println("milk = " + milk);


    }

}
