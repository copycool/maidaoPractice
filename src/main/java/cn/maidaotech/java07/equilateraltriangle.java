package cn.maidaitech.shui966.Char3;
//八
public class equilateraltriangle extends shape{
    private Integer primetere;
    public equilateraltriangle(){

    }
    public equilateraltriangle(Integer primetere){
        this.primetere=primetere;

    }

    @Override
    public void area() {
        double area=Math.sqrt(3)*this.primetere*this.primetere/4;
        System.out.println("正三角形的面积：不会求不会求不会求啊不会求"+area);

    }

    @Override
    public void perimeter() {
        System.out.println("正三角形的边长："+3*getPrimetere());

    }
    public void setPrimetere(Integer primetere) {
        this.primetere = primetere;
    }
    public Integer getPrimetere() {
        return primetere;
    }
    
}