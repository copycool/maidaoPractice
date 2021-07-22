package cn.maidaotech.java07.set_practice;

public class Rabbit {
    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println("兔子第" + i + "个月总数为" + sum(i) + "只");
        }
    }

    public static int sum(int i) {
        if (i < 3) {
            return 1;
        } else {
            return sum(i - 1) + sum(i - 2);
        }
    }

}