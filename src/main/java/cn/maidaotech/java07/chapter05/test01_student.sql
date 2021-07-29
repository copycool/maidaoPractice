USE day23;
CREATE TABLE student(
`id` INT(20) NOT NULL AUTO_INCREMENT,
`first_name` VARCHAR(20) NOT NULL,
`last_name` VARCHAR(20) NOT NULL,
-- `sex` tinynit not null,
`sex` VARCHAR(4) NOT NULL,
`school` VARCHAR(50) NOT NULL,
PRIMARY KEY (`id`)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

INSERT INTO student(first_name,last_name,sex,school) VALUES('abc','abc','男','北京大学');
INSERT INTO student(first_name,last_name,sex,school) VALUES('Tom','Peter','男','清华大学');
INSERT INTO student(first_name,last_name,sex,school) VALUES('Angela','小红','女','北京大学');
INSERT INTO student(first_name,last_name,sex,school) VALUES('angela','小兰','女','河南大学');
INSERT INTO student(first_name,last_name,sex,school) VALUES('Peter','Tom','女','河南大学');
INSERT INTO student(first_name,last_name,sex,school) VALUES('Mary','Jery','男','河南大学');
INSERT INTO student(first_name,last_name,sex,school) VALUES('Doctor','Fox','女','河南大学');

SELECT *FROM student;
-- 如何从表中选取first_name列的值以"a"开头的所有记录
SELECT *FROM student WHERE first_name LIKE 'a%';

-- 如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录
SELECT *FROM student WHERE first_name='Tom' AND last_name='Peter';

-- 如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录
SELECT *FROM student WHERE student.`first_name` BETWEEN 'Angela' AND 'Peter';

-- 哪条SQL语句可返回唯一不同的值 SELECT DIFFERENT SELECT DISTINCT SELECT UNIQUE
-- SELECT DISTINCT
SELECT DISTINCT sex FROM student;

-- 如何根据first_name列降序地从表中返回所有记录？只返回前十条记录呢？第11到20条记录呢？
SELECT *FROM student ORDER BY first_name ASC;
SELECT *FROM student ORDER BY first_name Desc LIMIT 0,10;
SELECT *FROM student ORDER BY first_name Desc LIMIT 10,10;

-- 如何向表中插入新的记录？
INSERT INTO student(first_name,last_name,sex,school) VALUES('Weilian','Wilson','男','浙江大学');

-- 如何向表中的last_name列插入Wilson？
INSERT INTO student(last_name) VALUE('Wilson');

-- 如何把表中last_name列的Peter改为Wilson？  先通过名字返回id
UPDATE student SET last_name='Wilson' WHERE id=10001;

-- 如何在表中删除first_name等于Angela的记录？
DELETE FROM student WHERE first_name='Angela';
 
-- 如何返回表中记录的数目？
SELECT COUNT(*) FROM student;

-- 如何在已存在的student表中增加一列名为age表示年龄的列？
ALTER TABLE student ADD age INT(10) NOT NULL DEFAULT 0;

-- 如何修改first_name列的字符长度为50且不允许NULL值？
ALTER TABLE student CHANGE first_name first_name VARCHAR(50) NOT NULL;

-- 如何删除表中的age列？
ALTER TABLE student DROP age;

-- 如何从将表中所有数据的first_name和last_name以空格连接合并存入另外一张表persion中？
-- SELECT last_name||' '||first_name NAME FROM student;
SELECT CONCAT( first_name,' ',last_name)FROM student;
CREATE TABLE persion(
`id` INT(10) NOT NULL AUTO_INCREMENT,
PRIMARY KEY (`id`),
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

SELECT *FROM persion;
ALTER TABLE persion ADD name1 VARCHAR(100) NOT NULL;
INSERT INTO persion(name1) SELECT CONCAT( first_name,' ',last_name)FROM student;

