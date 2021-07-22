package cn.maidaotech.java07.chapter04.test10_recursion;

public class Recursion {
    public static void main(String[] args) {
        recursion(168, 64);
    }

    private static void recursion(Integer x, Integer y) {
        if (x % y == 0) {
            System.out.println("边长为" + y);
        } else {
            recursion(y, x % y);
        }
    }
}
