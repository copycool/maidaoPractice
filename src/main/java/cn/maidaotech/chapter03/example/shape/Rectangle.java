package cn.maidaotech.chapter03.example.shape;

public class Rectangle extends Shape {
    // 这里的重写要和抽象类的传参保持一致即无参
    // 实现运算则依赖于自身属性
    // 其实还是自己对面向对象不够理解
    private Double height;
    private Double length;

    @Override
    public Double area() {
        return 2 * (height + length);
    }

    @Override
    public Double perimeter() {
        return height * length;
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