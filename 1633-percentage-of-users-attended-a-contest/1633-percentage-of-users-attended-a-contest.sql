# Write your MySQL query statement below
select contest_id, 
    ROUND(COUNT(user_id)* 100 / (select count(*) from users), 2)  as percentage   
from register r
group by contest_id
order by ROUND(COUNT(user_id)* 100 / (select count(*) from users), 2)  desc, contest_id
