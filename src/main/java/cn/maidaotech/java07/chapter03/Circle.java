package cn.maidaotech.java07.chapter03;

public class Circle extends Shape {
    private Integer r;
    
    public Circle(Integer r) {
        this.r = r;
    }

    @Override
    public Double area() {
        Double area = Math.PI * this.r * this.r;
        return area;
    }

    @Override
    public Double perimeter() {
        Double perimeter = Math.PI * this.r * 2;
        return perimeter;
    }

    public Integer getR() {
        return r;
    }

    public void setR(Integer r) {
        this.r = r;
    }

}
