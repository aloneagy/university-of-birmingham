package dayseven;

public class Test01studentArray {
    public static void main(String[] args) {
        Student [] students=new Student[3];
        Student s1=new Student("caocao",40);
        Student s2=new Student("liubei",35);
        Student s3=new Student("sunquan",30);
        Student s4=new Student("sunquan",30);
      //  Students[0]=s1;
      //  Students[1]=s2;
       // Students[2]=s3;
        for(int x=0;x<students.length;x++)
        {
            Student s=students[x];
            System.out.println(s.getName()+"---"+s.getAge());
        }
    }
}
