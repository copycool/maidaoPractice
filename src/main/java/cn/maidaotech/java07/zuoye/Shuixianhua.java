package cn.maidaotech.java07.zuoye;

//打印出所有的“水仙花数”，即一个三位数，其各位数字的立方和等于该数本身，例如153
public class Shuixianhua {
    public static void main(String[] args) {
        for (int num = 100; num < 1000; num++) {
            int a = num / 100;
            int b = num / 10 % 10;
            int c = num % 10;
            if (a * a * a + b * b * b + c * c * c == num) {
                System.out.println(num);
            }
        }
    }
}