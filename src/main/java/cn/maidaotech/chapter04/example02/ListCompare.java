package cn.maidaotech.chapter04.example02;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListCompare {
    //这里是老师写的代码，提升了数据量，让对比更可视
    private static final int TIMES = 10000;

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(TIMES);
        List<Integer> linded = new LinkedList<>();
        {
            long arrayBegin = System.currentTimeMillis();
            addFirst(array, TIMES);
            long arrayEnd = System.currentTimeMillis();
            System.out.println("ArrayList执行add操作" + TIMES + "次，耗时：" + (arrayEnd - arrayBegin));

            long linkedBegin = System.currentTimeMillis();
            addFirst(linded, TIMES);
            long linkedEnd = System.currentTimeMillis();
            System.out.println("LinkedList执行add操作" + TIMES + "次，耗时：" + (linkedEnd - linkedBegin));
        }
        {
            long arrayBegin = System.currentTimeMillis();
            getLast(array, TIMES);
            long arrayEnd = System.currentTimeMillis();
            System.out.println("ArrayList执行get操作" + TIMES + "次，耗时：" + (arrayEnd - arrayBegin));

            long linkedBegin = System.currentTimeMillis();
            getLast(linded, TIMES);
            long linkedEnd = System.currentTimeMillis();
            System.out.println("LinkedList执行get操作" + TIMES + "次，耗时：" + (linkedEnd - linkedBegin));
        }
        {
            long arrayBegin = System.currentTimeMillis();
            remove(array);
            long arrayEnd = System.currentTimeMillis();
            System.out.println("ArrayList执行remove操作" + TIMES + "次，耗时：" + (arrayEnd - arrayBegin));

            long linkedBegin = System.currentTimeMillis();
            remove(linded);
            long linkedEnd = System.currentTimeMillis();
            System.out.println("LinkedList执行remove操作" + TIMES + "次，耗时：" + (linkedEnd - linkedBegin));
        }
    }

    public static void addFirst(List<Integer> list, int num) {
        for (int i = 0; i < num; i++) {
            list.add(0, i);
        }
    }

    public static void getLast(List<Integer> list, int times) {
        for (int i = 0; i < times; i++) {
            list.get(list.size() / 2);//每次都获取集合中间的元素，LinkedList对get方法进行了优化，从两头get效率高，中间最低
        }
    }

    public static void remove(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.remove(0); //每次都删除头部第一个元素
        }
    }

}