
创建一张学生表student，其中有字段id、first_name、last_name、sex、school等列，其中id为自增主键

create table student(
    `id` bigint(50) not null auto_increment,
    `first_name` varchar(30) not null,
    `last_name` varchar(30) not null,
    `sex` tinyint(1) not null,
    `school` varchar(50) nut null,
    peimary kay (`id`)
);

 insert into student (id,first_name,last_name,sex,school) values (001,'Ann','Erica',1,'西亚斯');
 insert into student (id,first_name,last_name,sex,school) values (002,'Lucy','Peter',0,'河南工程学院');
 insert into student (id,first_name,last_name,sex,school) values (003,'Tom','Peter',1,'郑州大学');
 insert into student (id,first_name,last_name,sex,school) values (004,'Angle','Mary',0,'郑州大学');
mysql> insert into student(id,first_name,last_name,sex,school) values (005,'Nana','Cyril',0,'清华大学');
Query OK, 1 row affected (0.04 sec)

mysql> insert into student(id,first_name,last_name,sex,school) values (006,'Martin','Li',1,'加里敦大学');
Query OK, 1 row affected (0.04 sec)

mysql> insert into student (id,first_name,last_name,sex,school) values(007,'Ethan','Hans',1,'厦门大学');
Query OK, 1 row affected (0.02 sec)

mysql> insert into student(id,first_name,last_name,sex,school) values (008,'Sum','Wu',1,'上海交通大学');
Query OK, 1 row affected (0.03 sec)

mysql> insert into student(id,first_name,last_name,sex,school) values (009,'Alice','Lili',0,'新乡医学院');
Query OK, 1 row affected (0.02 sec)

mysql> insert into student(id,first_name,last_name,sex,school) values (010,'Eve','Grace',0,'西亚斯学院');
Query OK, 1 row affected (0.02 sec)

mysql> insert into student(id,first_name,last_name,sex,school) values (011,'Eli','Bob',1,'石河子大学');
Query OK, 1 row affected (0.03 sec)

mysql> insert into student(id,first_name,last_name,sex,school) values (012,'Lan','Henry',0,'郑州大学');
Query OK, 1 row affected (0.03 sec)

mysql> insert into student (id,first_name,last_name,sex,school) values (013,'Tom','Peter',1,'郑州大学');
Query OK, 1 row affected (0.02 sec)

如何从表中选取first_name列的值以"a"开头的所有记录？
 select first_name from student where first_name like 'A%';

如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录？
 select first_name,last_name from student where first_name='Tom' and last_name = 'Peter';

如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录？
select first_name from student where first_name between 'Angle' and 'Peter'order by first_name ASC;

哪条SQL语句可返回唯一不同的值？SELECT DIFFERENT  SELECT DISTINCT  SELECT UNIQUE
select distinct 返回唯一不同的值
select different  仅返回不同的值 
select unique  同 distinct

如何根据first_name列降序地从表中返回所有记录？只返回前十条记录呢？第7到10条记录呢？
 select first_name from student order by first_name desc;
 select first_name from student where id <=10;
  select first_name from student where id >=7 and id<=10;

如何向表中插入新的记录？如何向表中的last_name列插入Wilson？ (not null)
 insert into student (id,first_name,last_name,sex,school) values(null,'numm','Wilson',null,'null');


如何把表中last_name列的Peter改为Wilson？
update student set last_name= 'wilsion' where last_name='Peter';

如何在表中删除first_name等于Angela的记录？
 delete from student where first_name='Angle';

如何返回表中记录的数目？
 select count(*) from student;

如何在已存在的student表中增加一列名为age表示年龄的列？
alter table student add `age` int(150) not null;

如何修改first_name列的字符长度为50且不允许NULL值？
alter table student modify first_name varchar(50) not null;

如何删除表中的age列？
alter table student drop age;

如何从将表中所有数据的first_name和last_name以空格连接合并存入另外一张表persion中？
select concat(first_name,' ' ,last_name) as person from student;