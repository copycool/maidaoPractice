package com.example.three.shape;

public class Circle extends Shape {
    private Double r;

    public Circle(Double r){
        this.r = r;
    }
    @Override
    double area() {
        // TODO Auto-generated method stub
        return r * r * Math.PI /2;
    }

    @Override
	double perimeter() {
		// TODO Auto-generated method stub
		return r*Math.PI*2;
	}
    
}

   