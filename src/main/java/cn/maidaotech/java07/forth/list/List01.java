package cn.maidaotech.java07.forth.list;


import java.util.ArrayList;
import java.util.Iterator;
//创建一个集合存入 20 个 10 以内的整数，遍历集合，删除所有指定数字的元素。
public class List01 {
   public static void main(String[] args) {
    ArrayList<Integer> list=new ArrayList<Integer>(20);
       for(int i=0;i<20;i++){
           list.add((int)(Math.random()*10));
        } //System.out.println(list);
        for(Integer i:list){
            System.out.print(i+"  ");
        }
        System.out.println();
        Iterator<Integer> iterator=list.iterator();
        // while(iterator.hasNext()){
        //     System.out.print(iterator.next());
        // }
        while(iterator.hasNext()){
            if(iterator.next()==4){
                iterator.remove();
            }
        }
        System.out.println(list);
       }
       
       
   } 

