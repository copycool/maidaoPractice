package cn.maidaotech.java07.chapter02;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int num[] = new int[10];
        int[] num1 = new int[10];
        Integer[] num11 = new Integer[10];
        System.out.println(num1[5]);
        System.out.println(num11[5]);
        Integer[] num2 = new Integer[]{1,2,3};
        String temp[] = {"a","b","c"};
        for (int i = 0; i < num2.length; i++) {
            
        }
        for (Integer integer : num2) {
            
        }
        {
            int[] a = {1, 3, 5, 7, 9};
            int[] b = Arrays.copyOf(a, a.length*2);
            String str = Arrays.toString(b);
            System.out.println(b);
            System.out.println(str);
            b[0] = 2;
            System.out.println(a[0]);
        }
    }
}
