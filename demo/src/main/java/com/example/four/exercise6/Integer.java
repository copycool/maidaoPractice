package com.example.four.exercise6;
import java.util.HashSet;


public class Integer {
    String s1[];
  
   public static void main(String[] args) {
       
    String s1 = new String("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20");
    
       
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add(s1);
    System.err.println(hashSet);

   }
}