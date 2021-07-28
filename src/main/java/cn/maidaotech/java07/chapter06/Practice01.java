package cn.maidaotech.java07.chapter06;

public class Practice01 {
    public static void main(String[] args) {
        print();
    }

    public static void print() {
        int i = 1;

        try {
            System.out.println("try block:" + i);
        } catch (Exception e) {
            System.out.println("catch block:" + i);
        } finally {
            i = 10;
            System.out.println("finally block:" + i);
        }

        System.out.println(i);;
    }
}