package cn.maidaotech.java07;

import org.apache.commons.lang.StringUtils;

public class CheckEmail {
    public static void main(String[] args) {
        System.out.println(check("nimiki123_Y@.we"));
        System.out.println(check("123fff@.wea"));
        System.out.println(check("_Y@.we"));
        System.out.println(check("me0809_Y@.cnare"));
        System.out.println(check("ni123_Y@w.e"));


    }
    private static boolean check(String email){
        if(StringUtils.isEmpty(email)||email.indexOf("@")==-1){
            return false;
        }
        String[] nameHost=email.split("@");
        int index = 0;
        boolean hasNumber=false;
        boolean hasLower=false;
        boolean hasUpper=false;
        boolean hasUnderLine=false;

        while(index<nameHost[0].length()){
            char c =nameHost[0].charAt(index);
            if(index == 0 &&!isAlpha(c)){
                return false;
            }
            if (!isAlphaOrNumber(c) && c != 95) {
                return false;
            }
            if(isNumber(c)){
                hasNumber= true;
            }
            if(isLowerAlpha(c)){
                hasLower = true;
            }
            if(isUpperAlpha(c)){
                hasUpper = true;
            }
            if(c=='_'){
                hasUnderLine = true;
            }
            index++;

        }
        int kinds = 0;
        if(hasLower){
            kinds++;
        }
        if(hasNumber){
            kinds++;
        }
        if(hasUpper){
            kinds++;
        }
        if(hasUnderLine){
            kinds++;
        }
        if(kinds<3){
            return false;
        }
        int dotIndex = nameHost[1].indexOf('.');
        if (dotIndex <= 0 || dotIndex == nameHost[1].length() - 1) {
            return false;
        }
        return true;



       
        
       
    }

   

    private static boolean isAlphaOrNumber(char c) {
        if(isAlpha(c)||isNumber(c)){
            return true;
        }
        return false;
    }

    private static boolean isNumber(char c) {
        if(c>='0'&& c<='9'){
            return true;
        }
        return false;
    }

    private static boolean isAlpha(char c) {
         if (isLowerAlpha(c) || isUpperAlpha(c)){
             return true;
         }
         return false;
    }


    private static boolean isUpperAlpha(char c) {
        if(c>='A'&& c<='Z'){
            return true;
        }
        return false;
    }

    private static boolean isLowerAlpha(char c) {
        if(c>='a'&& c<='z'){
            return true;
        }
        return false;
    }

    

    }
