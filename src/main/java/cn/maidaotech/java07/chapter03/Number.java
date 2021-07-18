package cn.maidaotech.java07.chapter03;

public class Number {
    private Integer x;
    private Integer y;

    public Number(){
        
    }

    public Number(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    
    public Integer plus(){
        return x + y;
    }
    public Integer minus() {
        return x - y;
    }
    public Integer multiply(){
        return x * y;
    }
    public Integer division(){
        return x / y;
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