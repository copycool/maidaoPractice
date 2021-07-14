package cn.maidaotech.java07.chapter02.section287;
// 用字符“*”打印一个边长为 100 个*的空心正方形。
public class PrintSquare {
    public static void main(String[] args) {
        int size = 100;
        for (int i = 1; i <= size; i++) {
            System.out.print("*");
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 0 || j == size)
                    System.out.print("*");
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
    
}