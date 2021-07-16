package cn.maidaotech.java07.chapter03;

public class Rectangular extends Shape {
    private Double x;
    private Double y;
    
    public Rectangular() {
    }

    public Rectangular(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public Double area() {
        Double area = this.x * this.y;
        return area;
    }

    @Override
    public Double perimeter() {
        Double perimeter = this.x * 2 + this.y * 2;
        return perimeter;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

    public Double getY() {
        return y;
    }

    public void setY(Double y) {
        this.y = y;
    }
    
}
