package cn.maidaotech.java07.unit3;

public class ComputerTest {
    public static void main(String[] args) {
        Double x=3.0;
        Double y=4.0;
        System.out.println("x和y的加法运算结果是："+Computer.plus(x, y));
        System.out.println("x和y的减法运算结果是："+Computer.minus(x, y));
        System.out.println("x和y的乘法运算结果是："+Computer.multiply(x, y));
        System.out.println("x和y的除法运算结果是："+Computer.divisions(x, y));
    }
    
}