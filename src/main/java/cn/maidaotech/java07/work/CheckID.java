package cn.maidaotech.java07.work;

import org.apache.commons.lang.StringUtils;

public class CheckID {
    /**验证身份证号的合法性，
     * 身份证号必须满足以下规则：
     *         a. 必须以数字1至9开头
     *         b. 出生年份只能是19**或20**年的数组
     *         c. 出生月份只能是01至12月的数字
     *         d. 出生日两位数字只能是01至31的数字
     *         e. 15到17位可以是任意数字
     *         f. 第18位必须是是数字0-9和字母‘X’
     * @param id
     * @return
     */
    public static boolean checkIDIsTrue(String id){

        //判断id是不是null、""
        if (StringUtils.isEmpty(id)) {
            System.out.println("输入的参数有误，请重新输入！！！");
            return false;
        }

        //a. 身份证是否以数字1至9开头
        if (!Character.isDigit(id.charAt(0)) && id.charAt(0) != '0') {
            System.out.println("身份证不是以数字1至9开头");
            return false;
        }

        //b. 出生年份是否是19**或20**年的数组   412724 1998 0404 1552
        String year = id.substring(6, 8);
        if (!"19".equals(year)  && !"20".equals(year)) {
            System.out.println("出生年份不是19**或20**年的数组");
            return false;
        }

        // c. 出生月份只能是01至12月的数字
        Integer month = Integer.parseInt(id.substring(10, 12));
        if (month > 12 || month < 1) {
            System.out.println("出生月份不是01至12月的数字");
            return false;
        }

        //d. 出生日两位数字只能是01至31的数字
        Integer day = Integer.parseInt(id.substring(12, 14));
        if (day > 31 || day < 1) {
            System.out.println("出生日两位数字不是01至31的数字");
            return false;
        }

        //e. 15到17位可以是任意数字
        try {
            Integer.parseInt(id.substring(14, 17));
        } catch (Exception e) {
            System.out.println("15到17位不全是数字");
            return false;
        }

        //f. 第18位必须是是数字0-9和字母‘X’
        char c = id.charAt(17);
        if (!Character.isDigit(c) && c != 'X' && c != 'x') {
            System.out.println("第18位不是数字0-9或字母‘X’");
            return false;
        }

        //g. 合法的身份证号还必须满足一个公式：
        if (!handleFormula(id)) {
            return false;
        }

        System.out.println("输入的身份证号合法");
        return false;
    }

    //验证公式
    public static boolean handleFormula(String id){
        //反转字符串
        StringBuilder reverseId = new StringBuilder(id).reverse();
        int sum = 0;
        for (int i = 1; i < reverseId.length()+1; i++) {
            if (reverseId.charAt(i-1) == 'x' || reverseId.charAt(i-1) == 'X') {
                break;
            }
            //获取第i位置上的号码字符值，并转成int类型
            int a = Integer.parseInt(reverseId.charAt(i-1)+"");
            //获取第i位置上的加权因子
            int w = (int)Math.pow(2, i-1) % 11;
            //求和
            sum += a * w;
        }
        
        if (sum % 11 != 1) {
            System.out.println("不满足公式，输入身份证号有误！！！");
            return false;
        }
        return true;
    }
}