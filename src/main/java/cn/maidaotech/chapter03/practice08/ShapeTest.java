package cn.maidaotech.chapter03.practice08;

public class ShapeTest {
    public static void main(String[] args) {
        
        
       
        {
            Circle c = new Circle(2);
            System.out.println("半径为" + c.getRadius() + "的圆形：");
            System.out.println("   面积:" + c.area());
            System.out.println("   周长:" + c.perimeter());
        }
        {
            Rectangle r = new Rectangle(3.2, 4.2);
            System.out.println("长为" + r.getLength() + "宽为" + r.getWidth() + "的正方形:");
            System.out.println("   面积:" + r.area());
            System.out.println("   周长:" + r.perimeter());

        }
        {
            Triangle t = new Triangle(2);
            System.out.println("边长为" + t.getLength() + "的正三角形：");
            System.out.println("   面积:" + t.area());
            System.out.println("   周长:" + t.perimeter());

        }

    }
}