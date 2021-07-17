package cn.maidaotech.chapter03.exampletest;

import cn.maidaotech.chapter03.example.shape.Circle;
import cn.maidaotech.chapter03.example.shape.Rectangle;
import cn.maidaotech.chapter03.example.shape.Triangle;

public class ShapeTest {
    
    public static void main(String[] args) {
    Circle circle = new Circle(1.0);
    Triangle triangle = new Triangle(2.0);
    Rectangle rectangle = new Rectangle(4.0,6.0);
    System.out.println(circle.area());
    System.out.println(circle.perimeter());
    System.out.println(triangle.area());
    System.out.println(triangle.perimeter());
    System.out.println(rectangle.area());
    System.out.println(rectangle.perimeter());
    }
}