package cn.maidaotech.java07.chapter02;

public class ValidUtil {
    private final static String LOWER_STRING = "abcdefghijklmnopqrstuvwxyz";
    private final static String UPPER_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final static String NUMBER_STRING = "0123456789";

    public static boolean validLowerLetter(char c) {
        return LOWER_STRING.indexOf(c) == -1 ? false : true;
    }

    public static boolean validUpperLetter(char c) {
        return UPPER_STRING.indexOf(c) == -1 ? false : true;
    }

    public static boolean validLetter(char c) {
        return validLowerLetter(c) || validUpperLetter(c);
    }

    public static boolean validLetterAndNum(char c) {
        return validLetter(c) || validNumber(c);
    }

    public static boolean validNumber(char c) {
        return NUMBER_STRING.indexOf(c) == -1 ? false : true;
    }

}