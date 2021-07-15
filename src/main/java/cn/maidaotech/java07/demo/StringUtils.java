package cn.maidaotech.java07.demo;


    public class StringUtils {
        private final static String ALL_UPPER_CASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    
        public static boolean isEmpty(String str) {
            return str == null || str.length() == 0;
        }
    
        public static boolean isAlphaNumberUnderline(char c) {
            if (isAlpha(c) || isNumber(c) || c == '_') {
                return true;
            }
            return false;
        }
    
        public static boolean isAlphaNumber(char c) {
            if (isAlpha(c) || isNumber(c)) {
                return true;
            }
            return false;
        }
    
        public static boolean isNumber(char c) {
            if (c >= '0' && c <= '9') {
                return true;
            }
            return false;
        }
    
        public static boolean isAlpha(char c) {
            if (isUpperCase(c) || isLowerCase(c)) {
                return true;
            }
            return false;
        }
    
        public static boolean isLowerCase(char c) {
            if (c >= 'a' && c <= 'z') {
                return true;
            }
            return false;
        }
    
        public static boolean isUpperCase(char c) {
            if (c >= 'A' && c <= 'Z') {
                return true;
            }
            // if (c >= 65 && c <= 97) {
            // return true;
            // }
            // if(ALL_UPPER_CASE.indexOf(c)!=-1){
            // return true;
            // }
            return false;
        }
    }
    
   

