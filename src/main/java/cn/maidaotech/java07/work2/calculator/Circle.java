package cn.maidaotech.java07.work2.calculator;

public class Circle extends Shep {
    private final static double PI = 3.14;
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        // TODO Auto-generated method stub
        System.out.println(Circle.PI * Math.pow(this.radius, 2) );
    }

    @Override
    public void perimeter() {
        // TODO Auto-generated method stub
        System.out.println(2 * Circle.PI * this.radius);
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}