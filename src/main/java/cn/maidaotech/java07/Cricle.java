package cn.maidaotech.java07.unit3;

public class Cricle extends Shape {
    private Double r;

    @Override
    public Double area() {
        // TODO Auto-generated method stub
        return Math.PI * r * r;
    }

    @Override
    public Double perimeter() {
        // TODO Auto-generated method stub
        return Math.PI * 2 * r;
    }

    public Cricle() {
    }

    public Cricle(Double r) {
        this.r = r;
    }

    public Double getR() {
        return r;
    }

    public void setR(Double r) {
        this.r = r;
    }

}