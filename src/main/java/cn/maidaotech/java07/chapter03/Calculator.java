package cn.maidaotech.java07.chapter03;
// 编写 Java 程序模拟简单的计算器。
// 定义 Number 类，其中有两个成员变量 x 和 y，用构造函数赋 值 x 和 y 的初始值。
// 定义加 plus、减 minus、乘 multiply、除 division 等公有成员方法，
// 分别对两 个成员变量执行加减乘除的运算。
// 在 main 方法中创建 Number 对象并调用各个方法，显示计算 结果
public class Calculator {
    public static void main(String[] args) {
        
    Number number = new Calculator().new Number(6,8);
    System.out.println(number.plus());
    System.out.println(number.minus());
    System.out.println(number.multiply());
    System.out.println(number.division());
    }
    public class Number{

        int x;
        int y;

        public Number(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public Number() {
        }
        public double plus(){
            return Math.addExact(x, y);
        }
        public double minus(){
            return Math.subtractExact(x, y);
        }
        public int multiply(){
            return Math.multiplyExact(x, y);
        }
        public double division(){
            return Math.floorDiv(x, y);
        }
    }

    
}