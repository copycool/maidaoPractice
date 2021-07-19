package cn.maidaotech.java07.chapter04.classExercise;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import cn.maidaotech.java07.chapter03.Product;

public class ListTest {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        Object[] obj = products.toArray();
        Product[] products2 = products.toArray(new Product[products.size()]);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }
        List<Integer> subList = list.subList(0, 5);
        System.out.println(subList);
        subList.set(0, 11);
        System.out.println(subList);
        System.out.println(list);

        //集合转换为map k是name v是它本身
      products.stream().collect(Collectors.toMap(Product::getName, i->i));
    }
}
