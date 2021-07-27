package cn.maidaotech.java07.chapter05.practice10.com.maidao.model;

import java.util.Map;

public class TableFields {
    private String tableName;
    private Map<String, String> ormMap;

    public TableFields(String tableName, Map<String, String> ormMap) {
        this.tableName = tableName;
        this.ormMap = ormMap;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public Map<String, String> getOrmMap() {
        return ormMap;
    }

    public void setOrmMap(Map<String, String> ormMap) {
        this.ormMap = ormMap;
    }
}
