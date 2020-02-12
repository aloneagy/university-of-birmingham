package dayeight;

public class String_Demo03 {
    public static void main(String[] args) {
        String s = "aa|bb|cc";
        String s2 = "itheimajavaithcastjava123";
        String[] strArray2 = s2.split("java");
        String[] strArray = s.split("\\|");
        for (int x = 0; x < strArray.length; x++)
        {
            System.out.println(strArray[x]);
            System.out.println(strArray2[x]);
        }
    }

}
