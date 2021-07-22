package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Random;
import java.util.TreeSet;

public class simulatelandlords {
    public static void main(String[] args) {
        String[] num = {"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String[] color = {"♥","♠","♦","♣"};
        HashMap<Integer, String> hm = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        int index = 0;

        for(String s1 : num){
            for(String s2 : color){
                hm.put(index, s2.concat(s1));
                list.add(index);
                index++;
            }
        }
        hm.put(index, "小王");
        list.add(index);
        index++;
        hm.put(index, "大王");
        list.add(index);
        //洗牌
        Collections.shuffle(list);
        //发牌
        TreeSet<Integer> cuicancan = new TreeSet<>();
        TreeSet<Integer> liumengmeng = new TreeSet<>();
        TreeSet<Integer> me = new TreeSet<>();
        TreeSet<Integer> dipai = new TreeSet<>();
        for(int i=0; i<list.size(); i++){
            if(i>=list.size()-3){
                dipai.add(list.get(i));
            }else if(i % 3 == 0){
                cuicancan.add(list.get(i));
            }else if(i % 3 == 1){
                liumengmeng.add(list.get(i));
            }else{
                me.add(list.get(i));
            }
        }
        lookpoker(hm, cuicancan, "崔灿灿");
        lookpoker(hm, liumengmeng, "刘梦梦");
        lookpoker(hm, me, "王雪利");
        lookpoker(hm, dipai, "底牌");
        //抢地主
        Random random = new Random();
        int t = random.nextInt()*3;
        if(t < 1){
            System.out.println("崔灿灿抢到了地主！");
        }else if(t<2){
            System.out.println("刘梦梦抢到了地主！");
        }else{
            System.out.println("王雪利抢到了地主！");
        }
    }
    // 看牌
    // 1.返回值类型void
    // 2.参数列表HashMap,TreeSet,String,name
    public static void lookpoker(HashMap<Integer, String> hm,TreeSet<Integer> ts, String name){
        System.out.println(name+"的牌是：");
        for(Integer i : ts){        //i代表双列集合中的每一个键
            System.out.print(hm.get(i)+"——");
        }
        System.out.println();
    }
}