package cn.maidaotech.java07.chaptet03;

public class ShapTest {
    public static void main(String[] args) {
        Cricle c = new Cricle(5);
        Triangle t = new Triangle(5);
        Rectangle r = new Rectangle(7, 9);
        System.out.println("圆的面积为："+c.area());
        System.out.println("圆的周长为："+c.perimeter());
        System.out.println("正三角形的面积为"+t.area());
        System.out.println("正三角形的周长为"+t.perimeter());
        System.out.println("矩形的面积为"+r.area());
        System.out.println("矩形的周长为"+r.perimeter());
    }
    
}