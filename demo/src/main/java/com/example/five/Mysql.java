package com.example.five;

public class Mysql {
   /* mysql> show databases;
+--------------------+
| Database           |
+--------------------+
| information_schema |
| local              |
| mysql              |
| performance_schema |
| sys                |
+--------------------+
5 rows in set (0.01 sec)

mysql> use local;
Database changed
mysql> show tables;
+-----------------+
| Tables_in_local |
+-----------------+
| student         |
| sys             |
| 二货            |
+-----------------+
3 rows in set (0.00 sec)

mysql> desc sys;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| stu    | int(11)     | YES  |     | NULL    |       |
| class  | varchar(20) | YES  |     | NULL    |       |
| course | varchar(20) | YES  |     | NULL    |       |
| grade  | varchar(20) | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
4 rows in set (0.00 sec)
mysql> insert into grade(id,stu_number,class,course,score) values(5,'20160105','一','语文','97');
Query OK, 1 row affected (0.06 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(1,'20160101','一','数学','99');
ERROR 1062 (23000): Duplicate entry '1' for key 'PRIMARY'
mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(6,'20160101','一',数学','99');
Query OK, 1 row affected (0.04 sec)

mysql> insert into grade(id,stu_number,class,course,score) values(7,'20160102','一',数学','98');
Query OK, 1 row affected (0.02 sec)

mysql> insert into grade(id,stu_number,class,course,score) values(8,'20160103','一',数学','99');
Query OK, 1 row affected (0.10 sec)

mysql> insert into grade(id,stu_number,class,course,score) values(9,'20160104','一',数学','96');
Query OK, 1 row affected (0.01 sec)

mysql> insert into grade(id,stu_number,class,course,score) values(10,'20160105','一''数学','97');
Query OK, 1 row affected (0.10 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(11,'20160101','一''选修课','99');
Query OK, 1 row affected (0.01 sec)

mysql> insert into grade(id,stu_number,class,course,score) values(12,'20160102','一''选修课','98');
Query OK, 1 row affected (0.02 sec)

mysql> insert into grade(id,stu_number,class,course,score) values(13,'20160103','一''选修课','99');
Query OK, 1 row affected (0.12 sec)

mysql> insert into grade(id,stu_number,class,course,score) values(14,'20160104','一''选修课','96');
Query OK, 1 row affected (0.03 sec)

mysql> insert into grade(id,stu_number,class,course,score) values(15,'20160105','一','选修课','97');
Query OK, 1 row affected (0.10 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(16,'20160201','二','语文','99');
Query OK, 1 row affected (0.06 sec)

mysql> insert into grade(id,stu_number,class,course,score) values(17,'20160202','二''语文','98');
Query OK, 1 row affected (0.06 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(18,'20160203','二','语文','92');
Query OK, 1 row affected (0.06 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(19,'20160204','二','语文','82');
Query OK, 1 row affected (0.02 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(20,'20160205','二''语文','85');
Query OK, 1 row affected (0.05 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(21,'20160201','二''数学','89');
Query OK, 1 row affected (0.11 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(22,'20160202','二','数学','83');
Query OK, 1 row affected (0.01 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(23,'20160203','二','数学','81');
Query OK, 1 row affected (0.02 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(24,'20160204','二','数学','86');
Query OK, 1 row affected (0.05 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(25,'20160205','二','数学','85');
Query OK, 1 row affected (0.02 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(26,'20160201','二','选修课','85');
Query OK, 1 row affected (0.10 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(27,'20160202','二','选修课','90');
Query OK, 1 row affected (0.10 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(28,'20160203','二','选修课','90');
Query OK, 1 row affected (0.04 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(29,'20160204','二','选修课','92');
Query OK, 1 row affected (0.09 sec)

mysql> INSERT INTO grade(id,stu_number,class,course,score) VALUES(30,'20160205','二''选修课','95');
Query OK, 1 row affected (0.12 sec)

mysql> select*from grade;
+----+------------+-------+--------+-------+
| id | stu_number | class | course | score |
+----+------------+-------+--------+-------+
|  1 |   20160101 | 一    | 语文   |    99 |
|  2 |   20160102 | 一    | 语文   |    98 |
|  3 |   20160103 | 一    | 语文   |    99 |
|  4 |   20160104 | 一    | 语文   |    96 |
|  5 |   20160105 | 一    | 语文   |    97 |
|  6 |   20160101 | 一    | 数学   |    99 |
|  7 |   20160102 | 一    | 数学   |    98 |
|  8 |   20160103 | 一    | 数学   |    99 |
|  9 |   20160104 | 一    | 数学   |    96 |
| 10 |   20160105 | 一    | 数学   |    97 |
| 11 |   20160101 | 一    | 选修课 |    99 |
| 12 |   20160102 | 一    | 选修课 |    98 |
| 13 |   20160103 | 一    | 选修课 |    99 |
| 14 |   20160104 | 一    | 选修课 |    96 |
| 15 |   20160105 | 一    | 选修课 |    97 |
| 16 |   20160201 | 二    | 语文   |    99 |
| 17 |   20160202 | 二    | 语文   |    98 |
| 18 |   20160203 | 二    | 语文   |    92 |
| 19 |   20160204 | 二    | 语文   |    82 |
| 20 |   20160205 | 二    | 语文   |    85 |
| 21 |   20160201 | 二    | 数学   |    89 |
| 22 |   20160202 | 二    | 数学   |    83 |
| 23 |   20160203 | 二    | 数学   |    81 |
| 24 |   20160204 | 二    | 数学   |    86 |
| 25 |   20160205 | 二    | 数学   |    85 |
| 26 |   20160201 | 二    | 选修课 |    85 |
| 27 |   20160202 | 二    | 选修课 |    90 |
| 28 |   20160203 | 二    | 选修课 |    90 |
| 29 |   20160204 | 二    | 选修课 |    92 |
| 30 |   20160205 | 二    | 选修课 |    95 |
+----+------------+-------+--------+-------+
30 rows in set (0.00 sec)
mysql> select score from grade;
+-------+
| score |
+-------+
|    99 |
|    98 |
|    99 |
|    96 |
|    97 |
|    99 |
|    98 |
|    99 |
|    96 |
|    97 |
|    99 |
|    98 |
|    99 |
|    96 |
|    97 |
|    99 |
|    98 |
|    92 |
|    82 |
|    85 |
|    89 |
|    83 |
|    81 |
|    86 |
|    85 |
|    85 |
|    90 |
|    90 |
|    92 |
|    95 |
+-------+
30 rows in set (0.00 sec)
mysql> select course,count(*) as num from grade group by course;
+--------+-----+
| course | num |
+--------+-----+
| 语文   |  10 |
| 数学   |  10 |
| 选修课 |  10 |
+--------+-----+
3 rows in set (0.01 sec)
mysql> update grade set score='57' where id=1;
Query OK, 1 row affected (0.12 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> update grade set score='52' where id=28;
Query OK, 1 row affected (0.12 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> select * from grade where score<=60 order by score;
+----+------------+-------+--------+-------+
| id | stu_number | class | course | score |
+----+------------+-------+--------+-------+
| 28 |   20160203 | 二    | 选修课 |    52 |
|  1 |   20160101 | 一    | 语文   |    57 |
+----+------------+-------+--------+-------+
2 rows in set (0.00 sec)

mysql> select*from grade where stu_number=20160101;
+----+------------+-------+--------+-------+
| id | stu_number | class | course | score |
+----+------------+-------+--------+-------+
|  1 |   20160101 | 一    | 语文   |    57 |
|  6 |   20160101 | 一    | 数学   |    99 |
| 11 |   20160101 | 一    | 选修课 |    99 |
+----+------------+-------+--------+-------+
3 rows in set (0.00 sec)
mysql> select sum(score) from grade where class=1;
+------------+
| sum(score) |
+------------+
|       NULL |
+------------+
1 row in set, 30 warnings (0.00 sec)

mysql> select sum(score) from grade where id<=15;
+------------+
| sum(score) |
+------------+
|       1425 |
+------------+
1 row in set (0.00 sec)

mysql> select sum(score) from grade where class=1 group by stu_number;
+------------+
| sum(score) |
+------------+
|        255 |
|        294 |
|        297 |
|        288 |
|        291 |
+------------+
5 rows in set (0.00 sec)
mysql> select sum(score) from grade where class=1 group by stu_number;desc
+------------+
| sum(score) |
+------------+
|        255 |
|        294 |
|        297 |
|        288 |
|        291 |
+------------+
5 rows in set (0.00 sec)
mysql> select sum(score) from grade where class=1 group by stu_number order by sum(score) desc;
+------------+
| sum(score) |
+------------+
|        297 |
|        294 |
|        291 |
|        288 |
|        255 |
+------------+
5 rows in set (0.00 sec)
mysql> select * from grade where score>80;
+----+------------+-------+--------+-------+
| id | stu_number | class | course | score |
+----+------------+-------+--------+-------+
|  2 |   20160102 | 1     | 语文   |    98 |
|  3 |   20160103 | 1     | 语文   |    99 |
|  4 |   20160104 | 1     | 语文   |    96 |
|  5 |   20160105 | 1     | 语文   |    97 |
|  6 |   20160101 | 1     | 数学   |    99 |
|  7 |   20160102 | 1     | 数学   |    98 |
|  8 |   20160103 | 1     | 数学   |    99 |
|  9 |   20160104 | 1     | 数学   |    96 |
| 10 |   20160105 | 1     | 数学   |    97 |
| 11 |   20160101 | 1     | 选修课 |    99 |
| 12 |   20160102 | 1     | 选修课 |    98 |
| 13 |   20160103 | 1     | 选修课 |    99 |
| 14 |   20160104 | 1     | 选修课 |    96 |
| 15 |   20160105 | 1     | 选修课 |    97 |
| 16 |   20160201 | 2     | 语文   |    99 |
| 17 |   20160202 | 2     | 语文   |    98 |
| 18 |   20160203 | 2     | 语文   |    92 |
| 19 |   20160204 | 2     | 语文   |    82 |
| 20 |   20160205 | 2     | 语文   |    85 |
| 21 |   20160201 | 2     | 数学   |    89 |
| 22 |   20160202 | 2     | 数学   |    83 |
| 23 |   20160203 | 2     | 数学   |    81 |
| 24 |   20160204 | 2     | 数学   |    86 |
| 25 |   20160205 | 2     | 数学   |    85 |
| 26 |   20160201 | 2     | 选修课 |    85 |
| 27 |   20160202 | 2     | 选修课 |    90 |
| 29 |   20160204 | 2     | 选修课 |    92 |
| 30 |   20160205 | 2     | 选修课 |    95 |
+----+------------+-------+--------+-------+
28 rows in set (0.00 sec)

mysql> select * from grade where score>80 group by stu_number;
+----+------------+-------+--------+-------+
| id | stu_number | class | course | score |
+----+------------+-------+--------+-------+
|  2 |   20160102 | 1     | 语文   |    98 |
|  3 |   20160103 | 1     | 语文   |    99 |
|  4 |   20160104 | 1     | 语文   |    96 |
|  5 |   20160105 | 1     | 语文   |    97 |
|  6 |   20160101 | 1     | 数学   |    99 |
| 16 |   20160201 | 2     | 语文   |    99 |
| 17 |   20160202 | 2     | 语文   |    98 |
| 18 |   20160203 | 2     | 语文   |    92 |
| 19 |   20160204 | 2     | 语文   |    82 |
| 20 |   20160205 | 2     | 语文   |    85 |
+----+------------+-------+--------+-------+
10 rows in set (0.00 sec)

mysql> select * from grade where score>80 group by course;
+----+------------+-------+--------+-------+
| id | stu_number | class | course | score |
+----+------------+-------+--------+-------+
|  2 |   20160102 | 1     | 语文   |    98 |
|  6 |   20160101 | 1     | 数学   |    99 |
| 11 |   20160101 | 1     | 选修课 |    99 |
+----+------------+-------+--------+-------+
3 rows in set (0.00 sec)

mysql> select stu_number,min(score) from grade;
+------------+------------+
| stu_number | min(score) |
+------------+------------+
|   20160101 |         52 |
+------------+------------+
1 row in set (0.00 sec)
mysql> select stu_number,min(score) from grade group by stu_number;
+------------+------------+
| stu_number | min(score) |
+------------+------------+
|   20160101 |         57 |
|   20160102 |         98 |
|   20160103 |         99 |
|   20160104 |         96 |
|   20160105 |         97 |
|   20160201 |         85 |
|   20160202 |         83 |
|   20160203 |         52 |
|   20160204 |         82 |
|   20160205 |         85 |
+------------+------------+
10 rows in set (0.00 sec)
mysql> select stu_number,min(score) from grade group by stu_number having min(score)>80;
+------------+------------+
| stu_number | min(score) |
+------------+------------+
|   20160102 |         98 |
|   20160103 |         99 |
|   20160104 |         96 |
|   20160105 |         97 |
|   20160201 |         85 |
|   20160202 |         83 |
|   20160204 |         82 |
|   20160205 |         85 |
+------------+------------+
8 rows in set (0.00 sec)

mysql> select stu_number from(select stu_number,min(score) from grade group by stu_number having min(score)>80) stu;
+------------+
| stu_number |
+------------+
|   20160102 |
|   20160103 |
|   20160104 |
|   20160105 |
|   20160201 |
|   20160202 |
|   20160204 |
|   20160205 |
+------------+
8 rows in set (0.00 sec)
mysql> select * from grade where score<60;
+----+------------+-------+--------+-------+
| id | stu_number | class | course | score |
+----+------------+-------+--------+-------+
|  1 |   20160101 | 1     | 语文   |    57 |
| 28 |   20160203 | 2     | 选修课 |    52 |
+----+------------+-------+--------+-------+
2 rows in set (0.00 sec)
mysql> select avg(score) from grade order by avg(score) desc;
+------------+
| avg(score) |
+------------+
|    90.6333 |
+------------+
1 row in set (0.00 sec)

mysql> select avg(score) from grade group by course order by avg(score) desc;
+------------+
| avg(score) |
+------------+
|    91.3000 |
|    90.3000 |
|    90.3000 |
+------------+
3 rows in set (0.01 sec)
mysql> select avg(score) from grade group by class order by avg(score) desc;
+------------+
| avg(score) |
+------------+
|    95.0000 |
|    86.2667 |
+------------+
2 rows in set (0.00 sec)

mysql> select avg(score) from grade group by class order by avg(score) desc;
+------------+
| avg(score) |
+------------+
|    95.0000 |
|    86.2667 |
+------------+
2 rows in set (0.00 sec)

mysql> select avg(score) from grade where course='语文' group by class order by avg(score) desc;
+------------+
| avg(score) |
+------------+
|    91.2000 |
|    89.4000 |
+------------+
2 rows in set (0.00 sec)
mysql> select max(score),min(score),avg(score) from grade where course='语文';
+------------+------------+------------+
| max(score) | min(score) | avg(score) |
+------------+------------+------------+
|         99 |         57 |    90.3000 |
+------------+------------+------------+
1 row in set (0.00 sec)

mysql> select max(score),min(score),avg(score) from grade where course='数学';
+------------+------------+------------+
| max(score) | min(score) | avg(score) |
+------------+------------+------------+
|         99 |         81 |    91.3000 |
+------------+------------+------------+
1 row in set (0.00 sec)

mysql> select max(score),min(score),avg(score) from grade where course='选修课';
+------------+------------+------------+
| max(score) | min(score) | avg(score) |
+------------+------------+------------+
|         99 |         52 |    90.3000 |
+------------+------------+------------+
1 row in set (0.00 sec)
    */
}