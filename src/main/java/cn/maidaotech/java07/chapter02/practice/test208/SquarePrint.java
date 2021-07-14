package cn.maidaotech.java07.chapter02.practice.test208;

public class SquarePrint {
    public static void print() {
        for (int i = 1; i <= 100; i++) {
            StringBuilder curLine = new StringBuilder();
            for (int j = 1; j <= 100; j++) {
                if (i == 1 || i == 100)
                    curLine.append(" * ");
                else if (j == 1 || j == 100)
                    curLine.append(" * ");
                else
                    curLine.append("   ");
            }
            System.out.println(curLine.toString());
        }
    }
}