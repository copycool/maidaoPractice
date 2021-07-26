package cn.maidaotech.java07.chapter02.string;

public class Pactice05 {
    //编程检测用户名的合法性，用户名需满足以下条件：
    //长度8到20个字符
    //只能英文字母、数字
    //必须以大写字母开头
    public static void main(String[] args) {
        boolean b = print("AsfGh345b");
        if (b) {
            System.out.println("yes");
        }else{
            System.out.println("no");
        }
    }
    public static Boolean print(String str){
        
        if (str==null || str.length() == 0) {
            return false;
        }
        
        if (str.length()<8 || str.length()>20) {
            return false;
        }

        char[] newChar = str.toCharArray();
        if (newChar[0]<'A' || newChar[0]>'Z') {
            return false;
        }
        for (int i = 1; i < newChar.length; i++) {
            if (newChar[i]>='0'&&newChar[i]<='9'||newChar[i]>='a'&&newChar[i]<='z'||newChar[i]>='A'&&newChar[i]<='Z') {
                
            }else{
                return false;
            }
        }
        return true;
    }
}