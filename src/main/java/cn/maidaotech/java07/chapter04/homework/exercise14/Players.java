package cn.maidaotech.java07.chapter04.homework.exercise14;

import java.util.ArrayList;

public class Players {
    private String name;
    private ArrayList<String> cards;
    public Players() {
    }
    public Players(String name, ArrayList<String> cards) {
        this.name = name;
        this.cards = cards;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<String> getCards() {
        return cards;
    }
    public void setCards(ArrayList<String> cards) {
        this.cards = cards;
    }
    @Override
    public String toString() {
        return "Players [cards=" + cards + ", name=" + name + "]";
    }
    
}
