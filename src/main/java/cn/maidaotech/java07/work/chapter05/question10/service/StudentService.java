package cn.maidaotech.java07.work.chapter05.question10.service;

import cn.maidaotech.java07.work.chapter05.question10.pojo.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

    List<Student> selectAll();

    List<Student> selectFailStudentCountByCourdeId(Long courseId);

    List<Student> selectAllCourseScoreExceedEighty();

    List<Student> selectAtLeastOneFailed();
}