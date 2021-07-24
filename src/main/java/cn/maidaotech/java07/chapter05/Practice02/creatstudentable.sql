CREATE TABLE IF NOT EXISTS `student`(
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(30) CHARACTER SET utf8mb4 DEFAULT NULL,
    `last_name` varchar(30) CHARACTER SET utf8mb4 DEFAULT NULL,
    `sex` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '昵称',
    `school` varchar(30) CHARACTER SET utf8mb4 DEFAULT NULL,
    PRIMARY KEY (`id`)
)
alter table student modify sex  varchar(8) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '性别';
