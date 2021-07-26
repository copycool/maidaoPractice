```sql
# 外键索引
ALTER TABLE `score` ADD KEY `idx_sno`(sno);
ALTER TABLE `score` ADD KEY `idx_cno`(cno);
ALTER TABLE `student` ADD KEY `idx_clazzid`(clazz_id);

# 联查表
ALTER TABLE `clazz_course` ADD KEY `idx_cnoclazzid`(cno,clazz_id);

# 业务需求
ALTER TABLE `score` ADD KEY `idx_score`(score);

```