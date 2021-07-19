package cn.maidaotech.java07.chapter04;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortAlphabet {
    // 将如下英文其中的单词按照字母排序后打印输出
    // Plain TextThe identifier of the encoding used to encode the bytes in value.
    // "Plain" "TextThe" "identifier" "of" "the" "encoding" "used" "to" "encode"
    // "the" "bytes" "in" "value"
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] a = { "Plain", "TextThe", "identifier", "of", "the", "encoding", "used", "to", "encode", "the",
                "bytes", "in", "value" };
        Collections.addAll(list, a);
        list.sort(Comparator.naturalOrder());

        // System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}