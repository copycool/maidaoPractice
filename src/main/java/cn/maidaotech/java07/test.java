package cn.maidaotech.java07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(20);
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 5));
        }
        System.out.println("删除前：" + list);
        remove(list, 3);
        System.out.println("删除后：" + list);
    }

    public static void remove(List<Integer> list, int num) {
        Iterator<Integer> it=list.iterator();
        while(it.hasNext()){
            Integer n=it.next();
            if(n != null && n.intValue() == num){ //强制转换成int类型，num代表上面要删除的值
                it.remove();

            }
        
        }
    }
}