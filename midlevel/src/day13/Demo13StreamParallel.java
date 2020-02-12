package day13;

import java.util.stream.Stream;

public class Demo13StreamParallel {
    public static void main(String[] args) {
        Stream<Integer> stream=Stream.of(10,20,30,40,50).parallel();
    }
}
