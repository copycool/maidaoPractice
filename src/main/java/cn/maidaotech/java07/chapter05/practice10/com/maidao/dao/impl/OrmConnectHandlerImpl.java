package cn.maidaotech.java07.chapter05.practice10.com.maidao.dao.impl;

import cn.maidaotech.java07.chapter05.practice10.com.maidao.dao.IConnectionHandler;
import cn.maidaotech.java07.chapter05.practice10.com.maidao.dao.IOrmHandler;
import cn.maidaotech.java07.chapter05.practice10.com.maidao.model.TableFields;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrmConnectHandlerImpl<T extends TableFields> implements IOrmHandler<T>, IConnectionHandler {
    private static final String CONNECT_URL = "jdbc:mysql://localhost:3306/maidao_practice?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
    private static final String USER = "root";
    private static final String PASSWORD = "lidongyi521";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    protected Connection conn = null;
    protected PreparedStatement stmt = null;
    protected ResultSet rs = null;

    protected Class<?> modelClass;

    @Override
    public void executeConnect() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        this.conn = DriverManager.getConnection(CONNECT_URL, USER, PASSWORD);
    }

    @Override
    public void clearConnect() throws SQLException {
        if (rs != null) {
            rs.close();
        }
        if (stmt != null) {
            stmt.close();
        }
        if (conn != null) {
            conn.close();
        }
    }

    @Override
    public void setModelClass(Class<?> clazz) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        this.modelClass = clazz;
    }

    @Override
    public String getString(T t) {
        System.out.println(t.toString());
        for (Field field : t.getClass().getFields()) {
        }
        return null;
    }

    @Override
    public List<T> getList(ResultSet rs) {
        return null;
    }

    @Override
    public T get(ResultSet rs) throws SQLException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ResultSetMetaData metaData = rs.getMetaData();  //获取列集
        int colCount = metaData.getColumnCount(); //获取列的数量
        Object[] arr = new Object[colCount];
        for (int i = 1; i <= colCount; i++) {
            String colName = metaData.getColumnName(i);
            rs.next();
            String colValue = rs.getString(colName);
            System.out.println(colValue);
            arr[i - 1] = colValue;
        }
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("tableName", "student");
        for (Field field : this.modelClass.getDeclaredFields()) {
            System.out.println(field.getType());
        }
        Object o = this.modelClass.getConstructor(String.class, Map.class, Long.class, String.class, String.class, Integer.class, Long.class, String.class, String.class, String.class).newInstance("sdf", stringStringMap, 2L,"sdf", "sdf", 1, 2L, "sdf", "124124", "123124");
        System.out.println(o);
        return null;
    }
}
