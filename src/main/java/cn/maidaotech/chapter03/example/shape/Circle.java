package cn.maidaotech.chapter03.example.shape;

public class Circle extends Shape {
    private Double r;
    //关于构造方法，一般无参的不需要写无参构造方法
    //但是如果有参数，又需要无参的情况，需要再写一下无参构造方法

    @Override
    public Double area() {
        return Math.PI * r * r;
    }

    @Override
    public Double perimeter() {
        return Math.PI * 2 * r;
    }

    public Circle() {
    }

    public Circle(Double r) {
        this.r = r;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }
}