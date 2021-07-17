package cn.maidaotech.java07.work3.shape;

public class Circle extends Shape {
    private double radius;

    public Circle(){}
    public Circle(double radius){
        this.radius=radius;
    }
     // 圆面积
     @Override
     public double area() {
         return radius*radius*Math.PI;
        //  System.out.println("圆面积是：" + (radius*radius*Math.PI));
     }
 
     //圆周长
     @Override
     public double perimeter() {
         return 2*radius*Math.PI;
        //  System.out.println("圆周长是：" + 2*radius*Math.PI );
     }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    
}
