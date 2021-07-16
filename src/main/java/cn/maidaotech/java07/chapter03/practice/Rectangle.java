package cn.maidaotech.java07.chapter03.practice;

public class Rectangle extends Shape {

    private Double length;
    private Double width;

    @Override
    Double area() {
        // TODO Auto-generated method stub
        return length * width;
    }

    @Override
    Double perimeter() {
        // TODO Auto-generated method stub
        return (length + width) * 2;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

}