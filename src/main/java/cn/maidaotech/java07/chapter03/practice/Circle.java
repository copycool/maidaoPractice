package cn.maidaotech.java07.chapter03.practice;

public class Circle extends Shape {

    private Integer r;

    @Override
    Double area() {
        return 0.5 * Math.PI * r * r;
    }

    @Override
    Double perimeter() {
        return 2 * r * Math.PI;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

    public Circle(Integer r) {
        this.r = r;
    }

}