package cn.maidaotech.java07.utitls;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtitls {
    public static final String DRIVER = "com.mysql.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/school";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "root";

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName(DRIVER);
            conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
