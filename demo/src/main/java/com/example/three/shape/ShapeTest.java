package com.example.three.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Circle c = new Circle(2.3);
        System.out.println("圆的面积是："+c.area()+"\n"+"圆的周长是："+c.perimeter());
        Rectangle r = new Rectangle(1.2, 3.2);
        System.out.println("矩形的面积是："+r.area()+"\n"+"矩形的周长是："+r.perimeter());
        Triangle t = new Triangle(2.2, 2.3, 3, 4);
        System.out.println("三角形的面积是:"+t.area()+"\n"+"三角形的周长是："+t.perimeter());
    }
}