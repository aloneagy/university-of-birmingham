package dayeleven;

public class Outerr {
    public void methodOuter(){//方法
        final int num=100;
        class LocalInner{//局部内部类
            public void methodInner(){
                System.out.println("内部类的方法执行");
                System.out.println(num);
                System.out.println(100);
            }
        }
        new LocalInner().methodInner();
    }
    public void methodOuterAnother(){//错误 局部内部类不能在它的方法外定义

    }
}
