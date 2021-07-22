package cn.maidaotech.java07.chapter04.test14_poker;
import java.util.*;
public class Poker {
    


/*
   有序版的斗地主。
   1.准备牌
   2.洗牌
   3.发牌
   4.排序
   5.看牌
 */
    public static void main(String[] args) {
        //准备牌，使用Map集合，存储索引和牌大小
        HashMap<Integer, String> poker = new HashMap<>();
        //创建List集合存储牌的索引
        ArrayList<Integer> key = new ArrayList<>();
        List<String> colors = List.of("♠", "♥", "♣", "♦");
        List<String> nums = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");
        //先把大王和小王两个特殊牌放入Map集合。
        int index = 0;
        poker.put(index, "大王");
        key.add(index);
        index++;
        poker.put(index, "小王");
        key.add(index);
        index++;
        //组合牌
        for (String num : nums) {
            for (String color : colors) {
                poker.put(index, color + num);
                key.add(index);
                index++;

            }

        }
        //System.out.println(poker);
        //System.out.println(key);
        //洗牌
        Collections.shuffle(key);
        //System.out.println(key);


        //创建四个Integer型的集合，存储牌的索引。
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> player04 = new ArrayList<>();
        for (int i=0;i<key.size();i++) {
            Integer integer1 = key.get(i);
            if (i >= 51) {
                player04.add(integer1);
            } else if (i % 3 == 0) {
                player01.add(integer1);
            } else if (i % 3 == 1) {
                player02.add(integer1);
            } else if (i % 3 == 2) {
                player03.add(integer1);
            }

        }
        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);
        Collections.sort(player04);
        look("刘德华",poker,player01);
        look("刘德华",poker,player02);
        look("刘德华",poker,player03);
        look("刘德华",poker,player04);
        for (Integer integer : player01) {
            String value = poker.get(integer);
            System.out.print(value+" ");
        }


    }
    public static void look(String name,HashMap<Integer, String> poker,ArrayList<Integer> list){
        System.out.print(name+":");
        for (Integer key : list) {
            String value = poker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }

}
