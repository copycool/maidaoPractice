CREATE DATABASE #学生表1
CREATE TABLE
IF
	NOT EXISTS `student` (
		`id` INT ( 11 ) NOT NULL AUTO_INCREMENT PRIMARY KEY,
		`class_name` INT ( 10 ) NOT NULL,
		`first_name` VARCHAR ( 20 ) NOT NULL,
		`last_name` VARCHAR ( 20 ) NOT NULL,
		`sex` VARCHAR ( 10 ) NOT NULL,
		`age` INT ( 10 ) NOT NULL,
		`school` VARCHAR ( 20 ) NOT NULL,
		`state` VARCHAR ( 20 ) NOT NULL,
		`minzu` VARCHAR ( 20 ) NOT NULL 
	) ENGINE = INNODB AUTO_INCREMENT = 1000 DEFAULT CHARSET = UTF8;
INSERT INTO student ( class_name, first_name, last_name, sex, age, school, state, minzu )
VALUES
	( 01, '大壮', '李', '男', '22', '北京大学', '中国', '汉' ),
	(02,'阿喵','玫','女','28','清华大学','中国','汉' ),
	(03,'凡宝','肖','女','21','哈弗大学','中国','汉' ),
	(05,'大兵','吴','男','28','北京大学','中国','汉' ),
	(06,'大兵','吴','男','28','北京大学','中国','汉' ),
	(08,'大兵','吴','男','28','北京大学','中国','汉' ),
	(09,'大兵','吴','男','28','北京大学','中国','汉' ),
	(10,'大兵','吴','男','28','北京大学','中国','汉' ),
	(11,'大兵','吴','男','28','北京大学','中国','汉' ),
	(12,'大兵','吴','男','28','北京大学','中国','汉' ),
	(13,'大兵','吴','男','28','北京大学','中国','汉' ),
	(15,'大兵','吴','男','28','北京大学','中国','汉' ),
	(25,'大兵','吴','男','28','北京大学','中国','汉' ),
	(22,'大兵','吴','男','28','北京大学','中国','汉' ),
	(23,'大兵','吴','男','28','北京大学','中国','汉' );
	SELECT *FROM student;
	#如何从表中选取first_name列的值以"a"开头的所有记录
	SELECT *FROM student WHERE frist_name LIKE 'a%';
	
	#如何从表中选择first_name等于Tom而且last_name等于Peter的所有记录
	SELECT *FROM student WHERE first_name='Tom' AND last_name='Peter';
	
	#如何按字母顺序从表中选取first_name介于Angela和Peter的所有记录
	SELECT *FROM student WHERE student.`first_name` BETWEEN 'Angela' AND 'Peter';
	
	#哪条SQL语句可返回唯一不同的值
	SELECT DISTINCT sex FROM student;
	
	#如何根据first_name列降序地从表中返回所有记录？只返回前十条记录呢？第11到20条记录呢？
	SELECT *FROM student ORDER BY first_name ASC;
	SELECT *FROM student ORDER BY first_name ASC LIMIT 0,10;
	SELECT *FROM student ORDER BY first_name ASC LIMIT 10,10;

	#如何向表中插入新的记录？
	INSERT INTO student(first_name,last_name,sex,school) VALUES('Weilian','Wilson','男','浙江大学');

	如何向表中的last_name列插入Wilson？
	INSERT INTO student(last_name) VALUE('Wilson');

	#如何把表中last_name列的Peter改为Wilson？
	UPDATE student SET last_name='Wilson' WHERE id=10001;

	#如何在表中删除first_name等于Angela的记录？
	DELETE FROM student WHERE first_name='Angela';
 
	#如何返回表中记录的数目？
	SELECT COUNT(*) FROM student;

	#如何在已存在的student表中增加一列名为age表示年龄的列？
	ALTER TABLE student ADD age INT(10) NOT NULL DEFAULT 0;

	#如何修改first_name列的字符长度为50且不允许NULL值？
	ALTER TABLE student CHANGE first_name first_name VARCHAR(50) NOT NULL;

	#如何删除表中的age列？
	ALTER TABLE student DROP age;