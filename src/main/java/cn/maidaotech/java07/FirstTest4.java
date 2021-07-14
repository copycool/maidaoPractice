package cn.maidaotech.java07;
import java.util.Scanner;
public class FirstTest4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入你的手机号；" );
        String num = scan. nextLine();
        if ( num.length() != 11){
           System.out.println("失败");
        } 
         if(num.charAt(0)!='1'){
             System.out.println("失败"); 
         }
         String num2 ="3,5,6,7,8,9";
         if( !num2.contains (num.charAt(1)+"")){
             System.out.println("失败");
         }
}
}