package cn.maidaotech.java07.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcDemo {
    private static final String URL = "jdbc:mysql://localhost:3306/student_system";
    private static final String USER = "root";
    private static final String PASSWORD = "xie249817";
    
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        Statement statem = null;
        ResultSet rs = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
    
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            String userName = "托尼.史塔克";
            statem = conn.createStatement();
            rs = statem.executeQuery("select sno,stu_name from student where stu_name="+userName);
            System.out.println( rs);
            while(rs.next()){
                System.out.println("学号："+rs.getLong("sno")+"姓名："+rs.getString("stu_name"));
            }
        }finally{
            if(rs !=null){
                rs.close();
            }
            if(statem != null){
                statem.close();
            }

            if(conn != null){
                conn.close();
            }
        }
        
    }
}