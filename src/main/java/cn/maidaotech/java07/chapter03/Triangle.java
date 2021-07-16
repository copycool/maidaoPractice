package cn.maidaotech.java07.chapter03;

public class Triangle extends Shape {
    private Double x;
    

    public Triangle() {
    }

    

    public Triangle(Double x) {
        this.x = x;
    }



    @Override
    public Double area() {
        Double area = (Math.sqrt(3) *Math.pow(this.x,2) ) / 4;
        return area;
    }

    @Override
    public Double perimeter() {
        Double perimeter = this.x * 3;
        return perimeter;
    }

    public Double getX() {
        return x;
    }

    public void setX(Double x) {
        this.x = x;
    }

   
    
    

}
