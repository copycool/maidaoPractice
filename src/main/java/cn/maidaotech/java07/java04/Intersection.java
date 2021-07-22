package cn.maidaotech.java07.java04;

import java.util.ArrayList;
import java.util.List;

public class Intersection {
    public static void main(String[] args) {
        List<String> a=new ArrayList();
        List<String> b=new ArrayList();
        a.add("A");
        a.add("B");
        b.add("B");
        b.add("C");
        System.out.println("a集合原本文本"+a);
        System.out.println("a集合原本文本"+b);


        //交集
         a.retainAll(b); 
        System.out.println("集合a和集合b的交集是>>>"+a); 
        a.clear();
        b.clear();


        a.add("A");
        a.add("B");
        b.add("B");
        b.add("C");
        //并集
        a.removeAll(b);
        a.addAll(b);
        System.out.println("集合a和集合b的并集是>>>"+a);
        a.clear();
        b.clear();


        a.add("A");
        a.add("B");
        b.add("B");
        b.add("C");
        //差集
        a.removeAll(b);
        System.out.println("集合a和集合b的差集是>>>"+a);
        a.clear();
        b.clear();

        a.add("A");
        a.add("B");
        b.add("B");
        b.add("C");
        b.removeAll(a);
        System.out.println("集合b和集合a的差集是>>>"+b);
        a.clear();
        b.clear();
    }
}