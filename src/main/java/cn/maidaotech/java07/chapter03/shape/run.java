package cn.maidaotech.java07.chapter03.shape;

public class run {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Circle.radius = 2.0;
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
        Rectangle rectangle =new Rectangle();
        rectangle.width = 6.0;
        rectangle.height = 9.0;
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        Triangle triangle = new Triangle();
        triangle.a = 66.0;
        triangle.b = 88.8;
        triangle.c = 99.9;
        System.out.println(triangle.area());
        System.out.println(triangle.perimeter());

    }
    
}