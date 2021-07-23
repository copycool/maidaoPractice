package cn.maidaotech.java07.chapter04.Work.Practice14;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Control {
    public static Map<Integer,String> Draw(List<String> list, Map<Integer,String> gamerone,Map<Integer,String> gamertwo,Map<Integer,String> gamerthree){
        
        for (int i = 1; i <= list.size()-3; i++) {
            if (i%3==0) {
                gamerthree.put(i, list.get(i));
            }
            if (i%3==1) {
                gamerone.put(i, list.get(i));
            }else{
                gamertwo.put(i, list.get(i));
            }
        }
         Map<Integer,String> lastCard = new HashMap<>();
        List<String> list2 = list.subList(list.size()-3, list.size());
        
         for (int i = 0; i <3; i++) {
            lastCard.put(i+51, list2.get(i));
         }
         return lastCard;
        
    }
    public static  Map<Integer,String> randomGamer(Map<Integer,String> lastCard,Map<Integer,String> gamerone,Map<Integer,String> gamertwo,Map<Integer,String> gamerthree){
        Integer flag = new Random().nextInt(3)+1;
        if (gamerone.containsKey(flag)) {
            gamerone.putAll(lastCard);
            System.out.println("gamerone抢到地主");
            return gamerone;
        }
        if (gamertwo.containsKey(flag)) {
            gamertwo.putAll(lastCard);
            System.out.println("gamertwo抢到地主");
            return gamertwo;
        }
        gamerthree.putAll(lastCard);
        System.out.println("gamerthree抢到地主");
        return gamerthree;
    }
}
