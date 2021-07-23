package cn.maidaotech.java07.chapter04.Work;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Practice03 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            list.add(new Random().nextInt(5) + 1);
        }

        System.out.println(list);
        for (int i = 0; i < 60; i++) {
            System.out.print("=");
        }
        System.out.println();
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            if (iterator.next() != null || iterator.next() == 5) {
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}
