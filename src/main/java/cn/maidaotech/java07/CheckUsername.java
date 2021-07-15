package cn.maidaotech.java07;

public class CheckUsername {
   // private final static String 
    public static void main(String[] args) {
       // char c ='1';
       System.out.println("username123");
        
    }

    public static boolean check(String username){
        if(username == null){
            return false;
        }
        if(username.length()<8 || username.length()>20){
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(i==0 && !isUpperCase(c) ){
                return false;
            }
            if(isAlphaNumber(c)){
                return false;
            }
            
        }return true;
    }
    private static boolean isAlphaNumber(char c){
        if(isAlpha(c) || isNumber(c)){
            return true;
        }
        return false;
    }
    private static boolean isAlpha(char c){
        if(isUpperCase(c) || isLowerCase(c)){
            return true;
        }
        return false;
    }
    private static boolean isLowerCase(char c){
        if(c>='a' && c<='z'){
            return true;
        }
        return false;
    }
    private static boolean isNumber(char c){
        if(c>='0'||c<='9'){
            return true;
        }
        return false;
    }
    private static boolean isUpperCase(char c){
        if(c>='A' && c<='Z'){
            return true;
        }
        /*if(c>=65 && c<=90){
            return true;
        }*/
        
        return false;
    }

}