package cn.maidaotech.java07.work.chapter05.question10.dao;

import cn.maidaotech.java07.work.chapter05.question10.pojo.Bigdata;

public interface BigdataMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Bigdata record);

    int insertSelective(Bigdata record);

    Bigdata selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Bigdata record);

    int updateByPrimaryKey(Bigdata record);
}