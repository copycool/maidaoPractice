package com.maidao.dao.impl;

import com.maidao.dao.ISimpleDao;
import com.maidao.model.TableFields;

import java.lang.reflect.InvocationTargetException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class SimpleDaoImpl<T extends TableFields> extends OrmConnectHandlerImpl implements ISimpleDao<T> {
    @Override
    public List<T> selectAll() {
        return null;
    }

    @Override
    public T selectById(T t) throws SQLException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        executeConnect(); // 待会通过动态代理调用
        StringBuilder builder = new StringBuilder();
        builder.append("select * from ");
        builder.append(t.getOrmMap().get("tableName"));
        this.stmt = this.conn.prepareStatement(builder.toString());
        ResultSet resultSet = this.stmt.executeQuery();
        this.get(resultSet);
        return null;
    }

    @Override
    public List<T> selectByOption(T t) {
        return null;
    }

    @Override
    public Boolean insert(T t) {
        return null;
    }

    @Override
    public Boolean insertBatch(List<T> ts) {
        return null;
    }

    @Override
    public Boolean update(T t) {
        return null;
    }

    @Override
    public Boolean deleteById(T t) {
        return null;
    }

    @Override
    public T queryOne(String sql) {
        return null;
    }

    @Override
    public List<T> query(String sql) {
        return null;
    }
}
