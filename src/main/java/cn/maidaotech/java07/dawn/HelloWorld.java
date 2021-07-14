package cn.maidaotech.java07.dawn;


public class HelloWorld {
    public static void seyHi(){
        int[] a = {1, 3, 5, 7, 9};               
        System.out.println(a.length);
    }

    public static void main(String[] args) {
        //获取计算器的cpu核数
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
}