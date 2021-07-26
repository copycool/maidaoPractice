设计一个大学生成绩系统使用的数据库表，要求至少涉及学生信息、班级信息、课程信息、成
绩信息等。

create table student(
`id` int(11) not null auto_increment,
`s_no` varchar(20) not null,
`sex` tinyint(1) not null,
`name` varchar(20) not null,
primary key (`id`)
);

create table aclass(
`id` int (11) not null auto_increment,
`cls_no` int(20) not null,
primary key (`id`)
);

create table course(
`id` int(11) not null auto_increment,
`c_no` int(10) not null,
`name` varchar(10) not null,
primary key (`id`)
);

create table score(
`id` int(11) not null auto_increment,
`Math_score` int(100) not NULL,
`Ch_score` int(100) not NULL,
`En_score` int(100) not NULL,
`sport_score` int(100) not NULL,
`s_no` varchar(20) not null,
primary key (`id`)
 );

向各表中插入数据

insert into student(id,s_no,sex,name) values (001,'1801',0,'Nana');
insert into student(id,s_no,sex,name) values (002,'1802',0,'Lili');
insert into student(id,s_no,sex,name) values (003,'1803',1,'Bob');
insert into student(id,s_no,sex,name) values (004,'1804',1,'Barry');
insert into student(id,s_no,sex,name) values (005,'1805',0,'Ann');
insert into student(id,s_no,sex,name) values (006,'1806',0,'Daphne');
insert into student(id,s_no,sex,name) values (007,'1807',0,'Lucy');
insert into student(id,s_no,sex,name) values (008,'1808',1,'Hardy');
insert into student(id,s_no,sex,name) values (009,'1809',1,'Abedin');
insert into student(id,s_no,sex,name) values (0010,'1810',1,'Monon');

insert into aclass(cls_no) values (1801);
insert into aclass(cls_no) values (1802);

insert into course (c_no,name) values (01,'语文'); 
insert into course (c_no,name) values (02,'数学'); 
insert into course (c_no,name) values (03,'英语'); 
insert into course (c_no,name) values (09,'体育'); 

insert into score (Ch_score,s_no,Math_score,En_score,sport_score) values(78,'1801',45,78,34);
insert into score (Ch_score,s_no,Math_score,En_score,sport_score) values(90,'1802',56,89,22);
insert into score (Ch_score,s_no,Math_score,En_score,sport_score) values(45,'1803',44,78,98);
insert into score (Ch_score,s_no,Math_score,En_score,sport_score) values(77,'1804',34,12,66);
insert into score (Ch_score,s_no,Math_score,En_score,sport_score) values(99,'1805',67,34,78);
insert into score (Ch_score,s_no,Math_score,En_score,sport_score) values(56,'1806',89,82,75);
insert into score (Ch_score,s_no,Math_score,En_score,sport_score) values(92,'1807',82,40,27);
insert into score (Ch_score,s_no,Math_score,En_score,sport_score) values(82,'1808',19,40,28);
insert into score (Ch_score,s_no,Math_score,En_score,sport_score) values(94,'1809',45,87,46);
insert into score (Ch_score,s_no,Math_score,En_score,sport_score) values(23,'1810',39,10,68);


创建关联表

学生班级关联表
CREATE TABLE stu_class(
`id` int(100) not null auto_increment,
`stu_id` int(11) not null,
`cls_id` int(11) not null,
PRIMARY key (id) 
);

INSERT INTO stu_class(`stu_id`,`cls_id`) VALUES(1,1);
INSERT INTO stu_class(`stu_id`,`cls_id`) VALUES(2,1);
INSERT INTO stu_class(`stu_id`,`cls_id`) VALUES(3,1);
INSERT INTO stu_class(`stu_id`,`cls_id`) VALUES(4,1);
INSERT INTO stu_class(`stu_id`,`cls_id`) VALUES(5,1);
INSERT INTO stu_class(`stu_id`,`cls_id`) VALUES(6,2);
INSERT INTO stu_class(`stu_id`,`cls_id`) VALUES(7,2);
INSERT INTO stu_class(`stu_id`,`cls_id`) VALUES(8,2);
INSERT INTO stu_class(`stu_id`,`cls_id`) VALUES(9,2);
INSERT INTO stu_class(`stu_id`,`cls_id`) VALUES(10,2);

班级课程管理表
CREATE TABLE cla_course(
`id` int(100) not null auto_increment,
`cls_id` int(11) not null,
`course_id` int(11) not null,
PRIMARY key (id) 
);

INSERT INTO cla_course(cls_id,course_id) VALUES(1,1);
INSERT INTO cla_course(cls_id,course_id) VALUES(1,2);
INSERT INTO cla_course(cls_id,course_id) VALUES(1,3);
INSERT INTO cla_course(cls_id,course_id) VALUES(1,4);
INSERT INTO cla_course(cls_id,course_id) VALUES(2,1);
INSERT INTO cla_course(cls_id,course_id) VALUES(2,2);
INSERT INTO cla_course(cls_id,course_id) VALUES(2,3);
INSERT INTO cla_course(cls_id,course_id) VALUES(2,4);
