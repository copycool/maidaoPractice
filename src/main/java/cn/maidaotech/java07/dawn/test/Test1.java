package cn.maidaotech.java07.dawn.test;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        // int result = test4();
        // System.out.println("result:" + result);
        System.out.println("ni zhen bang");
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