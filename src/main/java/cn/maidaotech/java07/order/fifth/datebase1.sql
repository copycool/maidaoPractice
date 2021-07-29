/* 第八题 */

/* 学生表 */
CREATE Table IF NOT EXISTS `student` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `student_name` VARCHAR (20) NOT NULL,
    `sno` int(20) NOT NULL,
    `cno` INT(10) NOT NULL,
    `sex` TINYINT(1) NOT NULL,
    PRIMARY KEY(`id`),
    UNIQUE KEY `uk_sno`(`sno`)
    )ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
INSERT INTO student (student_name,sno,cno,sex) 
VALUES
 ('莉莉',1001,2001,1),
 ('苏苏',1002,2001,0),
 ('旺旺',1003,2001,0),
 ('公公',1004,2001,1),
 ('凹凹',1005,2001,1),
 ('郑郑',1006,2002,0),
 ('品平',1007,2002,1),
 ('侃侃',1008,2002,1),
 ('谷古',1009,2002,1),
 ('天天',10010,2002,1),
 ('东方',10011,2003,0),
 ('嘿嘿',10012,2003,1),
 ('品牌',10013,2003,0),
 ('日日',10014,2003,1),
 ('强强',10015,2003,0);

 /* 班级表 */
CREATE Table IF NOT EXISTS `class_info` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `cno` INT (20) NOT NULL,
    `class_name` VARCHAR(20) NOT NULL,
     PRIMARY KEY(`id`),
      UNIQUE KEY `uk_cno`(`cno`)
    )ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

    INSERT INTO class_info(cno,class_name)
    VALUES
    (2001,'物联网班'),
    (2002,'软工班'),
    (2003,'计科网三班');
   
    /* 课程表 */

CREATE Table IF NOT EXISTS `course` (
    `id`BIGINT(20) NOT NULL AUTO_INCREMENT,
    `course_no` INT(2) NOT NULL,
    `course_type` VARCHAR (20) NOT NULL,
    `course_name` VARCHAR (20) NOT NULL,
    `cno` INT(20) NOT NULL,
    PRIMARY KEY(`id`),
    UNIQUE KEY `uk_course_no`(`course_no`)
    )ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

    INSERT INTO couse(course_no,course_type,course_name,cno)
    VALUES
    (10,'必修课','算法设计',2001),
    (11,'必修课','数据库设计',2001),
    (12,'选修课','美术设计',2001);

    /* 成绩表 */
    CREATE Table IF NOT EXISTS `stu_score` (
    `id`BIGINT(20) NOT NULL AUTO_INCREMENT,
    `sno` INT(20) NOT NULL,
    `course_no` INT(20) NOT NULL,
    `score` INT(20) NOT NULL,
    PRIMARY KEY(`id`)
    )ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

    INSERT INTO stu_score(sno,course_no,score)
    VALUES
    (1001,10,75),
    (1001,11,55),
    (1001,12,65),
    (1002,10,59),
    (1002,11,80),
    (1002,12,82),
    (1003,10,92),
    (1003,11,76),
    (1003,12,56),
    (1004,10,48),
    (1004,11,80),
    (1004,12,90),
    (1005,10,65),
    (1005,11,59),
    (1005,12,88),
    (1006,10,69),
    (1006,11,79),
    (1006,12,88),
    (1007,10,76),
    (1007,11,60),
    (1007,12,82),
    (1008,10,76),
    (1008,11,60),
    (1008,12,82),
    (1009,10,80),
    (1009,11,60),
    (1009,12,92),
    (10010,10,70),
    (10010,11,84),
    (10010,12,94),
    (10011,10,90),
    (10011,11,50),
    (10011,12,72),
    (10012,10,88),
    (10012,11,40),
    (10012,12,82),
    (10013,10,80),
    (10013,11,60),
    (10013,12,92),
    (10014,10,83),
    (10014,11,62),
    (10014,12,72),
    (10015,10,88),
    (10015,11,64),
    (10015,12,92);

/* 修改录入错误的学生姓名、学生成绩(至少写3条)； */
UPDATE student set student_name='熊熊' WHERE id=1;
UPDATE stu_score set score='8'WHERE id=1;

/* 统计每门课的学生人数； */
SELECT course_no '课程编号' , COUNT(sno) '选课人数' from stu_score GROUP BY course_no 
/* 查询某一门课程不及格的学生信息 */
SELECT s.* 
FROM student s RIGHT JOIN stu_score b on s.sno = b.sno,
WHERE b.course_no=10 AND b.score<70;
/* 
查询某一个学生的各科成绩； */
SELECT score '成绩' FROM stu_score WHERE sno=10010;

/* 查询一个班级每个学生的总成绩，并按总成绩由高到低排序 */
SELECT s.student_name,SUM(a.score)
 FROM stu_score a,student s
 WHERE a.sno=s.sno
 GROUP BY s.student_name
 ORDER BY SUM(a.score) DESC;

/* 查询每门课都大于80分的学生信息； */
select * from student 
WHERE sno in (SELECT sno FROM stu_score GROUP BY sno HAVING MIN(score)>60);

/* 查询至少有一门课程不及格的学生信息； */
SELECT * FROM student 
WHERE sno in(SELECT sno FROM stu_score GROUP BY sno HAVING MIN(score)<60);
/* 
查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序； */
SELECT s.cno,AVG(a.score)
 FROM stu_score a ,student s
WHERE  s.sno=a.sno AND a.course_no=10
 GROUP BY s.cno
  ORDER BY AVG(a.score) DESC;

/* 查询各科成绩最高分、最低分和平均分； */
SELECT course_no '课程号',MAX(score),MIN(score),AVG(score)
FROM stu_score
GROUP BY course_no



/* 分析上一题中SELECT查询语句的执行效率，并创建索引进行优化。 */
 explain select * from stu_score where sno='1001' order by created_at;
