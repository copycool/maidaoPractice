package cn.maidaotech.java07.chapter4.question6;

import java.util.HashSet;
import java.util.Set;

//创建一个Set集合，保存20个30以内的随机整数，必须保证20个。
public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>(20);
        while (set.size() < 20) {
            set.add((int) (Math.random() * 30));
        }

        System.out.println(set);
    }

}