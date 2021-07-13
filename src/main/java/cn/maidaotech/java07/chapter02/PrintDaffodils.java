package cn.maidaotech.java07.chapter02;

public class PrintDaffodils {
    //打印出所有的“水仙花数”，即一个三位数，其各位数字的立方和等于该数本身，例如153
    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            int sum = a*a*a+b*b*b+c*c*c;
            if(sum == i){
                System.out.println(i);
            }
        }
    }
    
}