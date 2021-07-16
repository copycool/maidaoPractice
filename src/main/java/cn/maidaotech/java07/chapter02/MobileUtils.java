package cn.maidaotech.java07.chapter02;

public class MobileUtils {
    public static final String NUMBER = "9876543210";
    public static void main(String[] args) {
        
        System.out.println(isMobile("13214124128"));   
    }
    private static boolean isMobile(String mobile){
        if(mobile == null || mobile.length()!= 11){
            return false;
        }
        if(mobile.charAt(0) !='1'){
            return false;
        }
        if("356789".indexOf(mobile.charAt(1)) == -1 ){
            return false;
        }
        int index = 2;
        while (index < 11) {
           if(NUMBER.indexOf(mobile.charAt(index)) == -1 ){
               return false;
           } 
           index++;
        }
        return true;



    }




}