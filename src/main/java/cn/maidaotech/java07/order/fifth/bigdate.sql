
CREATE TABLE `big_data` (
  `id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '自增主键',
  `user_id` bigint(20) unsigned NOT NULL COMMENT '用户主键',
  `username` varchar(50) NOT NULL COMMENT '用户名',
  `amount` int(11) NOT NULL COMMENT '年龄',
  `status` tinyint(1) NOT NULL COMMENT '状态',
  `created_at` bigint(20) NOT NULL COMMENT '创建时间',
  `updated_at` bigint(20) NOT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`,`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2010001 DEFAULT CHARSET=utf8;

