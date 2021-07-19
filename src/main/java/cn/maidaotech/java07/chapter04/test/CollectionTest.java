package cn.maidaotech.java07.chapter04.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import cn.maidaotech.java07.chapter03.practice.Dog;

public class CollectionTest {
    static class SetTest {
        public static void main(String[] args) {
            Dog c = new Dog("sss", "sss", 2);
            Dog t = new Dog("sss", "sss", 2);
            Dog y = new Dog("sss2", "ss3s", 4);
            Set<Dog> dogSetList = new HashSet<>();
            dogSetList.add(c);
            dogSetList.add(t);
            dogSetList.add(y);
            Iterator<Dog> iterator = dogSetList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next().getAge()); // 当重写hashCode和equals输出 2，4，没有重写输出2，4，2
            }
        }
    }

    static class ListSet {
        public static void main(String[] args) {
            List<String> list = new ArrayList<String>();
            list.add("8");
            list.add("9");
            list.add("10");
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                if ("9".equals(iterator.next()))
                    iterator.remove();
            }
            System.out.println(list.toString());
        }
    }

}