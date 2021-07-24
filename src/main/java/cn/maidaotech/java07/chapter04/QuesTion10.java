package cn.maidaotech.java07.chapter04;
/**
 * 有一块长168米宽64米的土地，将这块地分隔成大小相等的正方形，
 * 编程计算满足以上条件的情况下，能分隔的最大正方形边长是多少
 */
public class QuesTion10 {
    public static void landSplit() {
        helper(1, 0);
    }

    public static void helper(int s, int max) {
        if (s >= 64) {
            System.out.println("最大边长：" + max);
            return;
        }

        if (64 % s == 0 && 168 % s == 0)
            max = s;

        helper(s + 1, max);
    }

    public static void main(String[] args) {
        landSplit();
    }

}
