package cn.maidaotech.java07.chapter04.question14;

import java.util.LinkedList;
import java.util.List;

public class Player {
    private String name;
    private List<String> handCards = new LinkedList<>();

    public Player(String name, List<String> handCards) {
        this.name = name;
        this.handCards = handCards;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        return builder.append("player name：").append(name).append(handCards).append("}").toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHandCards() {
        return handCards;
    }

    public void setHandCards(List<String> handCards) {
        this.handCards = handCards;
    }

}