package cn.maidaotech.java07.set_practice.score_sort.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import cn.maidaotech.java07.set_practice.score_sort.model.Student;

public interface StudentService {
    public Map<Integer, Student> infoInit();

    public List<Entry<Integer, Student>> infoSort(Map<Integer, Student> map);
}