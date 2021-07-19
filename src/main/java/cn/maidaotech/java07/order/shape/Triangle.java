package cn.maidaotech.java07.order.shape;

import java.math.BigDecimal;
import java.math.RoundingMode;

// 定义一个抽象类 Shape，表示二维图形，拥有抽象方法 area 和 perimeter，
// 分别用来计算形状的 面积和周长。定义一些二维形状类，如矩形、三角形、圆等，都是 shape 的子类。
public  class Triangle extends Shape {
    private double length;

    public Triangle(double length) {
        
        this.length = length;
    }

    public Triangle() {
    }

    @Override
    double area() {// 正三角形面积公式=4分之3的平方根乘以边长的平方
        return new BigDecimal(Math.pow(length, 2)).multiply(new BigDecimal(Math.sqrt(3))).divide(new BigDecimal(4))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();

    }

    @Override
    double perimeter() {
        return length * 3;
    }

    public double getLength() {

        return this.length;
    }


    public void setLength(double length) {
        if(length<0){
            System.out.println("cuo");
        }else { 
            this.length = length;
    }
    }
}


 