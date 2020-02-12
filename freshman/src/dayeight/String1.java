package dayeight;

public class String1 {
    public static void main(String[] args) {
        String str1="apple";
        int len= str1.length();
        System.out.println("apple有"+len+"个字符");
        System.out.println("、、、、、length()-----------------");
        String str2="pen";
        String str3=str1+str2;
        System.out.println(str3);
        String str4=str1.concat(str2);
        System.out.println(str4);
        System.out.println("\\\\ concat(String str)-----------------");

        char c=str1.charAt(0);
        System.out.println("第0个字符为"+c);
        System.out.println("第一个字符为"+str2.charAt(1));
        System.out.println("第er个字符为"+str2.charAt(2));
        System.out.println("第san个字符为"+str2.charAt(3));
        System.out.println("第si个字符为"+str2.charAt(4));
        System.out.println("\\\\ indexof(String str)-----------------");

        String subStr1= str1.substring(0);
        String subStr2= str1.substring(3);
        String subStr3= str1.substring(str1.length());
        System.out.println(subStr1);
        System.out.println(subStr2);
        System.out.println(subStr3);
        System.out.println("\\\\ substring(int begin,int end)-----------------");
        String subStr5=str1.substring(1,5);
        System.out.println(subStr5);
        System.out.println("\\\\ substring(int begin,int end)-----------------");







    }
}
