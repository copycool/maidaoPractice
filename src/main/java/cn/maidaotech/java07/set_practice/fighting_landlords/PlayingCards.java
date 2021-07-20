package cn.maidaotech.java07.set_practice.fighting_landlords;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 准备牌 洗牌 发牌 看牌
 */
public class PlayingCards {

    public static void main(String[] args) {
        readyCards();
    }

    public static void readyCards() {
        List<String> list = new ArrayList<>();

        final String[] COLOR = { "♠", "♥", "♣", "♦" };
        final String[] NUM = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

        list.add("大王");
        list.add("小王");

        for (String color : COLOR) {
            for (String num : NUM) {
                list.add(color + "  " + num);
            }
        }
        restCards(list);
    }

    public static void restCards(List<String> list) {
        Collections.shuffle(list);
        dealCards(list);
    }

    public static void dealCards(List<String> list) {

        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        List<String> listC = new ArrayList<>();
        List<String> buttomCards = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            String p = list.get(i);
            if (i >= 51) {
                buttomCards.add(p);
            } else {
                if (i % 3 == 0) {
                    listA.add(p);
                } else if (i % 3 == 1) {
                    listB.add(p);
                } else {
                    listC.add(p);
                }
            }
        }

        Map<String, Player> map = new HashMap<>(6);
        Player playerA = new Player("playerA", listA, 15000);
        Player playerB = new Player("playerB", listB, 190000);
        Player playerC = new Player("PlayerC", listC, 25000);
        map.put(playerA.getName(), playerA);
        map.put(playerB.getName(), playerB);
        map.put(playerC.getName(), playerC);

        lookCards(map);
    }

    public static void lookCards(Map<String, Player> map) {
        map.forEach((k, v) -> {
            System.out.println(k + "\t:" + v.getCards() + "");
        });
    }

}