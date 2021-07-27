package cn.maidaotech.java07.chapter06.homework;

public class exercise3 {
    public static void main(String[] args) {
        int result = test3();
        System.out.println(result);
    }

    public static int test3() {
        int i = 1;
        try {
            i++;
            System.out.println("try block, i = " + i);
            return i;
        } catch (Exception e) {
            i++;
            System.out.println("catch block i = " + i);
            return i;
        } finally {
            i++;
            System.out.println("finally block i = " + i);
            return i;
        }
    }
}
