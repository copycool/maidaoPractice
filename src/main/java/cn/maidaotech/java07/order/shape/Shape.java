package cn.maidaotech.java07.order.shape;
// 8. 定义一个抽象类 Shape，表示二维图形，拥有抽象方法 area 和 perimeter，
// 分别用来计算形状的 面积和周长。定义一些二维形状类，如矩形、三角形、圆等，都是 shape 的子类。
public abstract class Shape {
abstract double area();
abstract double perimeter();
   
}
