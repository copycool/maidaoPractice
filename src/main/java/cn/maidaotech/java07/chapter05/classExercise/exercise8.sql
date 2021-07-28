-- 维护学生成绩系统的数据：
-- 修改录入错误的学生姓名、学生成绩(至少写3条)；
-- 统计每门课的学生人数； group by course
-- 查询某一门课程不及格的学生信息；
-- 查询某一个学生的各科成绩；where id
-- 查询一个班级每个学生的总成绩，并按总成绩由高到低排序； 学生id
-- 查询每门课都大于80分的学生信息；
-- 查询至少有一门课程不及格的学生信息；
-- 查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序； 学生id
-- 查询各科成绩最高分、最低分和平均分

update student77 set name='派大星'  where id=10000;
update score77 set score=88 where student_id=10009 and course_id=10002;

select count(*) number,course_id from  score77 GROUP BY course_id;

select * from student77 where id in(select student_id from score77 where score<60);

select score from score77 where student_id=10000;

SELECT SUM(s.score) AS "总成绩",stu.`name` AS '学生姓名'
FROM score77 s
INNER JOIN student77 stu
ON s.student_id = stu.id
WHERE stu.team_id = 10000
GROUP BY s.student_id
ORDER BY SUM(s.score)
DESC

select * from student77 where id in(select student_id from score77 GROUP BY student_id having min(score)>80)

select avg(s.score) as "总成绩",stu.team_id as "班级"
from score77 s
left join student77 stu
on s.student_id=stu.id
where course_id=10000
group by team_id
order by sum(s.score) desc;


select * from student77 where id in(select distinct student_id from score77  where score<60);

select max(score) from score77 GROUP BY course_id;
select min(score) from score77 GROUP BY course_id;
select avg(score) from score77 GROUP BY course_id;