-- 创建一张学生表student，其中有字段id、first_name、last_name、sex、school等列，
-- 其中id为自增主键，通过SQL完成以下操作：
mysql> create table student(
    `id` bigint(30) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(30) not null,
    `last_name` varchar(30) not null,
    `sex` tinyint(1) not null,
    `school` varchar(30) not null,
);
mysql> insert into student(id,first_name,last_name,sex,school) values(1,'Angela','Martin',0,'北京大学');

mysql> insert into student(id,first_name,last_name,sex,school) values(2,'Tom','Peter',1,'清华大学');

mysql> insert into student(id,first_name,last_name,sex,school) values(3,'Peter','Martin',1,'清华大学');


-- 如何从表中选取first_name列的值以"a"开头的所有记录？
mysql> select first_name from student where first_name like 'a%';


-- 如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录？
mysql> select * from student where first_name='Tom' and last_name='Peter';

-- 如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录？
mysql> select first_name from student where first_name between 'Angela' and 'Peter' order by first_name ASC;

-- 哪条SQL语句可返回唯一不同的值？
SELECT DIFFERENT  仅返回不同的值
SELECT DISTINCT   返回唯一不同的值
SELECT UNIQUE   同distinct

-- 如何根据first_name列降序地从表中返回所有记录？只返回前十条记录呢？第11到20条记录呢？
-- 升序：asc  降序：desc
mysql> select * from student order by first_name desc;
mysql> select * from student limit 0,10;
mysql> select * from student limit 11,20;


-- 如何向表中插入新的记录？
mysql> insert into student(id,first_name,last_name,sex,school) values(4,'Michle','Wilson',1,'中南大学');

-- -如何向表中的last_name列插入Eason？
mysql> insert into student(id,first_name,last_name,sex,school) values(5,'John','Eason',1,'东京大学');

-- 如何把表中last_name列的Peter改为Wilson？
mysql> update student set last_name='Wilson' where last_name='Peter';


-- 如何在表中删除first_name等于Angela的记录？
mysql>  delete from student where first_name='Angela';

-- 如何返回表中记录的数目？
mysql> select * from student;

-- 如何在已存在的student表中增加一列名为age表示年龄的列？添加字段：alter命令,add子句
mysql> alter table student add age int not null ;

-- 如何修改first_name列的字符长度为50且不允许NULL值？修改字段：使用change(列出原列名和新列名）或者modify（只需指明字段名）
mysql> alter table student modify/change first_name varchar(50) not null;
-- mysql> alter table student change first_name first_name varchar(50) not null;

-- 如何删除表中的age列？删除字段：alter命令,drop子句
mysql> alter table student drop age;


-- 如何从将表中所有数据的first_name和last_name以空格连接合并存入另外一张表persion中？
mysql> select concat(first_name,' ',last_name) from student as persion;