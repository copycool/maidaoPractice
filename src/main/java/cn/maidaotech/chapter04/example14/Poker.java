package cn.maidaotech.chapter04.example14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker {
    public static void main(String[] args) {
        //生成牌堆和打乱顺序
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            list.add("♠" + i);
            list.add("♥" + i);
            list.add("♣" + i);
            list.add("♦" + i);
        }
        list.add("大王");
        list.add("小王");
    System.out.println(list);
    System.out.println("洗牌");
    Collections.shuffle(list);
    //将集合元素随机排列
    System.out.println(list);
    //发牌阶段
    List<String> people1 = new ArrayList<>();
    List<String> people2 = new ArrayList<>();
    List<String> people3 = new ArrayList<>();
    System.out.println("摸牌");
    distribute(list, people1, people2, people3);
    System.out.println("第一个人:" + people1);
    System.out.println("第二个人:" + people2);
    System.out.println("第三个人:" + people3);
    System.out.println("地主牌");
    System.out.println(list);
    //地主分配
    System.out.println("抢地主");
    landlord(list, people1, people2, people3);
    System.out.println("第一个人:" + people1);
    System.out.println("第二个人:" + people2);
    System.out.println("第三个人:" + people3);

    }
    //发牌函数
    public static void distribute(List<String> list, List<String> a, List<String> b, List<String> c) {
        for (int i = 0; i < list.size() - 3; i++) {
            if (i % 3 == 0) {
                a.add(list.get(i));
            } else if (i % 3 == 1) {
                b.add(list.get(i));
            } else {
                c.add(list.get(i));
            }
        }
        //对list动态更改，清除前面的元素
        list.subList(0, list.size() - 3).clear();
    }
    //地主函数
    public static void landlord(List<String> list, List<String> a, List<String> b, List<String> c) {
        double ran = Math.random() * 3;
        if (ran < 1) {
            a.addAll(list);
            System.out.println("第一个人是地主");
        } else if (ran >= 1 && ran < 2) {
            b.addAll(list);
            System.out.println("第二个人是地主");
        } else {
            c.addAll(list);
            System.out.println("第三个人是地主");
        }
    }

}