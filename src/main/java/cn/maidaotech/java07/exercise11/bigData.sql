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

drop procedure if exists insert_big_data;
delimiter $$
create procedure insert_big_data(in max_num int(10))
begin
 declare i int default 0;
 declare t bigint default 0;
 set autocommit = 0;
 repeat
  set i = i + 1;
   insert into big_data(user_id,username,amount,status,created_at,update_at)
	values
	(rand_num(10000),rand_string(3,6),rand_num(10000),rand_num(10),rand_date(100000000000),rand_date(100000000000));
  until i = max_num
  end repeat;
  commit;
end $$
