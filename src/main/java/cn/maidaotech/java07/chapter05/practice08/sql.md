```sql
SELECT * 
FROM student;
/* a */
UPDATE `student`
SET `first_name` = "Marhy"
WHERE
sno = "10006";
UPDATE `student`
SET `first_name` = "Xiaolong"
WHERE
sno = "10003";

UPDATE `score`
SET `score` = 100
WHERE
id = 1;
UPDATE `score`
SET `score` = 90
WHERE
id = 2;
UPDATE `score`
SET `score` = 100
WHERE
id = 3;

/* b */
SELECT COUNT(*) AS total,c.`name` 
FROM `student` AS s 
LEFT JOIN `clazz` AS c
ON s.clazz_id = c.id
GROUP BY s.clazz_id

/* c */
SELECT s.*
FROM `student` AS s
LEFT JOIN score AS sc
ON s.sno = sc.sno
WHERE sc.score < 60
AND
sc.cno = 1

/* d */
SELECT s.score AS "分数",c.`name` AS "课程名称"
FROM `score` AS s
LEFT JOIN `course` c
ON
s.cno = c.cno
WHERE
s.sno = 10000

/* e */
SELECT SUM(sc.score) AS "总分",s.`first_name` AS "学生姓名"
FROM `score` AS sc
RIGHT JOIN `student` AS s
ON sc.sno = s.sno
WHERE 
s.clazz_id = 1
GROUP BY s.sno

/* f */
SELECT s.*
FROM `student` AS s
WHERE 
NOT EXISTS(SELECT * 
					 FROM `score` AS sc 
					 WHERE 
					 sc.score < 80 
					 AND sc.sno = s.sno)

/* g */
SELECT s.*
FROM `student` AS s
WHERE EXISTS(SELECT * 
						 FROM `score` AS sc
						 WHERE s.sno = sc.sno
						 AND sc.score < 60)

/* h */
SELECT AVG(sc.score) AS "平均分",sz.`name` AS "班级名称"
FROM score AS sc
RIGHT JOIN (SELECT s.sno,c.id AS `clazz_id`,c.`name` 
						FROM `student` AS s 
						LEFT JOIN clazz AS c 
						ON s.clazz_id = c.id). AS sz
ON sc.sno = sz.sno
WHERE sc.cno = 1
GROUP BY sz.clazz_id
DESC

/* i */
SELECT MAX(sc.score) AS "最高分",MIN(sc.score) AS "最低分",c.`name` AS "课程名称"
FROM `score` sc
LEFT JOIN `course` c
ON sc.cno = c.cno
GROUP BY sc.cno

SELECT @@tx_isolation # 查询当前mysql事务隔离级别
```
