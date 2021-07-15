package cn.maidaotech.java07.zuoye;

//菱形边长为5，
//两个三角形，斜边5，高4，底是6
public class printrhombus {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // 打印上半部分空格
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // 打印原本实心的*部分
            for (int j = 1; j <= 2 * i - 1; j++) {
                // 仅在一行的开头和末尾打印*
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i = 4; i >= 1; i--) {
            // 打印下半部分空格
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            // 打印原本实心的*部分
            for (int j = 1; j <= 2 * i - 1; j++) {
                // 仅在一行的开头和末尾打印*
                if (j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
