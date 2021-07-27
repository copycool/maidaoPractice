use chapter05;
--创建一张学生表 student，其中有字段 id、first_name、last_name、sex、school 等列，其中 id 为 自增主键
CREATE TABLE `student`( 
`id` BIGINT(50) NOT NULL AUTO_INCREMENT COMMENT '学生学号', 
`first_name` VARCHAR(50) NOT NULL COMMENT'姓氏', 
`last_name` VARCHAR(50) NOT NULL COMMENT'名字', 
`sex` INT(2) NOT NULL COMMENT'性别', 
`school` VARCHAR(20) NOT NULL COMMENT'学校', 
PRIMARY KEY(`id`) 
)ENGINE=INNODB DEFAULT CHARSET=utf8
--初始化
INSERT INTO `student`(`id`, `first_name`, `last_name`, `sex`, `school`)VALUES 
(201712211101, "Angela", "Jane", 1, "郑州西亚斯学院"), 
(201712211102, "Bob", "Peter", 0, "升达大学"),
(201712211103, "cui", "cancan", 1, "河南工程学院"), 
(201712211104, "liu", "meimei", 1, "河南工程学院"), 
(201712211105, "zhang", "xiannv", 1, "河南工程学院"), 
(201712211115, "biu", "shiry", 1, "河南工程学院"), 
(201712211128, "Tom", "雪利", 1, "河南工程学院"), 
(201712211129, "刘", "Peter", 1, "河南工程学院"), 
(201712211106, "Tom", "灿灿", 1, "河南工程学院"), 
(201712211109, "张", "Peter", 1, "河南工程学院"), 
(201712211116, "李", "Peter", 1, "河南工程学院"), 
(201712211119, "Tom", "苹果", 1, "河南工程学院");
--从表中选取 first_name 列的值以"a"开头的所有记录
SELECT  * FROM student WHERE first_name LIKE "a%"; 
--如何从表中选择 first_name 等于 Tom 而且 last_name 等于 Peter 的所有记录
SELECT * FROM student WHERE first_name="Tom" AND last_name="Peter";
--如何按字母顺序从表中选取 first_name 介于 Angela 和 Peter 的所有记录
SELECT * FROM student WHERE first_name BETWEEN 'Angela' AND 'Peter' ORDER BY first_name;
--返回唯一不同的值
SELECT DISTINCT * FROM student;
--何根据 first_name 列降序地从表中返回所有记录
SELECT * FROM student ORDER BY first_name DESC; 
--返回前十条记录
SELECT * FROM student LIMIT 0，10;
--返回第11 到 20 条记录
SELECT * FROM student LIMIT 10,10;
--把表中 last_name 列的 Peter 改为 Wilson
UPDATE student SET last_name="Wilson" WHERE last_name="Peter";
--在表中删除 first_name 等于 Angela 的记录
DELETE FROM student WHERE first_name="Angela";
--返回表中记录的数目
SELECT COUNT(*) AS total  FROM student;  
--在已存在的 student 表中增加一列名为 age 表示年龄的列
ALTER TABLE student ADD age INT(3) NOT NULL DEFAULT 18 COMMENT"年龄";
--修改 first_name 列的字符长度为 40 且不允许 NULL 值
ALTER TABLE student MODIFY first_name VARCHAR(40) NOT NULL;
--删除表中的 age 列
ALTER TABLE student DROP COLUMN age;
--将表中所有数据的first_name和 last_name以空格连接合并存入另外一张表persion 中
CREATE TABLE person(
`name` VARCHAR(50) 
)ENGINE=INNODB DEFAULT CHARSET=utf8
INSERT INTO `person`(`name`)SELECT CONCAT_WS(' ',first_name,last_name) FROM student;
SELECT * FROM person;
