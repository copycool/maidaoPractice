package cn.maidaotech.java07.chapter4.question14;
/*
模拟斗地主
创建一副牌洗牌摸牌：
3个游戏者轮流一次摸一张直到剩下3张牌
抢地主：随机一名游戏者获得3张底牌看牌
打印输出每位游戏者的手牌*/
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            list.add("♠" + i);
            list.add("♥" + i);
            list.add("♣" + i);
            list.add("♦" + i);
        }
        list.add("大王");
        list.add("小王");
        System.out.println(list);
        System.out.println("洗牌");
        Collections.shuffle(list);//随机排列语句
        System.out.println(list);
        List<String> a = new ArrayList<>();
        List<String> b = new ArrayList<>();
        List<String> c = new ArrayList<>();
        System.out.println("摸牌");
        distribute(list, a, b, c);
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
        System.out.println("地主牌");
        System.out.println(list);
        System.out.println("抢地主");
        rob(list, a, b, c);
        System.out.println("a:" + a);
        System.out.println("b:" + b);
        System.out.println("c:" + c);
    }

    public static void distribute(List<String> list, List<String> a, List<String> b, List<String> c) {
        for (int i = 0; i < list.size() - 3; i++) {
            if (i % 3 == 0) {
                a.add(list.get(i));
            } else if (i % 3 == 1) {
                b.add(list.get(i));
            } else {
                c.add(list.get(i));
            }
        }
        list.subList(0, list.size() - 3).clear();
    }

    public static void rob(List<String> list, List<String> a, List<String> b, List<String> c) {
        double ran = Math.random() * 3;

        if (ran < 1) {
            a.addAll(list);
            System.out.println("a抢到地主");
        } else if (ran >= 1 && ran < 2) {
            b.addAll(list);
            System.out.println("b抢到地主");
        } else {
            c.addAll(list);
            System.out.println("c抢到地主");
        }

    }
}
