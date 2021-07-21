package cn.maidaotech.java07.work.chapter05.question10.service;

import cn.maidaotech.java07.work.chapter05.question10.pojo.Course;
import org.springframework.stereotype.Service;

public interface CourseService {
    int deleteByPrimaryKey(Long id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}