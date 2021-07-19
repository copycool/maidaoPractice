package cn.maidaotech.java07.chapter04.classExercise;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.util.CollectionUtils;

import cn.maidaotech.java07.chapter03.Product;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        Date date = new Date();
        set.add(new Product("aaa", 100, date));
        set.add(new Product("bbb", 10000, date));
        set.iterator().next().getName();
    }

    private Collection<Product> getProducts() {
        Set<Product> set = new HashSet<>();
        if (CollectionUtils.isEmpty(set)) {
            return Collections.EMPTY_SET;// 空的 单个的
            // Collections.singleton(o); 单例集合 集合中只有一个元素
        }
        return set;
    }
}
