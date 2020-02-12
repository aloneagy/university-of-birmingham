package dayeleven;

public class FinalDemo2 {
    public static void main(String[] args) {
        final User u=new User("zhang",18);
      //  u=new User();被final修饰的 只能指向唯一的对象
     //   u.setUSERNAME()("zhangsan");
    }
}
