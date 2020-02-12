package daysix;

public class TestStudent {
    public static void main(String[] args)
    {
         Student s=new Student("aa",1);
        s.setName("柳岩");
        s.setAge(19);
        System.out.println(s.getName()+"---"+s.getAge());

        Student s2=new Student("aa",18);
        System.out.println(s2.getName()+"---"+s2.getAge());
    }
}
