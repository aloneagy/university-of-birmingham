package dayeleven;

public class User {
    final String USERNAME;
    private int age;

    public User(String USERNAME, int age) {
        this.USERNAME = USERNAME;
        this.age = age;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    public void setUSERNAME(String USERNAME){
//        this.USERNAME=USERNAME;
//    }
}
