package cn.maidaotech.java07.chapter;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] num = new int[10];
        Integer[] num1 = new Integer[10];
        Integer[] num2 = new Integer[]{1,2,3};
        System.out.println(num[1]);
        System.out.println(num1[1]);
        System.out.println(num2[1]);
    
    {
        int[] a = {1, 3, 5, 7, 9};        
        int[] b = Arrays.copyOf(a, a.length*2);  
        String str = Arrays.toString(b); 
        
        b[0] = 2;        
        System.out.println(a[0]);

        int[] intArr=new int[10];
        System.out.println(intArr[0]);
    }
    
}}