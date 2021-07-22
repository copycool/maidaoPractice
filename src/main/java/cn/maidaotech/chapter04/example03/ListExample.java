package cn.maidaotech.chapter04.example03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ListExample {
    public static void main(String[] args) {
        /*
         * List<Integer> list = new ArrayList(20); Random random = new Random(); for
         * (int i = 0; i < 20; i++) { int a = random.nextInt(6); list.add(a); }
         * System.out.println(list); removeall实现 List<Integer> smalllist = new
         * ArrayList(3); smalllist.add(1); smalllist.add(2); smalllist.add(3);
         * list.removeAll(smalllist); // 迭代器实现 { Iterator<Integer> iterator =
         * list.iterator(); while (iterator.hasNext()) { if (iterator.next() == 1) {
         * iterator.remove(); } } System.out.println(list); }
         */
        List<Integer> list = new ArrayList<>(20);
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            list.add(random.nextInt(6));
            //
        }
        System.out.println("删除前：" + list.toString());
        remove(list, 2);
        System.out.println("删除后：" + list.toString());
    }

    // 手写了一个remove方法
    public static void remove(List<Integer> list, int num) {
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            Integer n = it.next();
            if (n != null && n.intValue() == num) { // 注意这里的严谨性
                it.remove();
            }
        }

    }

}