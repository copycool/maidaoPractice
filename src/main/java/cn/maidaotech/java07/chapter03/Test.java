package cn.maidaotech.java07.chapter03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        set.add(new Product("AAA"));
        set.add(new Product("AAA"));
        
        Map<Product,Integer> map = new HashMap<>();
        map.put(new Product("A"), 1);
        System.out.println(map.get(new Product("A")));
    }
}
