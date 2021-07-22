package cn.maidaotech.java07.third.shap;

public class Circular {
    double radius;
    public  Circular(double radius){
        this.radius=radius;
    }
    
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    double area(){
        return radius*radius*Math.PI;
    }
    double perimeter(){
        return 2*radius*Math.PI;
    }
}
