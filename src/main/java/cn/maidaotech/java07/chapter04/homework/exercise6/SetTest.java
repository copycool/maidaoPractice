package cn.maidaotech.java07.chapter04.homework.exercise6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class SetTest {
    // 创建一个 Set 集合，保存 20 个 40 以内的随机整数，必须保证 20 个
    //创建一个Set集合，保存20个30以内的随机整数，必须保证20个
    public static void main(String[] args) {
        Set<Integer> hasSet = new HashSet<>();
        while (hasSet.size() < 20) {
            Integer random = new Random().nextInt(30);
            hasSet.add(random);
        }
        System.out.println(hasSet.toString());
        System.out.println(hasSet.size());
    }
}
