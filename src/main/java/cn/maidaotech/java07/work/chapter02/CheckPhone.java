package cn.maidaotech.java07.work.chapter02;

public class CheckPhone {
    
    /**
     * 1.编写一个方法验证用户输入的手机号，
     * 要求：11位数字、只能以数字1开头，第二位可以是数字3、5、6、7、8、9。
     * @param phone
     * @return
     */
    public static boolean checkPhoneIsTrue(String phone){

        //判断phone是不是null、""
        if (phone == null || phone == "") {
           System.out.println("输入的参数有误，请重新输入！！！");
           return false;
       }

       //是否以数字1开头
       if(phone.charAt(0) != '1'){
           System.out.println("输入的字符串不是以1开头");
           return false;
       }

       //第二位是否为数字3、5、6、7、8、9。
       if ("356789".contains(phone.charAt(1)+"")) {
           System.out.println("第二位不是数字3、5、6、7、8、9");
           return false;
       }

       //遍历字符串是否为11位数字
       for (int i = 0; i < phone.length(); i++) {
           if (!Character.isDigit(phone.charAt(i)) || phone.length() != 11) {
               System.out.println("输入的字符串不是11位数字");
               return false;
           }
       }
       
       System.out.println("输入的手机号格式正确");
       return true;
   }
}