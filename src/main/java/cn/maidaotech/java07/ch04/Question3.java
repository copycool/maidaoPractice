package cn.maidaotech.java07.ch04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Question3 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
         Random r=new Random();     
        for(int i=0;i<20;i++){
           int num=r.nextInt(5)+1;
           list.add(num);
        
        }
        
        System.out.println(list.toString());
        System.out.println(remove(list,5).toString());
    }
    public static List<Integer> remove(List<Integer> list,Integer option ){
        if(list==null||list.isEmpty()){
            return null;
            
        }
        Iterator<Integer> iterator=list.iterator();
        while(iterator.hasNext()){
        if(option.equals(iterator.next())){
         iterator.remove();   
        }
    }
    return list;
}
}
