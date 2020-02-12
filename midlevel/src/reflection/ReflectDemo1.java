package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class<?> c = Class.forName("reflection.Student");
        //constructor返回一个Constructor对象的数组
        Constructor<?>[] cons = c.getConstructors();
        for(Constructor con:cons){
            System.out.println(con);
        }
        Constructor<?>[] cons2 = c.getDeclaredConstructors();
        for(Constructor con:cons2){
            System.out.println(con);
        }
        System.out.println("------------");


        //参数表示的意思是你要获取的构着方法的参数的个数和数据类型对应的字节码文件
        Constructor<?> con = c.getConstructor();

        //constructor提供类一个类的单个构造函数的信息和访问权限

        Object obj = con.newInstance();
        System.out.println(obj);

    }
}

