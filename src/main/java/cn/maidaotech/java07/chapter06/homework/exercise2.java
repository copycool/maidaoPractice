package cn.maidaotech.java07.chapter06.homework;

public class exercise2 {
    public static void main(String[] args) {
        int result = test2();
        System.out.println(result);
    }

    public static int test2() {
        int i = 1;
        try {
            i++;
            throw new Exception();
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
