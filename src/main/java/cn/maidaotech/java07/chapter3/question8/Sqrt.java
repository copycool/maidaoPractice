package cn.maidaotech.java07.chapter3.question8;

public class Sqrt extends Shape{
    private Integer radius;
    public Sqrt(){

    }
    public Sqrt(Integer radius){
        this.radius=radius;
    }

    @Override
    public String area() {
        return ("圆的面积为："+Math.PI*radius*radius);

    }

    @Override
    public String perimeter() {
        return ("圆的圆周长："+2*Math.PI*radius);

    }
    public void setRadius(Integer radius) {
        this.radius = radius;
    }
    public Integer getRadius() {
        return radius;
    }
}