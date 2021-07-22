package cn.maidaotech.java07.set_practice;

public class BiggestSquare {

    public static void main(String[] args) {
        int res = maxSquare(168, 64);
        System.out.println("最大边长为：" + res);
    }

    private static int maxSquare(int longs, int wide) {
        if (longs % wide == 0) {
            return wide;
        } else {
            return maxSquare(wide, longs % wide);
        }
    }
}