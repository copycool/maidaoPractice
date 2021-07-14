package cn.maidaotech.java07;


import java.util.Scanner;
//从键盘输入学生学号，例如2019年01期12号，输入20190112，使用“/”和“%”运算符分解学号获得年份、期数和序号，并分别输出。
public class FirstTest{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
            System.out.println("请输入你的用户名 ；" );
            int s = scan.nextInt();
            int s1,s2,s3,s4;
                s1 = s / 10000;
                s2 = s % 10000;
                s3 = s2 / 100;
                s4 = s2 % 100;
            System.out.println("年份: " + s1);
            System.out.println("期数: " + s3);
            System.out.println("学号: " + s4);
                                
//判断某一年是否为闰年。
   checkYearIsLeap(2000);
		checkYearIsLeap(1999);
	}
	public static void checkYearIsLeap(int year){
		if (year % 4 == 0 && year % 100 != 0 ){
			    System.out.println("是闰年");
		}else if(year % 400 == 0){
				System.out.println("是闰年");
		} else{
				System.out.println("不是闰年");
		}

//打印出所有的“水仙花数”，即一个三位数，其各位数字的立方和等于该数本身，例如153

 int a,b,c,i;
 for( i = 100; i < 1000;i++)
 {
  a = i/100;
  b = (i%100)/10;
  c = i%10;
      if(Math.pow(a, 3) + Math.pow(b, 3)+ Math.pow(c, 3) == i ){
         System.out.println(i);
            }
              }
}
}