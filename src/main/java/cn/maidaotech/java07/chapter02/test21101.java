package cn.maidaotech.java07.chapter02;

public class test21101 {
    //编写一个方法验证用户输入的手机号，
    // 要求：11位数字、只能以数字1开头，第二位可以是数字3、5、6、7、8、9。
    public static void main(String[] args) {
        checkUserName("");
        checkUserName("123456");
        checkUserName("2345");
        checkUserName("11119326932");
        checkUserName("25737932693");
        checkUserName("15737932693");

    }
    public static boolean checkUserName(String userNumber){
      if(userNumber==null||userNumber.length()==0){
          System.out.println("手机号不可为空");
          return false;
      }
      if(userNumber.length()!=11){
            System.out.println("手机号必须为11位");
            return false;
      }
      char[] nums=userNumber.toCharArray();
      int first=(int)nums[0];
      if(first!=49){
          System.out.println("手机号的第一位必须为1");
          return false;
      }
      int second=(int)nums[1];
      if(second<51||second>58){
         
          System.out.println("手机号的第二位要为3、5、6、7、8、9");
          return false;
      }
      System.out.println("手机号的格式正确");
      return true;
    }
}
