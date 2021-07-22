package cn.maidaotech.java07.chapter3.question8;

public class EquilateralTriangle extends Shape{
    private Integer primetere;
    public EquilateralTriangle(){

    }
    public EquilateralTriangle(Integer primetere){
        this.primetere=primetere;

    }

    @Override
    public String area() {
        double area=Math.sqrt(3)*this.primetere*this.primetere/4;
        return ("正三角形的面积："+area);

    }

    @Override
    public String perimeter() {

        return ("正三角形的边长："+3*getPrimetere());

    }
    public void setPrimetere(Integer primetere) {
        this.primetere = primetere;
    }
    public Integer getPrimetere() {
        return primetere;
    }
    
}