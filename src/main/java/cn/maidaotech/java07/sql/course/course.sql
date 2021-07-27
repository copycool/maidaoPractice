/* 设计一个大学生成绩系统使用的数据库表，要求至少涉及学生信息、班级信息、课程信息、成 
绩信息等。要求： 
a. 至少两个班级、每班不少于 5 人- 187 - 
b. 至少三个学科，有选修课、有必修课 
c. 录入学生成绩要分布合理， */


/* 学生表 */
CREATE TABLE IF NOT EXISTS `student`(
`id`BIGINT(20) NOT NULL AUTO_INCREMENT;
`name` varchar(20) not null COMMENT '姓名',
`class` varchar(20) not null comment '班级',
`sno` varchar(20) not null comment '学号',
PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
insert INTO student(name,class,sno) VALUES('张三','一班','21101');
insert INTO student(name,class,sno) VALUES('李四','一班','21102');
insert INTO student(name,class,sno) VALUES('王五','一班','21103');
insert INTO student(name,class,sno) VALUES('李冰冰','二班','21201');
insert INTO student(name,class,sno) VALUES('张丽丽','二班','21202');
insert INTO student(name,class,sno) VALUES('刘西西','二班','21203');
insert INTO student(name,class,sno) VALUES('赵六','一班','21104');
insert INTO student(name,class,sno) VALUES('苏七','一班','21105');
insert INTO student(name,class,sno) VALUES('白落落','一班','21204');
insert INTO student(name,class,sno) VALUES('沈蔓蔓','一班','21205');
 
/*班级信息 */
CREATE TABLE IF NOT EXISTS `class`(
`id`BIGINT(20) NOT NULL AUTO_INCREMENT,
`class` varchar(20) not null comment '班级',
PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
insert INTO class(class) VALUES('一班');
insert INTO class(class) VALUES('二班');

/* 课程信息 */
create TABLE IF NOT EXISTS `course`(
`cno` INT(20) NOT NULL COMMENT '课程号',
`course_name` VARCHAR(20) NOT NULL COMMENT '课程',
`course_type` TINYINT NOT NULL COMMENT '选修1/必修0',
primary key (`cno`)
)ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
insert INTO course(cno,course_name,course_type) 
VALUES
(01,'语文',0),
(02,'数学',0),
(03,'英语',0),
(04,'科学',1);

/* 成绩信息 */
create TABLE IF NOT EXISTS `score`(
`id`BIGINT(20) NOT NULL AUTO_INCREMENT,
`sno` varchar(20) not null comment '学号',
`name` varchar(20) not null COMMENT '姓名',
`cno` int(20) not null COMMENT '课程号',
`score` int(20) not null COMMENT '分数',
PRIMARY KEY (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

insert INTO score(sno,name,cno,score)
VALUES
('21101','张三',01,67),
('21101','张三',02,98),
('21101','张三',03,89),
('21101','张三',04,83),

('21102','李四',01,89),
('21102','李四',02,100),
('21102','李四',03,86),
('21102','李四',04,93),

('21103','王五',01,65),
('21103','王五',02,74),
('21103','王五',03,90),
('21103','王五',04,76),

('21104','赵六',01,88),
('21104','赵六',02,90),
('21104','赵六',03,93),
('21104','赵六',04,84),

('21105','苏七',01,90),
('21105','苏七',02,80),
('21105','苏七',03,97),
('21105','苏七',04,81),

('21201','李冰冰',01,81),
('21201','李冰冰',02,64),
('21201','李冰冰',03,89),
('21201','李冰冰',04,70),

('21202','张丽丽',01,93),
('21202','张丽丽',02,90),
('21202','张丽丽',03,89),
('21202','张丽丽',04,89),

('21203','刘西西',01,65),
('21203','刘西西',02,76),
('21203','刘西西',03,98),
('21203','刘西西',04,79),

('21204','白落落',01,85),
('21204','白落落',02,83),
('21204','白落落',03,95),
('21204','白落落',04,90),

('21205','沈蔓蔓',01,92),
('21205','沈蔓蔓',02,75),
('21205','沈蔓蔓',03,84),
('21205','沈蔓蔓',04,89);


/* a. 修改录入错误的学生姓名、学生成绩(至少写 3 条)； */
update score set name='张大大' where sno='21101';
update student set name='张大大' where sno='21101';
update score set chinese_score= 69 where sno='21101';
/* a. 统计每门课的学生人数；  */
SELECT cno '课程编号' ,COUNT(sno) '选课人数' FROM score group BY cno;
/* b. 查询某一门课程不及格的学生信息；  */
SELECT * from student where sno in(SELECT sno from score where cno=01 and score<60);
/* c. 查询某一个学生的各科成绩*/
select * from score where sno in(select sno from student where name="张三");
/* d. 查询一个班级每个学生的总成绩，并按总成绩由高到低排序；  */
SELECT name,SUM(score) from score where name IN
(select name from student where class="一班") 
GROUP by name 
ORDER BY SUM(score) desc;
/* e. 查询每门课都大于 80 分的学生信息；  */
SELECT * from student where sno in (select sno FROM score  as s GROUP BY s.sno Having MIN(s.score)>80 );
/* f. 查询至少有一门课程不及格的学生信息；  */
SELECT * from student where sno in (select sno FROM score  as s GROUP BY s.sno Having MIN(s.score)<60 );
/* g. 查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序；  */
select cno,avg(score) from score group BY cno order BY avg(score) desc;
/* h. 查询各科成绩最高分、最低分和平均分；  */
select cno,avg(score),min(score),max(score) from score group BY cno ;




