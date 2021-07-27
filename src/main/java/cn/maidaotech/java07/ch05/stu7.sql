-- 设计一个大学生成绩系统使用的数据库表，要求至少涉及学生信息、班级信息、
-- 课程信息、成绩信息等。要求：
-- 至少两个班级、每班不少于5人
-- 至少三个学科，有选修课、有必修课
-- 录入学生成绩要分布合理
create table stu7(
`id` bigint(20) auto_increment,
`stu_id` bigint(20),
`name` varchar(20),
`sex` tinyint(1),
`class` varchar(20),
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
insert into stu7(stu_id,name,sex,class) values(20181912890,'李宁',1,'1班');
insert into stu7(stu_id,name,sex,class) values(20181912891,'王家悦',0,'2班');
insert into stu7(stu_id,name,sex,class) values(20181912892,'安庆',1,'2班');
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
insert into score7() ;

alter TABLE score7 drop course
DELETE FROM score7 WHERE id BETWEEN 10018 and 10047





