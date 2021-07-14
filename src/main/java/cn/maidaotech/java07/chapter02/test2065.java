package cn.maidaotech.java07.chapter02;

public class test2065 {
    //编程检测用户名的合法性，用户名需满足以下条件：长度8到20个字符 只能英文字母、数字 必须以大写字母开头
    public static void main(String[] args) {
        
        boolean username1=checkUserName("");
        boolean username2=checkUserName("123");
        boolean username3=checkUserName("a123456789");
        boolean username4=checkUserName("A123456789*");
        boolean username5=checkUserName("ABX123456789");

    }
    public static boolean checkUserName(String username){
        if(username==null||username.length()==0){
            System.out.println("用户名不能为空");
            return false;
        }
        if(username.length()<8||username.length()>20){
            System.out.println("用户名的长度必须为8到20");
            return false;
        }

        char[] usernamechar=username.toCharArray();
        int fistChar=(int)usernamechar[0];
        if(fistChar<65||fistChar>90){
            System.out.println("用户名必须以大写字母开头");
            return false;
        }

        for(int i=1;i<usernamechar.length;i++){
           int ascii=usernamechar[i];
           if(!((ascii>=65&&ascii<=90)||(ascii<=97&&ascii>=122)||(ascii>=48&&ascii<=57))){
                  System.out.println("用户名只能包含英文字母和数字");
                  return false;
           }
        }
        System.out.println("用户格式正确");
        return true;
    }
    
}
