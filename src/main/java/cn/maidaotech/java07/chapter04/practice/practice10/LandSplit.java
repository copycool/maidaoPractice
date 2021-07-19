package cn.maidaotech.java07.chapter04.practice.practice10;

public class LandSplit {
    /**
     * 规则理解： 1.土地长或宽与正方形边长取模都要等于0 2.正方形的边长不能超过土地的宽也就是64
     * 
     * 属于dp（动态规划）问题，思考状态、选择、临界条件、状态转移方程 确定状态：正方形的边长（最大边长也等于边长） 确定选择：正方形的边长
     * 确定临界条件：正方形的宽度>64
     */
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