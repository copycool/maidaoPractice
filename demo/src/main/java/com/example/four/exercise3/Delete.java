package com.example.four.exercise3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Delete {
   public static void main(String[] args) {
    List<Integer> temp = new ArrayList<>(20);
    for(int i = 0;i <= 20;i++){
        temp.add((int)(Math.random()*5));    
      }
    System.out.println("集合原有的元素：" + temp);
    remove(temp, 2);
    System.out.println("删掉2后的元素："+temp);
   }
   private static void remove(List<Integer> list,int num){
    Iterator<Integer> it =  list.iterator();
    while(it.hasNext()){
        Integer n = it.next();
        if(n != null && n.intValue() == num){ 
            it.remove();

         }
    
    }
   }
}