package cn.maidaotech.java07.chapter04;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SortAlphabet {
    // 将如下英文其中的单词按照字母排序后打印输出
    // Plain TextThe identifier of the encoding used to encode the bytes in value.
    // "Plain" "TextThe" "identifier" "of" "the" "encoding" "used" "to" "encode"
    // "the" "bytes" "in" "value"
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Plain", "TextThe", "identifier", "of", "the", "encoding", "used", "to", "encode", "the",
        "bytes", "in", "value"));

        Collections.sort(list);

        System.out.println(list);
    } 
}