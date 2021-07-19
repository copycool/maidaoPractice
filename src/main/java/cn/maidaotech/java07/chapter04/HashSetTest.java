package cn.maidaotech.java07.chapter04;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.springframework.util.CollectionUtils;

import cn.maidaotech.java07.chapter03.Product;

public class HashSetTest {
    public static void main(String[] args) {
        Set<Product> set = new HashSet<>();
        set.add(new Product("AAA"));
        set.add(new Product("BBB"));
        
        Product[] array = set.toArray(new Product[set.size()]);
        array[0].getName();
        set.iterator().next().getName();
    }

    // private Collection<Product> getProdcuts(){
    //     Set<Product> set = new HashSet<>();
    //     if(CollectionUtils.isEmpty(set)){
    //         return Collections.EMPTY_SET;
    //     }
        

    // }
}
