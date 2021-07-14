package cn.maidaotech.java07;

import java.util.Arrays;
import java.util.Scanner;

import javax.tools.DocumentationTool.Location;
class  MailboxTest {
    

    
    public static void main(String[] args) {
        System.out.println("请输入邮箱： ");
        Scanner scanner = new Scanner(System.in); 
        
         
        String email = scanner.next();
       
        
        //MailboxTest m1 = new MailboxTest();
        //m1.isStartWithChar(email);
        //String a = email.substring(0,);

        

    }
    
    
      
        

    //判断是否有@
    public static boolean isAt(String str){
        if(str.contains("@")){
            for(int i = 0; i < str.length(); i++){
    
                if(str[i] == "@"){ // 判断数组里面是否有对应值
        
                    
        
                    return i; // 存在时,返回下标
               }
           }            






            return true;
        }
        return false;
    }
    /*public static int binarySearch( str,String key){
        int b = Arrays.binarySearch(str,"@");
    }*/


    //name
    public static boolean isStartWithChar(String str){//判断是否以字母开头
        char start = str.charAt(0);
        if(start >= 'a' && start <= 'z' || start >= 'A' && start <= 'Z'){
            return true;
        }else{
            return false;
        }
        
    }
    public static boolean iscontain(String str){
        if(str.contains("@")){
            return true;
        }
        return false;
    }
    public static boolean isconstitute(String str){
        if(str.contains("a-z") && str.contains("A-Z") && str.contains("0-9")
         && str.contains("_")){
            if((str.contains("a-z") && str.contains("A-Z") && str.contains("0-9"))
            || (str.contains("a-z") && str.contains("A-Z") && str.contains("_"))
            || (str.contains("a-z") && str.contains("_") && str.contains("0-9"))
            || (str.contains("A-Z") && str.contains("_") && str.contains("0-9"))
            ){
                return true;
            }
            return false;
         }
         else{
            return false;
         }
        
    }
    //host
    public static boolean isdot(String str){
        if(str.contains(".")){
            return false;
        }else{
            if(str.endsWith(".") || str.startsWith(".")){
               return false; 
            }
            return true;  
        }
        
    }





}