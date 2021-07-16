package cn.maidaotech.chapter03.exampletest;

import cn.maidaotech.chapter03.example.Calc;

public class Clactest {
    public static void main(String[] args) {
        Double x = 3.5;
        Double y = 3.5;
        System.out.println(x + "和" + y + "的加法运算结果" + Calc.plus(x, y));
        System.out.println(x + "和" + y + "的减法运算结果" + Calc.minus(x, y));
        System.out.println(x + "和" + y + "的乘法运算结果" + Calc.multiply(x, y));
        System.out.println(x + "和" + y + "的除法运算结果" + Calc.division(x, y));
    }
}