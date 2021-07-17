package cn.maidaotech.java07.unit3;

public class Rectangle extends Shape {
    private Double height;
    private Double length;

    @Override
    public Double area() {
        // TODO Auto-generated method stub
        return (height + length) * 2;
    }

    @Override
    public Double perimeter() {
        // TODO Auto-generated method stub
        return (height + length);
    }

    public Rectangle() {
    }

    public Rectangle(Double height, Double length) {
        this.height = height;
        this.length = length;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

}