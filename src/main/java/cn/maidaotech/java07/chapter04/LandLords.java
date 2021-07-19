package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class LandLords {
       public static void main(String[] args) {

        //创建一个HashMap集合，用来存储牌
        HashMap<Integer, String> hm = new HashMap<>();
        //创建一个ArrayList集合用来存牌的索引
        ArrayList<Integer> array = new ArrayList<>();

        //创建牌的花色数组
        String[] colors = {"♦", "♣", "♥", "♠"};
        //创建牌的数字数组
        String[] numbers = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};

        //初始化索引为0
        int index= 0;
        //制作牌，并装牌到牌盒子
        for (String color : colors){
            for (String number : numbers){
                hm.put(index,color+number);
                array.add(index);
                index++;
            }
        }
        hm.put(index,"小王");
        array.add(index);
        index++;
        hm.put(index,"大王");
        array.add(index);
        //洗牌
        Collections.shuffle(array);
        //创建玩家和底牌
        TreeSet<Integer> zmySet=new TreeSet<>();
        TreeSet<Integer> lqxSet=new TreeSet<>();
        TreeSet<Integer> wzxSet=new TreeSet<>();
        TreeSet<Integer> dpSet=new TreeSet<>();
        //发牌
        for (int i=0;i<array.size();i++){
            int x=array.get(i);
            if (i>=array.size()-3){
                dpSet.add(x);
            }else if (i%3==0){
                zmySet.add(x);
            }else if (i%3==1){
                lqxSet.add(x);
            }else if (i%3==2){
                wzxSet.add(x);
            }
        }
        //调用看牌函数
        lookpoker("nana",zmySet,hm);
        lookpoker("lucy",lqxSet,hm);
        lookpoker("erica",wzxSet,hm);
        lookpoker("底牌",dpSet,hm);
    }
    //构造看牌函数
    public static void lookpoker(String name,TreeSet<Integer> ts,HashMap<Integer,String> hm){
        System.out.print(name+"的牌是：");
        for (Integer key : ts){
            String poker=hm.get(key);
            System.out.print(poker+" ");
        }
        System.out.println();
    }
}

