package cn.maidaotech.java07;
/*
编写Java程序模拟简单的计算器。定义Number类，其中有两个成员变量x和y，
用构造函数赋值x和y的初始值。定义加plus、减minus、乘multiply、除division等公有成员方法，
分别对两个成员变量执行加减乘除的运算。在main方法中创建Number对象并调用各个方法，显示计算结果。
*/
public class NumberTest {
    private int x;
    private int y;
    
    

    public static void main(String[] args) {
    NumberTest test = new NumberTest(10,8);
    test.plus();
    test.minus();
    test.multiply();
    test.division();
    }
    public void plus() {
        System.out.println(x+y);
    }
    public void minus() {
        System.out.println(x-y);
    }
    public void multiply() {
        System.out.println(x*y);
    }
    public void division() {
        System.out.println(x/y);
    }
    public NumberTest() {
    }

    public NumberTest(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
}