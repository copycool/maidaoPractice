package com.example.three.shape;

public class Triangle extends Shape{
    private Double a;
    private Double b;
    private int c;
    private int d;
    public Triangle(Double a,Double b,int c,int d){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;

    }
    @Override
    double area() {
        return a*b/2;
    }
    @Override
    double perimeter() {
        return a+c+d;
    }
    
}