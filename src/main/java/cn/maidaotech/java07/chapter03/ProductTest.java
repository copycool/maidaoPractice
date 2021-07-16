package cn.maidaotech.java07.chapter03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ProductTest {
    public static void main(String[] args) {
        Date now = new Date();

        Mobile m1 = new Mobile("小米", 100, now);
        Mobile m2 = new Mobile("华为", 150, now);
        Mobile m3 = new Mobile("锤子", 50, now);
        List<Mobile> list = new ArrayList<>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
        Collections.sort(list, new MobileComparator());
        for (Mobile mobile : list) {
            System.out.println(mobile.getName());
        }

        sort();
        sort(m1);
        sort(m1, m2);
    }

    public static void sort(Mobile... mobiles) {
        System.out.println(mobiles.length);
    }

    public static void swap(Product a, Product b) {
        Product temp = a;
        a = b;
        b = temp;
    }
}
