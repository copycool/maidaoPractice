package cn.maidaotech.java07.work.chapter05.question10.dao;

import cn.maidaotech.java07.work.chapter05.question10.pojo.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentMapper {
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