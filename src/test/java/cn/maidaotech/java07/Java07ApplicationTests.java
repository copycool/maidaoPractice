package cn.maidaotech.java07;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class Java07ApplicationTests {
	
	@Autowired
	DataSource dataSource;

	Logger logger = Logger.getLogger(Java07ApplicationTests.class);
	@Test
	void contextLoads() throws Exception {
		// logger.info("测试开始：");
		// System.err.println("获取数据库连接："+dataSource.getConnection());
		// logger.error("测试结束");
	}

}
