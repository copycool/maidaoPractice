package cn.maidaotech.java07.ch03;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape{
    private double a;

    public Triangle(){

    }public Triangle(double a){
        this.a=a;
    }

    
    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }


    @Override
    public double area() {
        return new BigDecimal(Math.pow(a, 2)).multiply(new BigDecimal(Math.sqrt(3))).divide(new BigDecimal(4))
        .setScale(2, RoundingMode.HALF_UP).doubleValue();

    }
    @Override
    public double perimeter() {
        return 3*a;
    }


    
}
