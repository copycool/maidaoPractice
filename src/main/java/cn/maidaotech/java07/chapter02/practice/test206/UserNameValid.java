package cn.maidaotech.java07.chapter02.practice.test206;

import cn.maidaotech.java07.chapter02.util.CharTypeEstimate;

public class UserNameValid {
    public static Boolean valid(String userName) {
        if (userName == null)
            return false;
        if (userName.length() < 8 || userName.length() > 20)
            return false;
        char[] userNameStrArr = userName.toCharArray();
        for (char c : userNameStrArr) {
            if (!CharTypeEstimate.numberEstimate(c) && !CharTypeEstimate.letterEstimate(c))
                return false;
        }
        if (!CharTypeEstimate.upperCaseEstimate(userNameStrArr[0]))
            return false;
        return true;

    }
}