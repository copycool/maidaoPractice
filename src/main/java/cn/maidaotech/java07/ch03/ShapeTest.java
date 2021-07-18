package cn.maidaotech.java07.ch03;

public class ShapeTest {
    public static void main(String[] args) {
        Circle c=new Circle(3);
        Triangle t=new Triangle(2);
        Square s=new Square(4);
        System.out.println("圆的面积："+c.area());
        System.out.println("圆的周长："+c.perimeter());
        System.out.println("三角形的面积："+t.area());
        System.out.println("三角形的周长："+t.perimeter());
        System.out.println("正方形的面积："+s.area());
        System.out.println("正方形的周长："+s.perimeter());

    }
}
