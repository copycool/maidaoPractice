package cn.maidaotech.java07;
public class ShapeDemo {
    public static void main(String[] args) {
        Rectangle rectangle=new Rectangle(5,7);
        System.out.println("长为"+rectangle.getLenght()+"高为"+rectangle.getWidth()+"矩形");
        System.out.println("面积为"+rectangle.area());
        System.out.println("周长为"+rectangle.perimeter());       
        EquilateralTriangle equilateralTriangle=new EquilateralTriangle(5);
        System.out.println("边长"+equilateralTriangle.getLenght()+"等边三角形");
        System.out.println("面积为"+equilateralTriangle.area());
        Circle circle=new Circle(5);
        System.out.println("直径为"+circle.getLenght()+"圆形");
        System.out.println("面积为"+circle.area());

        
        }
    
}