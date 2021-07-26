```sql
DROP TABLE IF EXISTS `clazz`
CREATE TABLE `clazz`(
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '班级编号，主键，唯一标识，自增',
  `name` VARCHAR(40) NOT NULL COMMENT '班级名称，最多40个字符',
	`created_at` BIGINT(20) NOT NULL COMMENT "创建时间戳",
	`updated_at` BIGINT(20) NOT NULL COMMENT "修改时间戳",
  PRIMARY KEY(`id`) USING BTREE
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='班级表'

DROP TABLE IF EXISTS `clazz_course`
CREATE TABLE `clazz_course`(
	`clazz_id` BIGINT(20) NOT NULL,
	`cno` BIGINT(20) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='班级课程联查表'

DROP TABLE IF EXISTS `course`
CREATE TABLE `course`(
	`cno` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '课程编号，主键，唯一标识，自增',
  `name` VARCHAR(40) NOT NULL COMMENT '课程名称，最多40个字符',
	`is_elective` TINYINT(1) UNSIGNED UNSIGNED COMMENT "是否为选修课",
	`created_at` BIGINT(20) NOT NULL COMMENT "创建时间戳",
	`updated_at` BIGINT(20) NOT NULL COMMENT "修改时间戳",
  PRIMARY KEY(`cno`) USING BTREE
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='班级表'

DROP TABLE IF EXISTS `student`
CREATE TABLE `student`(
	`id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '学生id，主键，唯一标识，自增',
	`sno` VARCHAR(20) NOT NULL COMMENT '学号',
	`first_name` VARCHAR(30) NOT NULL COMMENT "学生姓名",
	`last_name` VARCHAR(30) NOT NULL COMMENT "姓名",
	`sex` TINYINT(1) UNSIGNED NOT NULL COMMENT "性别：0男1女2保密",
	`clazz_id` BIGINT(20) NOT NULL COMMENT "班级id",
	`school` VARCHAR(20) NOT NULL COMMENT "学校",
	`birth` BIGINT(20) COMMENT "生日",
	`created_at` BIGINT(20) NOT NULL COMMENT "创建时间戳",
	`updated_at` BIGINT(20) NOT NULL COMMENT "修改时间戳",
	PRIMARY KEY(`sno`)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `score`
CREATE TABLE `score`(
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT '成绩编号，主键，唯一标识，自增',
  `score` TINYINT(2) UNSIGNED NOT NULL COMMENT '成绩，最多40个字符',
	`cno` BIGINT(20) NOT NULL COMMENT "课程id",
	`sno` BIGINT(20) NOT NULL COMMENT "学生id",
	`created_at` BIGINT(20) NOT NULL COMMENT "创建时间戳",
	`updated_at` BIGINT(20) NOT NULL COMMENT "修改时间戳",
  PRIMARY KEY(`id`) USING BTREE
)ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='成绩表'

INSERT INTO `clazz`(`name`,created_at,updated_at)
VALUES
("迈道1班","1234","1234"),
("迈道2班","1234","1234");
SELECT * FROM `clazz`;
INSERT INTO `student`(`first_name`,last_name,sex,clazz_id,school,created_at,updated_at)
VALUES
("Tom","peter",1,1,"迈道教育","1234","1234"),
("Jack","lihua",0,1,"迈道教育","1234","1234"),
("Lucy","xswq",1,1,"迈道教育","1234","1234"),
("Maecl","sx",0,1,"迈道教育","1234","1234"),
("sder","petsdfer",1,1,"迈道教育","1234","1234"),
("Emma","Lvy",0,2,"迈道教育","1234","1234"),
("Larissa","amy",1,2,"迈道教育","1234","1234"),
("Edith","gloria",0,2,"迈道教育","1234","1234"),
("Sophia","hailey",1,2,"迈道教育","1234","1234"),
("May","joyce",1,2,"迈道教育","1234","1234")
SELECT * FROM `student`

INSERT INTO `course` (`name`,is_elective,created_at,updated_at)
VALUES
("java基础",0,"1234","1234"),
("nodejs",1,"1234","1234"),
("react",0,"1234","1234")
EXPLAIN SELECT * FROM `course` WHERE cno = 1;
INSERT INTO `score` (score,cno,sno,created_at,updated_at)
VALUES
(99,1,10000,"1234","1234"),
(90,2,10000,"1234","1234"),
(95,3,10000,"1234","1234"),
(92,1,10001,"1234","1234"),
(89,2,10001,"1234","1234"),
(91,3,10001,"1234","1234"),
(94,1,10002,"1234","1234"),
(95,2,10002,"1234","1234")
SELECT * FROM `course`;
INSERT INTO `score` (score,cno,sno,created_at,updated_at)
VALUES
(99,3,10002,"1234","1234"),
(90,1,10003,"1234","1234"),
(95,2,10003,"1234","1234"),
(92,3,10003,"1234","1234"),
(89,1,10004,"1234","1234"),
(91,2,10004,"1234","1234"),
(94,3,10004,"1234","1234"),
(95,1,10005,"1234","1234"),
(95,2,10005,"1234","1234"),
(95,3,10005,"1234","1234"),
(95,1,10006,"1234","1234"),
(95,2,10006,"1234","1234"),
(95,3,10006,"1234","1234"),
(95,1,10007,"1234","1234"),
(95,2,10007,"1234","1234"),
(95,3,10007,"1234","1234"),
(95,1,10008,"1234","1234"),
(95,2,10008,"1234","1234"),
(95,3,10008,"1234","1234"),
(95,1,10009,"1234","1234"),
(95,2,10009,"1234","1234"),
(95,3,10009,"1234","1234"),
(95,1,100010,"1234","1234"),
(95,2,100010,"1234","1234"),
(95,3,100010,"1234","1234")

```