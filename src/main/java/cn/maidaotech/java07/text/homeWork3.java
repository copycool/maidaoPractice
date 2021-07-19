package cn.maidaotech.java07.text;
import java.util.Scanner;

public class homeWork3 {

    public static void main(String[] args) {
//1任意声明3个整数，求出这3个数中的最大值和最小值，并输出到控制台。
Scanner scanner=new Scanner(System.in);
    System.out.println("请输入第一个整数");
int num1=scanner.nextInt();
    System.out.println("请输入第儿个整数");
int num2=scanner.nextInt();
    System.out.println("请输入第三个整数");
int num3=scanner.nextInt();
if(num1>num2){
    if(num3>num1){
        System.out.println("最大值为："+num3+"  最小值为："+num2);
    }
    if(num3<num2){
        System.out.println("最大值为："+num1+"  最小值为："+num3); 
    }
    if(num3>num2&&num3<num1){
        System.out.println("最大值为："+num1+"  最小值为："+num2);
    }
    }
if(num2>num1){
    if(num3>num2){
        System.out.println("最大值为："+num3+"  最小值为："+num1);
    }
    if(num3<num1){
        System.out.println("最大值为："+num2+"  最小值为："+num3); 
    }
    if(num3<num2&&num3>num1){
        System.out.println("最大值为："+num2+"  最小值为："+num1);
    }
}
        // 2用字符“*”打印一个边长为100个*的空心正方形
    // String str1="*";
    // String str2=" ";
    
    for(int i=1;i<=9;i++){
        StringBuilder str=new StringBuilder();
        for(int j=1;j<=9;j++){
            if (i==1||i==9)
               str.append("*  ");
        else if (j==1||j==9)
               str.append("*  ");
                
             else
             
                 str.append("   ");
        }
           System.out.println(str.toString());
        }
        // 4判断101-200之间有多少个素数，并输出所有素数。 
       int i,a;
       
        for(i=101;i<=200;i++){
            for(a=2;a<i;a++){
           if(i%a==0){
               break;
           }
           if(a==i-1){
               System.out.println(i);
           }
        }
    }
    //1编写一个方法验证用户输入的手机号，要求：11位数字、只能以数字1开头，第二位可以是数字3、5、6、7、8
    Scanner scanner1=new Scanner(System.in);
    System.out.println("请输入手机号");
  String number = scanner1.nextLine();
   String number1="3,5,6,7,8";
    if(number.length()==11&&number.charAt(0)=='1'&&number1.contains(number.charAt(1)+"")){
         System.out.println("成功");
        }
    else{
        System.out.println("失败");
    }
    
    
    

    
    }
}
    

    

