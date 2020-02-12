package day13;

import java.util.ArrayList;
import java.util.List;

public class Demo02NormalFilter {
    public static void main(String[] args) {
        List<String>list=new ArrayList<>();
        list.add("张无忌");
        list.add("周芷若");
        list.add("赵敏");
        list.add("张强");
        list.add("张三丰");

        List<String>zhanglist=new ArrayList<>();
        for(String name:list){
            if(name.startsWith("张")){
                zhanglist.add(name);
            }
        }
        List<String> shortlist=new ArrayList<>();
        for(String name:zhanglist){
            if(name.length()==3){
                shortlist.add(name);
            }
        }
        for (String name:shortlist){
            System.out.println(name);
        }
    }

}
