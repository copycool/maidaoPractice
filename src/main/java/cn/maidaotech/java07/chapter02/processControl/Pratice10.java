package cn.maidaotech.java07.chapter02.processControl;

public class Pratice10 {
    //输出9*9乘法口诀
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+"*"+i+"="+i*j+"\t");
            }
            System.out.println();
        }
    }
}