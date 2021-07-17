package cn.maidaotech.java07.chaptet03;

public class Rectangle extends Shap{
    private double length;
    private double width;
     

    public  Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

@Override
double area() {
  return length*width;
}

@Override
double perimeter() {
    return (length+width)*2;
}
  
    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

   

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    
    
}