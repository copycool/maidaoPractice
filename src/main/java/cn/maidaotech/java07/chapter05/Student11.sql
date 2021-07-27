创建表big_data
CREATE DATABASE Student11;
CREATE Table big_data(
    `id` bigint(20) UNSIGNED not null AUTO_INCREMENT COMMENT '自增主键',
    `user_id` bigint(20) UNSIGNED NOT NULL COMMENT '用户主键',
    `username` VARCHAR(50) NOT NULL COMMENT '用户名',
    `amount` INT(11) NOT NULL COMMENT '年龄',
    `status` TINYINT(1) UNSIGNED NOT NULL COMMENT '状态',
    `create_at` BIGINT(20) NOT NULL COMMENT '创建时间',
    `update` BIGINT(20) COMMENT '修改时间',
    PRIMARY KEY (`key`)
);

alter table big_data auto_increment = 1000;

创建MySQL函数、存储过程，批量插入数据
设置MySQL参数：
set global log_bin_trust_function_creators=1;

创建生成随机字符串函数：
drop function IF EXISTS rand_string;
delimiter $$
create function rand_string(min int,max int) returns varchar(255)
begin
declare chars_str varchar(100) 
default 'abcdefghijklmnopqrstuvwxyz';
declare return_str varchar(255) default '';
declare i int default 0;
while i < floor(rand()*(max-min))+min do
set return_str = concat(return_str,substring(chars_str,floor(1+rand()*26),1));
set i = i + 1;
end while;
return return_str;
end $$

创建生成随机数字函数：
drop function IF EXISTS rand_num;
delimiter $$
create function rand_num(bound int) returns int(11)
begin
declare i int default 0;
set i = floor(rand()*bound);
return i;
end$$

创建生成随机时间戳函数：
drop function IF EXISTS rand_date;
delimiter $$
create function rand_date(n bigint) returns bigint
begin
declare i bigint default 0;
set i = REPLACE(UNIX_TIMESTAMP(CURRENT_TIMESTAMP(3)), '.', '')-floor(rand()*n);
return i;
end$$

创建存储过程批量生成数据：
drop procedure if exists insert_big_data;
delimiter $$
create procedure insert_big_data2(in max_num int(10))
begin
declare i int default 0;
declare t bigint default 0;
set autocommit = 0;
repeat
set i = i + 1;
insert into big_data(user_id,username,amount,status,create_at,update_at)
values
(rand_num(10000),rand_string(3,6),rand_num(10000),rand_num(10),rand_date(100000000000),rand_date(100000000000));
until i = max_num
end repeat;
commit;
end $$

调用存储过程，批量向表中插入数据
delimiter ;
call insert_big_data2(400*100);

查询所有记录，按创建时间倒序排列；
SELECT * FROM big_data ORDER BY create_at DESC;    // 0.104s

查询所有记录，按用户名正序排列；
SELECT * FROM big_data ORDER BY username ASC;   //0.113s

查询用户ID是6136（可以是其他ID，下同）的所有记录，按创建时间倒序排列；
SELECT * FROM big_data WHERE user_id = 6136 ORDER BY create_at DESC;   //0.056s

查询用户ID是6136，状态是1或2的所有记录，按创建时间倒序排列；
SELECT * FROM big_data WHERE user_id = 6136 AND (STATUS = 1 or STATUS = 2) ORDER BY create_at DESC;   //0.059s
SELECT * FROM big_data WHERE user_id = 6136 AND STATUS in( 1,2) ORDER BY create_at DESC;   //0.006s

查询用户ID是6136，金额超过5000的所有记录，按创建时间倒序排列；
SELECT * FROM big_data WHERE user_id = 6136 AND amount>5000 ORDER BY create_at DESC;     //0.053

查询用户ID是6136，状态是1，2018（包含）年以来的所有记录，按创建时间倒序排列；
SELECT * FROM big_data WHERE user_id = 6136 AND status = 1 AND update_at >2017 ORDER BY create_at DESC;   //0.059 

查询用户名为”mbk“，状态为5的所有记录，按修改时间倒序排列；
SELECT * FROM big_data WHERE username = 'ryk' AND status = 5 ORDER BY update_at DESC;   //0.071

查询各个状态的记录总数，和总金额；
SELECT status,COUNT(*) as '记录总数',sum(amount) '总金额' FROM big_data GROUP BY status ORDER BY status ASC;   //0.067

创建索引优化上述查询
ALTER TABLE big_data add key create_key (create_at);
SELECT * FROM big_data ORDER BY create_at DESC;