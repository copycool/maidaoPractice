/* 创建一张学生表student，其中有字段id、first_name、last_name、sex、school等列，其中id为自增主键 */
CREATE TABLE IF NOT EXISTS `students`(
	`id`BIGINT(20) NOT NULL AUTO_INCREMENT,
	`first_name`VARCHAR(20) 	CHARACTER SET utf8mb4 DEFAULT NULL,
	`last_name`VARCHAR(20) 	CHARACTER SET utf8mb4 DEFAULT NULL,
	`sex`VARCHAR(20) NOT NULL,
	`school`VARCHAR(20) CHARACTER SET utf8mb4 DEFAULT NULL,
	PRIMARY  KEY(`id`)
)AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8

/* #如何从表中选取first_name列的值以"a"开头的所有记录？ */
select * from student where first_name like 'a%';
/* #如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录？ */
select * from student where first_name="tom"and last_name="Peter";
/* #如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录？ */
select first_name from student where first_name BETWEEN "Angela" AND "Peter";
/* #如何根据first_name列降序地从表中返回所有记录？只返回前十条记录呢？第11到20条记录呢？ */
select * from student ORDER BY first_name limit 10,10;
/* #student添加内容 */
INSERT into student(first_name,last_name,sex,school)VALUES('Angela','2Peter','男','家里蹲大学');
/* #如何向表中的last_name列插入Wilson？ */
INSERT into student(first_name,last_name,sex,school)VALUES('os12121m','Wilson','男','家里蹲大学');	
/* #如何把表中last_name列的Peter改为Wilson？ */
UPDATE student set last_name="Wilson" WHERE last_name="Peter";
/* #如何在表中删除first_name等于Angela的记录？ */
DELETE FROM student WHERE first_name="Angela";
/* #如何返回表中记录的数目？ */
SELECT COUNT(*) from student;
/* #如何在已存在的student表中增加一列名为age表示年龄的列？ */
alter table student add age INT(20);
/* #如何修改first_name列的字符长度为50且不允许NULL值？ */
alter table student modify column first_name varchar(50)  not NULL;
/* #如何删除表中的age列？ */
alter table student drop column age;
/* #如何从将表中所有数据的first_name和last_name以空格连接合并存入另外一张表persion中？ */
select concat (first_name,"   ",last_name) as persion from student;



/* #创建一张学生表student，其中有字段id、first_name、last_name、sex、school等列，其中id为自增主键 */
CREATE TABLE IF NOT EXISTS `students`(
  `id`BIGINT(20) NOT NULL AUTO_INCREMENT,
	`student_name` VARCHAR(20) 	CHARACTER SET utf8mb4 DEFAULT NULL,
	`student_number` VARCHAR(20) 	CHARACTER SET utf8mb4 DEFAULT NULL,
	`student_sex` VARCHAR(20) 	CHARACTER SET utf8mb4 DEFAULT NULL,
	`student_age` int(20) not null,
	`class_message`VARCHAR(20)not null,
	`mathematics`        int(20) NOT NULL,
	`languages`     int(20)NOT NULL,
	`English`     int(20)NOT NULL,
	`total_score`int(20)NOT NULL,
	PRIMARY  KEY(`id`)
)AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8




/* #students添加内容 */
INSERT into students(student_name,student_number,student_sex,student_age,class_message,mathematics,languages,English)VALUES('王四','2236','男','19',"一班","94","98","82"),('小粉','2237','女','19',"二班","98","92","84");
/* #修改录入错误的学生姓名、学生成绩(至少写3条)； */
UPDATE students set languages="69" WHERE languages="699";
UPDATE students set English="37" WHERE English="7";
UPDATE students set student_name="张思" WHERE student_name="张三";
/* #统计每门课的学生人数； */
SELECT COUNT(mathematics) from students;#数学
SELECT COUNT(languages) from students;#语文
SELECT COUNT(English) from students;#英语
/* #查询某一门课程不及格的学生信息； */
SELECT * from students where English<"60";
/* #查询某一个学生的各科成绩； */
SELECT * from students where student_name="赵一";
/* #查询一个班级每个学生的总成绩，并按总成绩由高到低排序； */
SELECT student_name,total_score from students  WHERE class_message="一班" ORDER BY total_score desc;
/* #查询每门课都大于80分的学生信息； */
SELECT * from students WHERE English>80 and mathematics>80 and languages>80;
/* #查询至少有一门课程不及格的学生信息； */
SELECT * from students WHERE English<60 or languages<60 or mathematics<60;
/* #查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序； */
SELECT class_message,avg(mathematics) as mathematics from students GROUP BY class_message ORDER BY avg(mathematics) desc;
/* #查询各科成绩最高分、最低分和平均分； */
SELECT MAX(languages),MIN(languages),avg(languages),MAX(English),MIN(English),avg(English),MAX(mathematics),MIN(mathematics),avg(mathematics) from students;;









CREATE TABLE IF NOT EXISTS `big_data`(
	`id` BIGINT(20) not null auto_increment PRIMARY KEY  COMMENT '自增主键',
	`user_id` BIGINT(20) not null COMMENT '用户主键',
	`username` VARCHAR(50) not null  COMMENT '用户名',
	`amount` int(11) not NULL COMMENT '年龄',
	`status` TINYINT(1) not null COMMENT '状态',
	`created_at` BIGINT(20) not null COMMENT '创建时间',
	`updated_at` BIGINT(20) not null COMMENT '更新时间'
)ENGINE=INNODB auto_increment=10000 CHARSET=utf8;



/* 创建big_data表 */
set global log_bin_trust_function_creators=1;
DELIMITER $$
CREATE PROCEDURE insert_data5(IN START INT(10),IN max_num INT(10))  
BEGIN  
DECLARE i INT DEFAULT 0;   
#set autocommit =0 把autocommit设置成0  
 SET autocommit = 0;    
 REPEAT  
 SET i = i + 1;  
 INSERT INTO big_data (user_id,username,amount,status,created_at,updated_at  ) 
VALUES (CONCAT('1',CEILING(RAND()*90000+10000)),uuid(),FLOOR(18 + (RAND() * 7)),floor(rand()*2),CONCAT('1',CEILING(RAND()*900000000+100000000)),CONCAT('1',CEILING(RAND()*900000000+100000000)));  
 UNTIL i = max_num  
 END REPEAT;  
 COMMIT;  
 END $$
DELIMITER ;0
CALL insert_data5(10001,2000000);



/* #查询所有记录，按创建时间倒序排列； */
SELECT * from big_data ORDER BY created_at DESC;
/* #查询所有记录，按用户名正序排列； */
SELECT * from big_data ORDER BY username asc;
/* #查询用户ID是6136（可以是其他ID，下同）的所有记录，按创建时间倒序排列； */
SELECT * From big_data where id="6136" or user_id="6136" ORDER BY created_at desc;
/* #查询用户ID是6136，状态是1或2的所有记录，按创建时间倒序排列； */
SELECT * From big_data where id="16136" or user_id="16136" AND`status`IN(1,2) ORDER BY created_at desc;
/* #查询用户ID是6136，金额超过5000的所有记录，按创建时间倒序排列； */
SELECT * From big_data where id="16136" or user_id="16136" and(updated_at>"5000") ORDER BY created_at desc;
/* #查询用户ID是6136，状态是1，2018（包含）年以来的所有记录，按创建时间倒序排列； */
SELECT * From big_data where id="16136" or user_id="16136" and(`status`=1) AND(created_at>"1514736000") ORDER BY created_at desc;
/* #查询用户名为”mbk“，状态为5的所有记录，按修改时间倒序排列； */
SELECT * From big_data where id="16136" or user_id="16136" and(username="mbk") AND(`status`=5) ORDER BY created_at desc;
/* #查询各个状态的记录总数，和总金额； */
SELECT `status`,count(`status`),SUM(amount) from big_data2  GROUP BY `status`;
/* #----------------------索引优化----------------------# */
alter table big_data DROP key `index_name`; /* #删除索引 */
ALTER TABLE big_data ADD KEY `username`(username);/* #创建索引 */
ALTER TABLE big_data ADD KEY `created_at`(created_at);/* #创建索引 */
/* #查询所有记录，按创建时间倒序排列 */；
EXPLAIN SELECT * from big_data ORDER BY created_at DESC;
/* #查询所有记录，按用户名正序排列； */
EXPLAIN  SELECT * FROM big_data ORDER BY username asc;
ALTER TABLE big_data ADD KEY `id`(id);
ALTER TABLE big_data ADD KEY `user_id`(user_id);
/* #查询用户ID是6136（可以是其他ID，下同）的所有记录，按创建时间倒序排列； */
EXPLAIN SELECT * From big_data where id="16136" or user_id="16136" ORDER BY created_at desc;
/* #查询用户ID是6136，状态是1或2的所有记录，按创建时间倒序排列； */
SELECT * From big_data where id="16136" or user_id="16136" AND`status`IN(1,2) ORDER BY created_at desc;
/* #查询用户ID是6136，金额超过5000的所有记录，按创建时间倒序排列； */
SELECT * From big_data where id="16136" or user_id="16136" and(updated_at>"5000") ORDER BY created_at desc;
/* #查询用户ID是6136，状态是1，2018（包含）年以来的所有记录，按创建时间倒序排列 */；
SELECT * From big_data where id="16136" or user_id="16136" and(`status`=1) AND(created_at>"1514736000") ORDER BY created_at desc;
/* #查询用户名为”mbk“，状态为5的所有记录，按修改时间倒序排列； */
SELECT * From big_data where id="16136" or user_id="16136" and(username="mbk") AND(`status`=5) ORDER BY created_at desc;
ALTER TABLE big_data ADD KEY `status`(`status`);/* #创建索引 */
ALTER TABLE big_data ADD KEY `amount`(amount);/* #创建索引 */
/* #查询各个状态的记录总数，和总金额； */
SELECT `status`,count(`status`),SUM(amount) from big_data  GROUP BY `status`;