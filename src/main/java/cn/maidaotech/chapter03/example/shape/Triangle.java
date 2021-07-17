package cn.maidaotech.chapter03.example.shape;

public class Triangle extends Shape{
    private Double length;

    @Override
    public Double area() {
        return Math.sin(Math.PI/3) * length* length*0.5;
    }
    @Override
    public Double perimeter() {
        return length*3;
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