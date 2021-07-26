CREATE TABLE IF NOT EXISTS `s_class` (
    `id` int(20) not null auto_increment,
    `class_id` varchar(10) character set utf8mb4 not null  comment '班号',
    `class_name` varchar(20) character set utf8mb4 not null,
    primary key (`id`)
)
alter table s_class change classid class_id varchar(10) not null comment '班号';
alter table s_class change classname class_name varchar(20) character set utf8mb4 not null;

insert into s_class (class_id,class_name) values 
    ('19级01班','软工一班'),
    ('19级02班','软工二班');
select * from s_class;