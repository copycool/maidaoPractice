CREATE TABLE big_data (
	`id`BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id",
	`user_id`BIGINT(20) UNSIGNED NOT NULL COMMENT "用户id",
	`username`VARCHAR(50) CHARACTER SET utf8mb4 NOT NULL COMMENT "用户名",
	`amount`INT(11) NOT NULL COMMENT "年龄",
	`status`TINYINT(1) NOT NULL COMMENT "状态",
	`created_at` BIGINT ( 20 ) NOT NULL COMMENT "创建时间",
	`updated_at` BIGINT ( 20 ) NOT NULL COMMENT "修改时间",
	)ENGINE=INNODB AUTO_INCREMENT = 10000 CHARSET = utf8;


#查询所有记录，按创建时间倒序排列；
SELECT * FROM `big_data`  
ORDER BY  `created_at` DESC;
#查询所有记录，按用户名正序排列；
SELECT * FROM `big_data`  
ORDER BY  `username` ASC;
#查询用户ID是6136（可以是其他ID，下同）的所有记录，按创建时间倒序排列；
#
SELECT * FROM `big_data` WHERE(
user_id=186670 
)ORDER BY `created_at` DESC;
#查询用户ID是6136，状态是1或2的所有记录，按创建时间倒序排列；
#
SELECT * FROM `big_data` WHERE (
user_id=186670 AND `status`=1 or `status`=2 
)ORDER BY `created_at` DESC;
#查询用户ID是6136，金额超过5000的所有记录，按创建时间倒序排列；
SELECT * FROM `big_data` WHERE (
user_id=186670 AND `amount`>5
) ORDER BY `created_at` DESC;

#查询用户ID是6136，状态是1，2018（包含）年以来的所有记录，按创建时间倒序排列；
SELECT * FROM `big_data` WHERE (
user_id=186670 AND `status`=1 AND `created_at`>100000 
)ORDER BY `created_at` DESC;

#查询用户名为”mbk“，状态为5的所有记录，按修改时间倒序排列；
SELECT * FROM `big_data` WHERE (
username='mbk' AND `status`=5  
)ORDER BY `updated_at` DESC;

#查询各个状态的记录总数，和总金额；
SELECT COUNT(*),sum(amount) FROM `big_data` 
GROUP BY `status` ORDER BY `created_at` DESC;

#索引示例
ALTER TABLE `big_data`  ADD KEY `created_at`(`created_at`);










