#a
UPDATE students SET name='王五' WHERE name='**';
UPDATE score SET score=64 WHERE score=0;
UPDATE score SET score=95 WHERE score=-1;
#b
SELECT `cno`'课程',COUNT(*)'学生人数' FROM `score` GROUP BY cno ;
#c
SELECT * FROM score left join students on score.sno = students.sno WHERE score.cno = 1 AND score.score < 60;
#d
SELECT * FROM score RIGHT join course on course.cno=score.cno where score.sno=201804;
#e
SELECT `name` '名字',SUM(score)'总成绩' FROM score LEFT join students on score.sno=students.sno  WHERE class_id=1 GROUP BY  students.`name` ORDER By SUM(score) desc;
#f
SELECT *FROM students WHERE students.sno NOT in(SELECT s.sno FROM score s WHERE score<80 );
#g
SELECT *FROM score LEFT JOIN students on score.sno=students.sno WHERE score<60;
#h
select `name`'班级',AVG(score)'平均成绩' from score AS s LEFT JOIN (SELECT sno,class.`name`  FROM students left JOIN class on students.class_id=class.id )as cc on s.sno=cc.sno  WHERE s.cno=2 GROUP BY  cc.`name` desc;
#i
SELECT course.name"课程" ,MAX(s.score)"最高分",MIN(s.score)"最低分",AVG(s.score) '平均分'FROM score as s left JOIN course on s.cno=course.cno  GROUP BY course.name


#09
CREATE INDEX id_score on score(`score`);
SELECT score.score from score WHERE score<60;
EXPLAIN SELECT score.score from score WHERE score<60;
