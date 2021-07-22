package cn.maidaotech.java07.java04;

public class Rabbit {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("第" + i + "个月有:" + f(i) + "对兔子!");
        }
    }

    public static int f(int x) {
        if (x == 1 || x == 2) {
            return 1;
        } else {
            return f(x - 1) + f(x - 2);
        }

    }
}