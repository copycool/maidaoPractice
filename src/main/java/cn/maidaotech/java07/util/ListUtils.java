package cn.maidaotech.java07.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListUtils {
    /**
     * 删除集合内指定元素
     * 
     * @param list  元素集合
     * @param eleme 指定元素
     * @return 删除指定元素后的集合
     */
    public static List<Integer> removeAll(List<Integer> list, Integer eleme) {
        if (list == null || eleme == null) {
            return null;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == eleme) {
                list.remove(i);
            }
        }
        return list;
    }

    /**
     * 生成指定个数并在指定范围内的随机数
     * 
     * @param count 生成随机数的个数
     * @param bound 指定范围，(0 -> bound] 从0开始包含指定数
     * @return 返回存储随机数的集合
     */
    public static List<Integer> randumNum(int count, int bound) {
        if (count <= 0 || bound <= 0) {
            return null;
        }
        Random random = new Random();
        List<Integer> list = new ArrayList<>(0);
        while (list.size() < count) {
            list.add(random.nextInt(bound));
        }
        return list;
    }
}