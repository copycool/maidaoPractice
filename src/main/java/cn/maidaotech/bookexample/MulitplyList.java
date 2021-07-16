package cn.maidaotech.bookexample;

public class MulitplyList {
    //乘法口诀表
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                System.out.printf("%d*%d=%2d ", i, j, i * j);
            }
            System.out.println();
        }
    }
}