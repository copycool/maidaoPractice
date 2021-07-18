package cn.maidaotech.java07.ch03;

public class Square extends Shape {
    private double b;
    public Square(){

    }
    public Square(double b){
        this.b=b;
    }


    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }

    
    @Override
    public double area() {
        return b*b;
    }
    @Override
    public double perimeter() { 
        return 4*b;
    }

    

    
}
