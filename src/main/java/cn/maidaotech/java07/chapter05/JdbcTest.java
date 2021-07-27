package cn.maidaotech.java07.chapter05;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
    public static void main(String[] args) {
        // 加载MySql驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/stock", "root", "root");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
