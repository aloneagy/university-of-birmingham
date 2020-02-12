package day3;

import java.time.LocalDate;
import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String>link=new LinkedList();
        link.addFirst("a");
        link.addFirst("b");
        link.addFirst("c");
        System.out.println(link);

        System.out.println(link.getFirst());
        System.out.println(link.getLast());

        System.out.println(link.removeFirst());
        System.out.println(link.removeLast());
        while (!link.isEmpty()){
            System.out.println(link.pop());
        }
        System.out.println(link);

    }

}
