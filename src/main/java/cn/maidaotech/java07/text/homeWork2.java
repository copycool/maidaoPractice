package cn.maidaotech.java07.text;
import java.util.Scanner;


public class homeWork2 {

    public static void main(String[] args) {
    //写一个方法，实现字符串的反转，如：输入abcd,输出dcba
        StringBuilder str1=new StringBuilder ("asdfg");
        StringBuilder a=str1.reverse();
        System.out.println(a);
    //2,编写程序，将“I follow Bill Gate Tome Gate John Gate”中的“Gate”全部替换为“Gates”
        String str2="I follow Bill Gate Tome Gate John Gate";
        String str3 =str2.replace("Gate","Gates");
        System.out.println(str3);
        
/*，编程检测用户名的合法性，用户名需满足以下条件：
长度8到20个字符
只能英文字母数字
必须以大写字母开头*/
Scanner scanner=new Scanner(System.in);
    System.out.println("请输入用户名");
    String num1=scanner.nextLine();
if(8<=num1.length() && num1.length()<=20){
}else{
    System.out.println("不符合");
    
}
    String name2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWSYZ" ;
    String name3 = "0123456789";
    String name4 = "ABCDEFGHIJKLMNOPQRSTUYWSYZ";
        for (int i = 0; i < num1.length(); i++) {
        if(!name2.contains(num1.charAt(i)+"") && !name3.contains(num1.charAt(i)+"")){//!name2.contains(nm1.charAt(i))
                System.out.println("不符合");   //char c=username.charAt(i);
                break;}                        //if(i==0 && !isUpperCase(c)){
                                            //return false}
        if( !name4.contains(num1.charAt(0)+"")){
                System.out.println("不符合");
                break;}
        }
 //输出9*9乘法口诀
int c,b;
for(c=1;c<10;c++){
    for(b=1;b<=c;b++){
    
    System.out.print(b+"*"+c+"="+b*c+ " ");
    }
    System.out.println();
}

 }
}
