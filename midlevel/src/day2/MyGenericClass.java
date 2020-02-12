package day2;

public class MyGenericClass<MVP> {
    private MVP mvp;

    public MyGenericClass(MVP mvp) {
        this.mvp = mvp;
    }

    public MVP getMvp() {
        return mvp;
    }

    public void setMvp(MVP mvp) {
        this.mvp = mvp;
    }
}
