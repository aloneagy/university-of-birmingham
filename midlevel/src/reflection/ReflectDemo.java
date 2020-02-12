package reflection;

public class ReflectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        //类的class属性来获取对象
        Class<Student> c1 =Student.class;
        System.out.println(c1);

        Class<Student> c2 =Student.class;
        System.out.println(c1==c2);



        //调用对象的getClass()方法，返回该对象所对应的class对象
        Student s=new Student();
        Class<? extends Student> c3 = s.getClass();
        System.out.println(c1==c3);
        System.out.println("-----------");
        //使用class类中的静态方法forname（String className）
        Class<?> c4 = Class.forName("reflection.Student ");
        System.out.println(c1==c4);

    }
}
