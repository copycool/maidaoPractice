package cn.maidaotech.java07.chapter03;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Rectangle extends Shape{
    private Double length;
    private Double width;

    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    Double area(){
        return new BigDecimal(length).multiply(new BigDecimal(width)).setScale(2,RoundingMode.HALF_UP).doubleValue();
    }
    
    @Override
    Double perimeter(){
        return length * 2 + width * 2;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    




}