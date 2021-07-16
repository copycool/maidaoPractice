package cn.maidaitech.shui966.Char3;
/*五
编写Java程序模拟简单的计算器。
定义Number类，其中有两个成员变量x和y，用构造函数赋值x和y的初始值。
定义加plus、减minus、乘multiply、除division等公有成员方法，分别对两个成员变量执行加减乘除的运算。
在main方法中创建Number对象并调用各个方法，显示计算结果。 */

public class number {
    private double x;
    private double y;
    public number(){

    }
    public number(double x,double y){
        this.x=x;
        this.y=y;
    }
    public double plus(){
        return x+y;
    }
    public double minus(){
        return x-y;
    }
    public double multiply(){
        return x*y;
    }
    public double division(){
        return x/y;
    }
    public void setX(double x) {
        this.x = x;
    }
    public double getX() {
        return x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public double getY() {
        return y;
    }
    public static void main(String[] args) {
        number num=new number();
        number num1=new number(9,3);
        System.out.println(num.division());
        System.out.println(num1.plus());
        
    }

}