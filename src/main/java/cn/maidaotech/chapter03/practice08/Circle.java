package cn.maidaotech.chapter03.practice08;

public class Circle extends Shape {//圆
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
    @Override
    double perimeter() {
        return 2 * Math.PI * radius;
    }
    
}