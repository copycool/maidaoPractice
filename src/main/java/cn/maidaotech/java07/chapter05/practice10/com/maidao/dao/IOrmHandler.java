package cn.maidaotech.java07.chapter05.practice10.com.maidao.dao;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import cn.maidaotech.java07.chapter05.practice10.com.maidao.model.TableFields;

public interface IOrmHandler<T extends TableFields> {
    void setModelClass(Class<?> clazz)
            throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException;

    String getString(T t);

    List<T> getList(ResultSet rs);

    T get(ResultSet rs) throws SQLException, NoSuchMethodException, IllegalAccessException, InvocationTargetException,
            InstantiationException;
}
