#创建数据库
CREATE DATABASE test3 ;

#选择数据库
USE test3;

#创建学生表
CREATE TABLE student (
`id` BIGINT ( 20 ) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id",
`sno` BIGINT ( 20 ) NOT NULL COMMENT "学号",
`first_name` VARCHAR ( 10 ) COMMENT "第一名字",
`last_name` VARCHAR ( 10 ) NOT NULL COMMENT "最后名字",
`sex` TINYINT ( 1 ) NOT NULL COMMENT "性别",
`age` TINYINT ( 2 ) NOT NULL COMMENT "年龄",
`school` VARCHAR ( 10 ) NOT NULL COMMENT "学院",
`created_at` BIGINT ( 20 ) NOT NULL COMMENT "创建时间",
`updated_at` BIGINT ( 20 ) NOT NULL COMMENT "修改时间",
UNIQUE KEY `uk_sno` ( `sno` ) 
) ENGINE = INNODB DEFAULT CHARSET = utf8;
#查看表结构 
DESC student;

#插入数据
INSERT INTO student ( `sno`, `first_name`, `last_name`, `sex`, `age`, `school`, `created_at`, `updated_at` ) VALUES ( 20182512770001, "anily", "Peters", 1, 25, "国文研究院", 1, 1 ), ( 20182512770003, "Tom", "Peters", 2, 23, "信息工程学院", 2, 2 ), ( 20182512770004, "Tom", "Peter", 1, 21, "信息工程学院", 1, 3 ), ( 20182512770005, "bnily", "Peters", 2, 19, "信息工程学院", 2, 1 ), ( 20182512770006, "dnily", "Peters", 2, 19, "信息工程学院", 2, 3 ), ( 20182512770007, "enily", "Peters", 2, 20, "信息工程学院", 3, 3 ), ( 20182512770008, "fnily", "Peters", 1, 23, "信息工程学院", 3, 3 ), ( 20182512770009, "anily", "seters", 1, 22, "信息工程学院", 4, 1 ), ( 20182512770010, "xnily", "heters", 2, 22, "信息工程学院", 4, 2 ) 

#查看数据
SELECT * FROM student ;

#从表中选取first_name列的值以"a"开头的所有记录？
SELECT * FROM student WHERE `first_name` LIKE "a%" ;

#如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录？ 
SELECT * FROM student WHERE `first_name` = "Tom" AND `last_name` = "Peter" ;

#如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录？ 
SELECT  * FROM student  WHERE `first_name` >= "Angela" AND `first_name` <= "Peter"; 

#如何根据first_name列降序地从表中返回所有记录？ 
SELECT  * FROM student ORDER BY  `first_name` DESC; 

#只返回前十条记录呢？
SELECT  *FROM student GROUP BY  `first_name` LIMIT 10; 

#第11到20条记录呢
SELECT  * FROM student GROUP BY  `first_name`LIMIT 10 , 15; 

#如何向表中插入新的记录？
INSERT INTO student ( `sno`, `first_name`, `last_name`, `sex`, `age`, `school`, `created_at`, `updated_at` ) VALUES ( 20182512770011, "knily", "Peters", 2, 18, "国文研究院", 1, 1 ), ( 20182512770012, "sma", "aliwd", 1, 21, "信息工程学院", 2, 2 ), ( 20182512770013, "tus", "awd", 2, 23, "国际贸易学院", 1, 3 ), ( 20182512770014, "rus", "sgsfs", 1, 19, "国文研究院", 2, 1 ), ( 20182512770015, "boy", "rdhdh", 1, 28, "软件工程学院", 2, 3 ), ( 20182512770016, "keus", "adwda", 1, 19, "财经学院", 3, 3 ), ( 20182512770017, "suwker", "cxzsda", 2, 21, "军警院", 3, 3 ), ( 20182512770018, "swarp", "seters", 2, 22, "信息工程学院", 4, 1 ), ( 20182512770019, "lucea", "heters", 1, 22, "信息工程学院", 4, 2 )

#如何把表中last_name列的Peter改为Wilson？ 
UPDATE student SET `last_name` = "Wilson" WHERE `last_name`='Peter'; 

#如何在表中删除first_name等于Angela的记录？ delete 
FROM student WHERE `first_name` = "Angela"; 

#如何返回表中记录的数目？ 
SELECT  COUNT(*) FROM student WHERE `sex` = 1 

#如何在已存在的student表中增加一列名为age表示年龄的列？ 
ALTER TABLE student ADD `age` TINYINT(2) NOT NULL COMMENT "年龄"; 

#如何修改first_name列的字符长度为50且不允许NULL值？ 
ALTER TABLE student MODIFY `first_name` VARCHAR (50) NOT NULL COMMENT "第一名字" ;

#如何删除表中的age列 
ALTER TABLE DROP 'age'; 

#如何从将表中所有数据的first_name和last_name以空格连接合并存入另外一张表persion中？ #创建新表
CREATE TABLE persion( `id` BIGINT(20) NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id",
  `created_at` BIGINT(20) NOT NULL COMMENT "创建时间",
  `updated_at` BIGINT(20) NOT NULL COMMENT "修改时间",
  `user_name` VARCHAR(50) NOT NULL COMMENT "姓名", 
   UNIQUE KEY `uk_sno` (id) 
)ENGINE=INNODB AUTO_INCREMENT=1000 CHARSET=utf8; 

INSERT INTO persion(`user_name`) SELECT CONCAT_WS(' ',`first_name`,`last_name`) FROM student;
