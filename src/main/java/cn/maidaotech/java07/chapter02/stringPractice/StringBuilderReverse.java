package cn.maidaotech.java07.chapter02.stringPractice;

public class StringBuilderReverse {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("abcd");
        StringBuilder reverse = builder.reverse();
        System.out.println(reverse);
    }
}
