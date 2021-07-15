package cn.maidaotech.java07;

public class CheckUsername {

    
    private String username;

    public static void main(String[] args) {
         System.out.println("12345678是"+(check("12345678")?"正确的":"非法的"));
    }

    private static boolean check(String username) {
        if (username == null) {
            return false;
        }
        //如果长度小于8或者大于20，返回false
       
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(i == 0 && !isLetter(c)){
                return false;
            }
            
            
            // 如果username.charAt(i)不是字母、不是数字
            if(!isCorrect(c)){
                return false;
            }
        }
        return true;
    }

    private static boolean isLetter(char d) {
        if (d >= 65 && d <= 90) {
            return true;
        }
        if (d >= 97 && d <= 122) {
            return true;
        }
        return false;
    }

    private static boolean isCorrect(char c) {
        if (c >= 48 && c <= 57) {
            return true;
        }
        if (c >= 65 && c <= 90) {
            return true;
        }
        if (c == 95) {
            return true;
        }
        if (c >= 97 && c <= 122) {
            return true;
        }
        return false;

    }

}