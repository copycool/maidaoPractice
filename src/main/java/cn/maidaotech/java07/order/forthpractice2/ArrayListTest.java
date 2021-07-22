package cn.maidaotech.java07.order.forthpractice2;

import java.util.ArrayList;


public class ArrayListTest  {

    public static void main(String[] args) {
        
        Long stsrtTime = System.currentTimeMillis();
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("无敌");
        list1.add("哈哈");
        list1.add("JJ");
        //  list1.remove(2);
        int size = list1.size();
        System.out.println(list1);
        // System.out.println(list1.size());

        // for (int i = list1.size()-1; i >= 0; i--) {
        //     System.out.println(list1.get(i));
        // }
        // for (int i = 0; i < list1.size(); i++) {
        //     System.out.println(list1.get(i));
        // }
        Long endTime = System.currentTimeMillis();
        System.out.println("程序运行时间为："+(endTime-stsrtTime)+"ms");
}
}

    


   

