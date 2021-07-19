package cn.maidaotech.java07.work.chapter04.test;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test1 {
    public static void main(String[] args) {

        //Function.identity()
        Stream<String> stream = Stream.of("I", "love", "you", "too", "I");
        Map<String, Long> map = stream.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        //Collectors.counting()
        Stream<String> stream2 = Stream.of("I", "love", "you", "too", "I");
        Long collect = stream2.collect(Collectors.counting());
        System.out.println(collect);

        
    }
}