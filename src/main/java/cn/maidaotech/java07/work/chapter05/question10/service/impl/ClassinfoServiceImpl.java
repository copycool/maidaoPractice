package cn.maidaotech.java07.work.chapter05.question10.service.impl;

import cn.maidaotech.java07.work.chapter05.question10.dao.ClassinfoMapper;
import cn.maidaotech.java07.work.chapter05.question10.pojo.Classinfo;
import cn.maidaotech.java07.work.chapter05.question10.service.ClassinfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassinfoServiceImpl implements ClassinfoService {

    @Autowired
    private ClassinfoMapper classinfoMapper;

    @Override
    public int deleteByPrimaryKey(Long id) {
        return classinfoMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Classinfo record) {
        return classinfoMapper.insert(record);
    }

    @Override
    public int insertSelective(Classinfo record) {
        return classinfoMapper.insertSelective(record);
    }

    @Override
    public Classinfo selectByPrimaryKey(Long id) {
        return classinfoMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Classinfo record) {
        return classinfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Classinfo record) {
        return classinfoMapper.updateByPrimaryKey(record);
    }
}