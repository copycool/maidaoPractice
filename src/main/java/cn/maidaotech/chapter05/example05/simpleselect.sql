#建表student 最后一行记得不要带，
CREATE TABLE IF NOT EXISTS `student`(
	`id`      BIGINT(20) NOT NULL AUTO_INCREMENT,
	`first_name` VARCHAR(20) 	CHARACTER SET utf8mb4 DEFAULT NULL,
	`last_name`  VARCHAR(20) 	CHARACTER SET utf8mb4 DEFAULT NULL,
	`sex`        VARCHAR(20) NOT NULL,
	`school`     VARCHAR(20) CHARACTER SET utf8mb4 DEFAULT NULL,
	PRIMARY  KEY(`id`)
)AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;


INSERT INTO 
`student`(first_name,last_name,sex,school)
VALUES
('Ant','Peter','男','河南工程学院'),
('张','三','男','河南工程学院'),
('吴','十三','男','河南工程学院'),
('Angele','bay','女','NB学院'),
('conrt','Peter','女','郑州师范学院'),
('David','Peter','男','河南工程学院'),
('Ant','Pyeter','男','迈道教育学院'),
('ant','beter','女','河南工学院'),
('ww','Peter','男','河南大学'),
('Harra','song','女','郑州大学'),
('Joker','li','男','家里蹲大学'),
('Tom','Peter','男','华南师范大学'),
('Angela','Peter','男','河南工程学院');


#LIKE关键字实现模糊查询
SELECT * FROM student WHERE `first_name` LIKE "a%";

SELECT * FROM student WHERE (
`first_name` = "Tom" AND
`last_name` = "Peter"
)
SELECT * FROM student WHERE (
`first_name` BETWEEN "Angela" AND
`last_name` = "Peter"
)
#默认升序asc，降序desc
SELECT * FROM student ORDER BY `first_name` DESC;

#LIMIT关键字是前一个为开始位置默认0，逗号后面为数量
SELECT * FROM student ORDER BY `first_name` DESC LIMIT 0,10;

SELECT * FROM student ORDER BY `first_name` DESC LIMIT 10,20;

#使用insert语句
INSERT INTO 
`student`(first_name,last_name,sex,school)
VALUES
('杰克','Peter','男','中原工学院'),
('王','三','男','河南工程学院'),
('刘','十三','男','河南工程学院'),
('Anx','bay','女','NB学院'),
('wory','Peter','女','郑州师范学院'),
('Davidz','Peter','男','河南工程学院'),
('Antw','Pyeter','男','迈道教育学院'),
('ante','beter','女','河南工学院'),
('wwz','Peter','男','河南大学'),
('jl','song','女','郑州大学'),
('Joker1','li','男','家里蹲大学'),
('Tomc','Peter','男','华南师范大学'),
('Angelacc','Peter','男','河南工程学院');

#sex非空所以得写一下
INSERT INTO 
`student`(first_name,last_name,sex,school)
VALUES
('faker','Wilson','男','西亚斯学院');

#更新\删除 表之前要先查值
#UPDATE 表名称 SET 列名称 = 新值 WHERE 列名称 = 某值
SELECT * FROM`student`  WHERE `last_name` = 'Peter'
UPDATE `student` SET `last_name` = 'Wilson' WHERE `last_name` = 'Peter'
#DELETE FROM 表名称 WHERE 列名称 = 值
SELECT * FROM`student`  WHERE `first_name` = 'Angela'
DELETE FROM `student` WHERE `first_name` = 'Angela'
#查询条数
SELECT COUNT(*) FROM `student`
#
ALTER TABLE `student`
ADD `age` BIGINT(20)
#
ALTER TABLE `student`
DROP COLUMN `age` 
#这里是把列更新
ALTER TABLE `student`
MODIFY  first_name VARCHAR(50) 	CHARACTER SET utf8mb4 NOT NULL;

#连接语句
CREATE TABLE IF NOT EXISTS `person`(
    `id` bigint(20)  NOT NULL AUTO_INCREMENT,
    `name` varchar(80)  NOT NULL,
    PRIMARY KEY (`id`)
)
insert into `person`(`id`,`name`) select id, concat(first_name ,' ',last_name) from student 
select * from person
