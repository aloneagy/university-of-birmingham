package day12;

public class Demo09Lambda {
    public static void printName(String name,PersonBuilder builder){
        System.out.println(builder.builderPerson(name).getName());
    }

    public static void main(String[] args) {
        printName("a",Person::new);
    }
}
