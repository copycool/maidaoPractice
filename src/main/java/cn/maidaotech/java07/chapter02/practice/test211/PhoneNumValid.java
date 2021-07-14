package cn.maidaotech.java07.chapter02.practice.test211;

public class PhoneNumValid {
    public static Boolean valid(String number) {
        if (number == null)
            return false;
        if (number.length() != 11)
            return false;
        if (number.charAt(0) != '1')
            return false;
        if ((number.charAt(1) - '0') % 2 == 0)
            return false;

        return true;
    }
}