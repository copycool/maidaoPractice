```sql
CREATE TABLE student(	
	id BIGINT(20) AUTO_INCREMENT ,
	first_name VARCHAR(20),
	last_name VARCHAR(20),
	sex CHAR(1),
	school VARCHAR(20),
	PRIMARY KEY(id)
	);
INSERT INTO student VALUES(10010,'Abbet','Peator','男',NULL);
INSERT INTO student VALUES(10011,'Peter','jacker','男',NULL);
INSERT INTO student VALUES(10012,'jacker','Peator','男',NULL);
INSERT INTO student VALUES(10013,'Tom','Peator','男',NULL);
INSERT INTO student VALUES(10014,'Boom','Peator','男',NULL);
INSERT INTO student VALUES(10015,'Peter','Tom','男',NULL);
INSERT INTO student VALUES(10016,'Coool','Peator','男',NULL);
INSERT INTO student VALUES(10017,'Dulllar','Angela','男',NULL);
INSERT INTO student VALUES(10018,'Eeter','Peator','男',NULL);
INSERT INTO student VALUES(10019,'Angela','Peator','男',NULL);
INSERT INTO student VALUES(10020,'Leter','Peator','男',NULL);
INSERT INTO student VALUES(10021,'Oeter','Peator','男',NULL);
INSERT INTO student VALUES(10022,'Ueter','Peator','男',NULL);
INSERT INTO student VALUES(10023,'Ieter','Peator','男',NULL);
INSERT INTO student VALUES(10024,'Yeter','Peator','男',NULL);
INSERT INTO student VALUES(10025,'Heter','Peator','男',NULL);
INSERT INTO student VALUES(10026,'Feter','Peator','男',NULL);
INSERT INTO student VALUES(10027,'Veter','Peator','男',NULL);
INSERT INTO student VALUES(10028,'Keter','Peator','男',NULL);
INSERT INTO student VALUES(10029,'Meter','Peator','男',NULL);
INSERT INTO student VALUES(10030,'Xeter','Peator','男',NULL);

SELECT first_name FROM student WHERE first_name LIKE'a%'; 

SELECT * FROM student WHERE first_name='Tom' AND last_name='Peter';

SELECT * FROM student WHERE first_name BETWEEN'Angela'AND'Peter';

SELECT * FROM student ORDER BY first_name DESC;
SELECT * FROM student ORDER BY first_name DESC LIMIT 10;
SELECT * FROM student ORDER BY first_name DESC LIMIT 10,10;

INSERT INTO student VALUES();

INSERT INTO student(last_name)VALUES('Wilson');

UPDATE student SET last_name='Wilson' WHERE last_name='Peter';

DELETE FROM student WHERE first_name='Angela';

SELECT COUNT(*) FROM student;

ALTER TABLE student ADD age BIGINT(20);

UPDATE student SET first_name='yyy' WHERE id=10031;
ALTER TABLE student MODIFY first_name VARCHAR(50) NOT NULL;

ALTER TABLE student DROP age;
SELECT CONCAT(first_name,'   ',last_name)'person' FROM student;
```