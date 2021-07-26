package cn.maidaotech.java07.chapter02;

public class GainPeriod {
    //从键盘输入学生学号，例如2019年01期12号，输入20190112，
    //使用“/”和“%”运算符分解学号获得年份、期数和序号，并分别输出。
    public static void main(String[] args) {

        //方法一

        // Scanner sc = new Scanner(System.in);
        // System.out.println("请输入一个八位数字：");
        // String num = sc.nextLine();
    
        // String a = num.substring(0, 4);
        // String b = num.substring(4, 6);
        // String c = num.substring(6, 8);
        // System.out.println("年份是："+a);
        // System.out.println("期数是："+b);
        // System.out.println("序号是："+c);
    
    
        //方法二

        int number = 20180109;
        int year = number / 10000;
        int month = number % 10000/100;
        int day = number % 10000%100;
         
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);
    }
}