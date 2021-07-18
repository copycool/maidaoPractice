package cn.maidaotech.java07.chapter03;

public class ShapTest {
    public static void main(String[] args) {
        {
            Rectangle rectangle = new Rectangle(5.3, 2.3);
            System.out.println("长为" + rectangle.getLength() + "宽为" + rectangle.getWidth() + "的正方形:");
            System.out.println("面积:" + rectangle.area());
            System.out.println("周长:" + rectangle.perimeter());
        }
        {
            Triangle triangle = new Triangle(0.8);
            System.out.println("边长为" + triangle.getLength() + "的正三角形：");
            System.out.println("面积:" + triangle.area());
            System.out.println("周长:" + triangle.perimeter());
        }
        {
            Circle circle = new Circle(5);
            System.out.println("半径为" + circle.getRadius() + "的圆形：");
            System.out.println("面积:" + circle.area());
            System.out.println("周长:" + circle.perimeter());
        }

    }
    
}