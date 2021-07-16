package cn.maidaotech.java07.work2.calculator;

public class Triangle extends Shep {
    private Double side;
    private Double high;

    public Triangle() {
    }

    public Triangle(Double side, Double high) {
        this.side = side;
        this.high = high;
    }

    @Override
    public void area() {
        // TODO Auto-generated method stub
        System.out.println((this.side * this.high) / 2);
    }

    @Override
    public void perimeter() {
        // TODO Auto-generated method stub
        System.out.println(this.side + this.side + this.side);
    }

    public Double getside() {
        return side;
    }

    public void setside(Double side) {
        this.side = side;
    }

    public Double getHigh() {
        return high;
    }

    public void setHigh(Double high) {
        this.high = high;
    }

}