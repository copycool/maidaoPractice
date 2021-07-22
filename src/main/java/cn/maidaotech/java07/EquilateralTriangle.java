package cn.maidaotech.java07;

public class EquilateralTriangle extends Shape {
    private double lenght; // 长度 
    @Override
    double area() {
        return (Math.sqrt(3/2)*lenght*lenght*0.5);
    }

    @Override
    double perimeter() {
        return lenght*3;
    }
    public EquilateralTriangle(double lenght){
        this.lenght=lenght;
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    
}