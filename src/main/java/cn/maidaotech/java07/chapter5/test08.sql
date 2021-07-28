
#班级表
CREATE TABLE `class_table`  (
  `classId` int NOT NULL AUTO_INCREMENT PRIMARY KEY COMMENT "班级id",
  `class_no` int NOT NULL COMMENT '班级编号',
  `class_name` varchar(20)  NOT NULL COMMENT '班级名称'
) ENGINE = InnoDB AUTO_INCREMENT = 1000 CHARACTER SET = utf8 ;

INSERT INTO `class_table` VALUES (1, 1, '一班');
INSERT INTO `class_table` VALUES (2, 2, '二班');

#课程表
CREATE TABLE `course_table`  (
  `cid` int NOT NULL AUTO_INCREMENT,
  `course_no` int NOT NULL COMMENT '课程编号',
  `course_name` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '学科名',
  `course_type` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '课程类型',
  PRIMARY KEY (`cid`) USING BTREE,
  UNIQUE INDEX `uk_sno`(`course_no`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

#插入信息
INSERT INTO `course_table` VALUES (1, 1, '语文', '必修课');
INSERT INTO `course_table` VALUES (2, 2, '音乐', '选修课');
INSERT INTO `course_table` VALUES (3, 3, '体育', '选修课');

#成绩表
CREATE TABLE `score`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `snumber` int NOT NULL COMMENT '学号',
  `course_no` int NOT NULL COMMENT '课程编号',
  `scores` int NULL DEFAULT 0,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

INSERT INTO `score` VALUES (1, 2021001, 1, 77);
INSERT INTO `score` VALUES (2, 2021001, 2, 50);
INSERT INTO `score` VALUES (3, 2021001, 3, 80);
INSERT INTO `score` VALUES (4, 2021002, 1, 50);
INSERT INTO `score` VALUES (5, 2021002, 2, 80);
INSERT INTO `score` VALUES (6, 2021003, 1, 77);
INSERT INTO `score` VALUES (7, 2021003, 3, 40);
INSERT INTO `score` VALUES (8, 2021004, 1, 90);
INSERT INTO `score` VALUES (9, 2021004, 2, 90);
INSERT INTO `score` VALUES (10, 2021004, 3, 81);
INSERT INTO `score` VALUES (11, 2021005, 1, 77);
INSERT INTO `score` VALUES (12, 2021005, 2, 99);
INSERT INTO `score` VALUES (13, 2021006, 1, 80);
INSERT INTO `score` VALUES (14, 2021007, 1, 77);
INSERT INTO `score` VALUES (15, 2021007, 2, 77);
INSERT INTO `score` VALUES (16, 2021007, 3, 77);
INSERT INTO `score` VALUES (17, 2021008, 1, 77);
INSERT INTO `score` VALUES (18, 2021008, 3, 50);
INSERT INTO `score` VALUES (19, 2021009, 1, 40);
INSERT INTO `score` VALUES (20, 2021009, 2, 60);
INSERT INTO `score` VALUES (21, 2021009, 3, 80);
INSERT INTO `score` VALUES (22, 2021010, 1, 77);
INSERT INTO `score` VALUES (23, 2021010, 3, 77);
INSERT INTO `score` VALUES (24, 2021011, 1, 77);
INSERT INTO `score` VALUES (25, 2021011, 2, 90);
INSERT INTO `score` VALUES (26, 2021011, 3, 100);
INSERT INTO `score` VALUES (27, 2021012, 1, 100);
INSERT INTO `score` VALUES (28, 2021012, 2, 90);
INSERT INTO `score` VALUES (29, 2021012, 3, 90);

#学生表
CREATE TABLE `students`  (
  `sid` int NOT NULL AUTO_INCREMENT,
  `snumber` int NOT NULL COMMENT '学号',
  `sname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '学生姓名',
  `gender` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '性别',
  `class_no` int NOT NULL COMMENT '班级编号',
  PRIMARY KEY (`sid`) USING BTREE,
  UNIQUE INDEX `uk_sno`(`snumber`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;


INSERT INTO `students` VALUES (25, 2021001, '小白', '女', 1);
INSERT INTO `students` VALUES (26, 2021002, '陈浩', '男', 2);
INSERT INTO `students` VALUES (27, 2021003, '刘良', '女', 1);
INSERT INTO `students` VALUES (28, 2021004, '小明', '女', 2);
INSERT INTO `students` VALUES (29, 2021005, '小虎', '男', 1);
INSERT INTO `students` VALUES (30, 2021006, '张虎', '女', 2);
INSERT INTO `students` VALUES (31, 2021007, '高孙', '男', 1);
INSERT INTO `students` VALUES (32, 2021008, '小马', '男', 2);
INSERT INTO `students` VALUES (33, 2021009, '小狗', '女', 1);
INSERT INTO `students` VALUES (34, 2021010, '小猪', '男', 2);
INSERT INTO `students` VALUES (35, 2021011, '小鸟', '女', 1);
INSERT INTO `students` VALUES (36, 2021012, '小鸡', '男', 2);

SET FOREIGN_KEY_CHECKS = 1;

USE students;
SELECT *FROM students;
SELECT *FROM score;
ALTER TABLE score ADD UNIQUE KEY `uk_snumber_course`(`snumber`,`course_no`);-- 增加唯一索引

ALTER TABLE score ADD class_no INT(10) NOT NULL;-- 增加score class_no字段。
-- 修改录入错误的学生姓名、学生成绩(至少写3条)；
UPDATE students s SET sname='小赵' WHERE s.`snumber`=2021006;
UPDATE score s SET scores=80 WHERE s.`course_no`=001 AND s.`snumber`=2021007;
UPDATE score s SET scores=98 WHERE s.`course_no`=002 AND s.`snumber`=2021005;

#统计每门课的学生人数；
SELECT course_no,COUNT(*) SUM FROM score GROUP BY course_no;

#查询某一门课程不及格的学生信息；
SELECT snumber FROM score WHERE course_no=001 AND scores<60;
SELECT *FROM students WHERE snumber=ANY(
SELECT snumber FROM score WHERE course_no=001 AND scores<60);

#查询某一个学生的各科成绩；
SELECT snumber FROM students WHERE sname='小鸡';
SELECT *FROM score s WHERE s.`snumber`=(
SELECT snumber FROM students WHERE sname='小鸡');

# 查询一个班级每个学生的总成绩，并按总成绩由高到低排序；
SELECT class_no FROM class_table s WHERE s.`class_name`='一班';

SELECT snumber FROM students s WHERE s.`class_no`=(
SELECT class_no FROM class_table s WHERE s.`class_name`='一班');

#
SELECT snumber,SUM(scores) SUM FROM score s WHERE s.`snumber`=ANY(
SELECT snumber FROM students s WHERE s.`class_no`=(
SELECT class_no FROM class_table s WHERE s.`class_name`='一班')) GROUP BY snumber ORDER BY SUM DESC;

#查询每门课都大于80分的学生信息；select * from R inner join S on R.C=S.C;
SELECT * FROM students WHERE snumber NOT IN(SELECT snumber FROM score WHERE scores<80);

SELECT * FROM score WHERE snumber = 2021004;

#查询某一门课各个班级的平均学生成绩，并按成绩由高到低排序；
SELECT *FROM students INNER JOIN score USING (snumber);

#
SELECT class_no,course_no,AVG(scores) AVG FROM 
(SELECT *FROM students INNER JOIN score USING (snumber)) s
WHERE s.course_no=001 GROUP BY class_no ORDER BY AVG DESC;

#查询各科成绩最高分、最低分和平均分；
SELECT course_no,MAX(scores) FROM score GROUP BY course_no;
SELECT course_no,MIN(scores) FROM score GROUP BY course_no;
SELECT course_no,AVG(scores) FROM score GROUP BY course_no;

#
alter table score drop class_no;
