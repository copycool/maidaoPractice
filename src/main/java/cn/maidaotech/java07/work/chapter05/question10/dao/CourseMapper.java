package cn.maidaotech.java07.work.chapter05.question10.dao;

import cn.maidaotech.java07.work.chapter05.question10.pojo.Course;

public interface CourseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Course record);

    int insertSelective(Course record);

    Course selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}