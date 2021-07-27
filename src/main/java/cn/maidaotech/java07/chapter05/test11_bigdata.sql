CREATE TABLE big_data(
`id` BIGINT(20) UNSIGNED AUTO_INCREMENT NOT NULL COMMENT '自增主键',
`user_id` BIGINT(20) UNSIGNED NOT NULL COMMENT '用户主键',
`username` VARCHAR(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '用户名',
`amount` INT(11) SIGNED NOT NULL COMMENT '年龄',
`status` TINYINT(1) UNSIGNED NOT NULL COMMENT '状态',
`created_at` BIGINT(20) NOT NULL COMMENT '创建时间',
`update_at` BIGINT(20) DEFAULT NULL COMMENT '修改时间',
PRIMARY KEY (`id`)
)ENGINE=INNODB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8; 
SELECT *FROM big_data;
USE day23;
SET GLOBAL log_bin_trust_function_creators = 1;
 
DELIMITER $$
CREATE PROCEDURE insert_data(IN START INT(10),IN max_num INT(10))  
BEGIN  
DECLARE i INT DEFAULT 0;   
#set autocommit =0 把autocommit设置成0  
 SET autocommit = 0;    
 REPEAT  
 SET i = i + 1;  
 INSERT INTO big_data (user_id,username,amount,STATUS,created_at,updated_at  ) 
VALUES (CONCAT('1',CEILING(RAND()*90000+10000)),UUID(),FLOOR(18 + (RAND() * 7)),FLOOR(RAND()*2),CONCAT('1',CEILING(RAND()*900000000+100000000)),CONCAT('1',CEILING(RAND()*900000000+100000000)));  
 UNTIL i = max_num  
 END REPEAT;  
 COMMIT;  
 END $$

DELIMITER ;
CALL insert_data(10001,1000000);

ALTER TABLE big_data CHANGE update_at updated_at BIGINT(20) DEFAULT NULL COMMENT '修改时间';

-- 增加唯一索引 13.004s
EXPLAIN SELECT *FROM big_data WHERE user_id=144830;
ALTER TABLE big_data ADD UNIQUE KEY `uk_user_created`(`user_id`,`amount`,`created_at`);

ALTER TABLE big_data ADD UNIQUE KEY `uk_username`(`username`);


-- 查询所有记录，按创建时间倒序排列；  1.395s  1.366s
SELECT *FROM big_data ORDER BY created_at DESC LIMIT 0,100;

-- 查询所有记录，按用户名正序排列；1.532s  0.088s
SELECT *FROM big_data ORDER BY username;

-- 查询用户ID是6136（可以是其他ID，下同）的所有记录，按创建时间倒序排列；无索引0.168s  有索引0.018s
SELECT *FROM big_data WHERE user_id=171252 ORDER BY created_at DESC;

-- 查询用户ID是6136，状态是1或2的所有记录，按创建时间倒序排列  0.162s
SELECT *FROM big_data WHERE user_id=171252 AND STATUS=0 ORDER BY created_at DESC;

-- 查询用户ID是6136，金额超过5000的所有记录，按创建时间倒序排列；1.312s 0.117s
SELECT *FROM big_data WHERE user_id=171252 AND amount>20 ORDER BY created_at DESC;

-- 查询用户ID是6136，状态是1，2018（包含）年以来的所有记录，按创建时间倒序排列；1.258s 0.002s
SELECT *FROM big_data WHERE user_id=171252 AND STATUS=0 AND created_at>(SELECT DATEDIFF('2018-01-01 00:00:00','1970-01-01 00:00:00')*24*3600) ORDER BY created_at DESC;

-- 查询用户名为”mbk“，状态为5的所有记录，按修改时间倒序排列；1.265s  0.038s
SELECT *FROM big_data WHERE username='cf60f841-ee12-11eb-b5f5-2c4d54c822d1' AND STATUS=0 ORDER BY updated_at DESC;

-- 查询各个状态的记录总数，和总金额；1.327s
SELECT STATUS,COUNT(*),SUM(amount) FROM big_data GROUP BY STATUS;
