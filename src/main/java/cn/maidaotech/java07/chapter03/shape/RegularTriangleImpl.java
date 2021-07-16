package cn.maidaotech.java07.chapter03.shape;

public class RegularTriangleImpl implements Shape {
    private Integer border;

    public RegularTriangleImpl() {
    }

    public RegularTriangleImpl(Integer border) {
        this.border = border;
    }

    @Override
    public void area() {
        // TODO Auto-generated method stub
        double i = Math.pow(border, 2) - Math.pow(border / 2, 2);
        double high = Math.sqrt(i);
        System.out.println("正三角形面积为："+(border*high)/2);

    }

    @Override
    public void perimeter() {
        // TODO Auto-generated method stub
        System.out.println("正三角形周长为："+border*3);

    }



    public Integer getBorder() {
        return border;
    }

    public void setBorder(Integer border) {
        this.border = border;
    }


    
}
