package cn.maidaotech.java07.chapter03;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Triangle extends Shape{
    private Double length;

    public Triangle(Double length) {
        this.length = length;
    }
    
    @Override
    Double area(){
        return new BigDecimal(Math.pow(length, 2)).multiply(new BigDecimal(Math.sqrt(3))).divide(new BigDecimal(4)).setScale(2,RoundingMode.HALF_UP).doubleValue();

    }
    
    @Override
    Double perimeter(){
        return length * 3;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }


}
