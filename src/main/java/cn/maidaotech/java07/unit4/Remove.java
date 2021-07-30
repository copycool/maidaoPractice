package cn.maidaotech.java07.unit4;

import java.util.ArrayList;
import java.util.List;

public class Remove {
    //删除指定数字的元素
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(20);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                list.add(j);
            }
        }
        System.out.println(list);

        for (int a = 0; a < list.size(); a++) {
            if (list.get(a).equals(3)) {
                list.remove(a);

            }

        }
        System.out.println(list);
    }
}