package dayten;

abstract class Amimal1 {
    public abstract void eat();
}
class Cat extends Amimal1{
    public void eat(){
        System.out.println("chiyu");
        }
        public void catchMouse(){
            System.out.println("抓老鼠");
        }
}
class Dog extends Amimal1{
    public void eat(){
        System.out.println("chigutou");
    }
    public void watchhouse(){
        System.out.println("kanjian");
    }

}
