package cn.maidaotech.java07;

import java.util.jar.Attributes.Name;
import java.util.Scanner;
public class MathTest {
  
public static void main(String[] args){
// 字符替换 
String s = "I follow Bill Gate Tome Gate John Gate";
String s1 = s.replaceAll("Gate","Gates");
System.out.println(s1);



        //1.创建StringBuildMer类的实例对象
        StringBuilder  str = new StringBuilder("abcdefg");
        //2.调用 reverse()方法
        StringBuilder a =  str.reverse();
        System.err.println(a);
/*编程检测用户名的合法性，用户名需满足以下条件：
长度8到20个字符
只能英文字母、数字
必须以大写字母开头
*/

Scanner scan = new Scanner(System.in);
System.out.println("请输入你的用户名 ；" );
           String name = scan.nextLine();
        if (8<=name.length() && name.length()<=20) {
        }else{
            System.out.println("不符合");
        }
            String name2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWSYZ" ;
            String name3 = "0123456789";
            String name4 = "ABCDEFGHIJKLMNOPQRSTUYWSYZ";
   for (int i = 0; i < name.length(); i++) {
             if(!name2.contains(name.charAt(i)+"") && !name3.contains(name.charAt(i)+"")){
                    System.out.println("不符合");   
                    break;
             } 
             if( !name4.contains(name.charAt(0)+"")){
                    System.out.println("不符合");
                    break;
             }
         }
}
}


