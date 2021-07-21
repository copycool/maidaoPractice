package cn.maidaotech.java07.work.chapter05.question10.service.impl;

import cn.maidaotech.java07.work.chapter05.question10.dao.ScoreMapper;
import cn.maidaotech.java07.work.chapter05.question10.pojo.Score;
import cn.maidaotech.java07.work.chapter05.question10.service.ScoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class ScoreServiceImpl implements ScoreService {

    @Autowired
    private ScoreMapper scoreMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return scoreMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Score record) {
        return scoreMapper.insert(record);
    }

    @Override
    public int insertSelective(Score record) {
        return scoreMapper.insertSelective(record);
    }

    @Override
    public Score selectByPrimaryKey(Long id) {
        return scoreMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Score record) {
        return scoreMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Score record) {
        return scoreMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Map<Object, Object>> selectStudentCountByCourse() {
        return scoreMapper.selectStudentCountByCourse();
    }

    @Override
    public List<Score> selectStudentScoreBySno(Long sno) {
        return scoreMapper.selectStudentScoreBySno(sno);
    }

    @Override
    public List<Map<Object, Object>> selectStudentSumScoreByCno(Long cno) {
        return scoreMapper.selectStudentSumScoreByCno(cno);
    }

    @Override
    public List<Map<Object, Object>> selectEveryCalssAverageScoreByCourseId(Long courseId) {
        return scoreMapper.selectEveryCalssAverageScoreByCourseId(courseId);
    }

    @Override
    public List<Map<Object, Object>> selectEveryCourseScoreMaxMinAvg() {
        return scoreMapper.selectEveryCourseScoreMaxMinAvg();
    }

    @Override
    public List<Map<Object, Object>> selectAdditionalQuestions() {
        return scoreMapper.selectAdditionalQuestions();
    }
}