package cn.maidaotech.java07.chapter02.section267;
import java.util.Scanner;

// 编程检测用户名的合法性，用户名需满足以下条件： 
// a. 长度 8 到 20 个字符 
// b. 只能英文、数字、下划线 
// c. 必须以字母开头
public class CheckUsername {
   

    public static void main(String[] args){
        String letter = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
        String content = new String("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789_");
        System.out.println("您的用户名需要满足：长度8到20个，必须以字母开头，由英文,数字,下划线字符组成");
        System.out.println("请输入用户名:");

        while(true){
            boolean flag=false;
            Scanner sc=new Scanner(System.in);
            String name=sc.nextLine();
            String firstchar=String.valueOf(name.charAt(0));
            if(name.length()>=8&name.length()<=20&letter.contains(firstchar)){
                for(int i=1;i<name.length();i++) {
                    String c=String.valueOf(name.charAt(i));
                    if(content.contains(c)==false) {
                        flag=false;
                        break;
                    }
                }
                flag = true;
                if(flag=true){
                    System.out.println("您的用户名是合法的");
                    break;
                    }else{
                    System.out.println("您的用户名是非法的,请重新输入");      
                    }   	
            }else{
            System.out.println("您的用户名是非法的,请重新输入");   
            }
           	
}
	
}}


//方法封装
//     public boolean check(String username){
//         if(username == null){
//             return false;
//         }
//         if(username.length()<8 || username.length()>20){    //逆向思维，不能嵌套
//             return false;
//         }
//         for(int i=0;i<username.length();i++){
//             char c = username.charAt(i);
//             if(i==0 &&isUpperCase(c)){   //封装
//                 return false;
//             }
                // if()
//         }
//     }

    //    private static boolean isAlphaNumber(char c){
    //        if(isAlpha(c) || isNumber(c)){

    //        }
    //    }
    //    private static boolean isAlpha(char c){
    //        if(isUpperCase(c)|| isLowerCase(c)){
    //            return true;
    //        }
    //        return false;
    //    }
    //    private static boolean isNumber(char(c)){
    //        if(c>='0'||c>='9'){
    //            return true;
    //        }
    //        return false;
    //    }
//     private static boolean isUpperCase(char c){
//         if(c >= 'A' && c<='z'){
//             return true;
//         }
//         if(c >= 65 && c <=90){
//             return true;
//         }

//         return true;
//     }
// }