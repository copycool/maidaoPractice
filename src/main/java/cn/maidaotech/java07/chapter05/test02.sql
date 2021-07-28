--设计一个大学生成绩系统使用的数据库表，
--要求至少涉及学生信息、班级信息、课程信息、成绩信息等。
CREATE TABLE `student`(
`sno` BIGINT(30) NOT NULL AUTO_INCREMENT COMMENT'学号',
`name`VARCHAR(50) NOT NULL COMMENT'学生姓名',
`birthday`VARCHAR(30) NOT NULL  COMMENT'出生日期',
`address` VARCHAR(30) DEFAULT '河南' COMMENT'籍贯',
`create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`sno`)
)ENGINE=INNODB, DEFAULT CHARSET=utf8

CREATE TABLE `class`(
`clno` INT(10) NOT NULL AUTO_INCREMENT COMMENT'班级编号',
`name` VARCHAR(20) NOT NULL COMMENT'班级名称',
`number` INT(10) NOT NULL COMMENT'班级人数',
`department` VARCHAR(10) DEFAULT'计算机学院' COMMENT'所属系部',
`create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`clno`)
)ENGINE=INNODB,DEFAULT CHARSET=utf8

CREATE TABLE `course`(
`cono` INT(10) NOT NULL AUTO_INCREMENT COMMENT'课程编号',
`name` VARCHAR(20) NOT NULL COMMENT'课程名称',
`trait` VARCHAR(20) NOT NULL COMMENT'课程性质',
`create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
PRIMARY KEY(`cono`)
)ENGINE=INNODB, DEFAULT CHARSET=utf8

CREATE TABLE score(
`sno` BIGINT(30) NOT NULL  COMMENT'学号',
`cono` INT(10) NOT NULL  COMMENT'课程编号',
`grade` INT(10) NOT NULL COMMENT'成绩'
`create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
)ENGINE=INNODB, DEFAULT CHARSET=utf8


CREATE TABLE cls_stu (
`sno` BIGINT(30) NOT NULL COMMENT'学号',
`clno` INT(10) NOT NULL COMMENT'班级编号'
`create_time` datetime DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
`update_time` datetime DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
)ENGINE=INNODB, DEFAULT CHARSET=utf8

INSERT INTO student(`sno`,`name`,`birthday`,`address`)VALUES
(201712211101,'王雪利','1998-02-24','河南'),
(201712211102,'崔灿灿','1999-02-25','北京'),
(201712211103,'刘梦梦','1998-09-16','浙江'),
(201712211104,'李生萍','1998-05-19','青海'),
(201712211105,'张小花','1998-12-06','陕西'),
(201712211106,'李聪萍','1998-01-06','陕西'),
(201712211107,'亢大星','1997-08-23','北京'),
(201712211108,'王大仙','1998-02-24','北京'),
(201712211109,'王小诺','2000-02-24','上海'),
(201712211110,'王小萌','2000-10-24','南京');

INSERT INTO class(`clno`,`name`,`number`,`department`)VALUES
(1741,'软件工程',35,'软件学院'),
(1743,'计算机科学与技术',35,'计算机学院'),


INSERT INTO course(`cono`,`name`,`trait`)VALUES
(001,'JavaSE','必修'),
(002,'数据库概论','必修'),
(003,'常用办公软件概述','选修'),
(004,'音乐鉴赏','选修'),
(005,'SSM框架','必修');

INSERT INTO score(`sno`,`cono`,`grade`)VALUES
(201712211101,001,99),
(201712211102,001,87),
(201712211103,001,84),
(201712211104,001,91),
(201712211105,001,93),
(201712211106,001,89),
(201712211107,001,56),
(201712211108,001,96),
(201712211109,001,89),
(201712211110,001,86),
(201712211101,002,68),
(201712211102,002,69),
(201712211103,002,98),
(201712211104,002,67),
(201712211105,002,39),
(201712211106,002,81),
(201712211107,002,86),
(201712211108,002,89),
(201712211109,002,87),
(201712211110,002,83),
(201712211101,003,98),
(201712211102,003,86),
(201712211103,003,86),
(201712211104,003,90),
(201712211105,003,92),
(201712211106,003,88),
(201712211107,003,78),
(201712211108,003,95),
(201712211109,003,88),
(201712211110,003,85),
(201712211101,004,98),
(201712211102,004,86),
(201712211103,004,83),
(201712211104,004,52),
(201712211105,004,92),
(201712211106,004,88),
(201712211107,004,76),
(201712211108,004,94),
(201712211109,004,99),
(201712211110,004,86),
(201712211101,005,99),
(201712211102,005,87),
(201712211103,005,57),
(201712211104,005,91),
(201712211105,005,93),
(201712211106,005,89),
(201712211107,005,79),
(201712211108,005,96),
(201712211109,005,89),
(201712211110,005,86);


INSERT INTO cls_stu(`sno`,`clno`)VALUES
('201712211101','1741'),
('201712211102','1741'),
('201712211103','1743'),
('201712211104','1741'),
('201712211105','1741'),
('201712211106','1743'),
('201712211107','1741'),
('201712211108','1743'),
('201712211109','1741'),
('201712211110','1743');

--至少两个班级、每班不少于 5 人
--至少三个学科，有选修课、有必修课
--录入学生成绩要分布合理

--修改录入错误的学生姓名、学生成绩(至少写 3 条)
UPDATE student SET name='王冰' WHERE sno=201712211108;
UPDATE score SET grade=100 WHERE sno=201712211108 AND clno=005;

--统计每门课的学生人数
SELECT cono ,COUNT(*) AS num FROM score GROUP BY cono;

--查询某一门课程不及格的学生信息
SELECT student.*,score.* 
FROM student,score 
WHERE  student.sno=score.sno
AND  grade<60;

--查询某一个学生的各科成绩
SELECT sno,cono,grade
FROM score 
WHERE sno=201712211101
--查询一个班级每个学生的总成绩，并按总成绩由高到低排序
SELECT score.sno,SUM(grade) 
FROM cls_stu ,score 
WHERE score.sno=cls_stu.sno
AND cls_sno=1741
GROUP BY score.sno
ORDER BY SUM(grade) DESC;
--查询每门课都大于 80 分的学生信息
SELECT student.*,score.grade
FROM student,score
WHERE student.sno=score.sno
AND student.sno IN(
SELECT sno
FROM score
GROUP BY sno
HAVING MIN(grade)>80
);
--查询至少有一门课程不及格的学生信息(聚合函数与where不公用)
SELECT student.*,score.grade
FROM student,score
WHERE student.sno=score.sno
AND student.sno IN(
SELECT sno
FROM score
GROUP BY sno
HAVING MIN(grade)<60
);
--查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序
SELECT id,AVG(grade)
FROM score,cls_stu
WHERE score.sno=cls_stu.sno
AND cono=001
GROUP BY cono
ORDER BY AVG(grade) DESC
--查询各科成绩最高分、最低分和平均分
SELECT id,MAX(grade),MIN(grade),AVG(grade)
FROM score,cls_stu
WHERE score.sno=cls_stu.sno
GROUP BY cono
