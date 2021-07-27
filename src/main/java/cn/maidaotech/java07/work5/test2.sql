
-- 创建一张学生表student，其中有字段id、first_name、last_name、sex、school等列，
-- 其中id为自增主键，通过SQL完成以下操作：
-- 如何从表中选取first_name列的值以"a"开头的所有记录？
-- 如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录？
-- 如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录？
-- 哪条SQL语句可返回唯一不同的值？
-- 

CREATE TABLE `student` (
  `id` bigint(30) NOT NULL COMMENT '学号' AUTO_INCREMENT,
  `first_name` varchar(30) DEFAULT NULL COMMENT '姓',
  `last` varchar(30) NOT NULL COMMENT '名字',
  `sex` int(2) NOT NULL COMMENT '性别',
  `school` varchar(50) NOT NULL   COMMENT '学校',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
-- 


 - 插入数据
 INSERT INTO student(id,first_name,last,sex,school) 
 VALUES(11111,'a','李渊',1,'河南工程学院'),(11113,'b','长孙无垢',0,'河南工程学院');

--  从表中选取first_name列的值以"a"开头的所有记录？
SELECT * from student
WHERE  first_name like '%a';

INSERT INTO student(id,first_name,last,sex,school) 
 VALUES(1456,'Tom','长孙无垢',0,'河南工程学院'),(1234,'李四','Peter',1,'河南工程学院'),(14561,'Tom','Peter',0,'河南工程学院');
-- 从表中选择first_name等于Tom而且last_name等于Peter的所有记录？
SELECT * 
from student
WHERE  first_name='Tom' and last_name='Peter';
-- 插入数据
INSERT INTO student(id,first_name,last_name,sex,school) 
 VALUES(145611,'Angela','长孙无垢',0,'河南工程学院'),(12345,'Peter','Peter',1,'河南工程学院');
-- 如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录？
SELECT *
from student
WHERE first_name BETWEEN 'Angela' AND  'Peter';

-- 哪条SQL语句可返回唯一不同的值？
SELECT DISTINCT last_name FROM student;

-- 如何
-- 根据first_name列降序地从表中返回所有记录？
SELECT *
from student
ORDER BY first_name DESC;

SELECT *
from student
ORDER BY first_name ASC;

-- 只返回前十条记录呢？第11到20条记录呢？
SELECT *
from student
limit 0,10;
SELECT *
from student
limit 10,10;

-- 如何向表中插入新的记录？
-- 如何向表中的last_name列插入Wilson？


-- 如何把表中last_name列的Peter改为Wilson？
SELECT *
from student
WHERE  last_name='Peter';
UPDATE student
SET last_name='Wilson'
WHERE  last_name='Peter';
-- 如何在表中删除first_name等于Angela的记录？如何返回表中记录的数目？
SELECT *
from student
WHERE  first_name='Angela';
DELETE FROM student
WHERE  first_name='Angela';
-- 如何在已存在的student表中增加一列名为age表示年龄的列？
alter table student add age int not null default 0 comment '年龄';


-- 如何修改first_name列的字符长度为50且不允许NULL值？如何删除表中的age列？


-- 修改字段，字段所有内容
alter  table student change column1 first_name  varchar(50) DEFAULT  NULL COMMENT '修改';
 alter  table student change first_name column1 varchar(100) DEFAULT 1.2 COMMENT '注释';
-- 修改字段类型，不包括字段名
alter  table student modify first_name  varchar(70) DEFAULT NULL COMMENT '注释'; 
-- 正常，能修改字段类型、类型长度、默认值、注释


-- 删除字段
ALTER TABLE student DROP age;


-- 如何从将表中所有数据的first_name和last_name以空格连接合并存入另外一张表persion中？
SELECT CONCAT(first_name,'',last_name) as persion from student;