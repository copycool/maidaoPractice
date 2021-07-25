package cn.maidaotech.java07.chapter04.homework.exercise10;

public class MaxLength {
    // 有一块长168米宽64米的土地，将这块地分隔成大小相等的正方形，
    // 编程计算满足以上条件的情况下，能分隔的最大正方形边长是多少。（用递归函数实现）

    // dp递归问题思考路线：
    // 从题目中寻找1，2
    // 1.找状态（一直可预见的能改变的值） 正方形的边长
    // 2.做选择（状态如何变化，从规则中寻找） 边长++
    // 从规则中寻找3，4
    // 3.临界条件（到什么状态结束，也就是到什么时候不能做选择） 边长的值>64
    // 4.找出公式（状态转移方程式，从题目中找规律） (168*64)%(边长*边长)==0
    public static void main(String[] args) {

        System.out.println(land(9, 6));
        System.out.println(land(64, 168));
        System.out.println("最大边长：" + square(1, 0));

    }

    public static int land(int height, int width) {
        if (width == 0)
            return height;
        else
            return land(width, height % width);
    }

    public static int square(int length, int max) {
        if (length >= 64) {
            // System.out.println("最大边长："+max);
            return max;
        }

        if ((168 * 64) % (length * length) == 0) {
            max = length;
        }
        return square(length + 1, max);

    }

}