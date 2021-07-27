#i
SELECT *FROM big_data
ORDER BY created_at DESC;
#ii
SELECT *from big_data
ORDER BY username;
#iii
SELECT *FROM big_data
WHERE user_id = 182561
ORDER BY created_at DESC;

#iv
SELECT *FROM big_data
WHERE user_id = 182561 and `status` = 1 or `status` = 2
ORDER BY created_at DESC;

#v
SELECT *FROM big_data
WHERE user_id = 182561 and amount >5000
ORDER BY created_at DESC;

#VI
SELECT *FROM big_data
WHERE user_id = 182561 AND `status` = 1 AND created_at >= unix_timestamp('2018-1-1 01-01-01')
ORDER BY created_at
 DESC;

#vii
SELECT *FROM big_data
WHERE username = 'mdk`'
AND  `status` = 5
ORDER BY update_at DESC;

#viii
SELECT COUNT(*) AS "总数",SUM(amount) AS "总金额",`status`
FROM `big_data`
GROUP BY `status`
