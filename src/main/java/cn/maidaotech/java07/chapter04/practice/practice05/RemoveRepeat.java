package cn.maidaotech.java07.chapter04.practice.practice05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RemoveRepeat {

    public static List<String> removeRepeat(List<String> list) {
        Map<String, Integer> checkMap = new HashMap<>();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            String curItem = iterator.next();
            if (checkMap.containsKey(curItem))
                iterator.remove();
            else
                checkMap.put(curItem, 1);
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add("s" + i);
        }
        list.add("s1");
        list.add("s1");
        list.add("s1");
        System.out.println(list.toString());
        System.out.println(removeRepeat(list).toString());
    }
}