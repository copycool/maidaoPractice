package cn.maidaotech.java07.chapter04;
// 一般而言，兔子在出生两个月后，就有繁殖能力，
// 一对兔子每个月能生出一对小兔子来。
// 如果所有兔子都不死，那么一年后可以繁殖多少对兔子？

public class QuesTion11 {
    public static void main(String[] args) {
        System.out.println(f(12));
    }
    public static int f(int n) {
       
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        }else {
            return f(n - 1) + f(n - 2);
        }
    }
}
