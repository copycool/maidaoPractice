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
            int a = random.nextInt(100);
            bigList.add(i);
        }

        ArrayList<Integer> smallList = getSmallList(bigList);
        System.out.println("偶数的个数有："+smallList.size()+"个");
        for (int i = 0; i < smallList.size()-1; i++) {
            System.out.println(smallList.get(i));
        }
    }

    private static ArrayList<Integer> getSmallList(ArrayList<Integer> bigList) {
        //创建一个小集合
        ArrayList<Integer> smallList = new ArrayList<>();
        for (int i = 0; i < bigList.size(); i++) {
            int num = bigList.get(i);
            if (num%2==0) {
                smallList.add(num);
            }
        }
        return smallList;
    }
    
}