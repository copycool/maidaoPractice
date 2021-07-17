package cn.maidaotech.java07.work2.calculator;

public class Circle extends Shep {
    private Double radius;

    public Circle() {
    }

    public Circle(Double radius) {
        this.radius = radius;
    }

    @Override
    public void area() {
        System.out.println(Math.floor(Math.PI * Math.pow(this.radius, 2)));
    }

    @Override
    public void perimeter() {
        System.out.println(Math.floor(2 * Math.PI * this.radius));
    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}