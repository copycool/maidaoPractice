package cn.maidaotech.java07.work2.number;

public class Number {
    private Integer x;
    private Integer y;

    public Number() {
    }

    public Number(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public int plus() {
        return this.x + this.y;
    }

    public int minus() {
        return this.x - this.y;

    }

    public int multipy() {
        return this.x * this.y;

    }

    public double division() {
        return this.x / this.y;

    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

}