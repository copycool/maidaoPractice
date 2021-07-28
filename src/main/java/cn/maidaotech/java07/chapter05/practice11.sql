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

alter table big_data drop key `createdat`;
select * from big_data order by created_at desc limit 0,20; #587ms
alter table big_data add key `createdat`(`created_at`);
select * from big_data order by created_at desc limit 0,20; #1.1ms

select * from big_data where user_id=6136 order by created_at desc; #455ms
alter table big_data add key `userid_createdat`(`user_id`,`created_at`);
select * from big_data where user_id=6136 order by created_at desc; #4.7ms
