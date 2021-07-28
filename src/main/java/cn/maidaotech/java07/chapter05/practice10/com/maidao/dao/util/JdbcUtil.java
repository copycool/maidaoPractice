package cn.maidaotech.java07.chapter05.practice10.com.maidao.dao.util;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JdbcUtil {
    private static final String CONNECT_URL = "jdbc:mysql://localhost:3306/maidao_practice?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
    private static final String USER = "root";
    private static final String PASSWORD = "lidongyi521";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    public static List<String> executeSelect(String sql) throws ClassNotFoundException, SQLException {
        try {
            executeCon();
            stmt = conn.createStatement();
            stmt.executeQuery(sql);
            return getStringList(rs);
        } finally {
            clear();
        }
    }

    public static Boolean excuteUpdate(String sql) throws ClassNotFoundException, SQLException {
        try {
            executeCon();
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(CONNECT_URL, USER, PASSWORD);
            stmt = conn.createStatement();
            return stmt.execute(sql);
        } finally {
            clear();
        }
    }

    private static List<String> getStringList(ResultSet rs) throws SQLException {
        ResultSetMetaData metaData = rs.getMetaData();
        int colNum = metaData.getColumnCount();
        List<String> table = new ArrayList<>();
        StringBuilder builder = new StringBuilder();

        while (rs.next()) {
            builder.append("| ");
            for (int i = 1; i <= colNum; i++) {
                builder.append(rs.getString(i));
                builder.append("\t");
                builder.append("|");
            }

            builder.append("\n");
            String curStr = builder.toString();
            table.add(curStr);
            System.out.println(curStr);
            builder.setLength(0);
        }

        return table;
    }

    private static Connection executeCon() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        conn = DriverManager.getConnection(CONNECT_URL, USER, PASSWORD);
        return conn;
    }

    private static void clear() throws SQLException {
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
}