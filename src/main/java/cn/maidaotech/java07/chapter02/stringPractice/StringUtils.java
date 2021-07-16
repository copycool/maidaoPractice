package cn.maidaotech.java07.chapter02.stringPractice;

public class StringUtils {
    public static boolean isUpperCase(char c){
        if(c>='A'&& c<='Z'){
            return true;
        }
        // if(str.indexOf(c) != -1){
        //     return true;
        // }
        return false;
    }
    public static boolean isLowerCase(char c){
        if(c>='a'&&c<='z'){
            return true;
        }
        return false;
    }
    public static boolean isNum(char c){
        if(c<'0'&&c>'9'){
            return false;
        }
        return true;
    }
    public static boolean UnderLine(char c){
        if (c!=95){
            return false;
        }
        return true;
    }
    public static boolean isEmpty(String str){
        if (str == null){
            return false;
        }
        return true;
    }
    public static boolean Alpha(char c){
        if (isLowerCase(c)||isUpperCase(c)){
            return true;
        }
        return false;
    }
    public static boolean AlphaAndNum(char c){
        if (Alpha(c)||isNum(c)){
            return true;
        }
        return false;
    }
}
