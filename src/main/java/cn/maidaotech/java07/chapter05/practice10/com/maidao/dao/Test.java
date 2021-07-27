package cn.maidaotech.java07.chapter05.practice10.com.maidao.dao;

import cn.maidaotech.java07.chapter05.practice10.com.maidao.dao.util.JdbcUtil;

import java.sql.SQLException;

public class Test {
        public static void main(String[] args) throws SQLException, ClassNotFoundException {
                // a
                JdbcUtil.executeSelect("SELECT * FROM student;");
                JdbcUtil.excuteUpdate("UPDATE `student` SET `first_name` = \"Marhy\"\n WHERE\n sno = \"10006\";");
                JdbcUtil.executeSelect("UPDATE `student` SET `first_name` = \"Xiaolong\" WHERE sno = \"10003\"");
                JdbcUtil.excuteUpdate("UPDATE `score` SET `score` = 100 WHERE id = 1;");
                JdbcUtil.excuteUpdate("UPDATE `score`\n" + "SET `score` = 100\n" + "WHERE\n" + "id = 2;");
                JdbcUtil.excuteUpdate("UPDATE `score`\n" + "SET `score` = 100\n" + "WHERE\n" + "id = 3;");
                // b
                JdbcUtil.executeSelect("SELECT s.*\n" + "FROM `student` AS s\n" + "LEFT JOIN score AS sc\n"
                                + "ON s.sno = sc.sno\n" + "WHERE sc.score < 60\n" + "AND\n" + "sc.cno = 1");
                // d
                // JdbcUtil.executeSelect("SELECT s.score AS \"分数\",c.`name` AS \"课程名称\"\n" +
                // "FROM `score` AS s\n" +
                // "LEFT JOIN `course` c\n" +
                // "ON\n" +
                // "s.cno = c.cno\n" +
                // "WHERE\n" +
                // "s.sno = 10000");
                // e
                // JdbcUtil.executeSelect("SELECT SUM(sc.score) AS \"总分\",s.`first_name` AS
                // \"学生姓名\"\n" +
                // "FROM `score` AS sc\n" +
                // "RIGHT JOIN `student` AS s\n" +
                // "ON sc.sno = s.sno\n" +
                // "WHERE \n" +
                // "s.clazz_id = 1\n" +
                // "GROUP BY s.sno");
                // f
                // JdbcUtil.executeSelect("SELECT s.*\n" +
                // "FROM `student` AS s\n" +
                // "WHERE \n" +
                // "NOT EXISTS(SELECT * \n" +
                // "\t\t\t\t\t FROM `score` AS sc \n" +
                // "\t\t\t\t\t WHERE \n" +
                // "\t\t\t\t\t sc.score < 80 \n" +
                // "\t\t\t\t\t AND sc.sno = s.sno)");
                // g
                // JdbcUtil.executeSelect("SELECT s.*\n" +
                // "FROM `student` AS s\n" +
                // "WHERE EXISTS(SELECT * \n" +
                // "\t\t\t\t\t\t FROM `score` AS sc\n" +
                // "\t\t\t\t\t\t WHERE s.sno = sc.sno\n" +
                // "\t\t\t\t\t\t AND sc.score < 60)");
                // h
                // JdbcUtil.executeSelect("SELECT AVG(sc.score) AS \"平均分\",sz.`name` AS
                // \"班级名称\"\n" +
                // "FROM score AS sc\n" +
                // "RIGHT JOIN (SELECT s.sno,c.id AS `clazz_id`,c.`name` \n" +
                // "\t\t\t\t\t\tFROM `student` AS s \n" +
                // "\t\t\t\t\t\tLEFT JOIN clazz AS c \n" +
                // "\t\t\t\t\t\tON s.clazz_id = c.id) AS sz\n" +
                // "ON sc.sno = sz.sno\n" +
                // "WHERE sc.cno = 1\n" +
                // "GROUP BY sz.clazz_id\n" +
                // "DESC");
                // i
                // JdbcUtil.executeSelect("SELECT MAX(sc.score) AS \"最高分\",MIN(sc.score) AS
                // \"最低分\",c.`name` AS \"课程名称\"\n" +
                // "FROM `score` sc\n" +
                // "LEFT JOIN `course` c\n" +
                // "ON sc.cno = c.cno\n" +
                // "GROUP BY sc.cno\n" +
                // "\n");
        }
}
