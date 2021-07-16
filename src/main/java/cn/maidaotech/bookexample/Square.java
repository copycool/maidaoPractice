package cn.maidaotech.bookexample;

public class Square {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < 98; i++) {
            System.out.print("*");
            for (int j = 0; j < 98; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < 100; i++) {
            System.out.print("*");
        }
    }
}