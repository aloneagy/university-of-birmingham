package dayeleven;

public class Role {
    int id;
    int blood;
    String name;
    Weapon wp;
    Armour ar;

    public Weapon getWp() {
        return wp;
    }

    public void setWeapon(Weapon wp) {
        this.wp = wp;
    }

    public Armour getAr() {
        return ar;
    }

    public void setArmour(Armour ar) {
        this.ar = ar;
    }
    public void attack(){
        System.out.println("使用"+wp.getName()+",造成"+wp.getHurt()+"点伤害");
    }
    public void wear(){
        this.blood+=ar.getProtect();
        System.out.println("穿上"+ar.getName()+"生命值增加"+ar.getProtect());
    }
}
