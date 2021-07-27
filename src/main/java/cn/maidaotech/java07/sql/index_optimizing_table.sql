CREATE TABLE big_data (
	`id`BIGINT(20) UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "id",
	`user_id`BIGINT(20) UNSIGNED NOT NULL COMMENT "用户id",
	`username`VARCHAR(50) CHARACTER SET utf8mb4 NOT NULL COMMENT "用户名",
	`amount`INT(11) NOT NULL COMMENT "年龄",
	`status`TINYINT(1) NOT NULL COMMENT "状态",
	`created_at` BIGINT ( 20 ) NOT NULL COMMENT "创建时间",
	`updated_at` BIGINT ( 20 ) NOT NULL COMMENT "修改时间",
)ENGINE=INNODB AUTO_INCREMENT = 10000 CHARSET = utf8;

	#设置sql参数
SET GLOBAL log_bin_trust_function_creators = 1;

set global log_bin_trust_function_creators=1;
DELIMITER $$
CREATE PROCEDURE insert_data(IN START INT(10),IN max_num INT(10))  
BEGIN  
DECLARE i INT DEFAULT 0;   
#set autocommit =0 把autocommit设置成0  
 SET autocommit = 0;    
 REPEAT  
 SET i = i + 1;  
 INSERT INTO big_data (user_id,username,amount,status,created_at,updated_at  ) 
VALUES (CONCAT('1',CEILING(RAND()*90000+10000)),uuid(),FLOOR(18 + (RAND() * 7)),floor(rand()*2),CONCAT('1',CEILING(RAND()*900000000+100000000)),CONCAT('1',CEILING(RAND()*900000000+100000000)));  
 UNTIL i = max_num  
 END REPEAT;  
 COMMIT;  
 END $$

DELIMITER ;
CALL insert_data(10001,2000000);