package cn.maidaotech.java07.chapter03.answer;

public class NumberCalc {
    private Number x;
    private Number y;

    public NumberCalc() {
    }

    public NumberCalc(Number x, Number y) {
        this.x = x;
        this.y = y;
    }

    public double puls(Number x, Number y) {
        return x.doubleValue() + y.doubleValue();
    }

    public double mins(Number x, Number y) {
        return x.doubleValue() - y.doubleValue();
    }

    public double multiply(Number x, Number y) {
        return x.doubleValue() * y.doubleValue();
    }

    public double division(Number x, Number y) {
        return x.doubleValue() / y.doubleValue();
    }

}
