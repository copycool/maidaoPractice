package cn.maidaotech.java07;

public class Circle extends Shape {
    public double lenght;
    @Override
    double area() {
        return Math.PI*((lenght/2)*(lenght/2));
    }

    @Override
    double perimeter() {
        return 2*Math.PI*(lenght/2);
    }
    public Circle(double lenght){
        this.lenght=lenght;
    }
    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    
}