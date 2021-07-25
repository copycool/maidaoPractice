-- 创建一张学生表student，其中有字段id、first_name、last_name、sex、school等列，其中id为自增主键，通过SQL完成以下操作：
-- 如何从表中选取first_name列的值以"a"开头的所有记录？
-- 如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录？
-- 如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录？
-- 哪条SQL语句可返回唯一不同的值？
-- SELECT DIFFERENT
-- SELECT DISTINCT
-- SELECT UNIQUE
-- 如何根据first_name列降序地从表中返回所有记录？
-- 只返回前十条记录呢？第11到20条记录呢？
-- 如何向表中插入新的记录？
-- 如何向表中的last_name列插入Wilson？
-- 如何把表中last_name列的Peter改为Wilson？
-- 如何在表中删除first_name等于Angela的记录？
-- 如何返回表中记录的数目？
-- 如何在已存在的student表中增加一列名为age表示年龄的列？
-- 如何修改first_name列的字符长度为50且不允许NULL值？
-- 如何删除表中的age列？
-- 如何从将表中所有数据的first_name和last_name以空格连接合并存入另外一张表persion中？

create table if not EXISTS `student`(
`id`  bigint(20) not null auto_increment,
`first_name`  varchar(30)  character set utf8mb4 default null comment '名',
`last_name`  varchar(30) character set utf8mb4  default null comment '姓',
`sex` tinyint(2)  comment '性别',
`school` varchar(30) comment '学校',
primary key (`id`)
)engine=InnoDB default charset=utf8;

insert into student(first_name,last_name,sex,school)
values('dTome','nTom',0,'中原工学院');
insert into student(first_name,last_name,sex,school)
values('bTome','aPeter',1,'12345');
insert into student(first_name,last_name,sex,school) 
values('cTome','aPeter',1,'12345');
insert into student(first_name,last_name,sex,school)
values('bTome','Peter',1,'12345');
insert into student(first_name,last_name,sex,school)
values('angela','Peter',0,'12345');
insert into student(first_name,last_name,sex,school)
values('bTome','Peter',0,'12345');
insert into student(first_name,last_name,sex,school)
values('aTome','Peter',1,'12345');

select * from student where `first_name` like 'a%';

select * from student where `first_name`='Tome' and `last_name`='Peter';

select * from student where `first_name`>'angela' and `first_name`<'Peter'  order by `first_name`;

select distinct `last_name` from student;

select * from student order by `first_name` desc;

select * from student order by `first_name` desc limit 0,10;

select * from student order by `first_name` desc limit 10,10;

insert into student(first_name,last_name,sex,school)
values('aTome','Peter',1,'12345');

insert into student(last_name) values ('Wilson');

update student set last_name='Wilson' where last_name='Peter';

delete from student where first_name='angela';

select count(*) count from student;

alter table student add `age` tinyint(1) unsigned comment '年龄';

alter table student modify first_name varchar(50);

alter table student drop age;