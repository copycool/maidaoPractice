package cn.maidaotech.java07.ch04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Question14 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        for(int i=1;i<=13;i++){
        list.add("方块"+i);
        list.add("梅花"+i);
        list.add("红心"+i);
        list.add("黑桃"+i);
        }
        list.add("大王");
        list.add("小王");
        System.out.println(list);
        System.out.println("洗牌");
        Collections.shuffle(list);
        System.out.println(list);
        List<String> listA = new ArrayList<>();
        List<String> listB = new ArrayList<>();
        List<String> listC = new ArrayList<>();
        System.out.println("摸牌");
        distribute(list,listA,listB,listC);
        System.out.println("玩家A："+listA);
        System.out.println("玩家B："+listB);
        System.out.println("玩家C："+listC);
        System.out.println("地主牌");
        System.out.println(list);
        System.out.println("抢地主");
        rob(list, listA, listB, listC);
        System.out.println("玩家A:" + listA);
        System.out.println("玩家B:" + listB);
        System.out.println("玩家C:" + listC);

    }

    public static void distribute(List<String> list, List<String> listA, List<String> listB, List<String> listC) {

        for (int i = 0; i < list.size() - 3; i++) {
            if (i % 3 == 0) {
                listA.add(list.get(i));
            } else if (i % 3 == 1) {
                listB.add(list.get(i));
            } else {
                listC.add(list.get(i));
            }
        }

        list.subList(0, list.size() - 3).clear();

    }

    public static void rob(List<String> list, List<String> listA, List<String> listB, List<String> listC) {
        double ran = Math.random() * 3;
        if (ran < 1) {
            listA.addAll(list);
            System.out.println("玩家A抢到地主");
        } else if (ran >= 1 && ran < 2) {
            listB.addAll(list);
            System.out.println("玩家B抢到地主");

        } else {
            listC.addAll(list);
            System.out.println("玩家C抢到地主");
        }
    }
}
