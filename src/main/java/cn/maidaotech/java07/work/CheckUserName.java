package cn.maidaotech.java07.work;

import java.util.regex.Pattern;

public class CheckUserName {
    public static void main(String[] args) {
        String userName = "";
        boolean res = check(userName);
        if(res){
            System.out.println("Success");
        }else{
            System.out.println("Error");
        }
    }

    /**
     * 检测用户名是否合法该方法内规则如下： 1. 长度 8 到 20 个字符 2. 只能英文、数字、下划线 3. 必须以字母开头
     * 
     * @param userName 用户名
     * @return boolean类型的值，符合规则返回`true` 不符合规则为`false`
     */
    public static boolean check(String userName) {
        if (userName == null) {
            return false;
        }
        int len = userName.length();
        if (len < 8 || len > 20) {
            return false;
        }
        String rule = "^['a'-'z''A'-'Z']\s$";
        boolean isMatch = Pattern.matches(rule, userName);
        if (!isMatch) {
            return false;
        }
        String secial = "[`~!@#$%^&*()+=|{}':;',\\[\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？\\\\]";
        boolean isSecial = Pattern.matches(secial, userName);
        if (isSecial) {
            return true;
        }
        return false;
    }
}