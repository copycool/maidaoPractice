/* 创建一张学生表 student，其中有字段 id、first_name、last_name、sex、school 等列，其中 id 为 
自增主键，通过 SQL 完成以下操作： 
a. 
如何从表中选取 first_name 列的值以"a"开头的所有记录？ 
b. 
如何从表中选择 first_name 等于 Tom 而且 last_name 等于 Peter 的所有记录？ 
c. 
如何按字母顺序从表中选取 first_name 介于 Angela 和 Peter 的所有记录？ 
d. 
哪条 SQL 语句可返回唯一不同的值？ 
i. 
SELECT 
DIFFERENT 
ii. 
SELECT 
DISTINCT 
iii. 
SELECT 
UNIQUE 
e. 
如何根据 first_name 列降序地从表中返回所有记录？只返回前十条记录呢？第 
11 到 20 条记录呢？ 
f. 
如何向表中插入新的记录？ 
g. 
如何向表中的 last_name 列插入 Wilson？ 
h. 
如何把表中 last_name 列的 Peter 改为 Wilson？ 
i. 
如何在表中删除 first_name 等于 Angela 的记录？ 
j. 
如何返回表中记录的数目？ 
k. 
如何在已存在的 student 表中增加一列名为 age 表示年龄的列？ 
l. 
如何修改 first_name 列的字符长度为 50 且不允许 NULL 值？ 
m. 
如何删除表中的 age 列？ 
n. 
如何从将表中所有数据的first_name和 last_name以空格连接合并存入另外一张表persion 
中？ */

CREATE TABLE IF NOT EXISTS `student` (
     `id` bigint(20) NOT NULL AUTO_INCREMENT, 
     `first_name` VARCHAR (20) NOT NULL,
     `last_name` VARCHAR(20) NOT NULL,
     `sex`VARCHAR(10) NOT NULL,
     `school`VARCHAR(20) NOT NULL,
     PRIMARY KEY (`id`)
     ) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;

     insert into student(first_name,last_name,sex,school) 
     values('王','银胜','男','河南工程学院');
     insert into student(first_name,last_name,sex,school) 
     values('Angela','baby','女','河南工程学院');
     insert into student(first_name,last_name,sex,school) 
     values('Tom','Peter','男','河南工程学院');
     insert into student(first_name,last_name,sex,school) 
     values('amy','ann','女','河南工程学院');
     insert into student(first_name,last_name,sex,school) 
     values('Peter','harry','男','河南工程学院');

     SELECT * from student where first_name like 'a%';
     SELECT * from student where first_name ='tom' and last_name='peter';
    SELECT * from student where  first_name  BETWEEN  'Angela'  AND   'Peter';
    SELECT * from student order by first_name desc;
    insert into student(first_name,last_name,sex,school) 
     values('张','小丽','女','河南工程学院');
     insert into student(first_name,last_name,sex,school) 
     values('dali','wilson','男','河南工程学院');
     update student SET last_name = 'Wilson' where last_name = 'Peter';
     delete FROM student where first_name = 'Angela';
     SELECT * FROM student limit 0,5;
     alter table student add age INT NOT null;
     alter TABLE student modify first_name varchar(50);
     alter TABLE student DROP age;

     CREATE TABLE IF NOT EXISTS `presion` (
     `id` bigint(20) NOT NULL AUTO_INCREMENT, 
     `name` VARCHAR (20) NOT NULL,
     PRIMARY KEY (`id`)
     ) ENGINE=InnoDB AUTO_INCREMENT=0 DEFAULT CHARSET=utf8;
    
     insert into presion name;
     select concat(last_name ," " , first_name )as name from student;