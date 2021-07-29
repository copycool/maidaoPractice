#查询所有记录，按创建时间倒序排列 
SELECT * FROM big_data ORDER BY `created_at` DESC;#8.49s
ALTER TABLE big_data ADD KEY `index_createdat` (`created_at`);
SELECT * FROM big_data ORDER BY `created_at` DESC LIMIT 0,50;#0.58s

#查询所有记录，按用户名正序排列；
SELECT * FROM big_data ORDER BY `username`;#12.179
ALTER TABLE big_data ADD KEY `index_username` (`username`);
SELECT * FROM big_data ORDER BY `username` LIMIT 0,20;#0.087s

#查询用户ID是16136（可以是其他ID，下同）的所有记录，按创建时间倒序排列；
SELECT * FROM big_data WHERE user_id = 6136 ORDER BY `created_at` DESC;#3.58s
ALTER TABLE big_data ADD KEY `index_userid` (`user_id`);
SELECT * FROM big_data WHERE user_id = 6136 ORDER BY `created_at` DESC;#0.641s

#查询用户ID是16136，状态是1或2的所有记录，按创建时间倒序排列；(使用userid索引和created_at索引)
SELECT * FROM big_data WHERE `status`IN (1,2) AND user_id = 6136 ORDER BY created_at DESC;#0.071s

#查询用户ID是6136，金额超过5000的所有记录，按创建时间倒序排列；
SELECT * FROM big_data WHERE user_id = 6136 AND amount >20 ORDER BY created_at DESC;#0.065s

#查询用户ID是6136，状态是1，2018（包含）年以来的所有记录，按创建时间倒序排列；
SELECT * FROM big_data WHERE user_id = 6136 AND amount = 1 AND created_at > 1511971200 ORDER BY created_at DESC;

#查询用户名为”mbk“，状态为5的所有记录，按修改时间倒序排列
SELECT * FROM big_data WHERE amount = 1 AND username = "mbk" ORDER BY updated_at DESC;

#查询各个状态的记录总数，和总金额；
SELECT `status`'状态码',COUNT(*)'状态总数',SUM(amount)'总金额' FROM big_data GROUP BY `status`

#创建索引优化上述查询，分析上述查询的效率，记录命中的索引及select查询的执行时间