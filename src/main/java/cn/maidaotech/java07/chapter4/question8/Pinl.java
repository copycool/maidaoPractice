package cn.maidaotech.java07.chapter4.question8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//读取个数不定的正整数，打印频率最高的，如果有多个一样的最高频率则都输出。
public class Pinl {
    public static void main(String[] args) {
        List<Integer> list =new ArrayList<>();

        while (list.size() < new Random().nextInt(30)){
            list.add(new Random().nextInt(10));
        }

        System.out.println("初始化的集合为："+list);
        System.out.println("-------");

    }
}