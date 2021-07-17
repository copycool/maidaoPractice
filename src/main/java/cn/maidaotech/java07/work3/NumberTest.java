package cn.maidaotech.java07.work3;

public class NumberTest {
    public static void main(String[] args) {

        NumberCal nu1 = new NumberCal(2.2, 0);
        NumberCal nu2 = new NumberCal(5.5, 1.1);
       System.out.println(nu1.minus());
        System.out.println(nu1.division());
        System.out.println(nu1.plus());
        System.out.println(nu2.multiply());
    }

}
