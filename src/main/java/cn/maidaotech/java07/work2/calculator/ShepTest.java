package cn.maidaotech.java07.work2.calculator;

public class ShepTest {
    public static void main(String[] args) {
        Shep circle = new Circle(35.5);
        Shep rectangle = new Rectangle(25.8, 12.2);
        Shep triangle = new Triangle(25.0, 23.2);

        circle.area();
        circle.perimeter();
        System.out.println("-------------------------");
        rectangle.area();
        rectangle.perimeter();
        System.out.println("-------------------------");
        triangle.area();
        triangle.perimeter();

    }

}