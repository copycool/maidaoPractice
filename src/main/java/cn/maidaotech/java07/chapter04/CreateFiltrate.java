package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Random;

public class CreateFiltrate {
    //用一个大集合存入20个随机数字，然后筛选其中的偶数元素，放到小集合中。
    //要求使用自定义的方法来实现筛选。
    public static void main(String[] args) {
        ArrayList<Integer> bigList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            bigList.add(random.nextInt(100)) ;
        }

        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            if (bigList.get(i)%2==0) {
                smallList.add(bigList.get(i));
            }
        }

        System.out.println("小集合长度为："+smallList.size());

        for (int i = 0; i < smallList.size(); i++) {
            System.out.println(smallList.get(i));
        }
    }
    
}