package cn.maidaotech.java07.work.chapter05.question10.service;

import cn.maidaotech.java07.work.chapter05.question10.pojo.Score;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

public interface ScoreService {

    int deleteByPrimaryKey(Long id);

    int insert(Score record);

    int insertSelective(Score record);

    Score selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Score record);

    int updateByPrimaryKey(Score record);

    List<Map<Object,Object>> selectStudentCountByCourse();

    List<Score> selectStudentScoreBySno(Long sno);

    List<Map<Object,Object>> selectStudentSumScoreByCno(Long cno);

    List<Map<Object,Object>> selectEveryCalssAverageScoreByCourseId(Long courseId);

    List<Map<Object,Object>> selectEveryCourseScoreMaxMinAvg();

    List<Map<Object,Object>> selectAdditionalQuestions();
}