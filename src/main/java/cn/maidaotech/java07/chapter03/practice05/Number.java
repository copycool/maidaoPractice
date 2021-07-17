package cn.maidaotech.java07.chapter03.practice05;

public class Number {
    private int x;
    private int y;

    public Number(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int plus() {
        return x + y;
    }

    public int minus() {
        return x - y;
    }

    public int multiply() {
        return x * y;
    }

    public int division() {
        return x / y;
    }


    public int getX() {
        return this.x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }

    public void setY(int y) {
        this.y = y;
    }

}