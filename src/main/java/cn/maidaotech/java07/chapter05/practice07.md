```sql
DROP TABLE `class`;
CREATE TABLE `class`(
 `id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '班级编号，主键，唯一标识，自增', 
  `name` varchar(40) NOT NULL COMMENT '班级名称，最多40个字符', 	
	`created_at` VARCHAR(100) NOT NULL COMMENT "创建时间戳", 
	`updated_at` VARCHAR(100) NOT NULL COMMENT "修改时间戳", 
	PRIMARY KEY(`id`) USING BTREE )ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='班级表';
	CREATE TABLE `class_course`( 	
	`class_id` BIGINT(20) NOT NULL, 	
	 `cno` BIGINT(20) NOT NULL )ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='班级课程联查表' 
		CREATE TABLE `course`( 
  	`cno` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '课程编号，主键，唯一标识，自增',  
		`name` varchar(40) NOT NULL COMMENT '课程名称，最多40个字符', 
	 `is_elective` TINYINT UNSIGNED COMMENT "是否为选修课", 	
	 `created_at` VARCHAR(100) NOT NULL COMMENT "创建时间戳", 	
	 `updated_at` VARCHAR(100) NOT NULL COMMENT "修改时间戳",  
		PRIMARY KEY(`cno`) USING BTREE )ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='班级表';
 	CREATE TABLE `student`( 
		`sno` BIGINT(20) NOT NULL AUTO_INCREMENT, 
	`first_name` VARCHAR(30) NOT NULL COMMENT "学生姓名", 	
	`last_name` VARCHAR(30) NOT NULL COMMENT "姓名", 	
		`sex` TINYINT(6) NOT NULL COMMENT "性别：0男1女2保密", 
			`class_id` BIGINT(20) NOT NULL COMMENT "班级id",
			`school` VARCHAR(20) NOT NULL COMMENT "学校", 	
			`created_at` VARCHAR(100) NOT NULL COMMENT "创建时间戳", 
			`updated_at` VARCHAR(100) NOT NULL COMMENT "修改时间戳", 
				PRIMARY KEY(`sno`) )ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
			CREATE TABLE `score`(
			`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '成绩编号，主键，唯一标识，自增',  
				 `score` TINYINT NOT NULL COMMENT '成绩，最多40个字符', 
					 `cno` BIGINT(20) NOT NULL COMMENT "课程id", 
				`sno` BIGINT(20) NOT NULL COMMENT "学生id", 
						 `created_at` VARCHAR(100) NOT NULL COMMENT "创建时间戳", 	
						 `updated_at` VARCHAR(100) NOT NULL COMMENT "修改时间戳",  
	PRIMARY KEY(`id`) USING BTREE )ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='成绩表';
	
	
	
	INSERT INTO class VALUES(110,'少年班','7777','7777');
	INSERT INTO class VALUES(111,'老年班','8888','8888');
	INSERT INTO class_course VALUES(110,15);
	INSERT INTO class_course VALUES(110,21);
	INSERT INTO class_course VALUES(111,16);
	INSERT INTO class_course VALUES(111,22);
	INSERT INTO course VALUES(15,'语文',0,'0000','000');
	INSERT INTO course VALUES(16,'数学',0,'0000','000');
	INSERT INTO course VALUES(21,'英语',1,'0000','000');
	INSERT INTO course VALUES(22,'体育',1,'0000','000');
	INSERT INTO student VALUES(10010,'张','飞',0,110,'一中','   ','  ');
	INSERT INTO student VALUES(10011,'张','三',0,110,'一中','   ','  ');
	INSERT INTO student VALUES(10012,'张','五',0,110,'一中','   ','  ');
	INSERT INTO student VALUES(10013,'李','三',0,110,'一中','   ','  ');
	INSERT INTO student VALUES(10014,'李','时',1,110,'一中','   ','  ');
	INSERT INTO student VALUES(10015,'王','天',0,111,'一中','   ','  ');
	INSERT INTO student VALUES(10016,'叶','饭',0,111,'一中','   ','  ');
	INSERT INTO student VALUES(10017,'萧','燕',1,111,'一中','   ','  ');
	INSERT INTO student VALUES(10018,'王','老头',0,111,'一中','   ','  ');
	INSERT INTO student VALUES(10019,'张','全单',0,111,'一中','   ','  ');
	INSERT INTO score VALUES(1,30,15,10010,'  ','  ');
	INSERT INTO score VALUES(2,40,15,10011,'  ','  ');
	INSERT INTO score VALUES(3,50,16,10012,'  ','  ');
	INSERT INTO score VALUES(4,60,16,10013,'  ','  ');
	INSERT INTO score VALUES(5,90,16,10014,'  ','  ');
	INSERT INTO score VALUES(6,100,21,10015,'  ','  ');
	INSERT INTO score VALUES(7,60,21,10016,'  ','  ');
	INSERT INTO score VALUES(8,40,21,10017,'  ','  ');
	INSERT INTO score VALUES(9,50,22,10018,'  ','  ');
	INSERT INTO score VALUES(10,80,22,10019,'  ','  ');
	
	UPDATE student SET last_name='凡' WHERE sno=10016;
	UPDATE score SET score=60 WHERE id=1;
	UPDATE student SET last_name='大仙' WHERE sno=10018;
	UPDATE score SET score=50 WHERE id=10;
	UPDATE student SET last_name='剑' WHERE sno=10013;
	UPDATE score SET score=20 WHERE id=7;
	
	SELECT COUNT(*) FROM score WHERE cno=15;
	SELECT COUNT(*) FROM score WHERE cno=16;
	SELECT COUNT(*) FROM score WHERE cno=21;
	SELECT COUNT(*) FROM score WHERE cno=22;
	
	SELECT * FROM score WHERE score < 60 AND cno=15;

	SELECT * FROM score WHERE sno=10014;
	
	SELECT * FROM score LEFT JOIN student ON score.sno=student.sno
	WHERE class_id=110 ORDER BY score DESC;
	
	SELECT * FROM student LEFT JOIN score ON student.sno=score.sno
	WHERE score>80;
	
	SELECT * FROM student LEFT JOIN score ON student.sno=score.sno
	WHERE score<60;
	
	SELECT AVG(score) FROM score WHERE cno=21;
	
	SELECT AVG(score) FROM score WHERE cno=15;
	SELECT MIN(score) FROM score WHERE cno=15;
	SELECT MAX(score) FROM score WHERE cno=15;
	SELECT AVG(score) FROM score WHERE cno=16;
	SELECT MIN(score) FROM score WHERE cno=16;
	SELECT MAX(score) FROM score WHERE cno=16;
	SELECT AVG(score) FROM score WHERE cno=21;
	SELECT MIN(score) FROM score WHERE cno=21;
	SELECT MAX(score) FROM score WHERE cno=21;
	SELECT AVG(score) FROM score WHERE cno=22;
	SELECT MIN(score) FROM score WHERE cno=22;
	SELECT MAX(score) FROM score WHERE cno=22;
```