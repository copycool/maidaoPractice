package cn.maidaotech.java07.chapter04.homework.exercise11;

//一般而言，兔子在出生两个月后，就有繁殖能力，一对兔子每个月能生出一对小兔子来。
// 如果所有兔子都不死，那么一年后可以繁殖多少对兔子？
public class Test {
    // 斐波那契数列
    // 月份 1 2 3 4 5 6 7 8 9 10 11 12
    // 兔子 1 1 2 3 5 8 13 21 34 55 89 144
    public static void main(String[] args) {
        System.out.println(Fibonacci(12));
    }

    public static int Fibonacci(int num) {
        if (num == 1) {
            return 1;
        } else if (num == 2) {
            return 1;
        }
        return Fibonacci(num - 1) + Fibonacci(num - 2);
    }

}
