package day13;

import java.util.stream.Stream;

public class Demo11StreamSkip {
    public static void main(String[] args) {
        Stream<String> original=Stream.of("张无忌","张三丰","周芷若");
        Stream<String> result=original.skip(2);
        System.out.println(result.count());
    }


}
