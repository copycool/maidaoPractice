package cn.maidaotech.java07;

import javax.sql.DataSource;

import cn.maidaotech.java07.work.chapter05.question10.dao.StudentMapper;
import cn.maidaotech.java07.work.chapter05.question10.pojo.Student;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
/**
 * 使用JDBC连接数据库，在IDEA终端打印上题的查询结果。
 */
@SpringBootTest
class Java07ApplicationTests {

	@Autowired
	private StudentMapper studentMapper;

	Logger logger = Logger.getLogger(Java07ApplicationTests.class);
	@Test
	void contextLoads() throws Exception {
		List<Student> students = studentMapper.selectAll();
		students.stream().forEach(student -> logger.info(student.toString()));
	}


	/**
	 * 修改录入错误的学生姓名、学生成绩
	 */
	@Test
	public void test1(){
		List<Student> students = studentMapper.selectAll();

		students.stream().forEach(student -> System.out.println(student.toString()));
	}

}
