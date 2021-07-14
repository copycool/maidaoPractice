package cn.maidaotech.java07.work;

/**
 * 打印空心正方形
 */
public class Square {
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