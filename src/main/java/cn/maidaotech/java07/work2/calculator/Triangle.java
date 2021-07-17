package cn.maidaotech.java07.work2.calculator;

public class Triangle extends Shep {
    private Number side;
    private Number high;

    public Triangle() {
    }

    public Triangle(Double side, Double high) {
        this.side = side;
        this.high = high;
    }

    @Override
    public void area() {
        System.out.println((this.side.doubleValue() * this.high.doubleValue()) / 2);
    }

    @Override
    public void perimeter() {
        System.out.println(this.side.doubleValue() + this.side.doubleValue() + this.side.doubleValue());
    }

    public Number getside() {
        return side;
    }

    public void setside(Number side) {
        this.side = side;
    }

    public Number getHigh() {
        return high;
    }

    public void setHigh(Number high) {
        this.high = high;
    }

}