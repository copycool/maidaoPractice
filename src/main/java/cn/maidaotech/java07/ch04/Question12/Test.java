package cn.maidaotech.java07.ch04.Question12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Depositor d1=new Depositor(4324,"丽丽",38989);
        Depositor d2=new Depositor(4484,"黄海波",938295.32);
        Depositor d3=new Depositor(4347,"季节",864987.00);
        HashMap<Integer,Depositor> map=new HashMap<>();
        map.put(1, d1);
        map.put(2, d2);
        map.put(3, d3);
        Set<Integer> s=map.keySet();
        Iterator<Integer> i=s.iterator();
        while(i.hasNext()){
            Object key=i.next();
            System.out.println(map.get(key));
        }

    }
}
