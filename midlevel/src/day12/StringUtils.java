package day12;

public class StringUtils {
    public static boolean isBlank(String str){
        return str==null ||" ".equals(str.trim());
    }
}
