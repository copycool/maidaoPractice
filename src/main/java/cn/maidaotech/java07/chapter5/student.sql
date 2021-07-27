CREATE TABLE #创建学生表
IF
	NOT EXISTS student (
	`id` BIGINT( 20 ) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id",
	`first_name` VARCHAR ( 30 ) NOT NULL COMMENT"学生名",
	`last_name` VARCHAR ( 30 ) NOT NULL COMMENT "学生姓",
	`sex` CHAR ( 2 ) NOT NULL COMMENT "性别",
	`school` VARCHAR ( 30 ) NOT NULL COMMENT "学校",
	`created_at` VARCHAR( 100 ) NOT NULL COMMENT "创建时间",
	`updated_at` VARCHAR( 100 ) NOT NULL COMMENT"更新时间"
	) ENGINE = INNODB AUTO_INCREMENT = 1000 DEFAULT CHARSET = utf8;
	INSERT INTO `student` (first_name,last_name,sex,school,created_at,updated_at)
	VALUES("丸庚","陈","男","北京大学","2000.2.3","2021.4.13");
	INSERT INTO `student` (first_name,last_name,sex,school,created_at,updated_at)
	VALUES("元英","丁","男","北京大学","2003.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2003.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2004.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2005.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2006.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2007.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2008.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2009.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2010.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2011.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2012.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2013.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2014.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2015.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2016.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2017.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2018.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2019.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2020.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2021.8.23","2021.4.13"),
	("元英","丁","男","北京大学","2022.8.23","2021.4.13");
	
	#1. 如何从表中选取first_name列的值以"a"开头的所有记录？
	SELECT * FROM `student` WHERE first_name LIKE "a%";
	
	#2. 如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录？
	SELECT * FROM `student` WHERE first_name= "Tom" AND last_name = "Peter";
	
	#3. 如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录？
	SELECT * FROM `student` WHERE first_name > "Angela" AND first_name < "Peter";
	
	#4. 哪条SQL语句可返回唯一不同的值？
	SELECT DISTINCT sex FROM student;
	
	#5. 如何根据first_name列降序地从表中返回所有记录？只返回前十条记录呢？第11到20条记录呢？
	SELECT * FROM `student` ORDER BY first_name ASC
	SELECT * FROM `student` ORDER BY first_name DESC LIMIT 10;
	SELECT * FROM `student` ORDER BY first_name DESC LIMIT 11,20;

	#6. 如何向表中插入新的记录？
	INSERT INTO `student` (first_name,last_name,sex,school,created_at,updated_at)
	VALUES("楚峰","韩","男","清华大学","1660.4.6","1354.36");
	
	#修改数据
	UPDATE student SET first_name="peter" WHERE id = 1006;
	UPDATE student SET first_name="peter" WHERE id = 1004;

	#10. 如何向表中的last_name列插入Wilson？
	INSERT INTO student(first_name,last_name,sex,school,created_at,updated_at)VALUES("大为","Wilson","女","清华大学","3321.8.8","3006");
	INSERT INTO student(first_name,last_name,sex,school,created_at,updated_at)VALUES("gete","Wilson","男","西安大学","666","1007");
	
	#11. 如何把表中last_name列的Peter改为Wilson？
	UPDATE student SET last_name="Wilson" WHERE id = 1006;
	
	#12. 如何在表中删除first_name等于Angela的记录？
	DELETE FROM student WHERE FIRST_name= "Angela";
	
	#添加数据
	INSERT INTO student(first_name,last_name,sex,school,created_at,updated_at)VALUES("大白","郝","男","西安交大","2009.3.16","20010.12.23"),
	("培安","杨","男","湖南大学","3245.6.34","2075.1.23"),
	("国明","杨","男","西洋学堂","3356.2.26","2000.12.8"),
	("晨蓓","高","男","西安交大","1006.3.16","2220.12.5"),
	("大北","李","男","西安交大","2009.3.16","2010.3.3"),
	("晓萌","高","女","哈弗大学","1009.4.16","2000.12.23"),
	("孟甜","王","女","哈尔滨工程","2509.3.16","6003.6.27"),
	("曾曾","陈","女","地球村大学","1703.7.24","3032.12.23"),
	("条条","桓","女","西安交大","1220.9。6","2000.12.23"),
	("昌恒","郝","男","西安交大","2009.3.16","2001.12.23"),
	("爱国","贾","男","西北大学","8765.33.6","2010.12.23"),
	("潇雅","万","女","开封大学","8747.3.46","3794.7.36"),
	("岑昌","郝","男","新媒体大学","2009.3.16","2010.12.23"),
	("恒","广","男","西安交大","2009.3.16","2110.12.23"),
	("玫","李","女","哈弗商学院","2003.3.16","2010.12.23"),
	("辉","郝","男","西安交大","2009.3.16","2020.2.28"),
	("战魁","郝","男","北京大学","2009.3.16","2010.12.23"),
	("晓晓","郝","女","西南大学","2009.3.16","2010.12.23");
	
	#13. 如何返回表中记录的数目？
	SELECT COUNT(*) AS TOTAL
	FROM `student`;

#14. 如何在已存在的student表中增加一列名为age表示年龄的列？
Alter TABLE `student` ADD age INT NOT NULL;

#15. 如何修改first_name列的字符长度为50且不允许NULL值？
ALTER TABLE `student` CHANGE first_name first_name VARCHAR(50) NOT NULL;

#16. 如何删除表中的age列？
ALTER TABLE student DROP age;

#17. 如何将表中所有数据的first_name和last_name以空格连接合并存入另外一张表persion中？
DROP TABLE`persion`
CREATE TABLE `persion`(
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY key,
	`name` VARCHAR(50) NOT NULL
)ENGINE=INNODB AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8; 

INSERT INTO persion (name) SELECT CONCAT_WS(first_name," ",last_name) FROM student;
SELECT * FROM `persion`;