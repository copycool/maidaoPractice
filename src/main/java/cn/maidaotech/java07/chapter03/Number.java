package cn.maidaotech.java07.chapter03;

public class Number {
    private double x;
    private double y;
    public Number() {
        this.x=1;
        this.y=1;
    }
    public Number(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public double getX() {
        return x;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getY() {
        return y;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double plus(double x,double y){
        return x+y;
    }
    public double minus(double x,double y){
        return x-y;
    }
    public double multiply(double x,double y){
        return x*y;
    }
    public double division(double x,double y){
        if(y==0){
            System.out.print("除数不可为0 ");
            return -1;
        }
        return x/y;
    }
    
}
