package cn.maidaotech.java07.chapter02.operator;

public class Practice05 {
    //从键盘输入学生学号，例如2019年01期12号，输入20190112，
    //使用“/”和“%”运算符分解学号获得年份、期数和序号，并分别输出
    public static void main(String[] args) {
        int id = 20190112;

        int year = id/10000;
        int semester = id%10000/100;
        int num = id%100;
        System.out.println("年份是："+year);
        System.out.println("期数是："+semester);
        System.out.println("序号是："+num);


    }
}