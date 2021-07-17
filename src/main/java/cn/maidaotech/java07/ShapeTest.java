package cn.maidaotech.java07.unit3;

public class ShapeTest {
    public static void main(String[] args) {
        Cricle cricle = new Cricle(3.0);
        Rectangle rectangle = new Rectangle(2.0, 3.0);
        Triangle triangle = new Triangle(4.0);
        System.out.println("圆形的面积是：" + cricle.area());
        System.out.println("圆形的周长是：" + cricle.perimeter());
        System.out.println("矩形的面积是：" + rectangle.area());
        System.out.println("矩形的周长是：" + rectangle.perimeter());
        System.out.println("三角形的面积是：" + triangle.area());
        System.out.println("三角形的周长是：" + triangle.perimeter());
    }

}