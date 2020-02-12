package day7;

import java.util.Arrays;

public class Demo07ComparatorLambda {
    public static void main(String[] args) {
        Person[] arr={
                new Person("a",19),
                new Person("b",18),
                new Person("c",20)
        };
        Arrays.sort(arr,(Person a,Person b) ->{
            return a.getAge()-b.getAge();
        });
        for(Person person:arr){
            System.out.println(person);
        }
    }
}
