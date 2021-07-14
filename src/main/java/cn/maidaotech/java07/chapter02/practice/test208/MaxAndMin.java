package cn.maidaotech.java07.chapter02.practice.test208;

public class MaxAndMin {
    public static void println(int a, int b, int c) {
        int max = a;
        int min = a;
        if (b > max)
            max = b;
        if (b < min)
            min = b;
        if (c > max)
            max = c;
        if (c < min)
            min = c;
        System.out.println("max：" + max);
        System.out.println("min：" + min);
    }
}