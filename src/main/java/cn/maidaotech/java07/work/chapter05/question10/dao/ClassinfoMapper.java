package cn.maidaotech.java07.work.chapter05.question10.dao;

import cn.maidaotech.java07.work.chapter05.question10.pojo.Classinfo;

public interface ClassinfoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Classinfo record);

    int insertSelective(Classinfo record);

    Classinfo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Classinfo record);

    int updateByPrimaryKey(Classinfo record);
}