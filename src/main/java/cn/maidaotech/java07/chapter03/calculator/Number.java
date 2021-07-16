package cn.maidaotech.java07.chapter03.calculator;

public class Number {
    private Integer x;
    private Integer y;

    public Number() {
    }

    public Number(Integer x, Integer y) {
        this.x = x;
        this.y = y;
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
    
    public int plus(Integer x,Integer y){
        return x+y;
    }
    public int minus(Integer x,Integer y){
        return x-y;
    }
    public int multiply(Integer x,Integer y){
        return x*y;
    }
    public int division(Integer x,Integer y){
        return x/y;
    }
    
}
