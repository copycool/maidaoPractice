package cn.maidaotech.java07.work4.Test14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        // 创建扑克牌
        List<String> list = new ArrayList<>();
        List<String> lista = new ArrayList<>();
        List<String> listb = new ArrayList<>();
        List<String> listc = new ArrayList<>();
        for (int i = 1; i < 14; i++) {
            list.add(i + "♠");
            list.add(i + "♥");
            list.add(i + "♣");
            list.add(i + "♦");
        }

        list.add("大王");
        list.add("小王");

        System.out.println(list);
        System.out.println();
        // 洗牌

        Collections.shuffle(list);
        System.out.println(list);
        // 摸牌
        for (int j = 1; j <= list.size() - 3; j++) {
            if (j % 3 == 1) {
                lista.add(list.get(j));
            } else if (j % 3 == 2) {
                listb.add(list.get(j));

            } else {
                listc.add(list.get(j));
            }

        }
        list.subList(0, list.size() - 3).clear();
        System.out.println();
        System.out.println("底牌" + list);
        System.out.println();
      

        // 抢地主
        int x = (int) Math.random() * 3;
        if (x % 3 == 0) {
            lista.addAll(list);
        } else if (x % 3 == 1) {
            listb.addAll(list);
        } else {
            listc.addAll(list);
        }
        System.out.println("a的牌");
        System.out.println(lista);
        System.out.println(lista.size());
        System.out.println("b的牌");
        System.out.println(listb);
        System.out.println(listb.size());
        System.out.println("c的牌");
        System.out.println(listc);
        System.out.println(listc.size());
    }

}
