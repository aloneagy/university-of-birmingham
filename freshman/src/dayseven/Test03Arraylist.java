package dayseven;

import java.util.ArrayList;

public class Test03Arraylist {
    public static void main(String[] args) {
        ArrayList<String>list=new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        printArraylist(list);
    }

    private static void printArraylist(ArrayList<String> list) {
        System.out.println("{");
        for(int i=0;i<list.size();i++){
            String s=list.get(i);
            if(i !=list.size()-1){
                System.out.println(s+"@");
            }else
            {
                System.out.println(s+"}");
            }
        }

    }
}
