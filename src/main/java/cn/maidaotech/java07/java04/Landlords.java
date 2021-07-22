package cn.maidaotech.java07.java04;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Landlords {
    public static void main(String[] args) {
        List<String> card = new ArrayList<>(); // 牌库
        List<String> type = new ArrayList<>(); // 牌类型
        type.addAll(Arrays.asList("A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"));
        System.out.println(type);
        for (int i = 0; i < 13; i++) {
            card.add("♥" + type.get(i));
            card.add("♦" + type.get(i));
            card.add("♣" + type.get(i));
            card.add("♠" + type.get(i));
        }
        /*
         * System.out.println(card); System.out.println(card.size());
         */
        card.add("小王");
        card.add("大王");

        Collections.shuffle(card);
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        List<String> c = new ArrayList<>();
        System.out.println("======发牌=====");
        for (int i = 0; i < card.size() - 3; i++) {
            if (i % 3 == 0) {
                a.add(card.get(i));
            } else if (i % 3 == 1) {
                b.add(card.get(i));
            } else {
                c.add(card.get(i));
            }

        }
        card.subList(0, card.size() - 3).clear();
        System.out.println("地主牌为:" + card);
        System.out.println("当前玩家A的牌为" + a);
        System.out.println("当前玩家B的牌为" + b);
        System.out.println("当前玩家C的牌为" + c);
        System.out.println("底牌" + card.size());
        System.out.println("=====选地主=====");
        int i = (int) (Math.random() * 3);
        System.out.println("地主随机数:" + i);
        if (i < 1) {
            System.out.println("玩家A抢到地主");
            a.addAll(card);
        } else if (i >= 1 && i < 2) {
            System.out.println("玩家B抢到地主");
            a.addAll(card);
        } else {
            System.out.println("玩家C抢到地主");
            a.addAll(card);
        }

        System.out.println("=====出牌阶段牌=====");
        System.out.println("玩家A牌" + a);
        System.out.println("玩家B牌" + b);
        System.out.println("玩家C牌" + c);

    }

}