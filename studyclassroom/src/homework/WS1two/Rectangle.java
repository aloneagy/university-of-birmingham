package homework.WS1two;

public class Rectangle
{
    private double width;
    private double height;
    private double circumference;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
        this.circumference = (width+height)*2;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
        circumference=(width+height)*2;//when you reset the value of width,the circumference will compute again;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        circumference=(width+height)*2;//when you reset the value of height,the circumference will compute again;
    }

    public double getCircumference() {
        return circumference;
    }

    public void setCircumference(double circumference) {
        this.circumference = circumference;
    }

    @Override
    public String toString() {
        return "The rectangle has a width of" + width + ",a height of" + height + ", and an circumference=" + circumference + '.';
    }

    public static void main(String[] args) {
        Rectangle r=new Rectangle(2,4);//because the value of circumference is changable, when you creat the object,you
        System.out.println(r);                          //can't set the value of circumference.
        r.setHeight(5);//reset the value of height 5 in the object r;
        System.out.println(r);
    }
}
