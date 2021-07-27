package cn.maidaotech.java07.chapter05.practice10.com.maidao.proxy;

import cn.maidaotech.java07.chapter05.practice10.com.maidao.config.JdbcConfig;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.sql.*;

public class ProxyFactory {

    private JdbcConfig config;
    private static final String CONNECT_URL = "jdbc:mysql://localhost:3306/maidao_practice?useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT%2B8";
    private static final String USER = "root";
    private static final String PASSWORD = "lidongyi521";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static Connection conn = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    private Object target;

    // 构造器，对target进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("开始访问数据库");
                        executeCon();
                        Class.forName(DRIVER);
                        // 利用反射机制调用目标对象的方法
                        Object object = method.invoke(target, args);
                        clear();
                        System.out.println("访问结束，关闭资源");
                        return object;
                    }
                });
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
