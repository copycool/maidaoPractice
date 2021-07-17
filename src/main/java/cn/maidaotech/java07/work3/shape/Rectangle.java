package cn.maidaotech.java07.work3.shape;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // 长方形面积
    @Override
    public double area() {
        return this.length * this.width;
        // System.out.println("长方形面积是：" + (this.length * this.width));
    }

    // 长方形周长
    @Override
    public double perimeter() {
        return 2 * (length + width);
        // System.out.println("长方形周长是：" + 2 * (length + width));
    }

    // public void rectangle(){
    // System.out.println(area()+perimeter());
    // }
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
