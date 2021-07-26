CREATE TABLE IF NOT EXISTS `student`(
    `id` bigint(20) NOT NULL AUTO_INCREMENT,
    `first_name` varchar(30) CHARACTER SET utf8mb4 DEFAULT NULL,
    `last_name` varchar(30) CHARACTER SET utf8mb4 DEFAULT NULL,
    `sex` varchar(20) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '昵称',
    `school` varchar(30) CHARACTER SET utf8mb4 DEFAULT NULL,
    PRIMARY KEY (`id`)
)
alter table student modify sex  tinyint(1) unsigned  COMMENT '性别 0代表女 1代表男';
