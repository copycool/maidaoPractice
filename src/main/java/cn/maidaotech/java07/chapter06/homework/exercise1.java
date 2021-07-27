package cn.maidaotech.java07.chapter06.homework;

public class exercise1 {
    public static void main(String[] args) {
        int result = test1();
        System.out.println(result);
    }

    public static int test1() {
        int i = 1;
        try {
            i++;
            System.out.println("try block, i = " + i);
        } catch (Exception e) {
            i--;
            System.out.println("catch block i = " + i);
        } finally {
            i = 10;
            System.out.println("finally block i = " + i);
        }
        return i;
    }
}
