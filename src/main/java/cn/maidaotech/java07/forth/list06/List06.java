package cn.maidaotech.java07.forth.list06;

import java.util.HashSet;
import java.util.Set;

//创建一个 Set 集合，保存 20 个 40 以内的随机整数，必须保证 20 个
public class List06 {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        while(set.size()<20){
            Integer num1=(int)(Math.random()*40+1);
            set.add(num1);
        }
        for(Integer i:set){
            System.out.print(i+",");
        }
    }
}
