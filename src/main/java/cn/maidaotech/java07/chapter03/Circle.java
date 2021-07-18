package cn.maidaotech.java07.chapter03;

import java.math.BigDecimal;
import java.math.RoundingMode;


public class Circle extends Shape {
    private Double radius;

    public Circle(){

    } 
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    Double area(){
        return new BigDecimal(Math.pow(radius, 2)).multiply(new BigDecimal(Math.PI)).setScale(2,RoundingMode.HALF_UP).doubleValue();

    }
    @Override
    Double perimeter(){
        return new BigDecimal(2).multiply(new BigDecimal(Math.PI)).multiply(new BigDecimal(radius)).setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    



    
}