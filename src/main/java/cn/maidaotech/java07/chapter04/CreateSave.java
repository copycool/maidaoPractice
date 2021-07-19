package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CreateSave {
    public static void main(String[] args) {
        //创建一个Set集合，保存20个30以内的随机整数，必须保证20个。
        Set set = new HashSet<>();
        while(set.size()!=20){
            set.add((int)(Math.random()*30));
        }
        System.out.println(set);
       
    }
}