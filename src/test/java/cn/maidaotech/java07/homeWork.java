package cn.maidaotech.java07;
import java.util.Scanner;
//从键盘输入学生学号，例如2019年01期12号，输入20190112，使用“/”和“%”运算符分解学号获得年份、期数和序号，并分别输出
import ch.qos.logback.core.net.SyslogOutputStream;
public class homeWork {
  public static void main(String[] args){
   Scanner scanner=new Scanner(System.in);
    System.out.println("请输入学号");
    int num1=scanner.nextInt();
    int year=num1/10000;
    int month=num1%10000/100;
    int day=num1%100;
    System.out.println("年份为："+year);
    System.out.println("期数为："+month);
    System.out.println("序号为："+day);
//判断某一年是否为闰年。
    System.out.println("请输入年份");
    int num2=scanner.nextInt();
    if(num2%4==0&&num2%100!=0||num2%400==0){
        System.out.println("是闰年");
    }else{
        System.out.println("不是闰年");
    }
//打印出所有的“水仙花数即一个三位数，其各位数字的立方和等于该数本身，例如153
int i,a,b,c;
for(i=100;i<1000;i++){
    a=i/100;
    b=i%100/10;
    c=i%10;
    if(i==Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))
    {
        System.out.println(i);
    }
}

}
    }


    