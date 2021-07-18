package cn.maidaotech.java07.ch03;

public class Circle extends Shape{
    private double r;

    public Circle(){

    }
    public Circle(double r){
        this.r=r;
    }
    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }


    @Override
    public double area() {
         return r*r*3.14;
    }
    @Override
    public double perimeter() {
        return 2*r*3.14;
    }
    
    
}
