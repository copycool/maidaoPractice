/*
创建一张学生表student
其中有字段id、first_name、last_name、sex、school等列
其中id为自增主键，通过SQL完成以下操作：
如何从表中选取first_name列的值以"a"开头的所有记录？
如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录？
如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录？
哪条SQL语句可返回唯一不同的值？
SELECT DIFFERENT
SELECT DISTINCT
SELECT UNIQUE
如何根据first_name列降序地从表中返回所有记录？只返回前十条记录呢？第11到20条记录呢？
如何向表中插入新的记录？
如何向表中的last_name列插入Wilson？
如何把表中last_name列的Peter改为Wilson？
如何在表中删除first_name等于Angela的记录？
如何返回表中记录的数目？
如何在已存在的student表中增加一列名为age表示年龄的列？
如何修改first_name列的字符长度为50且不允许NULL值？如何删除表中的age列？
如何从将表中所有数据的first_name和last_name以空格连接合并存入另外一张表persion中*/
CREATE TABLE IF NOT EXISTS `student` (
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    'first_name' varchar(30) comment '姓',
    'last_name' varchar(30) comment '名',
    sex enum('男','女') not null,
    'school' varchar(30) comment '学校',
    PRIMARY KEY (`id`),
    )ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

    insert into student(first_name,last_name,sex,school)
    values('Tom','Peter','女'，'北');
    insert into student(first_name,last_name,sex,school)
    values('almom','Peter','女'，'北');
    insert into student(first_name,last_name,sex,school)
    values('Angela','Peter','女'，'北');
    insert into student(first_name,last_name,sex,school)
    values('Peter','Pjsjk','女'，'北');

    SELECT *from student where first_name like "a%";
    



