package cn.maidaotech.java07.chapter04.practice03;

import java.util.ArrayList;
import java.util.Iterator;

public class NumberCollection {
    public static void main(String[] args) {
        // 1.创建一个集合
        ArrayList<Integer> arrayList = new ArrayList<>(20);
        // 2.往集合中添加20个5以内的数
        for (int i = 0; i < 20; i++) {
            // 2.1 创建一个5以内的随机数
            int random = (int) (Math.random() * 5);            
            arrayList.add(random);
        }
        Iterator<Integer> it = arrayList.iterator();
        while(it.hasNext()){
            if(it.next() == 3){
                it.remove();
            }
        }
        // 3.打印这个集合
        System.out.println(arrayList.toString());
       
    }

}