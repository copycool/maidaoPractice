```sql
DROP TABLE IF EXISTS `big_data`;
CREATE TABLE `big_data`(
	`id` BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT "自增主键",
  `user_id` BIGINT(20) UNSIGNED NOT NULL COMMENT "用户主键",
	`username` VARCHAR(50) NOT NULL COMMENT "用户名",
	`amount` INT(11) NOT NULL COMMENT "年龄",
	`status` TINYINT(1) UNSIGNED NOT NULL COMMENT "状态",
	`created_at` BIGINT(20) NOT NULL COMMENT "创建时间戳",
	`update_at` BIGINT(20) NULL COMMENT "修改时间戳",
  PRIMARY KEY(`id`) USING BTREE
)ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT="大数据";
ALTER TABLE `big_data` CHANGE `username` `username` VARCHAR(50) CHARACTER SET utf8mb4;

/* 一个函数插入200万条数据 */
set global log_bin_trust_function_creators=1;
DELIMITER $$
CREATE PROCEDURE insert_data(IN START INT(10),IN max_num INT(10))  
BEGIN  
DECLARE i INT DEFAULT 0;   
#set autocommit =0 把autocommit设置成0  
 SET autocommit = 0;    
 REPEAT  
 SET i = i + 1;  
 INSERT INTO big_data (user_id,username,amount,status,created_at,update_at  ) 
VALUES (CONCAT('1',CEILING(RAND()*90000+10000)),uuid(),FLOOR(18 + (RAND() * 7)),floor(rand()*2),CONCAT('1',CEILING(RAND()*900000000+100000000)),CONCAT('1',CEILING(RAND()*900000000+100000000)));  
 UNTIL i = max_num  
 END REPEAT;  
 COMMIT;  
 END $$

# 执行函数，插入测试数据
DELIMITER ;
CALL insert_data(20001,2000000);

/* I */
EXPLAIN SELECT * 
FROM `big_data` 
ORDER BY `created_at`
DESC

/* II */
EXPLAIN SELECT * 
FROM `big_data`
ORDER BY `username`
ASC

/* III */
EXPLAIN SELECT *
FROM `big_data`
WHERE
id=116136
ORDER BY created_at
DESC

/* IV */
EXPLAIN SELECT *
FROM `big_data`
WHERE
user_id=116136
AND
`status` IN (1,2)
ORDER BY created_at
DESC

/* V */
SELECT *
FROM `big_data`
WHERE
id=116136
AND
amount > 5000
ORDER BY created_at
DESC

/* VI */
SELECT *
FROM `big_data`
WHERE
id=116136
AND
`status` = 1
AND
created_at >= unix_timestamp('2018-1-1 01-01-01')
ORDER BY created_at
DESC

/* VII */
SELECT *
FROM `big_data`
WHERE
username="mbk"
AND
`status`=5
ORDER BY created_at
DESC

/* VIII */
SELECT COUNT(*) AS "总数",SUM(amount) AS "总金额",`status`
FROM `big_data`
GROUP BY `status`

/* 索引 */
ALTER TABLE `big_data` ADD KEY `idx_userid`(user_id);
ALTER TABLE `big_data` ADD KEY `idx_created`(created_at);
ALTER TABLE `big_data` ADD KEY `idx_username`(username);
ALTER TABLE `big_data` ADD KEY `idx_amount`(amount);
```