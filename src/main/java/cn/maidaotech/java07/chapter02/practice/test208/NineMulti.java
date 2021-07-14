package cn.maidaotech.java07.chapter02.practice.test208;

public class NineMulti {
    public static void println() {
        for (int i = 1; i <= 9; i++) {
            StringBuilder curLine = new StringBuilder();
            for (int j = 1; j <= i; j++) {
                curLine.append(i + " * " + j + " = " + i * j + " ");
            }
            System.out.println(curLine.toString());
        }
    }
}