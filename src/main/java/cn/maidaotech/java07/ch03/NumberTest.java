package cn.maidaotech.java07.ch03;

public class NumberTest {
    public static void main(String[] args) {
        Number num=new Number(9,3);
        System.out.println(num);
        System.out.println(num.plus());
        System.out.println(num.minus());
        System.out.println(num.multiply());
        System.out.println(num.division());

    }
}
