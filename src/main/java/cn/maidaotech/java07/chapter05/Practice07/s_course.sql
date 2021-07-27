CREATE TABLE IF NOT EXISTS `s_course`(
    `id` int(20) not null auto_increment,
    `cno` varchar(10) not null comment '课号',
    `course_name` varchar(30) not null,
    `is_compulsory` tinyint UNSIGNED NOT NULL COMMENT '是否为选修课 0代表选修课 1代表必修课',
    primary key (`id`)
)

select * from s_course ;
alter table s_course add cno varchar(10) not null comment '课号';
delete from s_course;
insert into s_course (cno,course_name,is_compulsory) values
('1001','语文',0),
('1002','数学',1),
('1003','英语',1);

select * from s_course;