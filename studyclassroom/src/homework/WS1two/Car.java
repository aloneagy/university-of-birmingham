package homework.WS1two;

public class Car {
    String make;
    int price;
    int MaxSpeed;
    String colour;

    public Car(String make, int price, int maxspeed, String colour) {//creat a approach to creat object,which has three thing you have to give when you use the method.
        this.make = make;// the object can get the "make" from class
        this.price = price;// the object can get the "price" from class
        this.MaxSpeed = maxspeed;// the object can get the "MaxSpeed" from class
        this.colour = colour;// the object can get the "make" from class
    }

    public String getMake() {//the object will get the make
        return make;// the
    }

    public void setMake(String make) {//the object can set the value of make;
        this.make = make;
    }

    public int getPrice() {//the object will get the price
        return price;
    }

    public void setPrice(int price) {//the object will set the price
        this.price = price;
    }

    public int getMaxSpeed() {//the object will get the MaxSpeed
        return MaxSpeed;
    }

    public void setMaxSpeed(int MaxSpeed) {//the object will set the MaxSpeed
        this.MaxSpeed = MaxSpeed;
    }

    public String getColour() {//the object will get the colour
        return colour;
    }

    public void setColour(String colour) {//the object will set the colour
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", price=" + price +
                ", maxspeed=" + MaxSpeed +
                ", colour='" + colour + '\'' +
                '}';
    }
}
