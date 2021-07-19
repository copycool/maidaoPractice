package cn.maidaotech.chapter04.practice03;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
//创建一个集合存入20个5以内的整数，遍历集合，删除所有指定数字的元素
public class IntegerList {
    public static void main(String[] args) {
        IntegerList i = new IntegerList();
        i.IntegerTest();
    }
    public void IntegerTest() {
        List<Integer> list = new ArrayList<>(20);
       
        while(list.size() != 20){//20个5以内的整数
            list.add((int)(Math.random()*5));
            }
        
        System.out.println(list);
        list.remove(0);//删除的第0位置的元素
        System.out.println(list);
        list.remove(new Integer(0));//删除的0
        System.out.println(list);

    }
}