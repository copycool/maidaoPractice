package cn.maidaotech.java07.chaptet03;

import java.math.BigDecimal;
import java.math.RoundingMode;


   
    public class Triangle extends Shap {
        
        private double length;
        public Triangle(double length){
            this.length = length;
        }

      @Override
    double area() {// 正三角形面积公式=4分之3的平方根乘以边长的平方
        return new BigDecimal(Math.pow(length, 2)).multiply(new BigDecimal(Math.sqrt(3))).divide(new BigDecimal(4))
                .setScale(2, RoundingMode.HALF_UP).doubleValue();

    }

    @Override
    double perimeter() {
        return length*3;
    }

}