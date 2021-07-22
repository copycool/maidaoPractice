package cn.maidaotech.chapter04.example10;

public class Square {
    // 分割最大正方形问题
    public static void main(String[] args) {
        int ans = f(168, 64);
        System.out.println("能分割的最大正方形的边长为" + ans);
    }

    public static int f(int x, int y) {
        if (x % y == 0) {
            return y;
        } else {
            return f(y, x % y);
        }
    }
}