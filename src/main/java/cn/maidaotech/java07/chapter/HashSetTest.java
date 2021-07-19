package cn.maidaotech.java07.chapter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.springframework.util.CollectionUtils;

import cn.maidaotech.java07.chapter03.order.model.Product;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        set.add(new Product("zzz", null, 0));
        set.add(new Product("vvv", null, 0));

        //取出某个位置的值
        set.iterator().next().getProductName();

        HashSet<Product> set1 = new HashSet<>();
        Iterator item = set1.iterator();
        while (item.hasNext()){
            System.out.println(item.next());
        }

        // List<Integer> list = new ArrayList<>(set);
        // list.get(0);

    }
    private Collection<Product> getProducts(){
        Set<Product> set = new HashSet<>();
        if (CollectionUtils.isEmpty(set)) {
            return Collections.EMPTY_SET;
        }
        return null;
        
    }
}