package cn.maidaitech.shui966.Char3;
//八
public class sqrt extends shape{
    private Integer radius;
    public sqrt(){

    }
    public sqrt(Integer radius){
        this.radius=radius;
    }

    @Override
    public void area() {
        System.out.println("圆的面积为："+Math.PI*radius*radius);

    }

    @Override
    public void perimeter() {
        System.out.println("圆的圆周长："+2*Math.PI*radius);

    }
    public void setRadius(Integer radius) {
        this.radius = radius;
    }
    public Integer getRadius() {
        return radius;
    }
}