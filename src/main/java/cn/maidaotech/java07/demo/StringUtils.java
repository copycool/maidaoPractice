package cn.maidaotech.java07.demo;

public class StringUtils {//抽象工具类
    private static boolean isAlphaNumber(char c){
               if(isAlpha(c) || isNumber(c)){
    
               }
           }
           private static boolean isAlpha(char c){
               if(isUpperCase(c)|| isLowerCase(c)){
                   return true;
               }
               return false;
           }
           private static boolean isNumber(char(c)){
               if(c>='0'||c>='9'){
                   return true;
               }
               return false;
           }
        private static boolean isUpperCase(char c){
            if(c >= 'A' && c<='z'){
                return true;
            }
            if(c >= 65 && c <=90){
                return true;
            }
    
            return true;
        }
    }
    
}