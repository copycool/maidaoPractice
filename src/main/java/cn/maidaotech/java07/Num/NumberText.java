package cn.maidaotech.java07.Num;

public class NumberText {
    public static void main(String[] args) {
    // 编写 Java 程序模拟简单的计算器。定义 Number 类，其中有两个成员变量 x 和 y，用构造函数赋 
    // 值 x 和 y 的初始值。定义加 plus、减 minus、乘 multiply、除 division 等公有成员方法，分别对两 
    // 个成员变量执行加减乘除的运算。在 main 方法中创建 Number 对象并调用各个方法，显示计算 
    // 结果。
    Number num1=new Number(4,2);
    System.out.println(num1.plus());
    System.out.println(num1.minus());
    System.out.println(num1.mupitly());
    System.out.println(num1.division());    
    }   
}
class Number{
    int x;
    int y;
    public Number(int x,int y){
        this.x=x;
        this.y=y;
    }
    public int plus(){
        return x+y;
    }
    public int minus(){
        return x-y;
    }public int mupitly(){
        return x*y;
    }public int division(){
        return x/y;
    }
}
