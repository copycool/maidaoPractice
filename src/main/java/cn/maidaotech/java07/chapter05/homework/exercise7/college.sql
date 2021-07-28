-- 设计一个大学生成绩系统使用的数据库表，要求至少涉及学生信息、班级信息、课程信息、成绩信息等。
-- 学生表 学号 姓名 班级名 创建时间 修改时间
-- 成绩表 成绩id 学生id 课程id 成绩 创建时间 修改时间
-- 课程表 课程号 课程名  创建时间 修改时间
-- 班级表 班级id 班级名 班级人数 创建时间 修改时间



-- 要求：至少两个班级、每班不少于5人
-- 至少三个学科，有选修课、有必修课
-- 录入学生成绩要分布合理，


create table if not exists student7(
`id` int(11) not null auto_increment comment '学生id',
`sno` varchar(20) not null comment '学生学号',
`name` varchar(20) character set utf8mb4 not null comment '学生姓名',
`sex` tinyint(1) not null comment '学生性别0女1男',
`birthdate` bigint(20) comment '学生出生日期' ,
primary key (`id`)
)engine=InnoDB charset=utf8;

create table if not exists aclass(
 `id` int(11) not null auto_increment comment '班级id',
 `name` varchar(20) not null comment '班级名称',
 primary key(`id`)
 )engine=InnoDB charset=utf8;

  create table if not exists stu_cls(
 `id` int(11) not null auto_increment comment '学生班级id',
 `stu_id` int(11) not null comment '学生id',
 `cls_id` int(11) not null comment '班级id',
 primary key (`id`) 
 )engine=InnoDB charset=utf8;

  create table if not exists course(
  `id` int(11) not null auto_increment comment '课程id',
	`cno` varchar(20) not null comment '课程号',
	`name` varchar(20) not null comment '课程名称',
	primary key(`id`)
 )engine = INNODB charset=utf8;
 
  create table if not exists exam(
  `id` int(11) not null auto_increment comment '考试id',
  `cls_id` int(11) not null comment '班级id',
  `cou_id` int(11) not null comment '课程id',
	primary key (`id`)
 )engine = innodb charset=utf8;

 create table if not exists score(
 `id` int(11) not null auto_increment comment '成绩id',
 `exam_id` int(11) not null comment '考试id',
 `score` int(11) not null comment '成绩',
 `st_id` int(11) not null comment '学生id',
  primary key (`id`)
 )engine = innodb charset=utf8;

 create table if not exists `cls_course`(
 `id` int(11) not null auto_increment comment '班级课程id',
 `cls_id` int(11) not null comment '班级id',
 `cou_id`int(11) not null comment '课程id',
 `type` tinyint(1) not null comment '课程类型0必修功1选修课',
 primary key(`id`)
  )engine=Innodb charset=utf8;

   create table if not exists `stu_course`(
 `id` int(11) not null auto_increment comment '学生课程id',
 `stu_id` int(11) not null comment '学生id',
 `cou_id` int(11) not null comment '课程id',
 `type` tinyint(1) not null comment '课程类型0必修课1选修课',
 primary key (`id`)
 )engine=Innodb charset=utf8;
 
  
  select * from student7;
 
 insert into student7(sno,name,sex,birthdate) values('20181901','陈佳楠',0,1611086496);

 insert into student7(sno,name,sex,birthdate) values('20181902','陈佳楠1',0,1611086496);
 insert into student7(sno,name,sex,birthdate) values('20181903','陈佳楠2',0,1611086496);
 insert into student7(sno,name,sex,birthdate) values('20181904','陈佳楠3',0,1611086496);
 insert into student7(sno,name,sex,birthdate) values('20181905','陈佳楠4',0,1611086496);
 insert into student7(sno,name,sex,birthdate) values('20181906','陈佳楠5',0,1611086496);
 insert into student7(sno,name,sex,birthdate) values('20181907','陈佳楠6',0,1611086496);
 insert into student7(sno,name,sex,birthdate) values('20181906','陈佳楠9',0,1611086496);
 insert into student7(sno,name,sex,birthdate) values('20181907','陈佳楠10',0,1611086496);
 
 
 update student7 set sno='201819010' where id=10;
 
 insert into aclass(name)values('软工移183');
 insert into aclass(name)values('软工移184');
 select * from aclass;
 
 insert into stu_cls(stu_id,cls_id)values(1,2);
 
insert into stu_cls(stu_id,cls_id)values(2,2);
insert into stu_cls(stu_id,cls_id)values(3,2);
insert into stu_cls(stu_id,cls_id)values(4,2);
insert into stu_cls(stu_id,cls_id)values(5,1);
insert into stu_cls(stu_id,cls_id)values(6,1);
insert into stu_cls(stu_id,cls_id)values(7,1);
insert into stu_cls(stu_id,cls_id)values(8,1);
insert into stu_cls(stu_id,cls_id)values(9,2);
insert into stu_cls(stu_id,cls_id)values(10,1);
				
 select * from stu_cls;
 
 
 insert into course(cno,name)values('001','软件工程');
 insert into course(cno,name)values('002','数据结构');
 insert into course(cno,name)values('003','数学建模');
 
 select * from course;
 
 insert into exam(cls_id,cou_id)values(1,2);
 insert into exam(cls_id,cou_id)values(2,1);
 insert into exam(cls_id,cou_id)values(2,3);
 select * from exam;
 
 
insert into cls_course(cls_id,cou_id,type) values(1,2,0);
insert into cls_course(cls_id,cou_id,type) values(2,1,0);
insert into cls_course(cls_id,cou_id,type) values(2,3,1);
select * from cls_course;



insert into stu_course(stu_id,cou_id,type)values(1,1,0);
insert into stu_course(stu_id,cou_id,type)values(2,1,0);
insert into stu_course(stu_id,cou_id,type)values(3,1,0);
insert into stu_course(stu_id,cou_id,type)values(4,1,0);

insert into stu_course(stu_id,cou_id,type)values(1,3,1);
insert into stu_course(stu_id,cou_id,type)values(2,3,1);
insert into stu_course(stu_id,cou_id,type)values(3,3,1);
insert into stu_course(stu_id,cou_id,type)values(4,3,1);

insert into stu_course(stu_id,cou_id,type)values(5,2,0);
insert into stu_course(stu_id,cou_id,type)values(6,2,0);
insert into stu_course(stu_id,cou_id,type)values(7,2,0);
insert into stu_course(stu_id,cou_id,type)values(8,2,0);
insert into stu_course(stu_id,cou_id,type)values(9,1,0);
insert into stu_course(stu_id,cou_id,type)values(9,3,1);
insert into stu_course(stu_id,cou_id,type)values(10,2,0);


select * from stu_course;

insert into score(exam_id,score,st_id)values(1,95,5);
insert into score(exam_id,score,st_id)values(1,85,6);
insert into score(exam_id,score,st_id)values(1,80,7);
insert into score(exam_id,score,st_id)values(1,91,8);
insert into score(exam_id,score,st_id)values(1,79,10);


insert into score(exam_id,score,st_id)values(2,86,1);
insert into score(exam_id,score,st_id)values(2,85,2);
insert into score(exam_id,score,st_id)values(2,80,3);
insert into score(exam_id,score,st_id)values(2,41,4);
insert into score(exam_id,score,st_id)values(2,59,9);

insert into score(exam_id,score,st_id)values(3,57,1);
insert into score(exam_id,score,st_id)values(3,80,2);
insert into score(exam_id,score,st_id)values(3,80,3);
insert into score(exam_id,score,st_id)values(3,91,4);
insert into score(exam_id,score,st_id)values(3,69,9);

select * from score;