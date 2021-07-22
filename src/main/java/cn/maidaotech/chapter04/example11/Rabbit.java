package cn.maidaotech.chapter04.example11;

public class Rabbit {
    /*
     * 斐波那契数列 兔子繁殖问题
     */
    public static void main(String[] args) {
        int ans = f(12);
        System.out.println("第十二个兔子的对数为" + ans);
    }

    public static int f(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return f(n - 1) + f(n - 2);
        }
    }
}