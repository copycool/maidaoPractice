package cn.maidaotech.java07.chapter02.practice.test211;

import cn.maidaotech.java07.chapter02.util.CharTypeEstimate;

public class EmailValid {
    public static Boolean valid(String email) {
        if (email == null)
            return false;
        String name = email.substring(0, email.indexOf('@'));
        String host = email.substring(email.indexOf('@') + 1);

        return nameValid(name) && hostValid(host);
    }

    private static Boolean nameValid(String name) {
        // 1.只能以字母開頭
        char firstLetter = name.charAt(0);
        if (!CharTypeEstimate.letterEstimate(firstLetter))
            return false;

        /**
         * 2.只能由字母、數字、下劃綫組成 3.至少包含大写字母、小写字母、数字、下划线中的三种
         */
        int containUpperLetter = 0;
        int containLowerLetter = 0;
        int containNum = 0;
        int containDecoration = 0;
        for (char letter : name.toCharArray()) {
            if (letter < 48 || letter > 122)
                return false;
            if (letter > 90 && letter < 95)
                return false;
            if (letter == 96)
                return false;
            if (letter > 57 && letter < 65) {
                return false;
            }
            if (CharTypeEstimate.numberEstimate(letter))
                containNum = 1;
            if (CharTypeEstimate.upperCaseEstimate(letter))
                containUpperLetter = 1;
            if (letter == 95)
                containDecoration = 1;
            if (CharTypeEstimate.lowerCaseEstimate(letter))
                containLowerLetter = 1;
        }
        int contains = containUpperLetter + containLowerLetter + containNum + containDecoration;
        if (contains < 3)
            return false;
        return true;
    }

    private static Boolean hostValid(String host) {
        int index = host.indexOf('.');
        Boolean result = (index == -1 || index == 0 || index == host.length() - 1);
        return !result;
    }
}