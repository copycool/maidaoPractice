package cn.maidaotech.java07.chapter03.shape;
/**
 * 定义一个抽象类Shape，表示二维图形，拥有抽象方法area和perimeter，
 * 分别用来计算形状的面积和周长。定义一些二维形状类，如矩形、正三角形、圆等，
 * 都是shape的子类。编写测试类分别计算面积和周长。
 */
public class Test {
    public static void main(String[] args) {
        Shape triangle = new RegularTriangleImpl(20.0);
        System.out.println(triangle.area()); 
        System.out.println(triangle.perimeter());
        Shape circle = new CircleImpl(4.0);
        System.out.println(circle.area());
        System.out.println(circle.perimeter());
    }
    
}
