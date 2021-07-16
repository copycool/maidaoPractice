package cn.maidaitech.shui966.Char3;
//八
public class Rectangle extends shape {
    private Integer extent;
    private Integer wide;
    public Rectangle(){

    }
    public Rectangle(Integer extent,Integer wide){
        this.extent=extent;
        this.wide=wide;
    }

    @Override
    public void area() {
        System.out.println("长方形的面积："+getExtent()*getWide()); 
    }

    @Override
    public void perimeter() {
        System.out.println("长方形的周长："+(2*getExtent()+2*getWide()));

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