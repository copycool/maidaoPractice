package cn.maidaotech.java07.chapter06;

public class Test04 {
    public static void main(String[] args) {
        // int result = test1();
        // System.out.println(result);

        int result02 = test2();
        System.out.println(result02);

        // int result03 = test3();
        // System.out.println(result03);

        // int result04 = test4();
        // System.out.println(result04);
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
        } finally{
            i++;
            System.out.println("finally block i = " + i);
            return i;
        }
    }

    public static int test4() { 
        // try 语句块中有 return 语句时的整体执行顺序
        int i = 1;
        try {
            i++;
            System.out.println("try block, i = " + i);
            return i++;
        } catch (Exception e) {
            i++;
            System.out.println("catch block i = " + i);
            return i;
        } finally {
            i++;
            System.out.println("finally block i = " + i);
        }
    }
}
