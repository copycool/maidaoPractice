package cn.maidaotech.java07.chapter04.homework.exercise7;

import java.util.StringTokenizer;

public class Test {
    // 从控制台输入一段英文，将其中的单词按照字母排序后打印输出。
    public static void main(String[] args) {

        // AlphabeticalOrderPrint("How are you");
        // AlphabeticalOrderPrint("I am full of you");
        AlphabeticalOrderPrint("The identifier of the encoding used to encode the bytes in value");

    }

    public static void AlphabeticalOrderPrint(String str) {
        String strs[] = new String[1024];
        int count = 0;
        StringTokenizer sti = new StringTokenizer(str.toLowerCase(), " ");

        while (sti.hasMoreTokens()) {
            strs[count] = sti.nextToken();
            count++;
        }

        for (int i = 0; strs[i + 1] != null; i++) {
            for (int j = 0; strs[j + 1] != null; j++) {
                String temp;
                if (strs[j].compareTo(strs[j + 1]) > 0) {
                    temp = strs[j];
                    strs[j] = strs[j + 1];
                    strs[j + 1] = temp;
                }

            }
        }

        for (int i = 0; i < count; i++) {
            System.out.print(strs[i] + " ");
        }
        System.out.println();

    }
}
