
-- 维护学生成绩系统的数据：
-- 修改录入错误的学生姓名、学生成绩(至少写3条)； 、
-- 1111找学生成绩  学生班级表找班级id 班级id找考试表 考试id找成绩表
-- 统计每门课的学生人数；
-- 查询某一门课程不及格的学生信息；
-- 查询某一个学生的各科成绩；
-- 查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
-- 查询每门课都大于80分的学生信息；
-- 查询至少有一门课程不及格的学生信息；
-- 查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序；
-- 查询各科成绩最高分、最低分和平均分

--1
update student7 set name ='派大星' where id=1;
select * from student7;

select score from score where exam_id in
( select id from  exam where cls_id in
 ( select cls_id from stu_cls where stu_id=1)
)
--修改学生成绩
-- update score set score=99 where exam_id in
-- ( select id from  exam where cls_id in
--  ( select cls_id from stu_cls where stu_id=1)
-- )
update score set score=72 where st_id=1;



--2
select count(*) as number from stu_cls where cls_id in (
select cls_id from cls_course where cou_id=1
);
select count(*) as number from stu_cls where cls_id in (
select cls_id from cls_course where cou_id=2
);
select count(*) as number from stu_cls where cls_id in (
select cls_id from cls_course where cou_id=3
);

--3
select * from student7 where id in(
select st_id from score where score<60
)

--4
select * from score where st_id in
(
select id from student7 where name='派大星'
);

---5
select SUM(score) total_score from score where st_id in(
select stu_id from stu_cls where cls_id=2
) group by st_id order by total_score desc;

select SUM(score) total_score from score where st_id in(
select stu_id from stu_cls where cls_id=1
) group by st_id order by total_score desc;

--6
select * from student7 where id in(
select st_id from score group by st_id having min(score)>80)

--7
select * from student7 where id in(
select distinct st_id from score where score<60
)
--8
select avg(score) from score where exam_id in (select id from exam where cou_id=1);
select avg(score) from score where exam_id in (select id from exam where cou_id=2);
select avg(score) from score where exam_id in (select id from exam where cou_id=3);

--9
select max(score) from score where exam_id in (select id from exam where cou_id=1);
select max(score) from score where exam_id in (select id from exam where cou_id=2);
select max(score) from score where exam_id in (select id from exam where cou_id=3);

select min(score) from score where exam_id in (select id from exam where cou_id=1);
select min(score) from score where exam_id in (select id from exam where cou_id=2);
select min(score) from score where exam_id in (select id from exam where cou_id=3);

select avg(score) from score where exam_id in (select id from exam where cou_id=1);
select avg(score) from score where exam_id in (select id from exam where cou_id=2);
select avg(score) from score where exam_id in (select id from exam where cou_id=3);