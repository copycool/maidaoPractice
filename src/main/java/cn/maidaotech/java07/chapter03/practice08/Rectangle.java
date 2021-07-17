package cn.maidaotech.java07.chapter03.practice08;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return new BigDecimal(length).multiply(new BigDecimal(width)).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    @Override
    double perimeter() {
        return length * 2 + width * 2;
    }

    public double getLength() {
        return this.length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

}