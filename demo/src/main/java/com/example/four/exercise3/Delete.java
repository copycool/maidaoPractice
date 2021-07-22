package com.example.four.exercise3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Delete {
   public static void main(String[] args) {
    Collection temp = new ArrayList();
    temp.add(1);
    Collections.addAll(temp, Math.random()*5);
    System.out.println("集合原有的元素：" + temp);
    for(int i = 0;i < temp.size();i++){
        if (i <= 20) {
            temp.remove(2);
        }
    }
    System.out.println("集合删除2后的元素："+ temp);
   }
    
}