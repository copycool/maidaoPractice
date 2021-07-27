#a
#i
select * form big_data;
#ii
select * from big_data order by username ;
#iii
select * from big_data where user_id=19999 order by created_at desc;
#iv
select * from big_data where user_id=19999 and status in (1,2) order by created_at desc;
#v
select * from big_data where user_id=19999 and amount >20 order by created_at desc;
#vi
select * from big_data where user_id=19999 and status =1 and created_at>1514736000 order by created_at desc;
#vii
select * from big_data where username ='3a073fae-eebc-11eb-977b-04d4c4dddf35' and status=1 order by updated_at desc;
#viii
select  count(status) 总数,sum(amount) 总金额 from big_data group by status;
#b
alter table big_data add key uid_status(user_id,status);
select * from big_data where user_id=19999 and status =1 and created_at>1514736000 order by created_at desc;
 explain select * from big_data where user_id=19999 and status =1 and created_at>1514736000 order by created_at desc
 explain select * from big_data where user_id=19999 and amount >20 order by created_at desc;
 explain select * from big_data where status=1  and username ='3a073fae-eebc-11eb-977b-04d4c4dddf35'  order by updated_at desc;
