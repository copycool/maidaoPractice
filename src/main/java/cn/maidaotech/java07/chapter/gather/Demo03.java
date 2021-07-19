package cn.maidaotech.java07.chapter.gather;

public class Demo03 {
    /// 编写Java程序模拟简单的计算器。
    // 定义Number类，其中有两个成员变量x和y，用构造函数赋值x和y的初始值。
    // 定义加plus、减minus、乘multiply、除division等公有成员方法，分别对两个成员变量执行加减乘除的运算。
    // 在main方法中创建Number对象并调用各个方法，显示计算结果。
    private Number x;
    private Number y;

    public Demo03() {
    }

    public Demo03(Number x, Number y) {
        this.x = x;
        this.y = y;
    }

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

    public static void plus(Number x,Number y){
        System.out.println(x+"+"+y+"="+x+y);
    }

    public static void minus(Number x,Number y){
        System.out.println(x+"-"+y+"="+(x-y));
    }

    public static void multiply(Number x,Number y){
        System.out.println(x+"+"+y+"="+x+y);
    }

    public static void division(Number x,Number y){
        System.out.println(x+"+"+y+"="+x+y);
    }


}