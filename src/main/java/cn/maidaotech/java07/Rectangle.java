package cn.maidaotech.java07;

public class Rectangle extends Shape {
    private double width; // 宽度
    private  double lenght; // 长度

    @Override
    double area() {
        return lenght * width; //面积
        
    }

    @Override
    double perimeter() {
        
        return lenght * 2 + width * 2; //周长
    }

    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }

}