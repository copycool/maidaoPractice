package cn.maidaotech.java07.chapter03;

public abstract class Shape {
    //定义一个抽象类Shape，表示二维图形，拥有抽象方法area和perimeter，分别用来计算形状的面积和周长。
    //定义一些二维形状类，如矩形、正三角形、圆等，都是shape的子类。编写测试类分别计算面积和周长。
    public abstract void area();
    public abstract void perimeter();

}