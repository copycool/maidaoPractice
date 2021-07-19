package cn.maidaotech.java07.set_practice.score_sort.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import cn.maidaotech.java07.set_practice.score_sort.model.Student;

public class StudentServiceImpl implements StudentService {
    Map<Integer, Student> map = new HashMap<>(50);

    @Override
    public Map<Integer, Student> infoInit() {

        Random random = new Random();
        // 使用循环生成40个对象
        int count = 190100;
        String str = "张";
        for (int i = 0; i <= 40; i++) {
            map.put(count + (i + 1), new Student((count + (i + 1)), (str + (i + 1)), (random.nextInt(101 - 50) + 50)));
        }

        map.forEach((k, v) -> {
            System.out.println(k + ":" + v + "\t");
        });
        return map;
    }

    @Override
    public List<Map.Entry<Integer, Student>> infoSort(Map<Integer, Student> map) {
        // 转存list
        List<Map.Entry<Integer, Student>> list = new ArrayList<Map.Entry<Integer, Student>>(map.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Student>>() {

            @Override
            public int compare(java.util.Map.Entry<Integer, Student> m1, java.util.Map.Entry<Integer, Student> m2) {
                return m1.getValue().compareTo(m2.getValue());
            }
        });
        return list;
    }

}