package cn.maidaotech.java07.chapter02;

public class CheckUsername {
    public static void main(String[] args) {
        System.out.println(check("Lcvadlvadf243"));
        System.out.println(reverses("abcdefg"));
        CheckUsername.change();
    }

    private static boolean check(String username) {
        if (username.length() < 8 || username.length() > 20) {
            return false;
        }
        if (!ValidUtil.validUpperLetter(username.charAt(0))) {
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            
            char c = username.charAt(i);
            
         if (!ValidUtil.validLetterAndNum(c)) {
                return false;
            }

        }
        return true;
    }
    private static String reverses(String s){
        StringBuffer str = new StringBuffer(s);
        String res =  str.reverse().toString();
        return res;
    }

    private static void change(){
        String str1 = "I follow Bill Gate Tome Gate John Gate";
        String str2 = "Gates";
        String temp = str1.replace("Gate",str2);
        System.out.println(temp);


    }







}