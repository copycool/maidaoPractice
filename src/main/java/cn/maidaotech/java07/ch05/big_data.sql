create table big_data(
`id` bigint(20) not null auto_increment COMMENT "自增主键",
`user_id` bigint(20) not null COMMENT "用户主键",
`username` varchar(50) not null COMMENT"用户名",
`amount`  int(11) not null COMMENT"年龄",
`status` tinyint(1) not null COMMENT"状态",
`created_at` bigint(20) not null COMMENT"创建时间戳",
`update_at` bigint(20) null COMMENT"修改时间戳",
PRIMARY KEY (`id`)  
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8;
alter table big_data modify username varchar(50) CHARACTER SET utf8mb4;

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


-- i.查询所有记录，按创建时间倒序排列；
 select * from big_data order by created_at desc;
-- ii.查询所有记录，按用户名正序排列；
select * from big_data order by username asc;

-- iii.查询用户ID是195686（可以是其他ID，下同）的所有记录，按创建时间倒序排列；
select * from big_data where user_id=195686 order by created_at desc;

-- iv.查询用户ID是195686，状态是1或0的所有记录，按创建时间倒序排列；
select * from big_data where user_id=195686 
and (`status`=1 or `status`=0) order by created_at desc;

-- v.查询用户ID是195686，年龄超过23的所有记录，按创建时间倒序排列；
select * from big_data where user_id=195686 and amount>23 ORDER BY created_at desc;

-- vi.查询用户ID是195686，状态是1，2018（包含）年以来的所有记录，按创建时间倒序排列；
select * from big_data where user_id=195686 and `status`=1 and created_at>=unix_timestamp('2018-01-01 00-00-00')
ORDER BY created_at desc;

-- vii.查询用户名为”279a3816-eecc-11eb-a2f6-6c2b593ac17a“，状态为1的所有记录，按修改时间倒序排列；
select * from big_data where username='279a3816-eecc-11eb-a2f6-6c2b593ac17a' and `status`=1 ORDER BY update_at desc;
-- viii.查询各个状态的记录总数，和总金额；
select count(*),sum(amount),`status` from big_data GROUP BY `status`;