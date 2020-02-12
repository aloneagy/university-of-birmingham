package dayeleven;

public class Rolee {
    FaShuSkill fs;
    public void setFaShuSkill(FaShuSkill fs){
        this.fs=fs;
    }
    public void faShuSKillAttrack(){
        System.out.println("发动法术攻击");
        fs.faShuAttrack();
        System.out.println("攻击完毕");
    }
}
