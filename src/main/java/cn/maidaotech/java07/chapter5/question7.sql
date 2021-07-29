CREATE TABLE sstudent ( `id` BIGINT ( 20 ) NOT NULL auto_increment, `sno` VARCHAR ( 30 ) CHARACTER

SET utf8 DEFAULT NULL COMMENT '学号', `sna` VARCHAR ( 30 ) CHARACTER
SET utf8 DEFAULT NULL COMMENT '姓名', `ssex` TINYINT ( 1 ) not null default COMMENT '性别:1-男 2：女', PRIMARY KEY ( `id` ) )ENGINE = INNODB DEFAULT charset = utf8; /*ENGINE=INNODB auto_increment=1000 DEFAULT CHARACTER=utf8;*/

INSERT INTO sstudent ( sno, sna, ssex ) VALUES ( '201801', '江一', '1' );

INSERT INTO sstudent ( sno, sna, ssex ) VALUES ( '201802', '江二', '0' );

INSERT INTO sstudent ( sno, sna, ssex ) VALUES ( '201803', '江河', '1' );

INSERT INTO sstudent ( sno, sna, ssex ) VALUES ( '201804', '江四', '0' );

INSERT INTO sstudent ( sno, sna, ssex ) VALUES ( '201805', '江五', '1' );

INSERT INTO sstudent ( sno, sna, ssex ) VALUES ( '201806', '江六', '1' );

INSERT INTO sstudent ( sno, sna, ssex ) VALUES ( '201807', '江七', '0' );

INSERT INTO sstudent ( sno, sna, ssex ) VALUES ( '201808', '江八', '1' );

INSERT INTO sstudent ( sno, sna, ssex ) VALUES ( '201809', '江九', '1' );

INSERT INTO sstudent ( sno, sna, ssex ) VALUES ( '201810', '江十', '1' );

CREATE TABLE class( `id` BIGINT ( 20 ) NOT NULL auto_increment, `cnumber` VARCHAR ( 30 ) CHARACTER

SET utf8 DEFAULT NULL COMMENT '班号', `cname` VARCHAR ( 30 ) CHARACTER
SET utf8 DEFAULT NULL COMMENT '班级名称', PRIMARY KEY (`id`) )ENGINE = INNODB DEFAULT charset = utf8;

INSERT INTO class ( cnumber, cname) VALUES ( '01', '软工41' );

INSERT INTO class ( cnumber, cname) VALUES ( '02', '软工42' );

CREATE TABLE course( `id` BIGINT ( 20 ) NOT NULL auto_increment, `conumber` VARCHAR ( 30 ) CHARACTER

SET utf8 DEFAULT NULL COMMENT '课程号', /*`conumber` VARCHAR ( 30 ) NOT NULL COMMENT '课程号',*/ `coname` VARCHAR ( 50 ) CHARACTER
SET utf8 DEFAULT NULL COMMENT '课程名称', `cocharacter` VARCHAR ( 30 ) CHARACTER
SET utf8 DEFAULT NULL COMMENT '课程性质', /*'type' tinyint（4）默认值为4 not null comment '1-必修:2-选修'*/ PRIMARY KEY (`id`) );

INSERT INTO course ( conumber, coname, cocharacter ) VALUES ( '001', '计算机导论', '选修课' );

INSERT INTO course ( conumber, coname, cocharacter ) VALUES ( '002', '数据结构', '必修课' );

INSERT INTO course ( conumber, coname, cocharacter ) VALUES ( '003', '软件工程', '必修课' );

CREATE TABLE score( `id` BIGINT ( 20 ) NOT NULL auto_increment, `cou_id` VARCHAR ( 30 ) CHARACTER

SET utf8 DEFAULT NULL COMMENT '课程号', `stu_id` VARCHAR ( 30 ) CHARACTER
SET utf8 DEFAULT NULL COMMENT '学号', `sscore` VARCHAR ( 30 ) CHARACTER
SET utf8 DEFAULT NULL COMMENT '成绩', PRIMARY KEY (`id`) );

INSERT INTO score(cou_id,stu_id,sscore)VALUES('001','201801','90');

INSERT INTO score(cou_id,stu_id,sscore)VALUES('002','201810','40');

CREATE TABLE stu_class( `id` BIGINT(20)NOT NULL auto_increment, `stu_id` VARCHAR(30) CHARACTER

SET utf8 default null comment'学号', `cla_id` VARCHAR(30) CHARACTER
SET utf8 default null comment'班级号', PRIMARY KEY(`id`) )ENGINE=INNODB DEFAULT charset=utf8;

INSERT INTO stu_class(stu_id,cla_id)VALUES('201801','01');

INSERT INTO stu_class(stu_id,cla_id)VALUES('201802','01');

INSERT INTO stu_class(stu_id,cla_id)VALUES('201803','01');

INSERT INTO stu_class(stu_id,cla_id)VALUES('201804','01');

INSERT INTO stu_class(stu_id,cla_id)VALUES('201805','01');

INSERT INTO stu_class(stu_id,cla_id)VALUES('201806','02');

INSERT INTO stu_class(stu_id,cla_id)VALUES('201807','02');

INSERT INTO stu_class(stu_id,cla_id)VALUES('201808','02');

INSERT INTO stu_class(stu_id,cla_id)VALUES('201809','02');

INSERT INTO stu_class(stu_id,cla_id)VALUES('201810','02');

CREATE TABLE stu_course( `id` BIGINT(20) not null auto_increment, `stu_id` VARCHAR (30) CHARACTER

SET utf8 DEFAULT NULL COMMENT '学号', `cou_id` VARCHAR (30) CHARACTER
SET utf8 DEFAULT NULL COMMENT '课程号', PRIMARY KEY(`id`) );

INSERT INTO stu_course(stu_id,cou_id) VALUES('201801','001');

INSERT INTO stu_course(stu_id,cou_id) VALUES('201801','002');

INSERT INTO stu_course(stu_id,cou_id) VALUES('201801','003');

INSERT INTO stu_course(stu_id,cou_id) VALUES('201802','001');

INSERT INTO stu_course(stu_id,cou_id) VALUES('201803','001');

INSERT INTO stu_course(stu_id,cou_id) VALUES('201804','001');