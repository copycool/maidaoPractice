-- 设计一个大学生成绩系统使用的数据库表，
-- 要求至少涉及学生信息、班级信息、课程信息、成绩信息等。
-- 要求：至少两个班级、每班不少于5人至少三个学科，
-- 有选修课、有必修课
-- 录入学生成绩要分

-- 维护学生成绩系统的数据：
-- 修改录入错误的学生姓名、学生成绩(至少写3条)；
-- 统计每门课的学生人数；
-- 查询某一门课程不及格的学生信息；查询某一个学生的各科成绩；
-- 查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
-- 查询每门课都大于80分的学生信息；
-- 查询至少有一门课程不及格的学生信息；
-- 查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序；
-- 查询各科成绩最高分、最低分和平均分；

-- 建库
CREATE DATABASE student

-- 建表
CREATE TABLE `student` ( `id` int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, `no` VARCHAR(10) NOT NULL COMMENT '学号' , `name` varchar(20) DEFAULT NULL COMMENT '姓名', `sex` tinyint(4) NOT NULL COMMENT '性别', `age` int(11) NOT NULL COMMENT '年龄', `class_no`int (4) NOT NULL COMMENT'班级' ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- birthdate "1998-12-26"
-- birthdate BIGINT（20）
-- -- 班级表
CREATE TABLE `class`(
 `id` int(10) NOT NULL AUTO_INCREMENT PRIMARY KEY,
`grade_no` int (4) NOT NULL COMMENT'年级',
`class_no`int (4) NOT NULL COMMENT'班级'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- -- 课程表
CREATE TABLE `course`( `id` int(30) NOT NULL AUTO_INCREMENT PRIMARY KEY, `cno` VARCHAR(30) NOT NULL COMMENT '课程号', `cname`VARCHAR(30) DEFAULT NULL COMMENT '课程名', `type`TINYINT(4) DEFAULT NULL )ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- 班级课程
-- CREATE TABLE `class_course`（
-- -- `id` int（30） NOT NULL AUTO_INCREMENT PRIMARY KEY
-- -- `class_no`int （4） NOT NULL COMMENT'班级'
-- -- -- `student_id` int（10） NOT NULL
-- -- ）ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `stu_course` ( `id` bigint(30) NOT NULL AUTO_INCREMENT PRIMARY KEY , `student_id` bigint(30) NOT NULL COMMENT '学号', `cno` bigint(30) NOT NULL COMMENT '课程号'  ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE `score` ( `id` bigint(30) NOT NULL AUTO_INCREMENT PRIMARY KEY, `student_id` bigint(30) NOT NULL COMMENT '学号', `cno` bigint(30) NOT NULL COMMENT '课程号', `score` bigint(10) NULL COMMENT'成绩' ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- 插入数据
INSERT INTO `student` (no, name, sex, age, class_no) VALUES (12110, '嬴政', 1, 18, 22), (12111, '李渊', 1, 18, 22), (12112, '武则天', 0, 17, 22), (12113, '李世民', 1, 17, 22), (12114, '朱元璋', 1, 19, 22), (12115, '刘邦', 1, 19, 22) ;
INSERT INTO `student` (no, name, sex, age, class_no) VALUES (12210, '小明', 1, 18, 23), (12211, '小王', 1, 18, 23), (12212, '小李', 0, 17, 23), (12213, '杨广', 1, 17, 23), (12214, '胡亥', 1, 19, 23), (12215, '崇祯', 1, 19, 23) ;
-- 插入课程数据
INSERT INTO `course` (cno, cname, type) VALUES(101,'计科',1),(102,'c++',1),(103,'数据库',1),(104,'算法',1);
INSERT INTO `course` (cno, cname, type) VALUES(111,'网球',2),(112,'概率论',2),(113,'计网',2),(114,'网络攻防',2);

-- 插入学生课程表

INSERT INTO `stu_course` (student_id,cno ) VALUES 
(12110,101),(12110,102),(12110,103), (12110,104), (12110,114),(12110,113);
INSERT INTO `stu_course` (student_id,cno ) VALUES 
(12111,101), (12111,101) ,(12111,101), (12111,101),(12111,111),(12111,112);
INSERT INTO `stu_course` (student_id,cno ) VALUES 
 (12113,101), (12113,101) ,(12113,101), (12113,101),(12113,111),(12113,112),
(12211,101),(12111,102),(12111,103), (12111,101), (12111,113),
(12212,101),(12112,102),(12112,103), (12112,101), (12112,114);

INSERT INTO `score` (student_id,cno,score) VALUES 
(12110,101,85),(12110,102,88),(12110,103,90), (12110,104,100), (12110,114,70),(12110,113,80);
-- 插入成绩
INSERT INTO `score` (student_id,cno,score) VALUES 
(12110,101,85),(12110,102,88),(12110,103,90), (12110,104,100), (12110,114,70),(12110,113,80);

INSERT INTO `score` (student_id,cno,score) VALUES 
(12111,101,85),(12111,102,88),(12111,103,90), (12111,104,100), (12111,113,80);
INSERT INTO `score` (student_id,cno,score) VALUES 
(12211,101,85),(12111,102,88),(12111,103,90), (12111,101,60), (12111,113,80)，
(12113,101,55),(12113,102,68),(12113,103,60), (12113,104,100), (12113,111,60)
;
INSERT INTO `score` (student_id,cno,score) VALUES 
(12212,101,65),(12112,102,58),(12112,103,60), (12112,101,60), (12112,113,80),
(12214,101,85),(12214,102,88),(12214,103,90), (12214,101,60), (12214,112,80),
(12213,101,85),(12113,102,88),(12113,103,90), (12113,101,60), (12113,113,80);


-- 维护学生成绩系统的数据：
-- 修改录入错误的学生姓名、学生成绩(至少写3条)；
SELECT * FROM `student` where no=12115;
update student SET name='刘彻'  where id=12115;
SELECT * FROM `student` where no=12113;
update student SET name='李建成'  where id=12113;
select * from student where no=12211;
update student set name='王圆' where no=12211;
SELECT * FROM `score`   where student_no=12110 and cno=102;
update `score` SET score=99  where student_no=12110 and cno=102;
SELECT * FROM `score`   where student_no=12113 and cno=102;
update `score` SET score=80  where student_no=12113 and cno=102;
-- 统计每门课的学生人数；
SELECT COUNT(*) as number from `stu_course`  where cno=111;
SELECT COUNT(*) as number from `stu_course`  where cno=104;
SELECT COUNT(*) as number from `stu_course`  where cno=101;
-- 查询某一门课程不及格的学生信息；查询某一个学生的各科成绩；
select  student.* FROM student WHERE no not in ( SELECT student_no FROM score WHERE cno=102 and score >=60 AND score.student_no = student.no);

--  select student* from score,student
--  where score.student_no=student.no ;
SELECT * from `score` where student_no=12110;
-- 查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
SELECT score.student_no,  SUM(score) 
from score group by score.student_no ORDER BY  SUM(score) DESC;
-- 查询每门课都大于80分的学生信息；
SELECT  *
FROM student
WHERE no NOT IN ( SELECT student_no FROM score WHERE score < 80 AND score.student_no = student.no) ; 
-- SELECT * FROM  group by id having min(score)>80
-- ;

-- 查询至少有一门课程不及格的学生信息；

-- SELECT * student.*,score.* FROM  student,score;
select  student.* FROM student WHERE no not in ( SELECT student_no FROM score WHERE score >=60 AND score.student_no = student.no);

-- SELECT student.*;
-- 查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序；

SELECT student_no,AVG(score) from score where cno=101 GROUP BY student_no  ;
-- 查询各科成绩最高分、最低分和平均分；
SELECT min(score) ,max(score),avg(score) from score WHERE cno ;
select  cno as'课程号' ,max(score) as'最高分',min(score) as '最低分',avg(score)as'平均成绩'  from score GROUP BY cno;
