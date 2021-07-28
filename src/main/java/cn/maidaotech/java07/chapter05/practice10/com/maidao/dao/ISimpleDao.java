package cn.maidaotech.java07.chapter05.practice10.com.maidao.dao;

import cn.maidaotech.java07.chapter05.practice10.com.maidao.model.TableFields;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.List;

public interface ISimpleDao<T extends TableFields> extends IOrmHandler, IConnectionHandler {

    List<T> selectAll();

    T selectById(T t) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException,
            InstantiationException, IllegalAccessException;

    List<T> selectByOption(T t);

    Boolean insert(T t);

    Boolean insertBatch(List<T> ts);

    Boolean update(T t);

    Boolean deleteById(T t);

    T queryOne(String sql);
}
