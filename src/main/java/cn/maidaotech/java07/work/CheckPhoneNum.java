package cn.maidaotech.java07.work;

/**
 * 验证手机号 要求：11 位数字、只能以数字 1 开头，第二位可以是数 字 3、5、6、7、8、9。
 */
public class CheckPhoneNum {

    public static void main(String[] args) {
        String phoneNum = "14538431554";
        boolean res = check(phoneNum);
        if (res) {
            System.out.println("您的手机号码校验通过");
        } else {
            System.out.println("您的手机号码校验没通过，请重新检查");
        }
    }

    public static boolean check(String phoneNum) {
        if (phoneNum == null) {
            return false;
        }
        if (phoneNum.length() != 11) {
            return false;
        }
        if (phoneNum.charAt(0) < '1' || phoneNum.charAt(0) > '9') {
            return false;
        }

        String item = phoneNum.substring(1, 2);
        String temp = "356789";
        if (!temp.contains(item)) {
            return false;
        }
        return true;
    }
}