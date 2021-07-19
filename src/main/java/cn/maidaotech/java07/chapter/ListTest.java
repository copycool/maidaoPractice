package cn.maidaotech.java07.chapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import cn.maidaotech.java07.chapter03.order.model.Product;

public class ListTest {
    public static void main(String[] args) {
        // List<Product> products = new ArrayList<>();
        // Object i = new Product[products.size()];
        // Object [] array = products.toArray(new Product[products.size()]);
        new ListTest().test();
        // ListTest it = new ListTest();
        // it.test();
    }

    public void test() {
        HashMap<Product, Integer> map = new HashMap<>();
        map.put(new Product("白色", "156",120), 100);
        map.put(new Product("黑色", "160",200), 100);
        System.out.println(map.get(new Product("白色", "156",120))); // 这个结果是null，如果想输出100，需要重写hashcode和equals

        // Set<Map.Entry<String, Product>> set = map.entrySet();
        // Iterator<Map.Entry<String, Product>> iterator1 = set.iterator();
        // while (iterator1.hasNext()) {
        // Map.Entry<String, Product> entry = iterator1.next();
        // String key = entry.getKey();
        // Product product = entry.getValue();
        // // do something with key and value
        // }
        // for (Map.Entry<String, Product> item : map.entrySet()) {
        // String key = item.getKey();
        // Product value = item.getValue();
        // // do something with key and value
        // }

        List<Integer> intList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            intList.add(i);
        }
        List<Integer> subList = intList.subList(0, 5);
        System.out.println(subList);
        subList.set(0, 11);
        System.out.println(subList);
        System.out.println(intList);

        List<String> strings = Arrays.asList("a", "", "b", "c", "d", "", "e");
        List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        class ProductKey {
            String color;
            String size;

            public ProductKey(String color, String size) {
                this.color = color;
                this.size = size;
            }

            @Override
            public int hashCode() {
                final int prime = 31;
                int result = 1;
                result = prime * result + getEnclosingInstance().hashCode();
                result = prime * result + ((color == null) ? 0 : color.hashCode());
                result = prime * result + ((size == null) ? 0 : size.hashCode());
                return result;
            }

            @Override
            public boolean equals(Object obj) {
                if (this == obj)
                    return true;
                if (obj == null)
                    return false;
                if (getClass() != obj.getClass())
                    return false;
                ProductKey other = (ProductKey) obj;
                if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
                    return false;
                if (color == null) {
                    if (other.color != null)
                        return false;
                } else if (!color.equals(other.color))
                    return false;
                if (size == null) {
                    if (other.size != null)
                        return false;
                } else if (!size.equals(other.size))
                    return false;
                return true;
            }

            private ListTest getEnclosingInstance() {
                return ListTest.this;
            }
        }
    }
}