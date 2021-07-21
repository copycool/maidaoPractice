package cn.maidaotech.java07.work.chapter05.question10.service;

import cn.maidaotech.java07.work.chapter05.question10.pojo.Classinfo;
import org.springframework.stereotype.Service;

@Service
public interface ClassinfoService {
    int deleteByPrimaryKey(Long id);

    int insert(Classinfo record);

    int insertSelective(Classinfo record);

    Classinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Classinfo record);

    int updateByPrimaryKey(Classinfo record);
}