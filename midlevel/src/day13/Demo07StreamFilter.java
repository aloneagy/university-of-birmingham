package day13;

import java.util.stream.Stream;

public class Demo07StreamFilter {
    Stream<String> original=Stream.of("张无忌","张三丰","周芷若");
    Stream<String> result=original.filter(a -> a.startsWith("张"));
}
