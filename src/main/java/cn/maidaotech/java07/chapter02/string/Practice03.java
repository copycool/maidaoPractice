package cn.maidaotech.java07.chapter02.string;


public class Practice03 {
    //写一个方法，实现字符串的反转，如：输入abcd，输出dcba
    public static void main(String[] args) {
        print("abcd");
    }
    public static void print(String str){
        StringBuilder builder = new StringBuilder(str);
        System.out.println(builder.reverse());
    }
    
    
}