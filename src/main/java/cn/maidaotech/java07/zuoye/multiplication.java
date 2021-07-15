package cn.maidaotech.java07.zuoye;

//9*9乘法表
public class multiplication {

    public static void main(String[] args) {

        int i, j;
        for (i = 1; i <= 9; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(i + "*" + j + "=" + i * j);
                continue;
            }
            System.out.println();
        }
    }
}
