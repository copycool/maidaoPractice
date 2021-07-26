package cn.maidaotech.java07.chapter02;
import java.util.Scanner;

public class JudegUsername {
    //编程检测用户名的合法性，用户名需满足以下条件：
    //长度8到20个字符
    //只能英文字母、数字
    //必须以大写字母开头
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入用户名");
        String userName=scanner.next();
        
        JudegUsername judgeUser = new JudegUsername();
        if (judgeUser.Judge(userName)){
            System.out.println("用户名格式正确");
        }else{
            System.out.println("用户名格式错误！");
        }

    }
    //判断用户名是否合法
    //用户名开头必须是大写字母，只能是以数字、字母组成
    public boolean Judge(String userName){
        char[] chars = userName.toCharArray();
        if (chars[0]<65||chars[0]>90){
            return false;
        }else{
            for (int i = 1; i < chars.length ; i++) {
                if (chars[i]>=48 && chars[i]<=57 || chars[i]>=65 && chars[i]<=90 || chars[i]>=97 && chars[i]<=122){
                }else{
                    return false;
                }
            }
        }
        return true;
    }

}