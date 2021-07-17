package cn.maidaotech.java07.chaptet03;

public class Cricle extends Shap {
    private double radius;


    public Cricle(double radius){
        this.radius = radius;

    }
   

    @Override
    double area() {
        return radius*radius;
    }

    @Override
    double perimeter() {
        return 3.14*(2*radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}