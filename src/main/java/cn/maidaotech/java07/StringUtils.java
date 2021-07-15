package cn.maidaotech.java07;

public class StringUtils {
//*************************************************************
    public static boolean isEmpty(String[] str) {//判断数组是否为空
        if(str == null){
            return false;
        }
        return true;
    }
//*************************************************************
    public static boolean isEmpty(String str) {//判断字符串是否为空
        if(str == null){
            return false;
        }
        return true;
    }
//*************************************************************
    public static boolean isAlpha(char c){//判断是否字母
        if(isUpperCase(c) || isLowerCase(c)){
            return true;
        }
        return false;
    }
    public static boolean isLowerCase(char c){
        if(c>='a' && c<='z'){
            return true;
        }
        return false;
    }
    public static boolean isUpperCase(char c){
        if(c>='A' && c<='Z'){
            return true;
        }
        return false;
    }
//**************************************************************
    public static boolean isNumber(char c){//判断字符是不是数字
        if(c>='0'||c<='9'){
            return true;
        }
        return false;
    }
//**************************************************************
}

