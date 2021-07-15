package cn.maidaotech.java07.chapter02.answer;

public class StringUtils {
    private final static String ALL_UPPER_CASE="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static boolean isEmpty(String s){
        if(s==null||s.length()==0){
            return true;
        }
        return false;
    }
    
    public static boolean isAlpha(char c){
        if(isUpperCase(c)||isLowerCase(c)){
            return true;
        }
        return false;
    }
    
    public static boolean isUpperCase(char c) {
        if(c>='A'&&c<='Z'){
            return true;
        }
        // if(c>=65&&c<=97){
        //     return true;
        // }
        // if(ALL_UPPER_CASE.indexOf(c)!=-1){
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

    public  static boolean isNumber(char c){
        if(c>='0'&&c<='9'){
            return true;
        }
        return false;
    }

    public static boolean isUnderLine(char c){
        if(c=='_'){
            return true;
        }
        return false;
    }

    public static boolean isAlphaNumberUnderLine(char c){
        if(isAlpha(c)||isNumber(c)||isUnderLine(c)){
            
           return true;
        }
        return false;
    }
    

    
}
