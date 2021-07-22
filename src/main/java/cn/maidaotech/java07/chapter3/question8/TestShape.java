package cn.maidaotech.java07.chapter3.question8;

public class TestShape{
    public static void main(String[] args) {
        Rectangle rec=new Rectangle(5,9);
        EquilateralTriangle equ=new EquilateralTriangle(6);
        Sqrt sq=new Sqrt(3);
        System.out.println(rec.area());
        System.out.println(rec.perimeter());
        System.out.println(equ.area());
        System.out.println(equ.perimeter());
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
    }
}