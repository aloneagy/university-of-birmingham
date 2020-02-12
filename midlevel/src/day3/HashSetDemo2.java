package day3;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {

        HashSet<Student>stuSet=new HashSet<>();
        Student stu=new Student("a",1);
        stuSet.add(stu);

        stuSet.add(new Student("b",2));
        stuSet.add(new Student("a",1));
        stuSet.add(new Student("c",3));
        stuSet.add(stu);

        for(Student a:stuSet){
            System.out.println(a);
        }
    }
}
