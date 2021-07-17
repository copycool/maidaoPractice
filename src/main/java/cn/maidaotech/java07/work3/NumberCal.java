package cn.maidaotech.java07.work3;

// 编写Java程序模拟简单的计算器。
// 定义Number类，其中有两个成员变量x和y，
// 用构造函数赋值x和y的初始值。
// 定义加plus、减minus、乘multiply、除division等公有成员方法，
// 分别对两个成员变量执行加减乘除的运算。
// 在main方法中创建Number对象并调用各个方法，显示计算结果。
public class NumberCal {
    private Number x;
    private Number y;

    public NumberCal() {
    }

    public NumberCal(Number x, Number y) {
        this.x = x;
        this.y = y;
    }

    // 求和
    public double plus() {
        return x.doubleValue() + y.doubleValue();
        // System.out.println(x + y);
        // System.out.println("和是:" + (this.x + this.y));
    }

    // 求差
    public double minus() {
        return x.doubleValue() - y.doubleValue();
        // System.out.println("差是:" + (x - y));
    }

    // 求积
    public double multiply() {
        return x.doubleValue() * y.doubleValue();
        // System.out.println("积是:" + (x.doubleValue() * y.doubleValue()));
    }

    // 求商
    public double division() {
        return x.doubleValue() / y.doubleValue();

    }// 四则运算

    // public double arithmetic() {
    // { return    this.plus();}
    //   {return   this.minus();}
    //     this.multiply();
    //     this.division();
    // }

    public Number getX() {
        return x;
    }

    public void setX(Number x) {
        this.x = x;
    }

    public Number getY() {
        return y;
    }

    public void setY(Number y) {
        this.y = y;
    }

}