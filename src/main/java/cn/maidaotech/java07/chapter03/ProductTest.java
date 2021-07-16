package cn.maidaotech.java07.chapter03;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Date;
import java.util.List;

public class ProductTest {
    public static void main(String[] args) {
        Date date= new Date();
        Mobile m1= new Mobile("小米100",100,date);
        Mobile m2= new Mobile("小米10",10,date);
        Mobile m3= new Mobile("小米50",50,date);
        List<Mobile> list=new ArrayList<Mobile>();
        list.add(m1);
        list.add(m2);
        list.add(m3);
      
        Collections.sort(list);
        for (Mobile mobile : list) {
            System.out.println(mobile.getName());
        }

        //没有实现comparable接口
        // List<Mobile> list2=new ArrayList<Mobile>();
        // Collections.sort(list2,new  Comparator<Mobile>(){
        //     public int compare(Mobile o1,Mobile o2){
        //         return o1.getPrice()>o2.getPrice()?1:0;
        //     }
        // });
        sort();
        sort(m1);
        sort(m1,m2);
    }
    public static void sort1(Mobile[] mobiles){

    
    }
        //可变长度的参数
    public static void sort(Mobile... mobiles){
           System.out.println(mobiles.length);
    
    }

}
