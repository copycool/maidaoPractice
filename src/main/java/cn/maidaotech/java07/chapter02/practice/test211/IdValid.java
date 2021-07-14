package cn.maidaotech.java07.chapter02.practice.test211;

import cn.maidaotech.java07.chapter02.util.CharTypeEstimate;

public class IdValid {
    public static Boolean valid(String id) {
        if (id == null || id.length() != 18)
            return false;
        char[] idArr = id.toCharArray();
        for (int i = 0; i < idArr.length - 1; i++) {
            if (!CharTypeEstimate.numberEstimate(idArr[i])) {
                return false;
            }
        }
        if (idArr[0] < 49 || idArr[0] > 57)
            return false;
        String yearStr = id.substring(6, 8);
        String monthStr = id.substring(10, 12);
        String dayStr = id.substring(12, 14);
        char endLetter = id.charAt(id.length() - 1);

        return yearValid(yearStr) && monthValid(monthStr) && dayValid(dayStr) && endValid(endLetter)
                && weigingfactorValid(id);
    }

    private static Boolean yearValid(String yearStr) {
        if (!yearStr.equals("19") && !yearStr.equals("20"))
            return false;
        return true;
    }

    private static Boolean monthValid(String monthStr) {
        int month = Integer.parseInt(monthStr);
        if (month < 1 || month > 12)
            return false;
        return true;
    }

    private static Boolean dayValid(String dayStr) {
        int day = Integer.parseInt(dayStr);
        if (day < 1 || day > 31)
            return false;
        return true;
    }

    private static Boolean endValid(char endLetter) {
        if (endLetter < 48)
            return false;
        if (endLetter > 57 && endLetter != 88)
            return false;
        return true;
    }

    private static Boolean weigingfactorValid(String id) {
        char[] idCharArr = id.toCharArray();
        int weigingfactor = 0;
        int j = 1;
        for (int i = 18; i > 0; i--) {
            int ai = Integer.parseInt(idCharArr[i - 1] + "");
            int wi = weigingfactorHelper(j) % 11;
            int weigingfactorChild = ai * wi;
            weigingfactor += weigingfactorChild;
            j++;
        }
        if (weigingfactor % 11 != 1)
            return false;
        return true;
    }

    private static int weigingfactorHelper(int num) {
        num--;
        if (num == 1)
            return 2;
        if (num == 0)
            return 1;
        return (weigingfactorHelper(num)) * 2;
    }
}