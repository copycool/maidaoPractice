package cn.maidaotech.java07.chapter02.stringPractice;


public class TestUsername {
    public static void main(String[] args) {
        System.out.println(check("Agdhs123"));
        System.out.println(check("a12314"));
        System.out.println(check("gfugfyuguygyu"));
        System.out.println(check("1dasfafa"));
        System.out.println(check("Djh456546"));
    }

    public static boolean check(String username){
        if(username == null){
            return false;
        }
        if(username.length()<8||username.length()>20){
            return false;
        }
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            if(i == 0 && !isUpperCase(c)){
                return false;
            }
            if(isNum(c)||isLowerCase(c)||isNum(c)){
                return true;
            }
            return false;

        }
        return true;

    }
    private static boolean isUpperCase(char c){
        if(c>='A'&& c<='Z'){
            return true;
        }
        // if(str.indexOf(c) != -1){
        //     return true;
        // }
        return false;
    }
    private static boolean isLowerCase(char c){
        if(c>='a'&&c<='z'){
            return true;
        }
        return false;
    }
    private static boolean isNum(char c){
        if(c<'0'&&c>'9'){
            return false;
        }
        return true;
    }
}
