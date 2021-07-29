package cn.maidaotech.java07.chapter3.question5;

public class Calculator {
    private Double x;
    private Double y;

    public Calculator() {

    }

    public Calculator(Double x, Double y) {
        this.x = x;
        this.y = y;
    }

    public double plus() {
        return x + y;
    }

    public double minus() {
        return x - y;
    }

    public double multiply() {
        return x * y;
    }

    public double division() {
        return x / y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
        Calculator calone = new Calculator(9.0, 3.0);
        System.out.println(cal.division());
        System.out.println(calone.plus());

    }

}