create table team(
`id` bigint(20) auto_increment,
`name` varchar(20) not null comment '名称',
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
insert into team(name) 
values('一班'),
('二班');

create table stu7(
`id` bigint(20) auto_increment,
`sno` bigint(20) not null,
`name` varchar(20) not null,
`sex` tinyint(1) not null default 0 comment '性别：1-男：2-女',
`team_id` bigint(20) not null,
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
insert into stu7(sno,name,sex,team_id) values(20181912890,'李宁',1,10000);
insert into stu7(sno,name,sex,team_id) values(20181912891,'王佳悦',0,10001);
insert into stu7(sno,name,sex,team_id) values(20181912892,'安清',1,10001);
insert into stu7(sno,name,sex,team_id) values(20181912893,'路经纬',1,10000);
insert into stu7(sno,name,sex,team_id) values(20181912894,'楚楚',1,10000);
insert into stu7(sno,name,sex,team_id) values(20181912895,'琪琪',0,10001);
insert into stu7(sno,name,sex,team_id) values(20181912896,'金凤',0,10001);
insert into stu7(sno,name,sex,team_id) values(20181912897,'顾燃',1,10000);
insert into stu7(sno,name,sex,team_id) values(20181912898,'陆运',1,10001);
insert into stu7(sno,name,sex,team_id) values(20181912899,'田露',0,10000);


create table course7(
`id` bigint(20) auto_increment,
`cno` bigint(20) not null COMMENT '课程号',
`name` varchar(20)  not null COMMENT '课程名',
`type` tinyint(1) not null COMMENT '选修-1：必修-0', 
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
insert into course7(cno,name,type) values(1230,'语文',1),
(1231,'数学',0),
(1232,'英语',0);


create table score7(
`id` bigint(20) auto_increment,
`sno` bigint(20) not null,
`cno` bigint(20) not null,
`score` int(20) not null,
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
insert into score7(sno,cno,score) 
values(20181912890,1230,65),
(20181912890,1231,68),
(20181912890,1232,78),

(20181912891,1230,34),
(20181912891,1231,68),
(20181912891,1232,76),

(20181912892,1230,86),
(20181912892,1231,68),
(20181912892,1232,74),

(20181912893,1230,87),
(20181912893,1231,65),
(20181912893,1232,95),

(20181912894,1230,63),
(20181912894,1231,63),
(20181912894,1232,75),

(20181912895,1230,65),
(20181912895,1231,77),
(20181912895,1232,88),

(20181912896,1230,85),
(20181912896,1231,97),
(20181912896,1232,88),

(20181912897,1230,76),
(20181912897,1231,77),
(20181912897,1232,80),

(20181912898,1230,77),
(20181912898,1231,87),
(20181912898,1232,90),

(20181912899,1230,81),
(20181912899,1231,87),
(20181912899,1232,98);


-- 修改录入错误的学生姓名、学生成绩
update stu7 set name='王佳悦'where name='王家悦';
update stu7 set name='安清' where name='安庆';
update stu7 set name='陆羽' where name='陆运';
update score7 set score=49 where id=10000;
update score7 set score=87 where id=10020;
update score7 set score=78 where id=10027;

-- 统计每门课的学生人数；2种
select count(cno) from score7 where cno=1230;
select count(cno) from course7 where cno=1231;
select count(cno) from course7 where cno=1232;

select cno,count(cno) from score7 GROUP BY cno;

-- 查询某一门课程不及格的学生信息；2种
select stu7.* from score7 ,stu7
where score7.sno=stu7.sno and score7.cno=1230 and score7.score<60;
-- 或者
SELECT *from stu7 WHERE sno in (SELECT  sno from score7 where cno=1230 and score<60);


-- 查询某一个学生的各科成绩    3种
select cno,score from score7,stu7 where score7.sno=stu7.sno and name='李宁';
select cno,score from score7 where sno=20181912890; 
select cno,score from score7 where sno in(select sno from stu7  where name='李宁');

-- 查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
select SUM(score),stu7.team_id from score7 left join stu7 on stu7.sno=score7.sno 
group by team_id ORDER BY sum(score) DESC;

select sum(score7.score),stu7.sno from score7 left join stu7 on stu7.sno=score7.sno
where stu7.team_id=10000 group by sno order by sum(score) desc;

select sum(score7.score),stu7.sno from score7 left join stu7 on stu7.sno=score7.sno
where stu7.team_id=10001 group by sno order by sum(score) desc;

select * from score7 right join stu7 on score7.sno=stu7.sno; 


-- 查询每门课都大于80分的学生信息；
select * from stu7
 where sno in(select score7.sno from score7 
left join course7
 on course7.cno=score7.cno
group by score7.sno 
having min(score7.score)>=80);

-- 查询至少有一门课程不及格的学生信息；
select stu7.* from score7,stu7 where score7.sno=stu7.sno and score<60;

select * from stu7 where sno in(select sno from score7 where score<60);
-- 查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序；
select avg(score),team_id from score7 LEFT JOIN stu7 on score7.sno=stu7.sno where cno=1230
GROUP BY team_id ORDER BY avg(score) desc;
  

-- 查询各科成绩最高分、最低分和平均分
SELECT min(score),max(score),avg(score),cno from score7
GROUP BY score7.cno;
