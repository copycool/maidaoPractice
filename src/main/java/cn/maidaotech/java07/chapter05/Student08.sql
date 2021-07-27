维护学生成绩系统的数据 (继第7题)：
a. 修改录入错误的学生姓名、学生成绩(至少写 3 条)；
UPDATE student set name = 'Angle' WHERE s_no = '1801';
UPDATE score SET Ch_score = 99 WHERE id = 1;
UPDATE score SET Math_score = 21 WHERE id = 1;

a. 统计每门课的学生人数；
SELECT COUNT(*) FROM stu_class WHERE cls_id = 1;
SELECT COUNT(*) FROM stu_class WHERE cls_id = 2;

b. 查询某一门课程不及格的学生信息；
SELECT s_no FROM score WHERE Ch_score<60;

c. 查询某一个学生的各科成绩；
SELECT Ch_score, Math_score, En_score, sport_score FROM score WHERE id=7;

d. 查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
 // SELECT sum(score) from score   WHERE (select stu_id from class where=1801 )GROUP BY score.s_no ORDER BY sum()DESC
e. 查询每门课都大于 80 分的学生信息；
SELECT  * FROM score where Ch_score>80 and Math_score>80 and En_score>80 and sport_score>80;

f. 查询至少有一门课程不及格的学生信息；
SELECT  * FROM score where Ch_score<60 or Math_score<60 or En_score<60 or sport_score<60;

g. 查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序；
SELECT AVG(Ch_score) as '语文成绩平均分' FROM score WHERE cla
h. 查询各科成绩最高分、最低分和平均分
SELECT MAX(Ch_score) as '语文成绩最高分', MAX(Math_score) as '数学成绩最高分' ,MAX(En_score) as '英语成绩最高分',MAX(sport_score) as '体育成绩最高分' FROM score;
SELECT MIN(Ch_score) as '语文成绩最低分', MIN(Math_score) as '数学成绩最低分' ,MIN(En_score) as '英语成绩最低分',MIN(sport_score) as '体育成绩最低分' FROM score;
SELECT AVG(Ch_score) as '语文成绩平均分', AVG(Math_score) as '数学成绩平均分' ,AVG(En_score) as '英语成绩平均分',AVG(sport_score) as '体育成绩平均分' FROM score;




