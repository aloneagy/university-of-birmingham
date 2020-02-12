package day7;

import java.util.Arrays;
import java.util.Comparator;

public class Demo06Compartor {
    public static void main(String[] args) {
        Person[] arr={
                new Person("a",19),
                new Person("b",18),
                new Person("c",20)
        };
        Comparator<Person> comp=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge() - o2.getAge();
            }
        };
        Arrays.sort(arr,comp);
        for(Person person:arr){
            System.out.println(person);
        }

    }
}
