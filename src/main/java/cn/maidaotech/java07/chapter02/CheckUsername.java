package cn.maidaotech.java07.chapter02;

public class CheckUsername {
    public static void main(String[] args) {
        check("fdf789");
        check("放的时间了678");
    }

    private static boolean check(String username){
        if(username != null){
            return false;
        }
        if(username.length()<8){
            return false;
        }

        return true;
    }
}
