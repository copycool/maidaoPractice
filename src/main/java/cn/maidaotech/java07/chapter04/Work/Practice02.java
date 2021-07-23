package cn.maidaotech.java07.chapter04.Work;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import cn.maidaotech.java07.chapter03.order.model.Product;

public class Practice02 {
    private static final float Times = 100000;// 加大操作次数
    private static Product product1 = new Product("手机", 1000.0, 10);

    public static void main(String[] args) {

        List<Product> list1 = new ArrayList<>();
        List<Product> list2 = new LinkedList<>();
        long stratTime = System.currentTimeMillis();
        addList(list1, Times);
        long endTime = System.currentTimeMillis();
        System.out.println("ArrayList添加操作了" + Times + "次" + "消耗时间" + (endTime - stratTime) + "ms");
      
        long stratTime1 = System.currentTimeMillis();
        addList(list2, Times);
        long endTime1 = System.currentTimeMillis();
        System.out.println("LinkList添加操作了" + Times + "次" + "消耗时间" + (endTime1 - stratTime1) + "ms");
        //get remove操作同理
    }

    private static void addList(List list, float times) {
        for (int i = 0; i < times; i++) {
            list.add(0, product1);
        }
    }

    private static void getList(List list, float times) {
        for (int i = 0; i < times; i++) {
            list.get(list.size() / 2);
        }
    }

    private static void delete(List list, float times) {
        for (int i = 0; i < times; i++) {
            list.remove(0);
        }

    }

}
