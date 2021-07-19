package cn.maidaotech.java07.order.shape;
import java.math.BigDecimal;
import java.math.RoundingMode;


import java.math.BigDecimal;

public class Circular extends Shape{
    private double radius;
    public Circular(){

    }
    public Circular(double radius){
        this.radius=radius;
    }
    double area(){
        return radius*radius*Math.PI;

    }
    double  perimeter(){
        return 2*radius*Math.PI;
    }
   public double getRadius(){
       return radius;
   }
    public void setRadius(double radius){
        this.radius=radius;
    }
} 
    
