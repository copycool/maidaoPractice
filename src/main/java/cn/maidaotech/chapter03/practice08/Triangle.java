package cn.maidaotech.chapter03.practice08;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape{
    private double length;

    @Override
    double area() {
        return  new BigDecimal(Math.pow(length, 2)).multiply(new BigDecimal(Math.sqrt(3))).divide(new BigDecimal(4))
        .setScale(2, RoundingMode.HALF_UP).doubleValue();

    }
    @Override
    double perimeter() {
        return 3*length;
    }

    public Triangle(double length) {
        this.length = length;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
}