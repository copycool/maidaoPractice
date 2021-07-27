-- 分析上一题中SELECT查询语句的执行效率，并创建索引进行优化

select * from student7 order by sno;
alter table student7 add key s_no(sno);
explain select * from student7 order by sno;