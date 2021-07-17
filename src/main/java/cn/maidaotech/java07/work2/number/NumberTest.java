package cn.maidaotech.java07.work2.number;

public class NumberTest {
    public static void main(String[] args) {
        Number num = new Number(3, 5);
        System.out.println(num.plus());
        System.out.println(num.minus());
        System.out.println(num.multipy());
        System.out.println(num.division());
    }
}