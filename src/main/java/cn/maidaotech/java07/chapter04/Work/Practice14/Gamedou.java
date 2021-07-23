package cn.maidaotech.java07.chapter04.Work.Practice14;

import java.util.HashMap;

import java.util.List;
import java.util.Map;



public class Gamedou {
    public static void main(String[] args) {
        List<String> list = InitCard.initCard();
        InitCard.shuffle(list);
        Map<Integer,String> gamerone = new HashMap<>();
        Map<Integer,String> gamertwo = new HashMap<>();
        Map<Integer,String> gamerthree = new HashMap<>();
        Map<Integer,String> lastCard = Control.Draw(list, gamerone, gamertwo, gamerthree);
        Control.randomGamer(lastCard, gamerone, gamertwo, gamerthree);
        // Set<Map.Entry<Integer, String>> set = gamerone.entrySet();
        // Iterator<Map.Entry<Integer, String>> iterator1 = set.iterator();
       kanpai(gamerone, "gamerone");
       kanpai(gamertwo, "gamertwo");
       kanpai(gamerthree, "gamerthree");
    }
    private static void kanpai(Map<Integer,String> gamer,String name){
        System.out.println(name+"的牌是");
        int count = 0;
        for (Map.Entry<Integer, String> item : gamer.entrySet()) {
            String value = item.getValue();
            System.out.println(value );
            count++;
            //do something with key and value
        }
        System.out.println( "共计"+count+"张牌");
    }
}
