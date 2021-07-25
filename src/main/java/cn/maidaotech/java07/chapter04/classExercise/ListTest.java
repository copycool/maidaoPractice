package cn.maidaotech.java07.chapter04.classExercise;

import java.util.ArrayList;
import java.util.Arrays;
// import java.util.Collection;
// import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import cn.maidaotech.java07.chapter03.Product;

public class ListTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Date date = new Date();
        products.add(new Product("name", 10, date));
        products.add(new Product("name2", 10, date));
        products.add(new Product("123", 10, date));
        products.add(new Product("name4", 10, date));
        products.add(new Product("name5", 10, date));

        // Object[] obj = products.toArray();
        // Product[] products2 = products.toArray(new Product[products.size()]);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> subList = list.subList(0, 5);
        System.out.println(subList);
        subList.set(0, 11);
        System.out.println(subList);
        System.out.println(list);

        // 集合转换为map k是name v是它本身
        products.stream().collect(Collectors.toMap(Product::getName, i -> i));

        List<String> aList = Arrays.asList("a", "b", "", "c", "", "d", "f", "");
        List<String> filtered = aList.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);

        List<String> names=products.stream().map(Product::getName).collect(Collectors.toList());
        //System.out.println(names);
        names.stream().forEach(System.out::println);
        names.stream().filter(s->!s.isEmpty()&&s.indexOf("name")!=-1).forEach(System.out::println);
    
    }
}
