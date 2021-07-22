package cn.maidaotech.java07.order.forthpractice6;
//创建一个Set集合，保存20个30以内的随机整数，必须保证20个

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;

public class random {
    public static void main(String[] args) {
    Set<Integer>  list1 = new HashSet<Integer>();
    
    while(list1.size()<20){
        int num = ((int)(Math.random()*30));
        list1.add(num);
    }
    // }
    //for增强循环
    for (Object object : list1) {
        System.out.println(object);
    }
    System.out.println(list1);
    // 迭代遍历
    //  Iterator<Integer> it = list1.iterator();  
    //     while (it.hasNext()) {  
    //     str  = it.next();  
    //     System.out.println(str);  
    //        }  
    }
    }

