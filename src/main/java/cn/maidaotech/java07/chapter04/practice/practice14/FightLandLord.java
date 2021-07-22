package cn.maidaotech.java07.chapter04.practice.practice14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FightLandLord {
    public static List<String> deck = new ArrayList<String>();
    public static List<String> cards = new LinkedList<>();

    private static String[] types = { "黑桃", "红心", "方角", "梅花" };
    private static String[] values = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A" };

    private static Player player1 = new Player("xiaoli", new LinkedList<>());
    private static Player player2 = new Player("xiaowang", new LinkedList<>());
    private static Player player3 = new Player("xiaozhang", new LinkedList<>());

    public static void main(String[] args) {
        player();
    }

    static {
        clear();
        init();
    }

    public static void player() {
        // 洗牌
        shuffle();
        // 摸牌
        touchCard();
        // 抢地主
        robLord();
        // 看牌
        squeezedCard();
        // 收牌
        clear();
    }

    private static void init() {
        for (int i = 0; i < types.length; i++) {
            for (int j = 0; j < values.length; j++) {
                deck.add(types[i] + values[j]);
            }
        }
    }

    private static void shuffle() {
        Collections.shuffle(deck);
    }

    private static void touchCard() {
        for (int i = 0; i < deck.size() - 3;) {
            player1.getHandCards().add(deck.get(i));
            i++;
            player2.getHandCards().add(deck.get(i));
            i++;
            player3.getHandCards().add(deck.get(i));
            i++;
        }

        for (int i = deck.size() - 3; i < deck.size(); i++) {
            cards.add(deck.get(i));
        }

        System.out.println("\n底牌——————————————————\n");
        cards.stream().forEach(System.out::println);
    }

    private static void robLord() {
        int randomNum = (int) (Math.random() * 2 + 1);
        switch (randomNum) {
            case 1:
                player1.getHandCards().addAll(cards);
                break;
            case 2:
                player2.getHandCards().addAll(cards);
                break;
            case 3:
                player3.getHandCards().addAll(cards);
                break;
        }
    }

    private static void squeezedCard() {
        StringBuilder builder = new StringBuilder();
        System.out.println(builder.append("\n").append(player1.getName()).append("手牌——————\n").toString());
        player1.getHandCards().forEach(System.out::println);
        builder.setLength(0);

        System.out.println(builder.append("\n").append(player2.getName()).append("手牌——————\n").toString());
        player2.getHandCards().forEach(System.out::println);
        builder.setLength(0);

        System.out.println(builder.append("\n").append(player3.getName()).append("手牌——————\n").toString());
        player3.getHandCards().forEach(System.out::println);
        builder.setLength(0);
    }

    private static void clear() {
        player1.getHandCards().clear();
        player2.getHandCards().clear();
        player3.getHandCards().clear();
        cards.clear();
    }

}