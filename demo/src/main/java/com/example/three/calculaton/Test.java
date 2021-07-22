package com.example.three.calculaton;

public class Test {
    public static void main(String[] args) {
        Math m = new Math(50, 15);
       System.out.println("加法：" + m.getX() + "+" + m.getY() + "=" + m.plus());
       System.out.println("减法：" + m.getX() + "-" + m.getY() + "=" + m.minus());
       System.out.println("乘法：" + m.getX() + "*" + m.getY() + "=" + m.multiply());
       System.out.println("除法：" + m.getX() + "/" + m.getY() + "=" + m.division());
    }
}