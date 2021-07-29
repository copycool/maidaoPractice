/* 第二题 */
/* 创建一张学生表student，其中有字段id、first_name、last_name、sex、school等列，
其中id为自增主键 */
CREATE Table IF NOT EXISTS `student` (
    `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR (20) NOT NULL,
    `last_name` VARCHAR(20) NOT NULL,
    `sex` VARCHAR(20) NOT NULL,
    `school` VARCHAR(20) NOT NULL,
    PRIMARY KEY(`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8
/* 插入数据 */
INSERT INTO student(first_name,last_name,sex,school) 
VALUES
('aili','weilian',1,'yizhong'),
('Tom','landon',0,'erzhong'),
('linuxn','Peter',0,'erzhong'),
('Peter','China',1,'sanzhong'),
('Tom','Peter',0,'sizhong'),
('taile','siweifute',1,'yizhong'),
('Angela','landon',0,'erzhong'),
('Tom','Peter',1,'sizhong'),
('angela','ercth',0,'sanzhong');

/* 从表中选取first_name列的值以"a"开头的所有记录 */
SELECT first_name FROM student WHERE fist_time LIKE 'a%';

/* 如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录 */
SELECT * FROM student WHERE first_name = 'Tom' AND last_name = Peter;
UPDATE student set first_name='yase'WHERE id=10004;
/* 如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录 */
SELECT * FROM student WHERE first_name >='Peter' AND first_name<= 'Angela' ;
SELECT * FROM student WHERE first_name BETWEEN 'Peter' AND 'Angela';

/* 哪条SQL语句可返回唯一不同的值  */
SELECT distinct;

/* 如何根据first_name列降序地从表中返回所有记录 只返回前十条记录？第11到20条记录 */
SELECT * FROM student ORDER BY first_name DESC;
/* SELECT * FROM student limit 4,2;返回4-6 */
/* SELECT * FROM student WHERE 1=1,LIMIT 4;返回0-4 */

/* 如何向表中插入新的记录？ */
INSERT INTO student(first_name,last_name,sex,school) VALUES('ailis','dog','男','yizhong');

/* 如何向表中的last_name列插入Wilson 把表中last_name列的Peter改为Wilson*/
UPDATE  student set last_name = 'wilson' WHERE last_name = 'Peter';
REPLACE (last_name,'Peter','wilson');

/* 如何在表中删除first_name等于Angela的记录 */
DELETE FROM student WHERE first_name = 'Angela';

/* 如何返回表中记录的数目 */
SELECT COUNT(*) FROM student;
SELECT * FROM student ORDER BY id;
SELECT SUM(id) FROM student;

/* 如何在已存在的student表中增加一列名为age表示年龄的列？
如何修改first_name列的字符长度为50且不允许NULL值？
如何删除表中的age列？ */
ALTER TABLE student ADD age int not null;
ALTER TABLE student MODIFY first_name CHAR(50) DEFAULT NOT NULL;
ALTER TABLE student drop age;

/* 合并查询 */
 select concat(' ','first_name','last_name') from student;

 /* 如何从将表中所有数据的first_name和last_name以空格连接合并存入另外一张表persion中？ */
CREATE TABLE IF NOT EXISTS `Persion`(
 `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(20) NOT NULL ,
    PRIMARY KEY(`id`)
    )ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
    
ALTER TABLE student ADD  all_name VARCHAR(20);
UPDATE student SET all_name = CONCAT(first_name, ' - ', last_name);

INSERT INTO persion(name)VALUES('1'),('22'),('23');
update persion s,student u
set s.name=u.all_name
where s.id=u.id;


CREATE TABLE IF NOT EXISTS `Person`(
 `id` BIGINT(20) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(20) NOT NULL DEFAULT '0' ,
    PRIMARY KEY(`id`)
    )ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;