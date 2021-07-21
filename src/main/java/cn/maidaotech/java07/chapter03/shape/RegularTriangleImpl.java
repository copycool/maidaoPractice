package cn.maidaotech.java07.chapter03.shape;

public class RegularTriangleImpl implements Shape {
    private Double border;

    public RegularTriangleImpl() {
    }

    public RegularTriangleImpl(Double border) {
        this.border = border;
    }

    @Override
    public String area() {
        
        double i = Math.pow(border, 2) - Math.pow(border / 2, 2);
        double high = Math.sqrt(i);
        return ("正三角形面积为：" + (border * high) / 2);

    }

    @Override
    public String perimeter() {
        
        return ("正三角形周长为：" + border * 3);

    }

    public Double getBorder() {
        return border;
    }

    public void setBorder(Double border) {
        this.border = border;
    }

}
