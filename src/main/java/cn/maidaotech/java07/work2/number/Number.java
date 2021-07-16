package cn.maidaotech.java07.work2.number;

/**
 * 编写Java程序模拟简单的计算器。定义Number类，其中有两个成员变量x和y，
 * 用构造函数赋值x和y的初始值。定义加plus、减minus、乘multiply、 除division等公有成员方法，分别对两个成员变量执行加减乘除的运算
 * 。在main方法中创建Number对象并调用各个方法，显示计算结果。
 */
public class Number {
    private Integer x;
    private Integer y;

    public Number() {
    }

    public Number(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }

    public void plus() {
        System.out.println(this.x + " + " + this.y + " = " +( this.x + this.y));
    }

    public void minus() {
        System.out.println(this.x + " - " + this.y + " = " + (this.x - this.y));

    }

    public void multipy() {
        System.out.println(this.x + " X " + this.y + " = " + (this.x * this.y));

    }

    public void division() {
        System.out.println(this.x + " / " + this.y + " = " + (this.x / this.y));

    }

    @Override
    public String toString() {
        return "Number [x=" + x + ", y=" + y + "]";
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

}