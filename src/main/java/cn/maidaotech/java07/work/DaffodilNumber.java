package cn.maidaotech.java07.work;

import java.util.Scanner;

public class DaffodilNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入1000以内的正整数");
        int number = input.nextInt();
        boolean res = check(number);
        if (res) {
            System.out.println(number + "是水仙花数");
        } else {
            System.out.println(number + "不是水仙花数");
        }
        input.close();
    }

    /**
     * 查看指定数值是否是水仙花数
     * 
     * @param daffodilNum 被检验的数值
     * @return 水仙花数为：true 不是水仙花数返回false
     */
    private static boolean check(int daffodilNum) {

        if (daffodilNum < 0 || daffodilNum > 1000) {
            return false;
        }
        int g = daffodilNum % 10;
        int s = daffodilNum % 100 / 10;
        int b = daffodilNum / 100;

        if ((g * g * g) + (s * s * s) + (b * b * b) == daffodilNum) {
            return true;
        } else {
            return false;
        }
    }
}