CREATE TABLE IF NOT EXISTS `student_grade`(
    `id` int(20) not null ,
    `student_id` varchar(8) CHARACTER SET utf8mb4 NOT NULL COMMENT '学号',
    `cno` varchar(10) not null comment '课号',
    `stu_name` varchar(50) CHARACTER SET utf8mb4 NOT NULL,
    `chinese_grade` tinyint(4) not null,
    `math_grade` tinyint(4) not null,
    `english_grade` tinyint(4) not null,
    PRIMARY KEY (`id`)
);
alter table student_grade add `is_compulsory` tinyint UNSIGNED NOT NULL COMMENT '是否为选修课 0代表选修课 1代表必修课';
select 
insert into  `student_grade`(id,student_id,cno,stu_name,)