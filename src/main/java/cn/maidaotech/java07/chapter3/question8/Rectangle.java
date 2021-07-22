package cn.maidaotech.java07.chapter3.question8;

public class Rectangle extends Shape {
    private Integer extent;
    private Integer wide;
    public Rectangle(){

    }
    public Rectangle(Integer extent,Integer wide){
        this.extent=extent;
        this.wide=wide;
    }

    @Override
    public String area() {
        return ("长方形的面积："+getExtent()*getWide());
        //System.out.println("长方形的面积："+getExtent()*getWide()); 
    }

    @Override
    public String perimeter() {
        return ("长方形的周长："+(2*getExtent()+2*getWide()));
        //System.out.println("长方形的周长："+(2*getExtent()+2*getWide()));

    }
    public void setExtent(Integer extent) {
        this.extent = extent;
    }
    public Integer getExtent() {
        return extent;
    }
    public void setWide(Integer wide) {
        this.wide = wide;
    }
    public Integer getWide() {
        return wide;
    }
    
}