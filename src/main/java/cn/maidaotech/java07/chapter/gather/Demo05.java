package cn.maidaotech.java07.chapter.gather;

import java.util.*;

public class Demo05 {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] array = { 1, 1, 1, 2, 3, 3, 5, 6, 5, 6, 6 };
        // 将元素作为键，元素出现的次数作为值，放入HashMap中
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == null) {
                map.put(array[i], 1);
            } else {
                int value = map.get(array[i]);
                map.put(array[i], value + 1);
            }
        }

        // 获取存在HashMap中所有的value值
        // 获取所有的值
        Collection<Integer> values = map.values();
        // 创建value集合的迭代器
        Iterator<Integer> valuesiterator = values.iterator();
        int maxValue = 0;
        // 找到最大的value
        while (valuesiterator.hasNext()) {
            int tem1 = valuesiterator.next();
            if (tem1 > maxValue) {
                maxValue = tem1;
            }
        }

        // 排查问题所需代码
        // System.out.println("maxValue:"+maxValue);
        // System.out.println("values:"+values);

        // 返回map中所有键的集合，创建迭代器
        Iterator<Integer> keyiterator = map.keySet().iterator();
        while (keyiterator.hasNext()) {
            // 迭代key集合，将key保存在临时变量tem2中
            int tem2 = keyiterator.next();
            // 排查问题所需代码，可以忽略
            // System.out.println("tem2(key值):"+map.get(tem2));

            // 通过临时变量tem2中保存的key值，得到map中的value值，看最大的value与map中的哪个value相等
            // 相等则输出value对应的key值，map中的key也就是数组中的数字
            if (maxValue == map.get(tem2)) {
                System.out.println("出现次数最多的数字：" + tem2);
            }
        }
    }
}
