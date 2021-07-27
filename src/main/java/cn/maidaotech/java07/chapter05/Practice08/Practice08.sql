#a
select * from student_grade where stu_name='张洪磊' ;
update student_grade SET grade=95 where stu_name='张洪磊' and grade=70;

#b
select course_name,count(*) from 
student_grade sg inner join s_course c on sg.cno=c.cno   group by course_name;

#c
select * from student_grade sg having sg.grade<60;

#d
select * from student_grade where  student_id='20190101';

#e student_id in('20190101','20190102','20190103','20190104','20190105')
select stu_name '名字', sum(grade) '总分' from student_grade sg inner join s_student s on sg.student_id=s.student_id where class_id= '19级01班' group by stu_name order by sum(grade) desc;

#f
select * from s_student where student_id not in (
    select student_id from student_grade where grade <80
);

#g
select * from s_student where student_id in(
select student_id from student_grade where grade<60);

#h
select class_id,avg(grade),course_name from (
    (select class_id ,grade,cno from s_student s inner join student_grade sg on s.student_id=sg.student_id) as ss inner join s_course c
 on c.cno = ss.cno)  where course_name = '语文' group by class_id;

#i
#Max
select max(grade),course_name from (
    (select class_id ,grade,cno from s_student s inner join student_grade sg on s.student_id=sg.student_id) as ss inner join s_course c
 on c.cno = ss.cno)  group by course_name;
 #Min
 select min(grade),course_name from (
    (select class_id ,grade,cno from s_student s inner join student_grade sg on s.student_id=sg.student_id) as ss inner join s_course c
 on c.cno = ss.cno)  group by course_name;
 #avg
select avg(grade),course_name from (
    (select class_id ,grade,cno from s_student s inner join student_grade sg on s.student_id=sg.student_id) as ss inner join s_course c
 on c.cno = ss.cno)  group by course_name;