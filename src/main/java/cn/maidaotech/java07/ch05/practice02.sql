CREATE TABLE `studnts` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `stuNo` varchar(20) NOT NULL,
  `stuclass` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10010 DEFAULT CHARSET=utf8mb3;

INSERT INTO `studnts` VALUES ('10000', '张章', '20180102', 'CT一班');
INSERT INTO `studnts` VALUES ('10001', '李丽', '20180103', 'CT一班');
INSERT INTO `studnts` VALUES ('10002', '朱珠', '20180206', 'CT二班');
INSERT INTO `studnts` VALUES ('10003', '牛妞', '20180108', 'CT一班');
INSERT INTO `studnts` VALUES ('10004', '王宇', '20180202', 'CT二班');
INSERT INTO `studnts` VALUES ('10005', '朝朝', '20180109', 'CT一班');
INSERT INTO `studnts` VALUES ('10006', '余一', '20180207', 'CT二班');
INSERT INTO `studnts` VALUES ('10007', '张其', '20180102', 'CT一班');
INSERT INTO `studnts` VALUES ('10008', '谢飞机', '20180111', 'CT一班');
INSERT INTO `studnts` VALUES ('10009', '灰灰', '20180210', 'CT二班');


CREATE TABLE `class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `class_name` varchar(30) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8mb3;


INSERT into class(class_name) VALUES
('CT一班'),
('CT二班');

CREATE TABLE IF NOT EXISTS `course`(
`cno` BIGINT(20) not null AUTO_INCREMENT,
`courseName` VARCHAR(30) not null,
`coursetype` TINYINT  not null COMMENT '0选修1必修',
PRIMARY KEY(`cno`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8mb3;

ALTER TABLE CHANGE coursetype coursetype TINYINT not null;

INSERT INTO course(courseName,coursetype) VALUES('java',1),
('python',1),
('javaweb',0),
('c++',1),
('math',0);

DROP TABLE IF EXISTS `score`;
CREATE TABLE IF NOT EXISTS `score`(
`id` BIGINT(20) not null AUTO_INCREMENT,
`cno` BIGINT(20)NOT NULL,
`name` VARCHAR(20) not null,
`score` INT(20) not null DEFAULT '0',
PRIMARY KEY(`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8mb3;


INSERT INTO score(name,cno,score) VALUES('张章',10000,89),
('张章',10001,63),
('张章',10002,78),
('张章',10004,90),
('张章',10003,96),

('李丽',10000,90),
('李丽',10003,96),
('李丽',10004,88),
('李丽',10002,74),
('李丽',10001,67),

('朱珠',10000,86),
('朱珠',10001,23),
('朱珠',10003,99),
('朱珠',10002,62),
('朱珠',10004,59),

('王宇',10000,96),
('王宇',10001,63),
('王宇',10002,70),
('王宇',10003,98),
('王宇',10004,60),

('余一',10000,69),
('余一',10001,82),
('余一',10002,92),
('余一',10003,86),

('张其',10001,90),
('张其',10000,73),
('张其',10002,66),
('张其',10003,69),

('谢飞机',10000,60),
('谢飞机',10001,80),
('谢飞机',10002,77),
('谢飞机',10004,63),

('灰灰',10000,65),
('灰灰',10001,65),
('灰灰',10002,89),

('朝朝',10000,78),
('朝朝',10001,92),
('朝朝',10002,83);

SELECT stu.`name` '学生姓名',s.score '学生分数'  FROM studnts stu,score s;

SELECT stu.`name` '学生姓名',s.score '学生分数' ,c.cno '课程号' FROM studnts stu,score s,course c;

update score set score=100 where id=10000;
update score set name='lili' where id=10005;
update score set name='李丽' where id=10005;

select cno, count(*) as num from score GROUP BY cno;
#查询某一门课程不及格的学生信息；
select `name`
from score
where score<60 AND cno = 10001;

select `name`, COUNT(`name`) AS total
from score
where score < 60
GROUP BY `name`
HAVING total = 1;

#查询某一个学生的各科成绩；
SELECT stu.`name` '学生姓名',s.score '学生分数' ,c.cno '课程号' FROM studnts stu,score s,course c;

SELECT s.score AS '分数',c.`courseName` AS '课程名称',s.`name`  AS '姓名'
FROM `score` AS s
LEFT JOIN `course` AS c
ON
s.cno = c.cno
WHERE
s.`name` ='李丽';



#查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
select SUM(score) AS '总成绩',stuclass AS '班级名称'
from score as sc
LEFT JOIN studnts as s
on s.`name` = sc.`name`
GROUP BY `stuclass`
ORDER BY SUM(score)
DESC

SELECT SUM(sc.score) AS '总成绩',s.`name` AS '学生姓名'
FROM score AS sc
LEFT JOIN studnts AS s
ON s.`name` = sc.`name`
WHERE s.stuclass='CT一班'
GROUP BY s.`name`
ORDER BY SUM(sc.score)
DESC

SELECT *
FROM score 
RIGHT JOIN studnts
ON score.`name` = studnts.`name`;

#查询每门课都大于 80 分的学生信息；

SELECT * 
FROM `studnts`
WHERE
`name` IN
(SELECT s.`name` AS '姓名'
FROM `score` AS s
LEFT JOIN `course` AS c
ON
s.cno = c.cno
GROUP BY s.`name`
HAVING min(s.score) > 60);
#查询至少有一门课程不及格的学生信息；
select `name`
from score
where score<60 AND cno = 10001;

select `name`, COUNT(`name`) AS total
from score
where score < 60
GROUP BY `name`
HAVING total >=1;

#查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序
SELECT s.`name`,sc.score, avg(sc.score) avg_score
from score sc 
GROUP BY s.`name`
HAVING avg

SELECT AVG(sc.score) AS '平均分', s.stuclass AS'班级'
FROM score AS sc
LEFT JOIN studnts AS s
ON s.`name` = sc.`name`
WHERE sc.cno = 10001
GROUP BY s.stuclass
ORDER BY AVG(sc.score)
DESC

#查询各科成绩最高分、最低分和平均分

select cno as '课程号', max(score) as '最高分',MIN(score) AS '最低分',AVG( score)'平均分'
FROM score 

GROUP BY cno;