package cn.maidaotech.java07;

public class CheckNumber {

    public static void main(String[] args) {
        System.out.println("1345678912是" + (check("1345678912") ? "正确的" : "非法的"));
    }

    private static boolean check(String number) {

        if (number == null) {
            return false;
        }

        if (number.length() != 11) {
            return false;
        }

        for (int i = 0; i < number.length(); i++) {
            char c = number.charAt(i);
            if (number.charAt(0) != '1') {
                return false;
            }
          

            if ( !isNumber(c)) {
                return false;
            }
            
        }

        return true;
    }

    private static boolean isNumber(char c){
        if (c >='0' && c <= '9'){
            return true;
        }  
        return false;
    }
}