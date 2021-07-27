--创建表 big_data
CREATE TABLE `big_data`(
`id` BIGINT(20) UNSIGNED AUTO_INCREMENT NOT NULL COMMENT'自增主键',
`user_id` BIGINT(20) UNSIGNED NOT NULL COMMENT'用户主键',
`username` VARCHAR(50) CHARACTER SET utf8mb4 NOT NULL COMMENT'用户名',
`amount` INT(11) SIGNED NOT NULL COMMENT'年龄',
`status` TINYINT(1) UNSIGNED NOT NULL COMMENT'状态',
`created_at` BIGINT(20) NOT NULL COMMENT'创建时间',
`update_at` BIGINT(20) COMMENT'修改时间',
PRIMARY KEY(`id`)
)ENGINE=INNODB,DEFAULT CHARSET=utf8,AUTO_INCREMENT=10000;
--创建生成随机字符串函数
SET GLOBAL log_bin_trust_function_creators=1;
DROP FUNCTION IF EXISTS rand_string;
DELIMITER$$
CREATE FUNCTION rand_string(MIN INT,MAX INT)RETURNS VARCHAR(255)
BEGIN
DECLARE chars_str VARCHAR(100) DEFAULT 'abcdefghijklmnopqrstuvwxyz';
DECLARE return_str VARCHAR(255) DEFAULT '';
DECLARE i INT DEFAULT 0;
WHILE i < FLOOR(RAND()*(MAX-MIN))+MIN  DO
SET return_str = CONCAT(return_str,SUBSTRING(chars_str,FLOOR(1+RAND()*26),1));
SET i = i+1;
END WHILE;
RETURN return_str;
END $$
--创建生成随机数字函数
SET GLOBAL log_bin_trust_function_creators=1;
DROP FUNCTION IF EXISTS rand_num;
DELIMITER $$
CREATE FUNCTION rand_num(bound INT) RETURNS INT(11)
BEGIN
DECLARE i INT DEFAULT 0;
SET i = FLOOR(RAND()*bound);
RETURN i;
END$$
--创建生成随机时间戳函数
SET GLOBAL log_bin_trust_function_creators=1;
DROP FUNCTION IF EXISTS rand_date;
DELIMITER $$
CREATE FUNCTION rand_date(n BIGINT) RETURNS BIGINT
BEGIN
DECLARE i BIGINT DEFAULT 0;
SET i = REPLACE(UNIX_TIMESTAMP(CURRENT_TIMESTAMP(3)),'.','')-FLOOR(RAND()*n);
RETURN i;
END$$
--创建存储过程批量生成数据
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
--调用存储过程，批量向表中插入数据
DELIMITER;
CALL insert_big_data(200*10000);
--查询所有记录，按创建时间倒序排列
SELECT * 
FROM big_data
ORDER BY created_at DESC;
--查询所有记录，按用户名正序排列
SELECT * 
FROM big_data
ORDER BY username;
--查询用户 ID 是 6136（可以是其他 ID，下同）的所有记录，按创建时间倒序排列；
SELECT * 
FROM big_data
WHERE user_id = 6136
ORDER BY created_at DESC;
--查询用户 ID 是 6136，状态是 1 或 2 的所有记录，按创建时间倒序排列；
SELECT * 
FROM big_data
WHERE user_id = 6136
AND STATUS IN (1,2)
ORDER BY created_at DESC;
--查询用户 ID 是 6136，金额超过 5000 的所有记录，按创建时间倒序排列；
SELECT * 
FROM big_data
WHERE user_id = 6136
AND amount>5000
ORDER BY created_at DESC;
--查询用户 ID 是 6136，状态是 1，2018（包含）年以来的所有记录，按创建时间 倒序排列
SELECT * 
FROM big_data
WHERE user_id = 6136
AND STATUS=1
AND YEAR(created_at)<=2018
--#查询用户名为”mbk“，状态为 5 的所有记录，按修改时间倒序排列
SELECT * 
FROM big_data
WHERE username = 'mbk'
AND STATUS = 5
ORDER BY update_at DESC;
--查询各个状态的记录总数，和总金额；
SELECT STATUS,COUNT(*),SUM(amount)
FROM big_data
GROUP BY STATUS
--#创建索引优化上述查询，分析上述查询的效率，记录命中的索引及 select 查询的执行时间
--#查询用户 ID 是 6136（可以是其他 ID，下同）的所有记录，按创建时间倒序排列；
ALTER TABLE `big_data` ADD INDEX index_name(`user_id`)
SELECT * 
FROM big_data
WHERE user_id = 6136
ORDER BY created_at DESC;
--#查询用户 ID 是 6136，状态是 1 或 2 的所有记录，按创建时间倒序排列；
ALTER TABLE `big_data` ADD INDEX (`status`)
SELECT * 
FROM big_data
WHERE user_id = 6136
AND STATUS IN (1,2)
ORDER BY created_at DESC;