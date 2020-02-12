package lamda;

public class StudentDemo {
    public static void main(String[] args) {
//        useStudentBuilder((String s,int a)->{
////            return new Student(s,a);
////        });

    //    useStudentBuilder((name,age)->new Student(name,age));
        //引用构造器
        useStudentBuilder(Student::new);
        //lamda表达式被构造器替代的时候，他的形式参数全部传递给构造器作为参数
    }
    private static void useStudentBuilder(StudentBuilder sb){
        Student s=sb.build("a",30);
        System.out.println(s.getAge()+","+s.getAge());
    }
}
