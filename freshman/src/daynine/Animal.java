package daynine;

public abstract class Animal {
    public abstract void run();

}
class Cat extends Animal{

    public void run()
    {
        System.out.println("小猫在墙头走～～");
    }
}

