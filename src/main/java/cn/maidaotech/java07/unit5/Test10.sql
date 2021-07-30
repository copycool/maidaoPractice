CREATE TABLE if not EXISTS `big_data`(
`id` BIGINT(20) 	NOT NULL auto_increment PRIMARY KEY COMMENT '自增主键',
`user_id` BIGINT(20) NOT NULL COMMENT"用户主键",
`username` varchar(50) NOT NULL  CHARACTER COMMENT'用户名',
`amount` int(11) NOT NULL COMMENT '年龄',
`status` TINYINT(1)  NOT NULL COMMENT'状态',
`created_at` BIGINT (20) NOT NULL COMMENT "创建时间",
`updated_at` BIGINT ( 20) DEFAULT null COMMENT "修改时间"
)ENGINE=INNODB auto_increment=10000 CHARSET=utf8;
ALTER TABLE big_data CHANGE `username` `username` VARCHAR(50) CHARACTER set utf8mb4 ;
#b_i
set global log_bin_trust_function_creators=1;
#b_ii
DELIMITER $$
CREATE PROCEDURE insert_data6(IN START INT(10),IN max_num INT(10))  
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
CALL insert_data6(10000,2000000);
#c_i
select *from big_data ORDER BY big_data.created_at DESC;
#c_ii
SELECT* FROM big_data ORDER BY big_data.username ;
#c_iii
select *FROM big_data  b WHERE b.id=66136 ORDER BY b.created_at desc;
#c_iV
SELECT *FROM big_data b WHERE b.id=16136 AND b.`status`IN(1,2)  ORDER BY b.created_at desc;
#c_v
SELECT *FROM big_data b WHERE b.amount>20 ORDER BY b.created_at  desc;
#c_vi
SELECT * from big_data b WHERE b.`status`=1 AND b.created_at >1514736000;
#c_vii
SELECT *from big_data b WHERE b.username=mbk AND b.`status`=5;
#c_viii
 SELECT COUNT(b.`status`)'记录总数' ,SUM(b.amount)'总金额' from big_data b ORDER BY b.`status`;
#d
select *FROM big_data  b WHERE b.id=6136 ORDER BY b.created_at desc;
