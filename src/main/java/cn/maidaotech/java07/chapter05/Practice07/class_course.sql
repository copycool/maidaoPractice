CREATE TABLE IF NOT EXISTS `class_course`(
    `id` int(20) not null auto_increment,
    `cno` varchar(10) not null ,
    `class_id` int(10) not null,
    primary key (`id`)
);

insert into class_course (cno,class_id) values
    ('1001',5),
    ('1002',5),
    ('1003',5),
    ('1001',6),
    ('1002',6),
    ('1003',6);
    
select * from class_course;