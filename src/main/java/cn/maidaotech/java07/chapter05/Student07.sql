设计一个大学生成绩系统使用的数据库表，要求至少涉及学生信息、班级信息、课程信息、成
绩信息等。

create table student(
`id` int(11) not null auto_increment,
`s_no` varchar(20) not null,
`sex` tinyint(1) not null default 0 comment '性别：1-男，2-女',  //枚举类型要指定默认值 default
`name` varchar(20) not null COMMENT '姓名',
`aclass_id` bigint(20) not null,
primary key (`id`)
);

insert into student(s_no,sex ,name ,aclass_id) VALUES('20181051',1,'Name',1801);
insert into student(s_no,sex ,name , aclass_id) VALUES('20181052',2,'Ann',1801);
insert into student(s_no,sex ,name , aclass_id) VALUES('20181053',1,'Monon',1801);
insert into student(s_no,sex ,name , aclass_id) VALUES('20181054',1,'Barry',1801);
insert into student(s_no,sex ,name , aclass_id) VALUES('20181055',2,'Lili',1801);
insert into student(s_no,sex ,name , aclass_id) VALUES('20181056',1,'Bob',1802);
insert into student(s_no,sex ,name , aclass_id) VALUES('20181057',2,'nana',1802);
insert into student(s_no,sex ,name , aclass_id) VALUES('20181058',1,'Barry',1802);
insert into student(s_no,sex ,name , aclass_id) VALUES('20181059',2,'Lucy',1802);
insert into student(s_no,sex ,name , aclass_id) VALUES('20181061',2,'Hardy',1802);



create table aclass(
`id` int (11) not null auto_increment,
`name` varchar(10) not null COMMENT '班级名称',
primary key (`id`)
);

insert into aclass(name) VALUES ('A班');
insert into aclass(name) VALUES ('B班');


create table course(
`id` int(11) not null auto_increment,
`c_no` varchar(10) not null COMMENT '课程编号',
`name` varchar(10) not null comment '课程名称',
`type` TINYINT(1) not NULL comment '1-必修，2-选修',            //0,1表示是否的概念
primary key (`id`)
);

INSERT into course(c_no,name,type) VALUES('1800001','java',1);
INSERT into course(c_no,name,type) VALUES('1800002','c语言',1);
INSERT into course(c_no,name,type) VALUES('1800003','前端',2);


create table score(
`id` int(11) not null auto_increment,
`studnt_id` bigint(20) not NULL,
`course_id` bigint(20) not NULL,
`score` int(11) not NULL,
primary key (`id`)
 );

 INSERT into score (student_id,course_id,score) 
 VALUES(1,1,89),
 (1,2,28),
 (1,3,10),

 (2,1,89),
 (2,2,28),
 (2,3,10),

 (3,1,89),
 (3,2,28),
 (3,3,10),

 (4,1,89),
 (4,2,28),
 (4,3,10),

 (5,1,89),
 (5,2,28),
 (5,3,10),

 (6,1,89),
 (6,2,28),
 (6,3,10),

 (7,1,89),
 (7,2,28),
 (7,3,10),

 (8,1,89),
 (8,2,28),
 (8,3,10),

 (9,1,89),
 (9,2,28),
 (9,3,10),

 (10,1,89),
 (10,2,28),
 (10,3,10);
