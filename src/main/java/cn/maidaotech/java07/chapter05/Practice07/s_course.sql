CREATE TABLE IF NOT EXISTS `s_course`(
    `id` int(20) not null auto_increment,
    `cno` varchar(10) not null comment '课号',
    `course_name` varchar(30) not null,
    `is_compulsory` tinyint UNSIGNED NOT NULL COMMENT '是否为选修课 0代表选修课 1代表必修课',
    primary key (`id`)
)

select * from s_course ;
alter table s_course  drop student_id;
insert into s_course (student_id) values
('20190101'),
('20190102'),
('20190103'),
('20190104'),
('20190105'),
('20190201'),
('20190202'),
('20190203'),
('20190204'),
('20190205')

insert into s_course (cno,course_name,is_compulsory) values
    ('1001','语文','0'),
    ('1002','数学','1'),
    ('1003','英语','1');

select * from s_course;