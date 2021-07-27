schoolbig_dataCREATE TABLE IF NOT EXISTS `big_data`(
	`id` BIGINT(20) not null auto_increment PRIMARY KEY  COMMENT '自增主键',
	`user_id` BIGINT(20) not null COMMENT '用户主键',
	`username` VARCHAR(50) not null  COMMENT '用户名',
	`amount` int(11) not NULL COMMENT '年龄',
	`status` TINYINT(1) not null COMMENT '状态',
	`created_at` BIGINT(20) not null COMMENT '创建时间',
	`updated_at` BIGINT(20) not null COMMENT '更新时间'
)ENGINE=INNODB auto_increment=10000 CHARSET=utf8;




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
VALUES (CONCAT('1',ceiling(RAND()*900000+100000)),uuid(),floor(18 + (RAND() * 7)),floor(rand()*2),CONCAT('1',CEILING(RAND()*900000000+100000000)),CONCAT('1',CEILING(RAND()*900000000+100000000)));  
 UNTIL i = max_num  
 END REPEAT;  
 COMMIT;  
 END $$

DELIMITER ;
CALL insert_data(10001,2000000);

