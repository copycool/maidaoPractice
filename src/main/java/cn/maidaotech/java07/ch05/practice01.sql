
show databases;
use test02;
show TABLES;
CREATE TABLE `student` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `frist_name` varchar(50) NOT NULL,
  `last_name` varchar(30) NOT NULL COMMENT '姓名',
  `sex` tinyint NOT NULL COMMENT '性别：0男1女2保密',
  `school` varchar(20) NOT NULL COMMENT '学校',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10013 DEFAULT CHARSET=utf8mb3;
SELECT * FROM student;

desc student;
alter table student drop created_at;
alter table student drop updated_at;
INSERT INTO student (frist_name,last_name,sex,school)
 values('Jim','Green',0,'东北大学');
INSERT INTO student (frist_name,last_name,sex,school)
 values('Lihua','Green',0,'东北大学');
INSERT INTO student (frist_name,last_name,sex,school)
 values('Angela','Green',1,'东北大学');
INSERT INTO student (frist_name,last_name,sex,school)
 values('Peter','Green',0,'东北大学');
INSERT INTO student (frist_name,last_name,sex,school)
 values('Gan','Fu',0,'河南大学');
INSERT INTO student (frist_name,last_name,sex,school)
 values('Alice','Fu',1,'河南大学');
INSERT INTO student (frist_name,last_name,sex,school)
 values('Bob','Gigi',0,'河南大学');
INSERT INTO student (frist_name,last_name,sex,school)
 values('Mice','Nini',1,'湖南大学');
INSERT INTO student (frist_name,last_name,sex,school)
 values('Kimi','Lin',1,'深圳大学');
INSERT INTO student (frist_name,last_name,sex,school)
 values('Aoqo','Xi',1,'深圳大学');
INSERT INTO student (frist_name,last_name,sex,school)
 values('Pipi','Zu',1,'河南大学');
INSERT INTO student (frist_name,last_name,sex,school)
 values('Angela','Peter',1,'河南大学');
select * from student where frist_name like 'a%';
select *from student where frist_name='Angela' and last_name='Peter';
select *from student ORDER BY frist_name DESC;
select *from student where id<=10010 ;
INSERT INTO  student( last_name) VALUES( 'Wilson');
update student set last_name='Wilson' where id=10012;
select * from student ;
ALTER TABLE student ADD age int not null;
DELETE FROM student WHERE( frist_name='Angela');
ALTER TABLE student drop age;
alter table student modify frist_name varchar(50) NOT NULL;
SELECT last_name ||" " || frist_name AS persion
from student;
create table if NOT EXISTS `persion`(
`id`  BIGINT(20) not null AUTO_INCREMENT,
`name` VARCHAR(20) not null,
PRIMARY KEY(`id`)
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
INSERT into persion name;
SELECT concat(frist_name ," " ,last_name)as name from student;