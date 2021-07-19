package cn.maidaotech.java07.work.chapter04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Question03 {
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList();
        
        for(int i=1;i<=20;i++){
            list.add(new Random().nextInt(5)+1);
        }

        System.out.println(list);
        System.out.println("======");

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()){
            if (iterator.next() % 2 != 0){
                iterator.remove();
            }
        }

        System.out.println(list);
    }
}