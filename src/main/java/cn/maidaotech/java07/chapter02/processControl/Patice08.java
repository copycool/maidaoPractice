package cn.maidaotech.java07.chapter02.processControl;

public class Patice08 {
    //使用字符“*”号打印一个边长为5个“*”的菱形。那么边长为10个、20个“*”的菱形呢？
    public static void main(String[] args) {
        print(10);
    }
    public static void print(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = n-1; j >= i; j--) {
                System.out.print("  ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }

            for (int j = n-1; j >= i; j--) {
                System.out.print("* ");
            }

            for (int j = n-1; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        
    }
}