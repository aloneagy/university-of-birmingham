package dayeleven;

public class Test {
    public static void main(String[] args) {
        Weapon wp=new Weapon("屠龙刀",999999);
        Armour ar=new Armour("麒麟甲",100000);
        Role r=new Role();
        r.setWeapon(wp);
        r.setArmour(ar);
        r.attack();
        r.wear();

    }
}
