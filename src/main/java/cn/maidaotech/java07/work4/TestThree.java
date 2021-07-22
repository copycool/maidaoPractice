package cn.maidaotech.java07.work4;

//创建一个集合存入20个5以内的整数，遍历集合，删除所有指定数字的元素
import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class TestThree {
    public static void main(String[] args) {
        List<Integer> str = new ArrayList(20);
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 5; j++) {
                str.add(i, j);
            }
        }
        System.out.println(str);
        System.out.print("遍历：");
        for (Integer integer : str) {
            System.out.print(integer + " ");
        }
        System.out.println();
        remove(str, 3);
        System.out.println(str);
    }

    public static void remove(List<Integer> list, int num) {
        Iterator<Integer> it =  list.iterator();
        while(it.hasNext()){
            Integer n = it.next();
            if(n != null && n.intValue() == num){ //注意这里的严谨性
                it.remove();
            }
        }}
    }
