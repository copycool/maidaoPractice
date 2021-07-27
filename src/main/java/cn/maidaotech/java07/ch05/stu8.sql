create table stu7(
`id` bigint(20) auto_increment,
`stu_id` bigint(20),
`name` varchar(20),
`sex` tinyint(1),
`class` varchar(20),
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
insert into stu7(stu_id,name,sex,class) values(20181912890,'李宁',1,'1班');
insert into stu7(stu_id,name,sex,class) values(20181912891,'王佳悦',0,'2班');
insert into stu7(stu_id,name,sex,class) values(20181912892,'安清',1,'2班');
insert into stu7(stu_id,name,sex,class) values(20181912893,'路经纬',1,'1班');
insert into stu7(stu_id,name,sex,class) values(20181912894,'楚楚',1,'1班');
insert into stu7(stu_id,name,sex,class) values(20181912895,'琪琪',0,'2班');
insert into stu7(stu_id,name,sex,class) values(20181912896,'金凤',0,'2班');
insert into stu7(stu_id,name,sex,class) values(20181912897,'顾燃',1,'1班');
insert into stu7(stu_id,name,sex,class) values(20181912898,'陆运',1,'2班');
insert into stu7(stu_id,name,sex,class) values(20181912899,'田露',0,'1班');



create table course7(
`id` bigint(20) auto_increment,
`cou_id` bigint(20),
`course` varchar(20),
`course_type` varchar(20),
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
insert into course7(cou_id,course,course_type) values(1230,'语文','选修课');
insert into course7(cou_id,course,course_type) values(1231,'数学','必修课');
insert into course7(cou_id,course,course_type) values(1232,'英语','必修课');


create table score7(
`id` bigint(20) auto_increment,
`stu_id` bigint(20),
`name` varchar(20),
`class` varchar(20),
`cou_id` bigint(20),
`course` varchar(20),
`score` bigint(20),
`course_type` varchar(20),
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
insert into score7(stu_id,class,cou_id,score,course_type) (select stu_id,class,cou_id,FLOOR(50 + (RAND() * 50)),course_type from stu7 , course7);
-- 将stu7中的部分数据导入score7中

-- 删除多余的数据
alter TABLE score7 drop course;
DELETE FROM score7 WHERE id BETWEEN 10018 and 10047;
delete from score7 where id between 10080 and 10109;
delete from stu7 where id between 10000 and 10019;

-- 修改录入错误的学生姓名、学生成绩
update stu7 set name='王家悦'where name='王佳悦';
update stu7 set name='安庆' where name='安清';
update stu7 set name='陆羽' where name='陆运';
update score7 set score=49 where id=10053;
update score7 set score=87 where id=10050;
update score7 set score=78 where id=10057;

-- 统计每门课的学生人数；
select count(cou_id=1230) from score7;
select count(cou_id=1231) from score7;
select count(cou_id=1232) from score7;

-- 查询某一门课程不及格的学生信息；2种
select stu7.* from score7 ,stu7
where score7.stu_id=stu7.stu_id and score7.cou_id=1230 and score7.score<60;
-- 或者
SELECT *from stu7 WHERE stu_id in (SELECT  stu_id from score7 where cou_id=1230 and score<60);


-- 查询某一个学生的各科成绩    3种
select cou_id,score from score7,stu7 where score7.stu_id=stu7.stu_id and name='李宁';
select cou_id,score from score7 where stu_id=20181912890; 
select cou_id,score from score7 where stu_id in(select stu_id from stu7  where name='李宁');

-- 查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
select SUM(score),score7.class from score7 left join stu7 on stu7.stu_id=score7.stu_id 
group by class ORDER BY sum(score) DESC;

select sum(score7.score),stu7.stu_id from score7 left join stu7 on stu7.stu_id=score7.stu_id
where stu7.class='1班' group by stu_id order by sum(score) desc;

select sum(score7.score),stu7.stu_id from score7 left join stu7 on stu7.stu_id=score7.stu_id
where stu7.class='2班' group by stu_id order by sum(score) desc;

select * from score7 right join stu7 on score7.stu_id=stu7.stu_id;  格式


-- 查询每门课都大于80分的学生信息；
select * from stu7
 where stu_id in(select score7.stu_id from score7 
left join course7
 on course7.cou_id=score7.cou_id 
group by score7.stu_id 
having min(score7.score)>=80);

-- 查询至少有一门课程不及格的学生信息；
select stu7.* from score7,stu7 where score7.stu_id=stu7.stu_id and score<60;
select * from stu7 where stu_id in(select stu_id from score7 where score<60);
-- 查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序；
select avg(score) from score7 where cou_id=1230 GROUP BY class ORDER BY avg(score) desc;
  

-- 查询各科成绩最高分、最低分和平均分；2种
SELECT min(score),max(score),avg(score),course7.course from score7 left JOIN course7 ON score7.cou_id = course7.cou_id
GROUP BY course7.course;

SELECT min(score),max(score),avg(score),cou_id from score7 
GROUP BY cou_id;
