package cn.maidaotech.java07.chapter02;

public class GetMostValue {
    //任意声明3个整数，求出这3个数中的最大值和最小值，并输出到控制台。
    public static void main(String[] args) {

        //方法一
        // int [] a = {3,56,8};
       
        // int temp =0;
        // for (int i = 0; i < a.length-1; i++) {
        //     if (a[i]>a[i+1]) {
        //         temp = a[i+1];
        //         a[i+1] = a[i];
        //         a[i] = temp;
        //     }
        // }
        // System.out.println("最大值为："+a[a.length-1]);
        // System.out.println("最小值为："+a[0]);



        //方法二
        int num1=2;
        int num2=7;
        int num3=1;

        //求最大值和最小值
        int max=num1 > num2 ? (num1 > num3 ? num1:num3) : (num2 > num3 ? num2 : num3);
        int min=num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
        System.out.println("最大值:"+max);
        System.out.println("最小值:"+min);
    }
    
}