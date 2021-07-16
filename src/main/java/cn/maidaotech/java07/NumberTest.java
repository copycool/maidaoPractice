package cn.maidaotech.java07;
//编写 Java 程序模拟简单的计算器。定义 Number 类，其中有两个成员变量 x 和 y，用构造函数赋 值 x 和 y 的初始值。
//定义加 plus、减 minus、乘 multiply、除 division 等公有成员方法，分别对两 个成员变量执行加减乘除的运算。
//在 main 方法中创建 Number 对象并调用各个方法，显示计算 结果
public class NumberTest {
    public static void main(String[] args) {
        Num2 number = new Num2(1,2);
        System.out.println(number.plus());
        System.out.println(number.minus());
        System.out.println(number.multiply());
        System.out.println(number.division());
    }
}
   class Num2{
    double a;
    double b;
    public Num2( double a1,double b2){
    a=a1;
    b=b2;
    }
    public double plus(){
        return a+b;
    }
    public double minus(){
        return a-b;
    }
    public double multiply(){
        return a*b;
    }
    public double division(){
        if(b==0){
            return 0;
        }
        return a/b;
    }
   }
// class Num{
//     int x;
//     int y;
//     public Num (int x,int y) {
//          this.x = x;
//          this.y = y;
//     }
//     public int plus(){
//         return x+y;
//     }
//     public int minus(){
//         return x-y;
//     }
//     public int  multiply(){
//        return x*y;
//     }
//     public double division(){
//         int res = 0;
//        try {
//            res = x/y;
//        } catch (Exception e) {
//         System.out.println("除数不为0"); 
//         System.exit(0); 
//        }//捕获异常
//        return res;
//     }
// }
