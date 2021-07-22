package cn.maidaotech.java07.work4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestTwo {

    public static void main(String[] args) {
        {
            LinkedList<String> sites = new LinkedList<String>();
            sites.add("hellow");
            sites.add("迈道");
            sites.add("欢迎");
            sites.add("你到来");

            System.out.println("LinkedList的操作");
            System.out.println(sites);
            // long sitesBegin=System.currentTimeMillis();
            // sites.addFirst("添加");
            // long sitesend=Sys
            System.out.println("添加后" + sites);
            System.out.println("从尾部访问元素，元素位置   " + sites.lastIndexOf("欢迎"));
            System.out.println("" + sites.getLast());
            System.out.println(sites.getFirst());
            sites.remove(2);
            System.out.println(sites);

        }

        {
            List<String> list = new ArrayList<>();
            list.add(0, "hellow,");
            list.add(1, "欢迎");
            list.add(2, "来到");
            list.add(3, "迈道学习");

            // list.add(0,"添加")；
            System.out.println();
            System.out.println("ArrayList的操作");
            System.out.println("从尾部访问元素，元素位置  " + list.lastIndexOf("欢迎"));
            System.out.println(list);
            System.out.println(list.get(0));
            list.add(0, "添加");
            System.out.println("添加后" + list);

            // 删除
            list.remove(2);
            System.out.println("删除后" + list);
        }
    }
}
