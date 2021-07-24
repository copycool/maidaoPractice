CREATE TABLE IF NOT EXISTS `s_student`(
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `student_id` varchar(8) CHARACTER SET utf8mb4 NOT NULL COMMENT '学号',
    `name` varchar(50)  CHARACTER SET utf8mb4 NOT NULL,
    `class` varchar(20) CHARACTER SET utf8mb4 NOT NULL COMMENT '班级',
    #`is_compulsory` tinyint UNSIGNED NOT NULL COMMENT '是否为选修课 0代表选修课 1代表必修课',
    `chinese_score` int(3) NOT NULL COMMENT '语文成绩',
    `math_score` int(3) NOT NULL COMMENT '数学成绩',
    `english_score` int(3) NOT NULL COMMENT '英语成绩',
    PRIMARY KEY (`id`)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;
alter table s_student drop is_compulsory


#init
insert into s_student (student_id,name,class,chinese_score,math_score,english_score) values 
    ('','张三','一班',60),
    ('李四','一班',70),
    ('王五','一班',80),
    ('李八','一班',75),
    ('赵四','一班',85),
    ('张六','二班',55),
    ('李七','二班',65),
    ('王九','二班',90),
    ('胡一','二班',65),
    ('尚田','二班',100);
select * from s_student

