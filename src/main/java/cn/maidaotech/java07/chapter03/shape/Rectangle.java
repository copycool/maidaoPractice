package cn.maidaotech.java07.chapter03.shape;



public class Rectangle extends Shape {

    private double length;
    private double width;

    @Override
    public void area() {
        System.out.println("长方形面积是："+length*width);


    }

    @Override
    public void perimeter() {
        System.out.println("长方形周长是："+(length+width)*2);

    }

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
    
}