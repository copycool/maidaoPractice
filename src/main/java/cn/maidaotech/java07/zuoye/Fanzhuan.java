package cn.maidaotech.java07.zuoye;

public class Fanzhuan {
    public static void main(String[] args) {
        String str = "abcdef";
        String temp = "";

        for (int i = 0; i < str.length(); i++) {
            //charAt取一段字符串中的一个字符
            temp = temp + str.charAt(str.length() - 1 - i);
        }
        System.out.println(temp);
    }
}
