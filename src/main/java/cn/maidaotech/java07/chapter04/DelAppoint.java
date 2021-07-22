package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;

public class DelAppoint {
   // 创建一个集合存入20个5以内的整数，遍历集合，删除所有指定数字的元素。
   public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
       for (int i = 0; i < 20; i++) {
           list.add((int)(Math.random()*5));
       }

       for (int i : list) {
           System.out.println(i);   
       }

       System.out.println("===========");

       for (int i = 0; i < list.size(); ) {
           if (list.get(i)%2==0) {
               list.remove(i);           
           }else{
               i++;
           }
       }
       System.out.println(list.toString());
   }
}