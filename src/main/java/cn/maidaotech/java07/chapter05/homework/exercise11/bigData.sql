create table if not exists `big_data`(
	 `id` bigint(20) unsigned not null auto_increment comment '自增主键',
	 `user_id` bigint(20) unsigned not null comment '用户主键',
	 `username` varchar(50) character set utf8mb4 not null comment '用户名',
	 `amount` int(11) not null comment '年龄',
	 `status` tinyint(1) unsigned not null comment '状态',
	 `create_at` bigint(20) not null comment '创建时间',
	 `update_at` bigint(20) comment '修改时间',
	 primary key (`id`)
)engine=INNODB auto_increment=10000 charset=utf8;


set global log_bin_trust_function_creators=1;

drop function IF EXISTS rand_string;
delimiter $$
create function rand_string(min int,max int) returns varchar(255)
begin
  declare chars_str varchar(100) default 'abcdefghijklmnopqrstuvwxyz';
	declare return_str varchar(255) default '';
	declare i int default 0;
	while i < floor(rand()*(max-min))+min do
	 set return_str = concat(return_str,substring(chars_str,floor(1+rand()*26),1));
	 set i = i + 1;
  end while;
 return return_str;
end $$


drop function IF EXISTS rand_num;
delimiter $$
  create function rand_num(bound int) returns int(11)
  begin
    declare i int default 0;
		set i = floor(rand()*bound);
	return i;
end$$


drop function IF EXISTS rand_date;
delimiter $$
 create function rand_date(n bigint) returns bigint
 begin
   declare i bigint default 0;
	 set i = REPLACE(UNIX_TIMESTAMP(CURRENT_TIMESTAMP(3)), '.', '')-floor(rand()*n);
 return i;
end$$

set global log_bin_trust_function_creators=1;
DELIMITER $$
CREATE PROCEDURE insert_big_data2(IN START INT(10),IN max_num INT(10))
BEGIN
DECLARE i INT DEFAULT 0; 
#set autocommit =0 把autocommit设置成0
 SET autocommit = 0;
 REPEAT  
 SET i = i + 1;
 INSERT INTO big_data (user_id,username,amount,status,create_at,update_at)
 VALUES (CONCAT('1',CEILING(RAND()*90000+10000)),uuid(),FLOOR(18 + (RAND() * 7)),floor(rand()*2),CONCAT('1',CEILING(RAND()*900000000+100000000)),CONCAT('1',CEILING(RAND()*900000000+100000000)));
 UNTIL i = max_num
 END REPEAT;
 COMMIT;
 END $$

DELIMITER ;
CALL insert_big_data2(10001,2000000);


-- 查询如下数据，记录执行时间
-- 查询所有记录，按创建时间倒序排列；
-- 查询所有记录，按用户名正序排列；
-- 查询用户ID是6136（可以是其他ID，下同）的所有记录，按创建时间倒序排列；
-- 查询用户ID是6136，状态是1或2的所有记录，按创建时间倒序排列；
-- 查询用户ID是6136，金额超过5000的所有记录，按创建时间倒序排列；
-- 查询用户ID是6136，状态是1，2018（包含）年以来的所有记录，按创建时间倒序排列；
-- 查询用户名为”mbk“，状态为5的所有记录，按修改时间倒序排列；
-- 查询各个状态的记录总数，和总金额；
-- 创建索引优化上述查询，分析上述查询的效率，记录命中的索引及select查询的执行时间

--1
select * from big_data order by create_at desc;
select * from big_data order by create_at desc limit 0,10;
alter table big_data add key `createat`(`create_at`);
--2
select * from big_data order by username;
--3
select * from big_data where user_id=158613 order by create_at desc;
alter table big_data add key `userid_createat`(`userid`,`create_at`);
--4
select * from big_data where  user_id=158613  and status in(0,1) order by create_at desc;
alter table big_data add key `userid_status_createat`(`user_id`,`status`,`create_at`)
--5
select * from big_data where user_id=158613 and amount>20 order by create_at desc;
--6
select * from big_data where user_id=158613 and status=1 and create_at>1514736000 order by create_at desc;
--7
select * from big_data where username='571f0deb-edae-11eb-8c8e-54bf644d44a2' and status=1 order by create_at desc;
alter table big_data add key `username_status_createat`(`username`,`status`,`create_at`)
--8
select count(*)as count,sum(amount) as total_amount from big_data group by status;
--9
alter table big_data add key createAt(create_at);
