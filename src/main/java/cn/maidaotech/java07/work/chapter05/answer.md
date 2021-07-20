二.创建一张学生表student，其中有字段id、first_name、last_name、sex、school等列，其中id为自增主键，通过SQL完成以下操作：

```sql
//1.建表
create table if not exist `student`(
	`id` bigint(20) not null auto_increment,
	`created_at` bigint(20) not null,
	`updated_at` bigint(20) not null,
	`first_name` varchar(20) not null,
    `last_name` varchar(10) not null,
    `sex` tinyint(1),
    `school` varchar(20),
    primary key (`id`)
 )engine=Innodb auto_increment=1000 default charset=utf8
```

​		a.

```sql
//从表中选取first_name列的值以"a"开头的所有记录
SELECT * FROM student where first_name LIKE 'a%';
```

​		b.

```sql
//从表中选择first_name等于Tom而且last_name等于Peter的所有记录
SELECT * from student where last_name = 'Peter' and first_name = 'Tom';
```

​		c.

```sql
//按字母顺序从表中选取first_name介于Angela和Peter的所有记录
select * from student where first_name BETWEEN 'Angela' AND 'Peter';
//或者
select * from student where first_name >= 'Angela' AND first_name <= 'Peter';
```

​		d.

```sql
//SQL语句可返回唯一不同的值
SELECT DISTINCT
```

​		e.

```sql
//根据first_name列降序地从表中返回所有记录
SELECT * from student ORDER BY first_name DESC;
//只返回前十条记录
SELECT * from student ORDER BY first_name DESC LIMIT 0,10;
//第11到20条记录
SELECT * from student ORDER BY first_name DESC LIMIT 10,10;
```

​		f.

```sql
//插入新的记录
INSERT INTO student(created_at,updated_at,first_name,last_name,sex,school) values (1,1,'gouzi','wang',0,'河南工程学院');
```

​		g.

```sql
//向表中的last_name列插入Wilson
INSERT INTO student(created_at,updated_at,first_name,last_name,sex,school)
values (1,1,'gouzi','Wilson',0,'河南工程学院');
```

​		h.

```sql
//把表中last_name列的Peter改为Wilson
UPDATE student set  last_name = 'Wilson' where last_name='Peter';
```

​		j.

```sql
//表中删除first_name等于Angela的记录
delete from student where first_name = 'Angela';
```

​		k.

```sql
//返回表中记录的数目
select COUNT(*) from student;
```

​		l.

```sql
//在已存在的student表中增加一列名为age表示年龄的列
ALTER table student add age int(3) ;
```

​		m.

```sql
//修改first_name列的字符长度为50且不允许NULL值
ALTER TABLE student MODIFY first_name VARCHAR(50) not null;
```

​		n.

```sql
//删除表中的age列
ALTER TABLE student drop age;
```

​		o.

```sql
//将表中所有数据的first_name和last_name以空格连接合并存入另外一张表persion中
1.创建person表
CREATE table if NOT EXISTS `person`(
	`id` BIGINT(20) not null auto_increment,
	`created_at` BIGINT(20) not NULL default 1,
	`updated_at` BIGINT(20) not NULL default 1,
	`user_name` VARCHAR(50) not NULL,
	PRIMARY KEY (`id`)
)ENGINE=INNODB auto_increment=1000 DEFAULT CHARSET=utf8;
2.复制数据
INSERT INTO person (user_name) 
select CONCAT(first_name," ",last_name) as user_name from student;

语法：
1. 表结构一样
  insert into 表1
  select * from 表2;
2. 表结构不一样
  insert into 表1 (列名1,列名2,列名3)
  select  列1,列2,列3 from 表2;
3. 只从另外一个表取部分字段
  insert into 表1 (列名1,列名2,列名3) values(列1,列2,(select 列3 from 表2));
```

7:

设计一个大学生成绩系统使用的数据库表，要求至少涉及学生信息、班级信息、课程信息、成绩信息等。要求：

```sql
1.创建学生表
CREATE TABLE IF not EXISTS `student`(
	`id` BIGINT(20) not NULL auto_increment PRIMARY KEY,
	`sno` BIGINT(20) not NULL  ,
	`created_at` BIGINT(20) NOT NULL,
	`stu_name` VARCHAR(10) not null,
	`age` int(3),
	`sex` TINYINT(1),
	`cno` BIGINT(20),
	UNIQUE KEY `uk_sno` (`sno`)
)ENGINE=INNODB default CHARSET=utf8;
2.创建班级表
CREATE TABLE IF not EXISTS `class_info`(
	`id` BIGINT(20) not NULL auto_increment PRIMARY KEY,
	`cno` BIGINT(20) not NULL comment '班级编号' ,
	`created_at` BIGINT(20) NOT NULL,
	`updated_at` BIGINT(20) not null,
	`c_name` VARCHAR(10) not null comment '班级名称',
	UNIQUE KEY `uk_cname` (`c_name`) ##创建唯一索引
)ENGINE=INNODB default CHARSET=utf8;
3.创建学生表cno与班级表cno的外键
ALTER TABLE student add CONSTRAINT FK_Cno FOREIGN KEY (cno) REFERENCES class_info(cno);
4.创建课程表
CREATE TABLE IF NOT EXISTS `course`(	
	`id` BIGINT(20) not null auto_increment PRIMARY KEY COMMENT '课程信息id',
	`course_no` BIGINT(20) not NULL COMMENT '课程号',
	`cno` BIGINT(20) not null COMMENT '班级编号',
	`created_at` BIGINT(20) not null COMMENT '创建人id',
	`updated_at` BIGINT(20) not NULL COMMENT '修改人id',
	`course_name` VARCHAR(10) not NULL COMMENT '课程名称',
	`score` DECIMAL(10) COMMENT '学分',
    `course_type` VARCHAR(14) not null comment '课程性质',
	`teacher_name` VARCHAR(10) not null COMMENT '教师名称',
	UNIQUE KEY `uk_courseno` (`course_no`)
)ENGINE=INNODB auto_increment=10000 DEFAULT CHARSET=utf8;
5.创建成绩表
CREATE TABLE IF not EXISTS `stu_score`(
	`id` BIGINT(20) not null PRIMARY key auto_increment COMMENT '成绩id',
	`sno` BIGINT(20) not null COMMENT '学号',
	`course_no` BIGINT(20) not NULL COMMENT '课程id',
	`score` DECIMAL(10) not null COMMENT '成绩',
	`created_at` BIGINT(20) not null COMMENT '创建人id',
	`updated_at` BIGINT(20) not NULL COMMENT '修改人id',
	UNIQUE key `uk_scoreid` (`id`)
)ENGINE=INNODB DEFAULT CHARSET=utf8;

a.至少两个班级、每班不少于5人
INSERT INTO class_info (cno,created_at,updated_at,class_name) 
VALUES
(10001,1,1,"软件工程一班"),
(10002,1,1,"软件工程二班"),
(10003,2,2,"软件技术一班"),
(10004,3,3,"软件技术二班"),
(10005,4,4,"计算机科学技术一班");

INSERT INTO student(sno,created_at,updated_at,stu_name,age,sex,cno)
VALUES
(20182512770001,1,1,'张三',19,0,10001),
(20182512770002,2,2,'王五',18,1,10001),
(20182512770003,4,4,'吴六',19,0,10001),
(20182512770004,3,3,'李飞',20,1,10001),
(20182512770005,5,5,'王四',21,0,10001),
(20182512770006,1,1,'李振',19,0,10002),
(20182512770007,2,2,'王颖',18,1,10002),
(20182512770008,4,4,'李佳',19,0,10002),
(20182512770009,3,3,'吴楠',20,1,10002),
(20182512770010,5,5,'薛仁贵',21,0,10002),
(20182512770011,1,1,'张秀',19,0,10003),
(20182512770012,2,2,'宋江',18,1,10003),
(20182512770013,4,4,'吴用',19,0,10003),
(20182512770014,3,3,'林冲',20,1,10003),
(20182512770015,5,5,'柴进',21,0,10003),
(20182512770016,1,1,'王莹',19,0,10004),
(20182512770017,2,2,'李欣',18,1,10004),
(20182512770018,4,4,'吴亦凡',19,0,10004),
(20182512770019,3,3,'罗志祥',20,1,10004),
(20182512770020,5,5,'路虎',21,0,10004),
(20182512770021,1,1,'大奔',19,0,10005),
(20182512770022,2,2,'浩哥',18,1,10005),
(20182512770023,4,4,'张麻子',19,0,10005),
(20182512770024,3,3,'汤师爷',20,1,10005),
(20182512770025,5,5,'八戒',21,0,10005)

b.至少三个学科，有选修课、有必修课
INSERT INTO course (course_no,cno,created_at,updated_at,course_name,credit,teacher_name,course_type)
VALUES
(10001,10001,1,1,'Java高阶工程教程',4,'张小军','必修课'),
(10002,10001,1,1,'React从基础到精通',4,'王泽民','必修课'),
(10003,10001,2,2,'MySQL从删库到跑路',4,'周瑜','必修课'),
(10004,10001,1,1,'Vue-cli3全家桶',4,'刘娟','选修课'),
(10005,10001,3,3,'JavaScript脚本之旅',4,'张敏','选修课');

INSERT INTO stu_score (sno,course_no,score,created_at,updated_at)
VALUES
(20182512770001,10001,95,1,1),
(20182512770001,10002,95,2,2),
(20182512770001,10003,95,3,3),
(20182512770001,10004,95,4,4),
(20182512770001,10005,95,5,5),
(20182512770002,10001,45,1,1),
(20182512770002,10002,35,2,2),
(20182512770002,10003,55,3,3),
(20182512770002,10004,25,4,4),
(20182512770002,10005,55,5,5),
(20182512770003,10001,75,1,1),
(20182512770003,10002,75,2,2),
(20182512770003,10003,75,3,3),
(20182512770003,10004,75,4,4),
(20182512770003,10005,75,5,5),
(20182512770004,10001,85,1,1),
(20182512770004,10002,85,2,2),
(20182512770004,10003,85,3,3),
(20182512770004,10004,85,4,4),
(20182512770004,10005,85,5,5),
(20182512770005,10001,60,1,1),
(20182512770005,10002,60,2,2),
(20182512770005,10003,60,3,3),
(20182512770005,10004,60,4,4),
(20182512770005,10005,60,5,5),
(20182512770006,10001,65,1,1),
(20182512770006,10002,65,2,2),
(20182512770006,10003,65,3,3),
(20182512770006,10004,65,4,4),
(20182512770006,10005,65,5,5),
(20182512770007,10001,95,1,1),
(20182512770007,10002,35,2,2),
(20182512770007,10003,75,3,3),
(20182512770007,10004,85,4,4),
(20182512770007,10005,95,5,5),
(20182512770008,10001,85,1,1),
(20182512770008,10002,75,2,2),
(20182512770008,10003,95,3,3),
(20182512770008,10004,95,4,4),
(20182512770008,10005,75,5,5)，
(20182512770009,10001,85,1,1),
(20182512770009,10002,45,2,2),
(20182512770009,10003,65,3,3),
(20182512770009,10004,35,4,4),
(20182512770009,10005,55,5,5);
(20182512770019,10001,85,1,1),
(20182512770019,10002,75,2,2),
(20182512770019,10003,95,3,3),
(20182512770019,10004,95,4,4),
(20182512770019,10005,75,5,5),
(20182512770011,10001,95,1,1),
(20182512770011,10002,95,2,2),
(20182512770011,10003,95,3,3),
(20182512770011,10004,95,4,4),
(20182512770011,10005,95,5,5),
(20182512770012,10001,45,1,1),
(20182512770012,10002,35,2,2),
(20182512770012,10003,55,3,3),
(20182512770012,10004,25,4,4),
(20182512770012,10005,55,5,5),
(20182512770013,10001,75,1,1),
(20182512770013,10002,75,2,2),
(20182512770013,10003,75,3,3),
(20182512770013,10004,75,4,4),
(20182512770013,10005,75,5,5),
(20182512770014,10001,85,1,1),
(20182512770014,10002,85,2,2),
(20182512770014,10003,85,3,3),
(20182512770014,10004,85,4,4),
(20182512770014,10005,85,5,5),
(20182512770015,10001,60,1,1),
(20182512770015,10002,60,2,2),
(20182512770015,10003,60,3,3),
(20182512770015,10004,60,4,4),
(20182512770015,10005,60,5,5),
(20182512770016,10001,65,1,1),
(20182512770016,10002,65,2,2),
(20182512770016,10003,65,3,3),
(20182512770016,10004,65,4,4),
(20182512770016,10005,65,5,5),
(20182512770017,10001,95,1,1),
(20182512770017,10002,35,2,2),
(20182512770017,10003,75,3,3),
(20182512770017,10004,85,4,4),
(20182512770017,10005,95,5,5),
(20182512770018,10001,85,1,1),
(20182512770018,10002,75,2,2),
(20182512770018,10003,95,3,3),
(20182512770018,10004,95,4,4),
(20182512770018,10005,75,5,5),
(20182512770019,10001,85,1,1),
(20182512770019,10002,45,2,2),
(20182512770019,10003,65,3,3),
(20182512770019,10004,35,4,4),
(20182512770019,10005,55,5,5),
(20182512770010,10001,85,1,1),
(20182512770010,10002,75,2,2),
(20182512770010,10003,95,3,3),
(20182512770010,10004,95,4,4),
(20182512770010,10005,75,5,5),
(20182512770020,10001,85,1,1),
(20182512770020,10002,75,2,2),
(20182512770020,10003,95,3,3),
(20182512770020,10004,95,4,4),
(20182512770020,10005,75,5,5);
```

8:维护学生成绩系统的数据：

```sql
a.修改录入错误的学生姓名、学生成绩(至少写3条)；
update student set stu_name = '张三丰' where sno=20182512770001;
UPDATE student set stu_name = '王武' where sno = 20182512770002;
UPDATE student set stu_name = '吴三桂' where sno = 20182512770003;
UPDATE stu_score set score = 75 where sno = 20182512770001 and course_no = 10001;
UPDATE stu_score set score = 36 where sno = 20182512770001 and course_no = 10002;
UPDATE stu_score set score = 86 where sno = 20182512770001 and course_no = 10003;

b.统计每门课的学生人数
SELECT course_no '课程编号' , COUNT(sno) '选课人数' from stu_score GROUP BY course_no 

c.查询课程编号为10001的不及格的学生信息
SELECT s.*
from student s RIGHT JOIN stu_score sc on s.sno = sc.sno
where sc.course_no=10001 and sc.score <60;

d.查询某一个学生的各科成绩
select * from stu_score where sno = 20182512770001;

e.查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
SELECT s.stu_name  '学生名称', SUM(ss.score) '各科总成绩' 
from stu_score as ss,student as s 
where s.cno=10001 and ss.sno=s.sno  
GROUP BY s.stu_name 
ORDER BY SUM(ss.score) DESC;

f.查询每门课都大于80分的学生信息
//方法一：
SELECT * from student where sno in
(SELECT DISTINCT sno from stu_score where sno not in
(select distinct  sno from stu_score where score<=80));
//方法二：
SELECT * FROM student where sno in
(SELECT sno from stu_score GROUP BY sno HAVING MIN(score)>80);

g.查询至少有一门课程不及格的学生信息
//方法一：
SELECT * from student where 
EXISTS
(SELECT * from stu_score where stu_score.sno=student.sno AND score<60);
//方法二：
SELECT DISTINCT s.* from student s,stu_score ss 
where s.sno=ss.sno AND ss.score<60;

h.查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序
select s.cno '班级编号', AVG(ss.score) '平均分' 
FROM stu_score ss,student s 
where s.sno=ss.sno and ss.course_no=10001 
GROUP BY s.cno ORDER BY AVG(ss.score) desc;

i.查询各科成绩最高分、最低分和平均分
select course_no '课程编号',MAX(score) '最高分',MIN(score) '最低分',AVG(score) '平均分'
from stu_score GROUP BY course_no

j.(附加题)有如下形式的表格：课程ID、课程名称、最高分、最低分、平均分、及格率、中等率、优良率、优秀率（及格为>=60，中等为70-80，优良为：80-90，优秀为>=90）按照平均分降序排列。思考并尝试编写查询SQL语句。
select ss.course_no '课程编号', 
(SELECT course_name from course where course_no=ss.course_no) '课程名称',
MAX(score) '最高分',MIN(score) '最低分',AVG(score) '平均分',
SUM(ss.score>=60)/COUNT(*) '及格率',
SUM(ss.score>=90)/COUNT(*) '优秀率'
 from stu_score ss GROUP BY ss.course_no ORDER BY AVG(score) desc;

```

