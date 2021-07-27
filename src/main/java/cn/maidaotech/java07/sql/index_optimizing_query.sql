ALTER TABLE big_data ADD KEY `index_userid` (`user_id`);
#向amount添加索引
ALTER TABLE big_data ADD KEY `index_amount` (`amount`);
#向created_at添加普通索引
ALTER TABLE big_data ADD KEY `index_createdat`(`created_at`);

#查询所有记录，按创建时间倒序排列 
SELECT * FROM big_data ORDER BY `created_at` DESC;#5.4s

#查询所有记录，按用户名正序排列；
SELECT * FROM big_data ORDER BY `username`;

#查询用户ID是16136（可以是其他ID，下同）的所有记录，按创建时间倒序排列；
SELECT * FROM big_data WHERE user_id = 16136 ORDER BY created_at DESC;

#查询用户ID是16136，状态是1或2的所有记录，按创建时间倒序排列；
SELECT * FROM big_data WHERE `status`IN (1,2) AND user_id = 16136 ORDER BY created_at DESC;

#查询用户ID是6136，金额超过5000的所有记录，按创建时间倒序排列；
SELECT * FROM big_data WHERE user_id = 16136 AND amount >20 ORDER BY created_at DESC;

#查询用户ID是6136，状态是1，2018（包含）年以来的所有记录，按创建时间倒序排列；
SELECT * FROM big_data WHERE user_id = 14732 AND amount = 1 AND created_at > 1964860561 ORDER BY created_at DESC;

#查询用户名为”mbk“，状态为5的所有记录，按修改时间倒序排列
SELECT * FROM big_data WHERE amount = 1 AND username = "mbk" ORDER BY updated_at DESC;

#查询各个状态的记录总数，和总金额；
SELECT `status`'状态码',COUNT(*)'状态总数',SUM(amount)'总金额' FROM big_data GROUP BY `status`

#创建索引优化上述查询，分析上述查询的效率，记录命中的索引及select查询的执行时间