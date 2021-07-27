 CREATE TABLE
IF
	NOT EXISTS `student` (
		`id` BIGINT ( 20 ) NOT NULL auto_increment,
		`first_name` VARCHAR ( 30 ) CHARACTER 
		SET utf8 DEFAULT NULL COMMENT '名',
		`last_name` VARCHAR ( 30 ) CHARACTER 
		SET utf8 DEFAULT NULL COMMENT '姓',
		`sex` TINYINT ( 2 ) COMMENT '性别',
		`school` VARCHAR ( 30 ) COMMENT '学校',
		PRIMARY KEY ( `id` ) 
	) ENGINE = INNODB DEFAULT charset = utf8;
INSERT INTO student ( first_name, last_name, sex, school )
VALUES
	( 'Tom', 'Peter', '0','12345' );
INSERT INTO student ( first_name, last_name, sex, school )
VALUES
	( 'aom', 'Peter', '1','12345' );
INSERT INTO student ( first_name, last_name, sex, school )
VALUES
	( 'Angela', 'Peter', '0','12345' );
INSERT INTO student ( first_name, last_name, sex, school )
VALUES
	( 'Peter', 'Peter', '1','12345' );
INSERT INTO student ( first_name, last_name, sex, school )
VALUES
	( 'Tom', 'Hany', '1','12345' );
INSERT INTO student ( first_name, last_name, sex, school )
VALUES
	( 'Sastu', 'Peter', '1','12345' );
SELECT
	* 
FROM
	student 
WHERE
	`first_name` LIKE 'a%';
SELECT
	* 
FROM
	student 
WHERE
	`first_name` = 'Tom' 
	AND `last_name` = 'Peter';
SELECT *FROM student where `first_name`>'Angela'and`first_name`<'Peter' ORDER BY 'first_name';
select DISTINCT `last_name` from student;
SELECT*from student ORDER BY `first_name` desc;
select *from student ORDER BY`first_name` desc limit 0,10;
select *from student ORDER BY`first_name` desc limit 10,10;
insert into student(first_name,last_name,sex,school)
values('aTome','Peter',1,'12345');

insert into student(last_name) values ('Wilson');

update student set last_name='Wilson' where last_name='Peter';

delete from student where first_name='angela';

select count(*) count from student;

alter table student add `age` tinyint(1) unsigned comment '年龄';

alter table student modify first_name varchar(50);

alter table student drop age;