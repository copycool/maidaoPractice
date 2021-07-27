/*修改录入错误的学生姓名、学生成绩(至少写3条)*/
update student set stu_id='江yi'WHERE id=1;
update student set stu_id='江杏'WHERE id=1;
update score set score='71'WHERE cou_id='002' and stu_id='201810';
/*统计每门课的学生人数；*/
SELECT cou_id ,COUNT(*) SUM FROM score GROUP BY cou_id;
/*查询某一门课程不及格的学生信息；*/
SELECT student.*,score.* 
FROM student,score 
WHERE  student.stu_id=score.stu_id
AND  score<60;
/*查询某一个学生的各科成绩；*/
SELECT stu_id,cou_id,score
FROM score 
WHERE stu_id=201810 ORDER BY cou_id;
 /*查询一个班级每个学生的总成绩，并按总成绩由高到低排序；*/
 SELECT score.stu_id,SUM(score) 
FROM stu_class ,score 
WHERE score.stu_id=stu_class.stu_id
AND stu_class.cl_id=01
GROUP BY score.stu_id
ORDER BY SUM(score) DESC;
/*查询每门课都大于80分的学生信息；*/
SELECT student.*,score.score
FROM student,score
WHERE student.stu_id=score.stu_id AND  student.stu_id IN(
SELECT stu_id
FROM score
GROUP BY stu_id
HAVING MIN(score)>80
);
/*查询至少有一门课程不及格的学生信息*/
SELECT student.*,score.score
FROM student,score
WHERE student.stu_id=score.stu_id
AND student.stu_id IN(
SELECT stu_id
FROM score
GROUP BY stu_id
HAVING MIN(score)<60
)AND score IN(
SELECT score.score
FROM score
WHERE score<60);
/*查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序；*/
SELECT  cl_id,AVG(score)
FROM score,stu_class
WHERE score.stu_id=stu_class.stu_id
AND cou_id=002
GROUP BY cl_id
ORDER BY AVG(score) DESC;
/*查询各科成绩最高分、最低分和平均分*/
SELECT score.cou_id,MAX(score),MIN(score),AVG(score)
FROM course,score
WHERE course.cou_id=score.cou_id
GROUP BY cou_id