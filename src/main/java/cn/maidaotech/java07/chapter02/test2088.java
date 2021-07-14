package cn.maidaotech.java07.chapter02;

public class test2088 {
    //使用字符“*”号打印一个边长为5个“*”的菱形。那么边长为10个、20个“*”的菱形呢？
    public static void main(String[] args) {
        printRhombus(5);
        printRhombus(10);
        printRhombus(20);

    }
    public static void printRhombus(int length){
        for (int i = 1; i <= length; i++) {
            for (int j = 0; j < length - i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

        for (int i = 1; i < length; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(' ');
            }
            for (int j = 0; j < 2 * (length - i) - 1; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

    }
}
