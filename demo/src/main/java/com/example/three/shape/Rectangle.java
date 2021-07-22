package com.example.three.shape;

public class Rectangle extends Shape {
    private Double x;
    private Double y;

    public Rectangle(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    double area() {
        
        return x*y;
    }

    @Override
    double perimeter() {
        // TODO Auto-generated method stub
        return (x+y)*2;
    }
    
}