package cn.maidaotech.java07.chapter02.answer;
    //编程检测用户名的合法性，
    // 用户名需满足以下条件：长度8到20个字符 
    // 只能英文字母、数字 
    // 必须以大写字母开头

public class CheckUserName {
    private final static String ALL_UPPER_CASE="ABCDEFGHIJKLMNOPQRSTUVWXYZ";


    
    public static boolean check(String username){
        if(username==null){
            return false;
        }
        if(username.length()<8||username.length()>20){
            return false;
        }
        for(int i = 0;i<username.length();i++){
            char c=username.charAt(i);
            //需要封装一个判断是否是大写字母
            if(i==0 &&!isUpperCase(c)){
              return false;
            }
            if(!isAlphaNumber(c)){
                return false;
            }
        }
        return true;
    }

    private static boolean isUpperCase(char c) {
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

    private static boolean isAlpha(char c){
        if(isUpperCase(c)||isLowerCase(c)){
            return true;
        }
        return false;
    }
    
    private static boolean isLowerCase(char c){
        if(c>='a'&&c<='z'){
            return true;
        }
        return false;
    }

    private  static boolean isNumber(char c){
        if(c>='0'&&c<='9'){
            return true;
        }
        return false;
    }
    private static boolean isAlphaNumber(char c){
        if(isAlpha(c)||isNumber(c)){
            
           return true;
        }
        return false;
    }

    
    
}
