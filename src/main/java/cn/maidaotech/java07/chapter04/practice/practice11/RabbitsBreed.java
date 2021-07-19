package cn.maidaotech.java07.chapter04.practice.practice11;

public class RabbitsBreed {
    /**
     * 前两个月的兔子的总数就是当前月的可以繁殖的兔子总数 所以当前月兔子总数等于上个月兔子总数 + 上个月可以繁殖的兔子数（前三个月的兔子总数）
     * 状态转移方程式：dp[i] = dp[i- 1] + dp[i - 3];
     * 临界条件：第二个月过完以前能够繁殖的兔子数都是初始值，当月份小于0时（只有迭代到最开始的月份或者计算可以繁殖兔子数的时候才会触发这个条件），繁殖能力都是兔子的初始值。
     */
    public static int breed(int month) {
        if (month <= 0)
            return 1; // 起始兔子数量
        return breed(month - 1) + breed(month - 3);
    }

    public static void main(String[] args) {
        System.out.println(breed(12));
    }
}