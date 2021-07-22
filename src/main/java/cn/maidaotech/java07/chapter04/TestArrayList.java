package cn.maidaotech.java07.chapter04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
//编写程序分别测试对比 ArrayList 和 LinkedList 
//在添加、访问、删除元素时的性能。
//提示：从集 合头部添加、删除元素，从集合尾部访问元素，
//请写出原因
public class TestArrayList {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new LinkedList<>();
        long startTime1 = System.currentTimeMillis();
        addFirst(a, 100000);
        long endTime1 = System.currentTimeMillis();
        System.out.println("ArrayList头部插入用时："+(endTime1-startTime1)+"ms");

        long startTime2 = System.currentTimeMillis();
        addFirst(b, 100000);
        long endTime2 = System.currentTimeMillis();
        System.out.println("LinkedList头部插入用时："+(endTime2-startTime2)+"ms");

        long startTime3 = System.currentTimeMillis();
        searchFromEnd(a, 1000);
        long endTime3 = System.currentTimeMillis();
        System.out.println("ArrayList尾部查找用时："+(endTime3-startTime3)+"ms");

        long startTime4 = System.currentTimeMillis();
        searchFromEnd(b, 1000);
        long endTime4 = System.currentTimeMillis();
        System.out.println("LinkedList尾部查找用时："+(endTime4-startTime4)+"ms");

        long startTime5 = System.currentTimeMillis();
        deleteFirst(a,600);
        long endTime5 = System.currentTimeMillis();
        System.out.println("ArrayList从头部删除用时："+(endTime5-startTime5)+"ms");
        

        long startTime6 = System.currentTimeMillis();
        deleteFirst(b,600);
        long endTime6 = System.currentTimeMillis();
        System.out.println("LinkedList从头部删除用时："+(endTime6-startTime6)+"ms");


       


    }
    public static void addFirst(List<Integer> list,int number){
        Random random = new Random();
            while(list.size()!=number){
            int temp = random.nextInt()*100000+1;
            list.add(0, temp);
        }    
    }
    public static void searchFromEnd(List<Integer> c, int target){
        for(int i=c.size()-1; i>0; i--){
            if(c.get(i)==target){
                System.out.println("您要查找的数字已在索引为"+i+"的位置找到");   
            }
        }
        // System.out.println("您要查找的数字不存在！");
    }

    public static void deleteFirst(List<Integer> c, int number){
        Iterator iterator = c.iterator();
        while(iterator.hasNext()){
            Object t = iterator.next();
            if(t.equals(number)){
                c.remove(iterator);
            }
        }
    }
}

