package cn.maidaotech.java07.work;

public class CheckIdNum {
    public static void main(String[] args) {
        String idNum = "";
        boolean res = true;

        try {
            res = check(idNum);
        } catch (Exception e) {
            e.printStackTrace();
        }

        if (res) {
            System.out.println(" Succes " + res + " : 该身份证号符合规则");
        } else {
            System.out.println(" Error " + res + " : 该身份证号不符合规则");
        }
    }

    /**
     * 检验身份证号输入是否符合规则
     * 
     * @param idNum 身份证号
     * @return 符合为`true`不符合为`false`
     * @throws Exception
     */
    private static boolean check(String idNum) {

        // 判断是否为空引用字符串
        if (idNum == null) {
            return false;
        }

        // 判断长度是否为18
        if (idNum.length() != 18) {
            System.out.println();
            return false;
        }

        // 判断身份证号第一位是否是数值
        if (!Character.isDigit(idNum.charAt(0))) {
            System.out.println("身份证号异常");
            return false;

        }

        // 判断身份证号第一位是否在1-9这个区间
        if ((idNum.charAt(0)) < '1' || idNum.charAt(0) > '9') {
            System.out.println("Error:身份证号第一位必须为[1-9]");
            return false;

        }

        // 判断身份证号中的年是否在规定范围
        String year = "" + idNum.charAt(6) + idNum.charAt(7);
        if (!(("19".equals(year)) || ("20".equals(year)))) {
            System.out.println("Error:身份证号出生年必须是`19**年~20**年`");
            return false;

        }

        // 将月份才分成两个单个字符进行判断
        if ("0".equals("" + idNum.charAt(10))) {
            if (!(idNum.charAt(11) < '0' || idNum.charAt(11) > '9')) {
                System.out.println("Error:身份证号出生月份错误");
                return false;

            }
        } else if ("1".equals("" + idNum.charAt(10))) {
            if (!(idNum.charAt(11) < '0' || idNum.charAt(11) > '2')) {
                System.out.println("Error:身份证号出生月份错误");
                return false;

            }
        }

        // 判断日期
        String day = "" + idNum.charAt(12) + idNum.charAt(13);
        Integer dayInt = Integer.parseInt(day);
        if (dayInt < 0 || dayInt > 31) {
            System.out.println("Error:身份正好出生日期不可小于0或大于31");
        }

        try {
            Integer.parseInt(idNum.substring(14, 17));
        } catch (Exception e) {
            System.out.println("15到17位不全是数字");
            return false;
        }

        if (idNum.charAt(17) < 0 || idNum.charAt(17) < 9 || !("x".equals(idNum.substring(18)))) {
            System.out.println("身份证号码最后一位必须是0~9或·x·");
            return false;
        }
        CheckIdNum.authority(idNum);
        return true;
    }

    // 加权因子计算
    private static boolean authority(String idNum) {
        int sum = 0;
        String[] arr = idNum.split("");
        for (int i = 1; i <= idNum.length(); i++) {
            sum += Integer.parseInt(arr[i]) * arr.length - i;
        }
        return true;
    }
}