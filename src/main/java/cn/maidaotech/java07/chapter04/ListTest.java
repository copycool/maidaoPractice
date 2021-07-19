package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import cn.maidaotech.java07.chapter03.Product;

public class ListTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("A"));
        products.add(new Product("B"));

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }
        List<Integer> subList = intList.subList(0, 5);
        System.out.println(subList);
        subList.set(0, 11);
        System.out.println(subList);
        System.out.println(intList);
        {
            List<String> strings = Arrays.asList("a", "", "b", "c", "d", "", "e");
            List<String> newList = new ArrayList<>();
            for (String it : strings) {
                if (it != null && it.length() != 0) {
                    newList.add(it);
                }
            }
            System.out.println(newList);
            strings.stream().filter(it -> it != null && it.length() != 0).collect(Collectors.toList());
        }
        List<String> nameList = products.stream().map(Product::getName).collect(Collectors.toList());
        List<String> _nameList = new ArrayList<>();
        for (Product p : products) {
            _nameList.add(p.getName());
        }
        Map<String, Product> productMap = products.stream().collect(Collectors.toMap(Product::getName, it -> it));
    }
}
