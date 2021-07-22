package cn.maidaotech.java07.work4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//("The","identifier", "of"," the"," encoding","used","to", "encode"," the" ,"bytes","in","value")
public class PrintEnglish {
    public static void main(String[] args) {
        // String a = { "The", "identifier", "of", " the", " encoding", "used", "to", "encode", " the", "bytes", "in",
        //         "value" };
        String english="The identifier of the encoding used to encode the bytes in value.";
       String [] a=english.split(" ");
        List<String > list1 = Arrays.asList(a);

        Collections.sort(list1);
       // list1.sort(Comparator.naturalOrder());
        System.out.println(list1);
        System.out.println(list1.size());
    }

}
