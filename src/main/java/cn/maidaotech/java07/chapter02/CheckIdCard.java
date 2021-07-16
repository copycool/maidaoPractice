package cn.maidaotech.java07.chapter02;

import cn.maidaotech.java07.utitls.IdUtitls;

/**验证身份证号的合法性，
 * 身份证号必须满足以下规则;
 * 必须以数字1至9开头
 * 出生年份只能是19**或20**年的数组
 * 出生月份只能是01至12月的数字
 * 出生日两位数字只能是01至31的数字
 * 15到17位可以是任意数字
 * 第18位必须是是数字0-9和字母‘X’合法的身份证号
 */
public class CheckIdCard {
    private static boolean checkIdCard(String Id){
        //必须以数字1至9开头
        if (IdUtitls.isFirstId()) {
            
        }
        return true;
    }
}
