package cn.maidaotech.java07.chapter;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTest {
    public static void main(String[] args){
        //加载mysql驱动
        try {
            Class.forName("com.mysql.jdbc.Driver");
            DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test", "root", "123456");
           // Connection c = Connection ("jdbc:mysql://127.0.0.1:3306/test", "root", "root");
           
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        
        
    }
}