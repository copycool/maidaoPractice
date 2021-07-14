package cn.maidaotech.java07.chapter02;

public class PrintRhumbus {
    //使用字符“*”号打印一个边长为5个“*”的菱形。那么边长为10个、20个“*”的菱形呢？
    public static void main(String[] args) {
        for (int i = 1; i < 6; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }for (int j = 4; j >= i; j--) {
                System.out.print("*");
            }for (int j = 4; j > i; j--) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
    
}