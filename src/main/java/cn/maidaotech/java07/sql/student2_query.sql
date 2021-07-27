USE student_system;

#修改录入错误的学生姓名、学生成绩(至少写3条)；

#修改学号为：20182512770003 的学生姓名
UPDATE student 
SET `stu_name` = "程树" 
WHERE
	`sno` = 20182512770003;
	
#修改姓名为: 程树 的 新青年 成绩
UPDATE stu_score 
SET `score` = 50 
WHERE
	`sno` = ( SELECT `sno` FROM student WHERE `stu_name` = "程树" ) 
	AND `course_no` = ( SELECT `course_no` FROM course WHERE `course_name` = "新青年" );
	
#修改姓名为: 程树 的 救国之路的探索 成绩
UPDATE stu_score 
SET `score` = 105 
WHERE
	`sno` = ( SELECT `sno` FROM student WHERE `stu_name` = "程树" ) 
	AND `course_no` = ( SELECT `course_no` FROM course WHERE `course_name` = "救国之路的探索" );
	
#统计每门的学生
SELECT
	`course_no`,
	COUNT( * ) 
FROM
	stu_score 
GROUP BY
	`course_no`;
	
#查询某一门课程不及格的学生信息；
SELECT
	* 
FROM
	student s 
WHERE
	s.sno = ANY ( SELECT `sno` FROM stu_score ss WHERE ss.score < 60 AND course_no = ( SELECT `course_no` FROM course WHERE `course_name` = "救国之路的探索" ) );
	
#查询某一个学生的各科成绩；
SELECT
	* 
FROM
	stu_score ss 
WHERE
	ss.`sno` = ( SELECT `sno` FROM student WHERE `stu_name` = "程树" );
	
#查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
SELECT
	`sno`,
	SUM( score ) AS sums 
FROM
	stu_score ss 
WHERE
	ss.`sno` = ANY ( SELECT `sno` FROM student s WHERE s.cno = ( SELECT `cno` FROM class_info ci WHERE ci.c_name = '软件工程一班' ) ) 
GROUP BY
	`sno` 
ORDER BY
	sums DESC;
	
#查询每门课都大于80分的学生信息；
SELECT DISTINCT
	s.`sno`,
	`stu_name`,
	`sex`,
	`school`,
	`course_name`,
	`course_type`,
	`score` 
FROM
	student s
	INNER JOIN stu_score ss ON s.sno = ss.sno 
	AND ss.score > 80
	INNER JOIN course c ON ss.course_no = c.course_no 
GROUP BY
	`stu_name`;
	
#查询至少有一门课程不及格的学生信息；
SELECT DISTINCT
	s.`sno`,
	`stu_name`,
	`sex`,
	`school`,
	`course_name`,
	`score` 
FROM
	student s
	JOIN stu_score ss ON s.sno = ss.sno 
	AND ss.score < 60
	RIGHT JOIN course c ON ss.course_no = c.course_no;
	
#查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序
SELECT
	s.`cno` '班级号',
	AVG( ss.score ) '平均分' 
FROM
	stu_score ss,
	student s 
WHERE
	ss.sno = s.sno 
	AND ss.course_no = ( SELECT `course_no` FROM course c WHERE c.course_name = '救国之路的探索' ) 
GROUP BY
	s.cno 
ORDER BY
	AVG( ss.score ) DESC;
	
#查询各科成绩最高分、最低分和平均分；
SELECT
	ss.course_no '课程号',
	course_name '课程名',
	MAX( `score` ) '最高分',
	MIN( `score` ) '最低分',
	AVG( `score` ) '平均分' 
FROM
	stu_score ss,
	course c 
WHERE
	ss.course_no = c.course_no 
GROUP BY
	ss.course_no;
	
#(附加题)有如下形式的表格：课程ID、课程名称、最高分、最低分、平均分、及格率、中等率、优良率、优秀率（及格为>=60，中等为70-80，优良为：80-90，优秀为>=90）按照平均分降序排列。思考并尝试编写查询SQL语句。
# 最高分、最低分、平均分
SELECT
	MAX( `score` ) '最高分',
	MIN( `score` ) '最低分',
	AVG( `score` ) '平均分' 
FROM
	course;
INSERT INTO `passing_rate` 
FROM
	( SELECT COUNT( * ) '及格人数' FROM course WHERE score >= 60 ) AS s SELECT
	`passing_rate` ROUND(
	COUNT( CASE course WHEN course.score >= 60 AND course.score <= 69 THEN 1 ELSE NULL END ) * 100 / COUNT( * ),
	2 
	OR '%' 
FROM
	course;
)
