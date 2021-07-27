package cn.maidaotech.java07.chapter05.practice10.com.maidao;

import cn.maidaotech.java07.chapter05.practice10.com.maidao.dao.ISimpleDao;
import cn.maidaotech.java07.chapter05.practice10.com.maidao.dao.impl.SimpleDaoImpl;
import cn.maidaotech.java07.chapter05.practice10.com.maidao.model.Student;

import java.lang.reflect.InvocationTargetException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) throws NoSuchMethodException, InstantiationException, SQLException, IllegalAccessException, InvocationTargetException, ClassNotFoundException {
        ISimpleDao<Student> simpleDao = new SimpleDaoImpl<>();
        Map<String, String> stringStringMap = new HashMap<>();
        stringStringMap.put("tableName", "student");
        Student student = new Student("sdf", stringStringMap, 2L, "sdf", "sdf", 1, 2L, "sdf", "124124", "123124");
        simpleDao.setModelClass(Student.class);
        simpleDao.selectById(student);
//        dao.selectById(student);
//        dao.selectAll();
//        dao.setModel();
    }
}
