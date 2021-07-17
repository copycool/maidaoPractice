package cn.maidaotech.java07.work2.calculator;

public class Rectangle extends Shep {
    private Double longs;
    private Double wide;

    public Rectangle() {
    }

    public Rectangle(Double longs, Double wide) {
        this.longs = longs;
        this.wide = wide;
    }

    @Override
    public void area() {
        System.out.println(this.longs * this.wide);
    }

    @Override
    public void perimeter() {
        System.out.println((this.longs + this.wide) * 2);
    }

    public Double getLongs() {
        return longs;
    }

    public void setLongs(Double longs) {
        this.longs = longs;
    }

    public Double getWide() {
        return wide;
    }

    public void setWide(Double wide) {
        this.wide = wide;
    }

}