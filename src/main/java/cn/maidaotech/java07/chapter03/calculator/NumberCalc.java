package cn.maidaotech.java07.chapter03.calculator;

public class NumberCalc {
    // private Number x; java中存在一个Number类，获取所有类型数字。
    private Number x;
    private Number y;

    public NumberCalc() {
    }

    public NumberCalc(Number x, Number y) {
        this.x = x;
        this.y = y;
    }

    public double plus(Number x, Number y) {
        return x.doubleValue() + y.doubleValue();
    }

    public double minus(Number x, Number y) {
        return x.doubleValue() - y.doubleValue();
    }

    public double multiply(Number x, Number y) {
        return x.doubleValue() * y.doubleValue();
    }

    public double division(Number x, Number y) {
        return x.doubleValue() / y.doubleValue();
    }

    public Number getX() {
        return x;
    }

    public void setX(Number x) {
        this.x = x;
    }

    public Number getY() {
        return y;
    }

    public void setY(Number y) {
        this.y = y;
    }

}
