package day13;

import java.util.stream.Stream;

public class Demo08StreamMap {
    public static void main(String[] args) {
        Stream<String> original=Stream.of("10","12","18");
        Stream<Integer> result=original.map(Integer::parseInt);
    }
}
