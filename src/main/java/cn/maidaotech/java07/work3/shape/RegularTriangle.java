package cn.maidaotech.java07.work3.shape;

public class RegularTriangle extends Shape {
    private double sidelength;

    public RegularTriangle() {
    }

    public RegularTriangle(double sidelength) {
        this.sidelength = sidelength;
    }

    // 正三角形面积
    @Override
    public double area() {

        double h = sidelength * Math.sin(Math.PI / 3);
        return sidelength * h / 2;
        // System.out.println("正三角形面积是：" + (sidelength * h / 2));
    }

    // 正三角形周长
    @Override
    public double perimeter() {
        return 3 * sidelength;
        // System.out.println("正三角形周长是：" + 3 * sidelength );
    }

    public double getSidelength() {
        return sidelength;
    }

    public void setSidelength(double sidelength) {
        this.sidelength = sidelength;
    }

}
