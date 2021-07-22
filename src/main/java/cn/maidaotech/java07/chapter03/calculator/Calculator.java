package cn.maidaotech.java07.chapter03.calculator;
/**
 * 编写Java程序模拟简单的计算器。定义Number类，其中有两个成员变量x和y，用构造函数赋值x和y的初始值.
 * 定义加plus、减minus、乘multiply、除division等公有成员方法，分别对两个成员变量执行加减乘除的运算。
 * 在main方法中创建Number对象并调用各个方法，显示计算结果。
 */
public class Calculator {
    public static void main(String[] args) {
        NumberCalc num = new NumberCalc();
        System.out.println(num.plus(10, 5));
        System.out.println(num.minus(-1, -2));
        System.out.println(num.multiply(10, 20));
        System.out.println(num.division(20, 2));
        System.out.println(num.division(1, 3));
    }
    
}