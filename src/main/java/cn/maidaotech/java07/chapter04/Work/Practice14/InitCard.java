package cn.maidaotech.java07.chapter04.Work.Practice14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InitCard {
    public static List<String> initCard(){
        List<String> card = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            card.add("♠" + i);
            card.add("♥" + i);
            card.add("♣" + i);
            card.add("♦" + i);
        }
        card.add("大王");
        card.add("小王");
        return card;
    }
    public static void shuffle(List<String> card){
        Collections.shuffle(card);
    }
}
