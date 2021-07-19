package cn.maidaotech.chapter04.practice04;

import java.util.ArrayList;
import java.util.Collection;

//如何判断两个集合是否有交集，并打印出他们的交集、并集和差集
public class Intersection {
    public static void main(String[] args) {
        Intersection i = new Intersection();
        i.Test();
        i.Test1();
        i.Test2();
    }
    public void Test() {//交集
        Collection cool = new ArrayList<>();
        cool.add(123);
        cool.add(456);
        cool.add(new String("Tom"));
        //System.out.println(cool);
        Collection cool2 = new ArrayList<>();
        cool2.add(123);
        cool2.add(666);
        cool2.add(new String("Jerry"));
        //System.out.println(cool2);
        cool.retainAll(cool2);
        System.out.println(cool);
    }
    
    public void Test1() {//并集
        Collection cool = new ArrayList<>();
        cool.add(123);
        cool.add(456);
        cool.add(new String("Tom"));
        //System.out.println(cool);
        Collection cool2 = new ArrayList<>();
        cool2.add(123);
        cool2.add(666);
        cool2.add(new String("Jerry"));
        //System.out.println(cool2);
        cool.addAll(cool2);
        System.out.println(cool);
    }
    public void Test2() {//求差集
        Collection cool = new ArrayList<>();
        cool.add(123);
        cool.add(456);
        cool.add(new String("Tom"));
        //System.out.println(cool);
        Collection cool2 = new ArrayList<>();
        cool2.add(123);
        cool2.add(666);
        cool2.add(new String("Jerry"));
        //System.out.println(cool2);
        cool.removeAll(cool2);
        System.out.println(cool);
    }
}