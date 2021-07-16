package cn.maidaotech.java07.work3;

// 编写Java程序模拟简单的计算器。
// 定义Number类，其中有两个成员变量x和y，
// 用构造函数赋值x和y的初始值。
// 定义加plus、减minus、乘multiply、除division等公有成员方法，
// 分别对两个成员变量执行加减乘除的运算。
// 在main方法中创建Number对象并调用各个方法，显示计算结果。
public class Number {
    private double x;
    private double y;

    public Number() {
    }

    public Number(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // 求和
    public void plus() {
        System.out.println(this.x + this.y);
        System.out.println("和是:" + (this.x + this.y));
    }

    // 求差
    public void minus() {
        System.out.println("差是:" + (x - y));
    }

    // 求积
    public void multiply() {
        System.out.println("积是:" + (x * y));
    }

    // 求商
    public void division() {
        if (y == 0) {
            System.out.println("除数为0，无法计算");
        } else {
            System.out.println("商是:" + (x / y));
        }
    }

    // 四则运算
    public void arithmetic() {
        this.plus();
        this.minus();
        this.multiply();
        this.division();
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

}