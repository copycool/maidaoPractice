insert into  student (first_name,last_name,sex,school)  values 
('A','im','女','迈道'),
('a','ncle','男','迈道'),
('k','im','女','迈道'),
('j','ncle','男','迈道'),
('Angela','Peter','女','迈道'),
('Tom','Peter','女','迈道'),
('Peter','Tom','男','迈道');
update student SET first_name='j' where id=13;
insert into  student (first_name,last_name,sex,school)  values
('xnzfasdge','htffeadr','女','迈道')
select * from student
/*a.如何从表中选取first_name列的值以"a"开头的所有记录？*/
select * from student where first_name like 'a%'; 
/*如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录？*/
select * from student where first_name='Tom' and  last_name='Peter';
/*如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录？*/
select * from student where first_name between 'Angela' and 'Peter';
/*哪条SQL语句可返回唯一不同的值？DISTINCT*/
select distinct first_name from student ;
/*如何根据first_name列降序地从表中返回所有记录？*/
select * from student order by first_name desc;
/*只返回前十条记录呢？*/
select * from student  limit 0,10;
select * from student  limit 10,10;
select * from student where id between 10 and 20
/*第11到20条记录呢？*/
select * from student where id between 20 and 30
/*如何向表中插入新的记录？*/
insert into  student (first_name,last_name,sex,school)  values
('gnzdge','hfeadr','男','迈道')
/*如何向表中的last_name列插入Wilson？*/
insert into student (last_name) values ('Wilson');
#h
update student SET last_name='Wilson' WHERE last_name='Peter'
#i
select * from student where first_name='Angela'
delete from student where first_name='Angela';
#j
select count(*) from student
#k
alter table student add age bigint not null default 0 comment '年龄';
#l
delete from student where id=32
alter table student modify first_name varchar(50) not null 
#m
alter table student drop age
#n
select concat(first_name ,' ',last_name) from student 
CREATE TABLE IF NOT EXISTS `persion`(
    `id` bigint(20)  NOT NULL AUTO_INCREMENT,
    `name` varchar(80)  NOT NULL,
    PRIMARY KEY (`id`)
)
insert into `persion`(`id`,`name`) select id, concat(first_name ,' ',last_name) from student 
select * from persion