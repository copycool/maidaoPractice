package cn.maidaotech.java07.order.forthpractice4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
    ArrayList<Integer> list4 = new ArrayList<>();
    ArrayList<Object> list5 = new ArrayList<>();
    for (int i = 0; i <5; i++) {
        int n = i;
        list4.add(n);
    }
    System.out.println(list4);
    for (int j = 2; j < 8; j++) {
        int m = j;
        list5.add(m);
    }
    System.out.println(list5);
    // list5.addAll(list4);先减后并集
    // System.out.println(list5);
    // list5.retainAll(list4);交集
    // System.out.println(list5);
    // list5.removeAll(list4);差集
    // System.out.println(list5);
}  
}
// private static List<Integer> initListB() {
//     List<Integer> list = new ArrayList<>();
//     list.addAll(Arrays.asList(1, 3, 5, 7, 9));
//     return list;  数组转换成集合

