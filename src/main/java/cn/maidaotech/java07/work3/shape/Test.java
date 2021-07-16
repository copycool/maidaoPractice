package cn.maidaotech.java07.work3.shape;

public class Test {
    public static void main(String[] args) {

        Shape rectangle = new Rectangle(3, 4);
        Shape regularTriangle = new RegularTriangle(6);
        Shape circle = new Circle(6);
        rectangle.area();
        rectangle.perimeter();
        regularTriangle.area();
        regularTriangle.perimeter();
        circle.area();
        circle.perimeter();
    }
}
