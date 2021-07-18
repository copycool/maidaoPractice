package cn.maidaotech.java07;

public class CheckUsername {

    // private final static String ALL_UPPER_CASE="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String username;

    public static void main(String[] args) {
        System.out.println("12345678是" + (check("12345678") ? "正确的" : "非法的"));
    }

    private static boolean check(String username) {
        if (username == null) {
            return false;
        }
        // 如果长度小于8或者大于20，返回false

        if (username.length() < 8 || username.length() > 20) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            
            if (i == 0 && !isUpperCase(c)) {
                return false;
            }

            // 如果username.charAt(i)不是字母、不是数字
            if (!isAlpha(c) && !isNumber(c)) {
                return false;
            }
           // return true;
        }
        return true;
    }

    private static boolean isUpperCase(char c) {
        if (c >= 65 && c <= 90) {
            return true;
        }
    //      if(ALL_UPPER_CASE.indexOf(c)!=-1){
    //          retun true;
    return false;
}

        private static boolean isAlpha(char c){
     if (c >= 'a' && c <= 'z') {
            return true;
        }
        if(c>='A'&& c<='Z'){
            return true;
        }
        return false;

        } 

        private static boolean isNumber(char c){
            if (c >= '0' && c <= '9'){
                return true;
            }  
            return false;
        }

}
