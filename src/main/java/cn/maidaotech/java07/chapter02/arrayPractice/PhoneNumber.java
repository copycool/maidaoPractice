package cn.maidaotech.java07.chapter02.arrayPractice;

import java.util.Scanner;
//编写一个方法验证用户输入的手机号，要求：11位数字、只能以数字1开头，第二位可以是数字3、5、6、7、8、9。
public class PhoneNumber {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        String s = num.next();
        int i = judgementPhoneNum(s);
        if (i ==1){
            System.out.println("正确格式");
        }else {
            System.out.println("错误格式");
        }
    }

    private static int judgementPhoneNum(String num) {
        char c = num.charAt(1);
        char c1 = num.charAt(0);
        if (num.length()>0&&num.length()<=11&&c1=='1'){
            if (c=='3'||c=='5'||c=='6'||c=='7'||c=='8'||c=='9'){

                return 1;
            }
        }
        return 0;
    }
}
