package cn.maidaotech.java07.chapter03.practice08;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return new BigDecimal(Math.pow(radius, 2)).multiply(new BigDecimal(Math.PI)).setScale(2, RoundingMode.HALF_UP)
                .doubleValue();
    }

    @Override
    double perimeter() {
        return new BigDecimal(2).multiply(new BigDecimal(Math.PI)).multiply(new BigDecimal(radius))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}