package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class LandLords {
    /**
     * 模拟斗地主创建一副牌
     * 洗牌
     * 摸牌：3个游戏者轮流一次摸一张直到剩下3张牌
     * 抢地主：随机一名游戏者获得3张底牌
     * 看牌：打印输出每位游戏者的手牌
     */
    //HashMap() 姓名  牌
    //arrayList() 花色+数组
     
    public static void main(String[] args) {
        HashMap<String,String> hm = new HashMap<>();
        ArrayList<String> list = new ArrayList<>();



        //花色
        String[] colors = {"♦", "♣", "♥", "♠"};
        //数字
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
   
        //牌
        for (String color : colors) {
            for (String number : numbers) {
                list.add(color+number);
            }
        }

        //洗牌
        Collections.shuffle(list);

        //摸牌
        for (int i = 1; i < 52; i++) {
           
        }

    }
      
}

