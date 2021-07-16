package cn.maidaotech.java07.chapter03.practice;

public class Number {
    private Integer x;
    private Integer y;

    public int plus() {
        return this.x + this.y;
    }

    public int minus() {
        return this.x - this.y;
    }

    public int multiply() {
        return this.x * this.y;
    }

    public int division(Object... a) {
        return this.x / this.y;
    }

    @Override
    public String toString() {
        return "Number [x=" + x + ", y=" + y + "]";
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

    public Number(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

}