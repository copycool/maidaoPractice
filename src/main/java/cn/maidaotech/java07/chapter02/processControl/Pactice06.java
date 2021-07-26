package cn.maidaotech.java07.chapter02.processControl;

public class Pactice06 {
    //任意声明3个整数，求出这3个数中的最大值和最小值，并输出到控制台。
    public static void main(String[] args) {
        print(9,7,3);    
    }
    public static void print(int a,int b,int c) {
        int max = (a>b?a:b)>c?(a>b?a:b):c;
        int min = (a<b?a:b)<c?(a<b?a:b):c;
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);

    }
}