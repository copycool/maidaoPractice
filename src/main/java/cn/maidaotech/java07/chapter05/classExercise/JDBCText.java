package cn.maidaotech.java07.chapter05.classExercise;

public class JDBCText {
    public static void main(String[] args) {
     try{
        Class.forName("com.mysql.jdbc.Driver");
     }catch(ClassNotFoundException e){
       e.printStackTrace();
     }
    }
}
