package cn.maidaotech.java07.chapter02;

public class Processcontrol {
    public static void main(String[] args) {
        Processcontrol.pro1();
        printlnSquare();
    }

    private static void pro1() {
        int a = 10;
        int b = 49;
        int c = 78;
        int d = a < b ? a : b;
        int e = d > c ? d : c;
        System.out.println(e);
        System.out.println(d);
    }

    private static void printlnSquare() {
        for (int i = 1; i <= 5; i++) {
            StringBuilder builder = new StringBuilder();
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 5) {
                    builder.append(" * ");
                } else if (j == 1 || j == 5) {
                    builder.append(" * ");
                } else {
                    builder.append("   ");
                }

            }
            System.out.println(builder.toString());
        }
    }

}