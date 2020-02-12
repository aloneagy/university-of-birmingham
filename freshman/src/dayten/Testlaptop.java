package dayten;

public class Testlaptop {
    public static void main(String[] args) {
        Laptop It=new Laptop();
        It.run();
        USB u=new Mouse();
        It.usbUSB(u);
        Keyboard kb=new Keyboard();
        It.usbUSB(kb);
        It.shutDown();

    }
}
