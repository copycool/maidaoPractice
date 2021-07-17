package cn.maidaotech.java07.work3.shape;

public class Test {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(3, 4);
        Shape regularTriangle = new RegularTriangle(6);
        Shape circle = new Circle(6);
        System.out.println("矩形面积是："+rectangle.area() +",周长是："+ rectangle.perimeter());
        System.out.println("正三角面积是："+regularTriangle.area()  +",周长是："+regularTriangle.perimeter());
        System.out.println("圆面积是："+circle.area() +",周长是："+ circle.perimeter());
    }
}
