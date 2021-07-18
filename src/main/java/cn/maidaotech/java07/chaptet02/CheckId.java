package cn.maidaotech.java07;

public class CheckId {
    // private static String yearStr;

    public static void main(String[] args) {
        System.out.println(check("12345679"));
        System.out.println(check("z1234567891020304"));
        System.out.println(check(""));

    }

    private static boolean check(String id) {
        if (id == null || id.length() != 18) {
            // System.out.println("不合法");
            return false;
        }
        char[] idArr = id.toCharArray();
        for (int i = 0; i < idArr.length - 1; i++) {

            if (!Number(idArr[i])) {
                return false;
            }

            if (idArr[0] < 49 || idArr[0] > 57) {
                return false;
            }

             

        }
        String yearStr = id.substring(6, 8);
        String monthStr = id.substring(10, 12);
        String dayStr = id.substring(12, 14);
        char endLetter = id.charAt(id.length() - 1);

        return checkyear(yearStr) && checkmonth(monthStr) && checkday(dayStr) && checkend(endLetter)&& checkweigingfactor(id);
        

    }

    private static Boolean checkweigingfactor(String id) {
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

    private static boolean checkend(char endLetter) {
        if (endLetter < 48 || endLetter > 57) {
            return false;
        }
        if (endLetter != 88) {
            return false;
        }
        return true;
    }

    private static boolean checkday(String dayStr) {
        int day = Integer.parseInt(dayStr);
        if (day < 1 || day > 31) {
            return false;
        }
        return true;
    }

    private static boolean checkmonth(String monthStr) {
        int month = Integer.parseInt(monthStr);
        if (month < 1 || month > 12) {
            return false;
        }
        return true;
    }

    private static boolean checkyear(String yearStr) {
        if (!yearStr.equals("19") && !yearStr.equals("20")) {
            return false;
        }
        return true;

    }

    private static boolean Number(char c) {
        if (c < '0' || c > '9') {
            return false;
        }
        return true;
    }

}