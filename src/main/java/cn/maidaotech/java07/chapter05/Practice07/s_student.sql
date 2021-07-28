CREATE TABLE IF NOT EXISTS `s_student`(
    `id` int(20) NOT NULL AUTO_INCREMENT,
    `student_id` varchar(8) CHARACTER SET utf8mb4 NOT NULL COMMENT '学号',
    `name` varchar(50)  CHARACTER SET utf8mb4 NOT NULL,
    PRIMARY KEY (`id`)
)ENGINE=InnoDB  DEFAULT CHARSET=utf8;
alter table s_student add cno varchar(10) not null comment '课号';
alter table s_student add class_id varchar(10) character set utf8mb4 not null  comment '班号';
alter table s_student modify id int(20) not null AUTO_INCREMENT;
alter table s_student drop cno;

delete from s_student ;
#init
insert into s_student (student_id,name,class_id) values 
    ('20190101','张三','19级01班'),
    ('20190102','李四','19级01班'),
    ('20190103','鸣人','19级01班'),
    ('20190104','王五','19级01班'),
    ('20190105','赵六','19级01班'),
    ('20190201','二一','19级02班'),
    ('20190202','二二','19级02班'),
    ('20190203','二三','19级02班'),
    ('20190204','二四','19级02班'),
    ('20190205','二五','19级02班');
select * from s_student ;

update s_student set name ='张洪磊' where name = '张三';