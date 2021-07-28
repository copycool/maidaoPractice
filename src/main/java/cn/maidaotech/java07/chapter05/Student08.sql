维护学生成绩系统的数据 (继第7题)：
a. 修改录入错误的学生姓名、学生成绩；
update   student,score set name = 'Erica' ,score = 69
where student.id = score.studnt_id 
and student.id = 1 
and score.id = 1  ;

a. 统计每门课的学生人数；
SELECT COUNT(*)as '学生人数' FROM score 
where course_id = 2; 

b. 查询某一门课程不及格的学生信息；
SELECT * from student,score     
where score < 60 
and student.id = score.studnt_id ;

c. 查询某一个学生的各科成绩；
SELECT course_id, score FROM score where studnt_id = 1 ;

d. 查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
SELECT student.aclass_id,student_id ,sum(score) as '总成绩' from score ,student 
WHERE student.id=score.student_id 
GROUP BY student_id  ,student.aclass_id 
ORDER BY SUM(score) ASC;
e. 查询每门课都大于 80 分的学生信息；
select s_no,sex,name,aclass_id,course_id,score  from score,student  
where student.id=score.student_id  
and score.student_id not in (select score.student_id from score where score<80);

f. 查询至少有一门课程不及格的学生信息；
SELECT s_no,sex,name,aclass_id,course_id,score from score,student 
WHERE student.id=score.student_id  
AND score.score<60 ORDER BY name;

g. 查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序；
SELECT student.aclass_id, AVG(score) as '平均成绩'
FROM score ,student 
where student.id=score.student_id
AND score.course_id = 1
AND student.aclass_id = 1000 ;

h. 查询各科成绩最高分、最低分和平均分
SELECT course_id, MAX(score) as '最高分',MIN(score)as '最低分',AVG(score) as '平均分'
FROM score
GROUP BY course_id;
