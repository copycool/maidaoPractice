package cn.maidaotech.java07.chapter03.shape;

public class Circle extends Shape {

    private double r;

    @Override
    public void area() {
        // TODO Auto-generated method stub
        System.out.println("面积为："+2*Math.PI*r*r);
    }

    @Override
    public void perimeter() {
        // TODO Auto-generated method stub
        System.out.println("周长为："+2*Math.PI*r);

    }
    

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }



}