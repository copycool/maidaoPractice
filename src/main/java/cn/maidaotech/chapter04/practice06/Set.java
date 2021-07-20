package cn.maidaotech.chapter04.practice06;
//创建一个Set集合，保存20个30以内的随机整数，必须保证20个

import java.util.ArrayList;
import java.util.List;

public class Set {
    public static void main(String[] args) {
        Set s = new Set();
        s.setTest();
    }
    public void setTest() {
        List<Integer> set = new ArrayList<>(20);
        while(set.size() != 20){
            set.add((int)(Math.random()*30));
        }
        System.out.println(set);
    }
}