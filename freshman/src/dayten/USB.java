package dayten;
interface USB {
    void open();
    void close();
}
class Mouse implements USB{

    @Override
    public void open() {
        System.out.println("鼠标开启 红灯闪一闪");

    }

    @Override
    public void close() {
        System.out.println("鼠标关闭，红灯熄灭");

    }
    public void click(){
        System.out.println("鼠标单机");
    }
}
class Keyboard implements USB{


    @Override
    public void open() {
        System.out.println("键盘开启 绿灯闪一闪");
    }

    @Override
    public void close() {
        System.out.println("键盘关闭 绿灯熄灭");
    }
    public void type(){
        System.out.println("键盘打字");
    }
}