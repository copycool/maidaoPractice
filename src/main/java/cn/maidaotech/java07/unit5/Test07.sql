#创建班级表
CREATE TABLE IF NOT EXISTS `class` (
	`id` INT ( 20 ) NOT NULL AUTO_INCREMENT COMMENT '班级编号',
	`name` VARCHAR ( 30 ) NOT NULL COMMENT '班级名称',
	`created_at` VARCHAR ( 100 ) NOT NULL COMMENT "创建时间",
	`updated_at` VARCHAR ( 100 ) NOT NULL COMMENT "修改时间",
	PRIMARY KEY ( `id` ) 
	) ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = DYNAMIC COMMENT = '班级表' 
	#创建课程表
	CREATE TABLE IF NOT EXISTS`course` (
	`cno` INT ( 20 ) NOT NULL AUTO_INCREMENT COMMENT '课程编号',
	`name` VARCHAR ( 40 ) NOT NULL COMMENT '课程名称',
	`is_elective` TINYINT UNSIGNED COMMENT '是否为选修课,0代表选修课，1代表必修课',
	`created_at` VARCHAR ( 100 ) NOT NULL COMMENT "创建时间",
	`updated_at` VARCHAR ( 100 ) NOT NULL COMMENT "修改时间",
	PRIMARY KEY ( `cno` ) 
	) ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = DYNAMIC COMMENT = '课程表' 
	#创建联合表
	CREATE TABLE `class_course` (
`class_id` INT ( 20 ) NOT NULL COMMENT '班级编号', 
`cno` INT ( 20 ) NOT NULL 
) ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = DYNAMIC COMMENT = '班级课程联查表' 
	#学生表
	CREATE TABLE `students` (
	`sno` VARCHAR ( 20 ) NOT NULL AUTO_INCREMENT 	PRIMARY KEY ,
	`name` VARCHAR ( 30 ) NOT NULL COMMENT "学生姓名",
	`sex` TINYINT ( 6 ) NOT NULL COMMENT "性别，0代表男，1代表女",
	`class_id` INT ( 20 ) NOT NULL COMMENT "班级id",
	`school` VARCHAR ( 20 ) NOT NULL COMMENT "学校",
	`created_at` VARCHAR ( 100 ) NOT NULL COMMENT "创建时间",
	`updated_at` VARCHAR ( 100 ) NOT NULL COMMENT "修改时间"
	) ENGINE = INNODB AUTO_INCREMENT = 10000 DEFAULT CHARSET = utf8;
#成绩表
CREATE TABLE `score` (
`id` INT ( 20 ) NOT NULL AUTO_INCREMENT COMMENT '成绩编号',
`score` TINYINT NOT NULL COMMENT '成绩',
`cno` INT ( 20 ) NOT NULL COMMENT "课程id",
`sno` INT ( 20 ) NOT NULL COMMENT "学生id",
`created_at` VARCHAR ( 100 ) NOT NULL COMMENT "创建时间",
`updated_at` VARCHAR ( 100 ) NOT NULL COMMENT "修改时间",
PRIMARY KEY ( `id` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8 ROW_FORMAT = DYNAMIC COMMENT = '成绩表'
#添加班级信息
INSERT INTO class (id,name,created_at,updated_at) VALUES(1,'高三一班','2017-7-24','2017-7-24');
INSERT INTO class (name,created_at,updated_at) VALUES('高三二班','2017-7-24','2017-7-24');
#添加课程信息
INSERT into course(cno,name,is_elective,created_at,updated_at)VALUES(1,'数学','1','2017-7-24','2017-7-24');
INSERT into course(name,is_elective,created_at,updated_at)VALUES('语文','1','2017-7-24','2017-7-24'),('音乐','0','2017-7-24','2017-7-24')
#添加班级课程联查表信息
INSERT into class_course (class_id,cno)VALUES(1,1),(1,2),(1,3),(2,1),(2,2),(2,3);
#添加学生表信息
INSERT into students (sno,name,sex,class_id,school,created_at,updated_at)VALUES(201801,'张三',0,1,'郑州一中','2017-7-24','2017-7-24');
INSERT into students (name,sex,class_id,school,created_at,updated_at)VALUES('李四',0,1,'郑州一中','2017-7-24','2017-7-24'),('小兰',1,2,'郑州一中','2017-7-24','2017-7-24'),('小红',1,1,'郑州一中','2017-7-24','2017-7-24'),('小刚',0,2,'郑州一中','2017-7-24','2017-7-24'),('小曹',0,1,'郑州一中','2017-7-24','2017-7-24'),('小小',1,1,'郑州一中','2017-7-24','2017-7-24'),('阿豪',0,2,'郑州一中','2017-7-24','2017-7-24'),('小明',0,2,'郑州一中','2017-7-24','2017-7-24'),('**',0,2,'郑州一中','2017-7-24','2017-7-24');
#添加成绩信息
INSERT INTO score (id,score,cno,sno,created_at,updated_at)VALUES(01,0,1,201801,'2017-7-24','2017-7-24');
INSERT into score (score,cno,sno,created_at,updated_at)VALUES (84,2,201801,'2017-7-24','2017-7-24'),(86,3,201801,'2017-7-24','2017-7-24'),(91,1,201802,'2017-7-24','2017-7-24'),(82,2,201802,'2017-7-24','2017-7-24'),(76,3,201802,'2017-7-24','2017-7-24'),(59,1,201803,'2017-7-24','2017-7-24'),(79,2,201803,'2017-7-24','2017-7-24'),(-1,1,201804,'2017-7-24','2017-7-24'),(86,2,201804,'2017-7-24','2017-7-24'),(93,3,201804,'2017-7-24','2017-7-24'),(53,1,201805,'2017-7-24','2017-7-24'),(89,2,201805,'2017-7-24','2017-7-24'),(65,3,201805,'2017-7-24','2017-7-24'),(84,1,201806,'2017-7-24','2017-7-24'),(92,2,201806,'2017-7-24','2017-7-24'),(97,1,201807,'2017-7-24','2017-7-24'),(88,2,201807,'2017-7-24','2017-7-24'),(76,3,201807,'2017-7-24','2017-7-24'),(71,1,201808,'2017-7-24','2017-7-24'),(57,2,201808,'2017-7-24','2017-7-24'),(77,1,201809,'2017-7-24','2017-7-24'),(83,2,201809,'2017-7-24','2017-7-24'),(58,3,201809,'2017-7-24','2017-7-24'),(75,1,201810,'2017-7-24','2017-7-24'),(98,2,201810,'2017-7-24','2017-7-24')