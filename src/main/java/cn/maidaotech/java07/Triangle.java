package cn.maidaotech.java07.unit3;

public class Triangle extends Shape {
    private Double length;

    @Override
    public Double area() {
        // TODO Auto-generated method stub
        return Math.sin(Math.PI / 3) * length * length * 0.5;
    }

    @Override
    public Double perimeter() {
        // TODO Auto-generated method stub
        return length * 3;
    }

    public Triangle() {
    }

    public Triangle(Double length) {
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

}