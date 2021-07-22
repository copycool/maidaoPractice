package cn.maidaotech.java07.chapter03.shape;

public class CircleImpl implements Shape {

    private Double radius;

    public CircleImpl() {
    }

    public CircleImpl(Double radius) {
        this.radius = radius;
    }

    @Override
    public String area() {
        // TODO Auto-generated method stub
        double area01 = Math.PI * Math.pow(radius, 2);
        return ("圆的半径为：" + radius + "\n" + "圆的面积为：" + area01);

    }

    @Override
    public String perimeter() {
        // TODO Auto-generated method stub
        double perimeter01 = 2 * Math.PI * radius;
        return ("圆的周长为：" + perimeter01);

    }

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

}
