package day13;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DemoCollect {
    public static void main(String[] args) {
        String[] array={"java","groovy","scala","kotlin"};
        List<String> list= Stream.of(array).collect(Collectors.toList());
    }
}
