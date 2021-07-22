package cn.maidaotech.java07.order.forthpratice7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//将如下英文其中的单词按照字母排序后打印输出。
//The identifier of the encoding used to encode the bytes in value.
public class EnglishTest {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        String a ="The identifier of the encoding used to encode the bytes in value";
        for (String string : a.split(" ")) {
            list1.add(string);
        }
        Collections.sort(list1);
         System.out.println(list1);
        // for ( int i =list1.size(); i >0; i--) {
        //      System.out.println(list1.get(i-1)+" ");
        //  }
    }
}
