package cn.maidaotech.java07.chapter03.practice05;

public class NumberTest {
    public static void main(String[] args) {
        Number num = new Number(50, 5);
        System.out.println(num.getX() + "+" + num.getY() + "=" + num.plus());
        System.out.println(num.getX() + "-" + num.getY() + "=" + num.minus());
        System.out.println(num.getX() + "*" + num.getY() + "=" + num.multiply());
        System.out.println(num.getX() + "/" + num.getY() + "=" + num.division());
    }
}