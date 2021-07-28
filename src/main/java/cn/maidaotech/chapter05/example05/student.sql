CREATE TABLE IF NOT EXISTS `student`(
id int(20) NOT NULL AUTO_INCREMENT,
sname VARCHAR(20) NOT NULL COMMENT "学生姓名",
sno VARCHAR(20) NOT NULL COMMENT "学号，以字符储存",
ssex TINYINT(1) NOT NULL COMMENT "性别，1为男性，2为女性，3为未知",
birthdate BIGINT(20) NOT NULL COMMENT "不用age，用时间戳",
class_id INT(20) NOT NULL COMMENT "班级号，对应class-id",
creat_at BIGINT(20) NOT NULL COMMENT "创建时间",
updated_at BIGINT(20) COMMENT "修改时间",
 PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
CREATE TABLE IF NOT EXISTS `class`(
id INT(20) NOT NULL AUTO_INCREMENT COMMENT "id直接对应班级号",
classname VARCHAR(20) NOT NULL COMMENT "班级名称",
creat_at BIGINT(20) NOT NULL COMMENT "创建时间",
updated_at BIGINT(20) COMMENT "修改时间",
 PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE IF NOT EXISTS `score`(
id BIGINT(20) NOT NULL AUTO_INCREMENT COMMENT "成绩id",
stuid VARCHAR(20) NOT NULL COMMENT "学生id",
score INT(5) NOT NULL COMMENT "成绩",
course_id INT(20) NOT NULL COMMENT "课程号，对应course的id",
creat_at BIGINT(20) NOT NULL COMMENT "创建时间",
updated_at BIGINT(20)  COMMENT "修改时间",
 PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE IF NOT EXISTS `course`(
id INT(20) NOT NULL AUTO_INCREMENT COMMENT "id对应课程号",
cname VARCHAR(20) NOT NULL COMMENT "课程名字",
select_status TINYINT(1) NOT NULL COMMENT "是选修课为1，不是选修课为2",
creat_at BIGINT(20) NOT NULL COMMENT "创建时间",
updated_at BIGINT(20)  COMMENT "修改时间",
 PRIMARY KEY (`id`)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

#数据插入语句因未保存略过
#下面是题目解答

#修改录入错误的学生姓名、学生成绩(至少写3条)；
SELECT * FROM`student`  WHERE `sname` = '郭爷爷'
UPDATE `student` SET `sname` = '郭子' WHERE `sname` = '郭爷爷'
SELECT * FROM`student`  WHERE `sname` = '老祖宗'
UPDATE `student` SET `sname` = '皮特' WHERE `sname` = '老祖宗'
SELECT * FROM`student`  WHERE `sname` = '牛牛'
UPDATE `student` SET `sname` = '牛七' WHERE `sname` = '牛牛'
SELECT * FROM`score`  WHERE `score` = 9
UPDATE `score` SET `score` = 79 WHERE `score` = 9
SELECT * FROM`score`  WHERE `score` = 93
UPDATE `score` SET `score` = 87  WHERE `score` = 93
SELECT * FROM`score`  WHERE `score` = 94
UPDATE `score` SET `score` = 75 WHERE `score` = 94
#统计每门课的学生人数；
SELECT `course_id`,COUNT(*) FROM `score` GROUP BY course_id 
#查询某一门课程不及格的学生信息；
SELECT COUNT(*) FROM `score` WHERE score<60 and course_id=1
#查询某一个学生的各科成绩；
SELECT * FROM score WHERE  stuid=10011
#查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
SELECT sname,sum(score) FROM score,student WHERE (student.id=score.stuid AND student.class_id=1) GROUP BY student.sname 
#查询每门课都大于80分的学生信息；
SELECT * FROM student WHERE sname NOT IN(
SELECT sname
FROM student,score
WHERE student.id=score.stuid AND score<80
)
#查询至少有一门课程不及格的学生信息；
SELECT * FROM student WHERE sname  IN(
SELECT sname
FROM student,score
WHERE student.id=score.stuid AND score<60
)
#查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序；
SELECT class.id,AVG(score) FROM score,student,class WHERE(
score.course_id='1' AND score.stuid =student.id AND student.class_id = class.id
)  GROUP BY student.class_id ORDER BY AVG(score) DESC;
#查询各科成绩最高分、最低分和平均分
SELECT score.course_id,AVG(score),MAX(score),MIN(score) FROM score,course WHERE course.id = score.course_id GROUP BY score.course_id





