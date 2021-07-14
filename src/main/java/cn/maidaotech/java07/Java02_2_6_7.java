package cn.maidaotech.java07;
import java.util.Scanner;
public class Java02_2_6_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入要反转的字符串:");
        String string=input.next();
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println("反转前字符串"+string);
        System.out.println("反转后字符串"+reverse);
    

    {
        String a="I follow Bill Gate Tome Gate John Gate";
        String strin=a.replace("Gate", "Gates");
        System.out.println("未替换文本为:"+a);
        System.out.println("已替换文本为:"+strin);
    }


    {
      System.out.println("请输入用户名:");
      String name=input.next();
      String regex = "[A-Z][a-zA-Z0-9]*";
      boolean f=name.matches(regex);
      System.out.println(f);
      if(name.length()>=8 && name.length()<=20){
         if(f==true){
            System.out.println(name+"当前用户名符合条件!~");
        }else if(f==false){
            System.out.println(name+"当前用户名不符合条件!~");
        }
      }else{
           System.out.println(name+"当前用户名不符合条件!~");
      }

    }
}
}