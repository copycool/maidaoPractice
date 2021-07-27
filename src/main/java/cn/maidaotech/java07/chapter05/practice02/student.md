```sql
CREATE TABLE `student`(
	`id` BIGINT(20) NOT NULL AUTO_INCREMENT,
	`frist_name` VARCHAR(30) NOT NULL COMMENT "学生姓名",
	`last_name` VARCHAR(30) NOT NULL COMMENT "姓名",
	`sex` TINYINT(6) NOT NULL COMMENT "性别：0男1女2保密",
	`school` VARCHAR(20) NOT NULL COMMENT "学校",
	`created_at` VARCHAR(100) NOT NULL COMMENT "创建时间戳",
	`updated_at` VARCHAR(100) NOT NULL COMMENT "修改时间戳",
	PRIMARY KEY(`id`)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

/* a. */
SELECT *
FROM `student`
WHERE
first_name LIKE "a%";

/* b */
SELECT *
FROM `student`
WHERE
first_name = "Tom"
AND last_name = "Peter";

/* c */
SELECT *
FROM `student`
WHERE
first_name > "Angle"
AND
first_name < "Peter"

/* d */
III

/* e */
SELECT *
FROM `student`
ORDER BY first_name
DESC
LIMIT 10;
SELECT *
FROM `student`
ORDER BY first_name
DESC
LIMIT 11,20;

/* f */
INSERT INTO `student`
(first_name,last_name,sex,school,created_at,updated_at)
VALUES
("Tom","Peter","1","maidao","1234","1234"),
("Joker","Peter","1","maidao","1234","1234");

/* g,h */
UPDATE `student`
SET last_name = "Wilson"
WHERE
last_name = "Peter";
SELECT * FROM `student`;

/* i */
DELETE FROM `student`
WHERE
first_name = "Angela";

/* j */
SELECT COUNT(*) AS TOTAL
FROM `student`;

/* k */
ALTER TABLE `student`
ADD age INT NOT NULL;

/* L */
ALTER TABLE `student`
CHANGE first_name first_name VARCHAR(50) NOT NULL;

/* m */
ALTER TABLE `student`
DROP age;

/* n */
DROP TABLE `person`;
CREATE TABLE `person`(
	id BIGINT(20) NOT NULL AUTO_INCREMENT,
	`name` VARCHAR(50) NOT NULL,
	PRIMARY KEY(`id`)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
INSERT INTO `person`(`name`)
SELECT CONCAT(first_name," ",last_name) AS `name`
FROM `student`;
SELECT * FROM `person`;
```
