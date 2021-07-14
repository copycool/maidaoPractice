package cn.maidaotech.java07.chapter02.practice.test208;

public class DiamondPrint {
    public static void print(int len) {
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print('*');
            }
            System.out.println();
        }
        for (int i = 1; i <= len - 1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            for (int k = 2 * len - 3; k >= 2 * i - 1; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}