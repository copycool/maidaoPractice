package cn.maidaotech.java07.chapter.gather;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Demo06 {
    
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