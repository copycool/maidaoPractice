package cn.maidaotech.java07.work.chapter05.question10.service.impl;

import cn.maidaotech.java07.work.chapter05.question10.dao.StudentMapper;
import cn.maidaotech.java07.work.chapter05.question10.pojo.Student;
import cn.maidaotech.java07.work.chapter05.question10.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Student record) {
        return studentMapper.insert(record);
    }

    @Override
    public int insertSelective(Student record) {
        return studentMapper.insertSelective(record);
    }

    @Override
    public Student selectByPrimaryKey(Long id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Student record) {
        return studentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Student record) {
        return studentMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Student> selectAll() {
        return studentMapper.selectAll();
    }

    @Override
    public List<Student> selectFailStudentCountByCourdeId(Long courseId) {
        return studentMapper.selectFailStudentCountByCourdeId(courseId);
    }

    @Override
    public List<Student> selectAllCourseScoreExceedEighty() {
        return studentMapper.selectAllCourseScoreExceedEighty();
    }

    @Override
    public List<Student> selectAtLeastOneFailed() {
        return studentMapper.selectAtLeastOneFailed();
    }
}