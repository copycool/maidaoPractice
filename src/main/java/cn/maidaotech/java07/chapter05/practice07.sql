create table `team`(
`id` bigint(20) auto_increment,
`name` varchar(50) not null comment '名称',
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
insert into `team`(`name`) values('软件工程');
insert into `team`(`name`) values('计算机科学与技术');

create table student(
`id` bigint(20) auto_increment,
`sno` bigint(20) not null comment '学号',
`name` varchar(50) not null comment '姓名',
`sex` tinyint(1) not null default 0 comment '性别：1-男；2-女',
`team_id` bigint(20),
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
insert into `student`(`sno`,`name`,`sex`,`team_id`) values('20190123','张1',1,10000);
insert into `student`(`sno`,`name`,`sex`,`team_id`) values('20190124','张2',1,10000);
insert into `student`(`sno`,`name`,`sex`,`team_id`) values('20190125','张3',1,10000);
insert into `student`(`sno`,`name`,`sex`,`team_id`) values('20190126','张4',2,10000);
insert into `student`(`sno`,`name`,`sex`,`team_id`) values('20190127','张5',2,10000);
insert into `student`(`sno`,`name`,`sex`,`team_id`) values('20190223','王1',1,10001);
insert into `student`(`sno`,`name`,`sex`,`team_id`) values('20190224','王2',1,10001);
insert into `student`(`sno`,`name`,`sex`,`team_id`) values('20190225','王3',1,10001);
insert into `student`(`sno`,`name`,`sex`,`team_id`) values('20190226','王4',2,10001);
insert into `student`(`sno`,`name`,`sex`,`team_id`) values('20190227','王5',2,10001);

create table course(
`id` bigint(20) auto_increment,
`serial` bigint(20) not null comment '课程编号',
`name` varchar(20) not null comment '课程名称',
`type` tinyint(4) not null comment '1-必修；2-选修',
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

insert into course(serial,name,type) values('1234567','C语言',1),
('1234555','Java',2),
('1234588','数据结构',1);

create table score(
`id` bigint(20) auto_increment,
`student_id` bigint(20) not null,
`course_id` bigint(20) not null,
`score` int(11) not null,
primary key (`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

insert into score (student_id,course_id,score) 
values(10000,10000,89),
(10000,10001,99),
(10000,10002,77),
(10001,10000,59),
(10001,10001,65),
(10001,10002,77),
(10002,10000,78),
(10002,10001,90),
(10002,10002,65),
(10003,10000,78),
(10003,10001,90),
(10003,10002,62),
(10004,10000,79),
(10004,10001,90),
(10004,10002,85),
(10005,10000,78),
(10005,10002,65),
(10006,10000,60),
(10006,10002,65),
(10007,10000,60),
(10007,10001,90),
(10007,10002,65),
(10008,10000,78),
(10008,10001,88),
(10008,10002,65),
(10009,10000,55),
(10009,10002,34);

