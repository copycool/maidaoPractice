package cn.maidaotech.java07.chapter03.shape;

public class ShapeTast {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setR(4);
        circle.area();
        circle.perimeter();

        Rectangle rectangle = new Rectangle();
        rectangle.setLength(3.0);
        rectangle.setWidth(3);
        rectangle.area();
        rectangle.perimeter();


        

    }
}