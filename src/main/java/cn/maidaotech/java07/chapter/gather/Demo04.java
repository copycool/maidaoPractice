package cn.maidaotech.java07.chapter.gather;

import java.util.ArrayList;
import java.util.HashMap;

public class Demo04 {
    public static void main(String[] args) {
        //创建一个hashmap集合，存储牌
        HashMap<Integer,String> hm = new HashMap<>();

        //创建ArrayList集合用来存牌的索引
        ArrayList<Integer> list = new ArrayList<>();

        //创建牌的花色数组
        String[] colors ={"♦", "♣", "♥", "♠"};
        //牌的数字数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        int index = 0;
        //制作牌，将牌放到盒子里
        for (String color : colors) {
            for (String number : numbers) {
                hm.put(index, color+number);
                list.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        list.add(index);
        
    }
    
}