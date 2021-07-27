package cn.maidaotech.chapter05;

public class JDBCTest {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}