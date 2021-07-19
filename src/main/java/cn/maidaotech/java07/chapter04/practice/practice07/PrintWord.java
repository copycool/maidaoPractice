package cn.maidaotech.java07.chapter04.practice.practice07;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class PrintWord {
    // /**
    // * 根据单词的字母排序
    // * @param word
    // */
    // public static void printWord(String word) {
    // char[] strArr = word.toCharArray();
    // Arrays.sort(strArr);
    // StringBuilder builder = new StringBuilder();
    // for (char c : strArr) {
    // builder.append(c);
    // }
    // System.out.println(builder.toString());
    // }

    public static void printWord(String passage) {
        String[] wordArr = passage.split(" ");

        Arrays.sort(wordArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() != o2.length())
                    return o1.length() - o2.length();
                return getValue(o1) - getValue(o2);
            }
        });

        StringBuilder stringBuilder = new StringBuilder();
        for (String word : wordArr) {
            stringBuilder.append(word);
            stringBuilder.append(" ");
        }
        
        System.out.println(stringBuilder.toString());
    }

    /**
     * 获取字符串的值
     */
    private static int getValue(String str) {
        char[] charArr = str.toCharArray();
        int value = 0;
        for (char c : charArr) {
            value += c;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        scanner.close();
        printWord(word);
    }
}