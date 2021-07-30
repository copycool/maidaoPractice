CREATE TABLE  IF not EXISTS`student`(
`id`BIGINT(20) NOT NULL AUTO_INCREMENT,
`first_name`VARCHAR(20) CHARACTER SET utf8mb4 DEFAULT NULL,
`last_name`VARCHAR(20) CHARACTER SET utf8mb4 DEFAULT NULL,
`sex`  VARCHAR(10) NOT NULL DEFAULT '男',
`school` VARCHAR(20) NOT NULL DEFAULT '清华大学',
PRIMARY KEY (`id`)
) 
INSERT INTO student (id,first_name,last_name,sex,school) VALUES(1001,'Tom','Peter','男','郑州大学');
INSERT INTO student (first_name,last_name,sex,school) VALUES('Tom','Jam','男','开封大学');
INSERT INTO student (first_name,last_name,sex,school) VALUES('Angela','Peter','女','澳门大学');
INSERT INTO student (first_name,last_name,sex,school) VALUES('Jam','Kai','女','湖南大学');
INSERT INTO student (first_name,last_name,sex,school) VALUES('Peter','Teng','男','北京大学')
INSERT INTO student (first_name,last_name,sex,school) VALUES('Beter','Teng','男','北京大学')
#a
SELECT * FROM student WHERE `first_name` LIke "A%";
#b
SELECT * FROM student WHERE `first_name` = "Tom" and `last_name` = "Peter";
#C
SELECT first_name FROM student WHERE `first_name`BETWEEN "Angela" AND "Peter" ;
#e
SELECT *FROM student  ORDER BY `first_name` DESC; 
#f
INSERT INTO student (first_name,last_name,sex,school) VALUES('hao','ni','男','郑州商学院');
#g
INSERT INTO student(last_name) VALUES ('Wilson');
#h
UPDATE student SET `last_name`='Wilson' WHERE `last_name`='Peter';
#i
DELETE FROM student WHERE `first_name`='Angela';
#j
SELECT COUNT(*) FROM student;
#k
ALTER  TABLE student ADD age int(10) NOT NULL DEFAULT 0 COMMENT '年龄';
#l
ALTER TABLE student MODIFY `first_name` VARCHAR(50) not  NULL;
#m
ALTER TABLE student DROP `age`;
#n
SELECT CONCAT(first_name,' ',last_name) 'person' FROM student ;