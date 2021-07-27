CREATE TABLE [name](  
    id int NOT NULL primary key AUTO_INCREMENT   comment 'primary key',
    create_time DATETIME COMMENT 'create time',
    update_time DATETIME COMMENT 'update time',
    [column] varchar(255) comment ''
) default charset utf8 comment '';
CREATE Table `big_data`(
    `id` bigint(20) NOT NULL  AUTO_INCREMENT  PRIMARY KEY  COMMENT'自增主键',
   `user_id` BIGINT (20)   UNSIGNED NOT NULL COMMENT '用户主键',
   `username`VARCHAR(50) CHARACTER SET utf8mb4 not null   COMMENT'用户名',
  `amount` int (11) SIGNED NOT NULL COMMENT '年龄',
  `status` TINYINT(2) UNSIGNED not null COMMENT '状态',
`created_at` BIGINT (20) NOT NULL COMMENT'创建时间',
`update_at`BIGINT(20) NOT NULL COMMENT'修改时间'
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;

alter table`big_data` modify  user_id unsigned ;

alter table big_data AUTO_INCREMENT=10000;
-- 
-- 
set global log_bin_trust_function_creators=1;
drop function IF EXISTS rand_string;
delimiter $$
create function rand_string(min int,max int) 
returns varchar(255)
begin
declare chars_str varchar(100) default'abcdefghijklmnopqrstuvwxyz';
declare return_str varchar(255) default'';
DECLARE i INT DEFAULT 0; 
while i < floor(rand()*(max-min))+min do
set return_str = concat(return_str,substring(chars_str,floor(1+rand()*26),1));
set i = i + 1;
end while;
return return_str;
end $$
;
-- 
-- 
-- SET GLOBAL log_bin_trust_function_creators=1;
-- drop function IF EXISTS rand_num;
-- delimiter $$ 
-- create function rand_num(bound int) returns int(11)
-- begin   
-- DECLARE i INT DEFAULT 0; 
-- set i = floor(rand()*bound);
-- return i;
-- end$$
-- ;
-- 
-- 
SET GLOBAL log_bin_trust_function_creators=1;
DROP FUNCTION IF EXISTS rand_num;
DELIMITER $$
CREATE FUNCTION rand_num(bound INT) RETURNS INT(11)
BEGIN
DECLARE i INT DEFAULT 0;
SET i = FLOOR(RAND()*bound);
RETURN i;
END$$
;
-- 时间戳
SET GLOBAL log_bin_trust_function_creators=1;
DROP FUNCTION IF EXISTS rand_date;
DELIMITER $$
CREATE FUNCTION rand_date(n BIGINT) RETURNS BIGINT
BEGIN
DECLARE i BIGINT DEFAULT 0;
SET i = REPLACE(UNIX_TIMESTAMP(CURRENT_TIMESTAMP(3)),'.','')-FLOOR(RAND()*n);
RETURN i;
END$$
;

-- SET GLOBAL log_bin_trust_function_creators=1;
-- DROP PROCEDURE IF EXISTS insert_big_data;
-- DELIMITER $$
-- CREATE PROCEDURE insert_big_data(IN START INT(10),IN max_num INT(10))
-- BEGIN
-- DECLARE i INT DEFAULT 0; 
-- #set autocommit =0 把autocommit设置成0
--  SET autocommit = 0;
--  REPEAT  
--  SET i = i + 1;
--  INSERT INTO big_data (user_id,username,amount,status,create_at,update_at)
--  VALUES (CONCAT('1',CEILING(RAND()*90000+10000)),uuid(),FLOOR(18 + (RAND() * 7)),floor(rand()*2),CONCAT('1',CEILING(RAND()*900000000+100000000)),CONCAT('1',CEILING(RAND()*900000000+100000000)));
--  UNTIL i = max_num
--  END REPEAT;
--  COMMIT;
--  END $$
-- ;
-- #创建存储过程批量生成数据
SET GLOBAL log_bin_trust_function_creators=1;
DROP PROCEDURE IF EXISTS insert_big_data;
DELIMITER $$
CREATE PROCEDURE insert_big_data(IN max_num INT(10))
BEGIN
DECLARE i INT DEFAULT 0;
DECLARE t BIGINT DEFAULT 0;
SET autocommit = 0;
REPEAT
SET i = i + 1;
INSERT INTO big_data(user_id,username,amount,STATUS,created_at,update_at)
VALUES
(rand_num(10000),rand_string(3,6),rand_num(10000),rand_num(10),rand_date(100000000000),rand_date(100000000000));
UNTIL i = max_num
END REPEAT;
COMMIT;
END $$
;
DELIMITER ;
CALL insert_big_data(20*10000);


-- //生成二百万条记录
-- 查询所有记录，按创建时间倒序排列；

SELECT * FROM big_data ORDER BY created_at DESC;
-- 查询所有记录，按用户名正序排列；
SELECT *from big_data ORDER BY username ASC;
-- 查询用户ID是6136（可以是其他ID，下同）的所有记录，按创建时间倒序排列；
SELECT * FROM big_data where user_id=6136 ORDER BY created_at DESC;
-- 查询用户ID是6136，状态是1或2的所有记录，按创建时间倒序排列；
SELECT * FROM big_data where status=1 ORDER BY created_at ASC;
-- 查询用户ID是6136，金额超过5000的所有记录，按创建时间倒序排列；
SELECT * FROM big_data where amount>5000 ORDER BY created_at ASC;
-- 查询用户ID是6136，状态是1，2018（包含）年以来的所有记录，按创建时间倒序排列；
SELECT * FROM big_data where status=1 and created_at<1514736000000 ORDER BY created_at ASC;
-- 查询用户名为”mbk“，状态为5的所有记录，按修改时间倒序排列；查询各个状态的记录总数，和总金额；

SELECT  COUNT(*),sum(amount)
FROM big_data
 where status=5 and username='mbk' 
ORDER BY created_at ASC;
-- 创建索引优化上述查询，分析上述查询的效率，记录命中的索引及select查询的执行时间
ALTER TABLE big_data ADD unique key  id_userid(id,user_id);
ALTER TABLE big_data ADD  key  username(username);

SELECT * FROM big_data where status=1 ORDER BY created_at ASC;
