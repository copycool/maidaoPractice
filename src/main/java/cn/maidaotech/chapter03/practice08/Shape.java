package cn.maidaotech.chapter03.practice08;
/*
定义一个抽象类Shape，表示二维图形，拥有抽象方法area和perimeter，分别用来计算形状的面积和周长。
定义一些二维形状类，如矩形、正三角形、圆等，都是shape的子类。编写测试类分别计算面积和周长。

*/
public abstract class Shape {//二维图形  抽象方法
    abstract double area();
    abstract double perimeter();
}