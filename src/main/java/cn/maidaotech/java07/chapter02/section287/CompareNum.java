package cn.maidaotech.java07.chapter02.section287;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.cglib.core.CollectionUtils;

import java.lang.String;
// 任意声明 3 个整数
// 求出这 3 个数中的最大值和最小值，并输出到控制台。
public class CompareNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字用,分隔：");
        String num = sc.nextLine();
        String[] str = num.split(",");
        int c[] = new int[str.length];
        int[] digit = varseInt(str,c);
        int[] order = sort(digit);
        System.out.println("排序如下：");
        for(int item : order){
            System.out.print(item+"\t");
        }
    }

    public static int[] varseInt(String[] a,int[] b){
       for(int i=0;i<a.length;i++){
           b[i] = Integer.parseInt(a[i]);
       }
       return b;
    } 
    
    public static int[] sort(int[] a){
        int temp=0;
        for(int i=0;i<a.length;i++){  //找第几个最大的
            for(int j=0;j<a.length-i-1;j++){   //比较次数，从前开始，
                if(a[i]>a[i+1]){
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        return a;
    }
}
        