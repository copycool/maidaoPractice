package cn.maidaotech.java07.chapter;

public class ExceptionTest {
    public static void main(String[] args) {
        int result = test();
        System.out.println(result);
    }

    public static int test() {
        // try 语句块中有 return 语句时的整体执行顺序
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
            i = 10;
            System.out.println("finally block i = " + i);
        }
    }
}