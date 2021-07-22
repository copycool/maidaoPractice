package cn.maidaotech.java07.ch04;

import java.util.ArrayList;
import java.util.List;

public class Question4 {
    public static void main(String[] args) {
            
        List<Integer> list1=new ArrayList<>();
          list1.add(2);
          list1.add(9);
        List<Integer> list2=new ArrayList<>();
          list2.add(0);
          list2.add(1);

       List<Integer> jiaoji=new ArrayList<>();
       for(Integer i:list1){
           if(list2.contains(i)){
               jiaoji.add(i);
           }
       }
        System.out.println("交集是："+jiaoji);
        
        List<Integer> bingji=new ArrayList<>();
        for(Integer i:list1){
            if(!bingji.contains(i)){
                bingji.add(i);
            }
        }
        for(Integer j:list2){
            if(!bingji.contains(j)){
                bingji.add(j);
            }
        }
        System.out.println("并集是："+bingji);

        List<Integer> chaji=new ArrayList<>();
         for(Integer i:list1){
            if(!list2.contains(i)){
                chaji.add(i);
            }
        }
        System.out.println("list1与list2的差集是："+chaji);
        
        

    }
}
