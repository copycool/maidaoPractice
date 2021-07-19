package cn.maidaotech.java07.chapter04.homework.exercise14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    // 创建一副牌洗牌摸牌：
    // 3个游戏者轮流一次摸一张直到剩下3张牌抢地主：
    // 随机一名游戏者获得3张底牌看牌：打印输出每位游戏者的手牌
    public static void main(String[] args) {
        List<String> pattens = new ArrayList<>();
        pattens.add("黑桃");
        pattens.add("红桃");
        pattens.add("方块");
        pattens.add("梅花");

        List<String> numbers = new ArrayList<>();
        for (int i = 2; i < 11; i++) {
            numbers.add(i + "");
        }
        numbers.add("A");
        numbers.add("J");
        numbers.add("K");
        numbers.add("Q");

        List<String> playCards = new ArrayList<>();
        for (String patten : pattens) {
            for (String number : numbers) {
                playCards.add(patten + number);
            }
        }
        playCards.add("大王");
        playCards.add("小王");

        Collections.shuffle(playCards);
        System.out.println(playCards);

        List<String> playOne = new ArrayList<>();
        List<String> playTwo = new ArrayList<>();
        List<String> playThree = new ArrayList<>();
        List<String> remainders = new ArrayList<>();

        for (int i = 0; i < playCards.size(); i++) {
            if (i % 3 == 0) {
                playOne.add(playCards.get(i));
            }
            if (i % 3 == 1) {
                playTwo.add(playCards.get(i));

            }
            if (i % 3 == 2) {
                playThree.add(playCards.get(i));

            }

            if (i >= 51) {
                remainders.add(playCards.get(i));

            }
        }

        System.out.println("玩家一：" + playOne);
        System.out.println("玩家二：" + playTwo);
        System.out.println("玩家三：" + playThree);
        System.out.println("剩余牌：" + remainders);

    }
}
