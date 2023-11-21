# Write your MySQL query statement below

# SELECT * FROM Cinema 
# WHERE description!='boring' AND id % 2 = 1 
# ORDER BY id DESC

select id, movie, description, rating
from cinema c
where id % 2 = 1 and description <> 'boring'
order by rating desc