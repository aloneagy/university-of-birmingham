package dayeleven;

public class Test1 {
    public static void main(String[] args) {
        Rolee rolee=new Rolee();
        rolee.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttrack() {
                System.out.println("纵横天下");
            }
        });
        rolee.faShuSKillAttrack();
        rolee.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttrack() {
                System.out.println("逆转乾坤");
            }
        });
        rolee.faShuSKillAttrack();
    }
}
