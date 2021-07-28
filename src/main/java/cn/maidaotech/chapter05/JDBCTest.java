package cn.maidaotech.chapter05;

import java.sql.DriverManager;


public class JDBCTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            DriverManager.getConnection("mysql:127.0.0.1:3306/student","root","root");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}