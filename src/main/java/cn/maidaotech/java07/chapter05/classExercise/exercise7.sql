
create table if not exists student77(
`id` bigint(11) not null auto_increment comment '学生id',
`sno` varchar(20) not null comment '学生学号',
`name` varchar(20) character set utf8mb4 default null comment '学生姓名',
`sex` tinyint(1) not null comment '学生性别0女1男',
`birthdate` bigint(20) comment '学生出生日期' ,
`aclass_id` int(11) not null comment '班级id',--在加上班级的id
primary key (`id`)
)engine=InnoDB auto_increment=10000 charset=utf8;

create table if not exists term77(
 `id` bigint(11) not null auto_increment comment '班级id',
 `name` varchar(20) not null comment '班级名称',
 primary key(`id`)
 )engine=InnoDB auto_increment=10000 charset=utf8;

   create table if not exists course77(
  `id` bigint(11) not null auto_increment comment '课程id',
  `no` varchar(20) not null comment '课程号',
  `name` varchar(20) not null comment '课程名称',
  `type` tinyint(1) not null comment '课程类型',
	primary key (`id`)
 )engine = innodb auto_increment=10000 charset=utf8;

 create table if not exists score77(
    `id` bigint(11) not null auto_increment comment '成绩id' ,
    `student_id` bigint(20) not null comment '学生id',
    `course_id` bigint(20) not null comment '课程id',
    `score` int(11) comment '成绩'
     primary key (`id`)
 )engine = innodb auto_increment=10000 charset=utf8;


 insert into `trem77`(`name`) values('软件工程');
 insert into `trem77`(`name`) values('计算机科学与技术');

insert into `sudent77`(`sno`,`name`,`sex`,`team_id`)values('20190123','cjn1',1,1000); 
insert into `sudent77`(`sno`,`name`,`sex`,`team_id`)values('20190124','cjn2',2,1000); 
insert into `sudent77`(`sno`,`name`,`sex`,`team_id`)values('20190125','cjn3',1,1000); 
insert into `sudent77`(`sno`,`name`,`sex`,`team_id`)values('20190126','cjn4',1,1000); 
insert into `sudent77`(`sno`,`name`,`sex`,`team_id`)values('20190127','cjn5',2,1000); 



insert into `sudent77`(`sno`,`name`,`sex`,`team_id`)values('20190223','ccjn1',1,1001); 
insert into `sudent77`(`sno`,`name`,`sex`,`team_id`)values('20190224','ccjn2',1,1001); 
insert into `sudent77`(`sno`,`name`,`sex`,`team_id`)values('20190225','ccjn3',2,1001); 
insert into `sudent77`(`sno`,`name`,`sex`,`team_id`)values('20190226','ccjn4',1,1001); 
insert into `sudent77`(`sno`,`name`,`sex`,`team_id`)values('20190227','ccjn5',2,1001); 



insert into `course77`(serial,name,type)values('1234567','C语言',1),('1234568','Java',2),('1234569','数据结构',1);

insert into score77(student_id,course_id,score)
values(10000,10000,89),
(10000,10001,99),
(10000,10002,79),

(10001,10000,59),

(10001,10002,75),

(10002,10000,89),
(10002,10001,58),
(10002,10002,85),

(10003,10000,89),
(10003,10001,91),
(10003,10002,86),

(10004,10000,32),
(10004,10002,88),

(10005,10000,75),
(10005,10001,99),
(10005,10002,79),

(10006,10000,89),
(10006,10001,98),
(10006,10002,69),

(10007,10000,89),

(10007,10002,82),

(10008,10000,90),

(10008,10002,86),

(10009,10000,95),
(10009,10001,90),
(10009,10002,82);
