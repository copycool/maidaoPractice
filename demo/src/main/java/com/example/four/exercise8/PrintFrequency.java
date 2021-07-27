package com.example.four.exercise8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PrintFrequency {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i<=30; i++){
            list.add((int)(Math.random()*10));
        }
        System.out.println("集合："+list.toString());
        Map<Integer,Integer> map = new HashMap<>();
        for(Integer i : list){
            map.merge(i, 1, Integer::sum);
         }
    }
    
}