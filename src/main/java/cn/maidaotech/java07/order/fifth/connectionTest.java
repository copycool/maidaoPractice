package cn.maidaotech.java07.order.fifth;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class connectionTest {
    public static final String URL = "jdbc:mysql://localhost:3306/student"; 
    public static final String USER = "root";
    public static final String PASSWORD = "123456";  
    public static void main(String[] args) throws Exception {      
          Connection conn = null; 
          Statement stmt = null;        
          ResultSet rs = null;        
          try {            
               //1.加载驱动程序            
              Class.forName("com.mysql.cj.jdbc.Driver");           
               //2. 获得数据库连接            
               conn = DriverManager.getConnection(URL, USER, PASSWORD);           
               //3.操作数据库，实现增删改查            
                stmt = conn.createStatement();            
                rs = stmt.executeQuery("SELECT * FROM student");            
              //如果有数据，rs.next()返回true            
                while (rs.next()) {                
                    System.out.println(rs.getLong("id") + rs.getString("first_name"));            }       
                 } finally {  
              // 关闭连接，释放资源           
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
                }

