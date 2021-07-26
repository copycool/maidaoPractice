CREATE TABLE IF NOT EXISTS `s_student`(
    `id` int(20) NOT NULL AUTO_INCREMENT,
    `student_id` varchar(8) CHARACTER SET utf8mb4 NOT NULL COMMENT '学号',
    `name` varchar(50)  CHARACTER SET utf8mb4 NOT NULL,
    PRIMARY KEY (`id`)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;
alter table s_student drop class;
alter table s_student modify id int(20) not null AUTO_INCREMENT;

#init
insert into s_student (student_id,name) values 
    ('20190101','张三'),
    ('20190102','李四'),
    ('20190103','鸣人'),
    ('20190104','王五'),
    ('20190105','赵六'),
    ('20190201','二一'),
    ('20190202','二二'),
    ('20190203','二三'),
    ('20190204','二四'),
    ('20190205','二五');

select * from s_student

