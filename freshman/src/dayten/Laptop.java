package dayten;
class Laptop
{
    public void run()

    {
        System.out.println("笔记本运行");
    }


    public void usbUSB(USB usb) {
        if (usb != null) {
            usb.open();
            if (usb instanceof Mouse) {
                Mouse m = (Mouse) usb;
                m.click();
            } else if (usb instanceof Keyboard) {
                Keyboard kb = (Keyboard) usb;
                kb.type();
            }
            usb.close();

        }

    }
    public void shutDown(){
        System.out.println("笔记本关闭");}
}



