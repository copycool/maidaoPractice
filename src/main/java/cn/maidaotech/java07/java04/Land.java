package cn.maidaotech.java07.java04;

public class Land {
    public static void main(String[] args) {
        int length = 168;
        int wide = 64;
        int result = count(length, wide);
        System.out.println("最终边长是:"+result);
    }

    public static int count(int length, int wide) {
        if (length % wide == 0) {
            return wide;
        } else {
            return count(wide, length % wide);
        }

    }
}