package cn.maidaotech.java07.work;

public class Show99 {
    public static void main(String[] args) {
        show99();
    }

    public static void show99() {
        for (int i = 1; i <= 9; i++) {// 打印9行
            for (int j = 1; j <= i; j++) {
                System.out.print("" + i + "x" + j + "=" + i * j + " ");
            }
            System.out.println();// 换行
        }

    }
}