package cn.maidaotech.java07.java04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sort {
    private static final String a = "The identifier of the encoding used to encode the bytes in value";

    public static void main(String[] args) {
        List<String> sort = new ArrayList<>();
        sort.add("The");
        sort.add("identifier");
        sort.add("of");
        sort.add("the");
        sort.add("encoding");
        sort.add("used");
        sort.add("to");
        sort.add("encode");
        sort.add("the");
        sort.add("bytes");
        sort.add("in");
        sort.add("value");
        Collections.sort(sort);
        /*
         * for (String string : sort) { System.out.println(string); }
         */
        for (int i = 0; i < sort.size(); i++) {
            System.out.println(sort.get(i));
        }

    }
}