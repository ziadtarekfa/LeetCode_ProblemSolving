# Write your MySQL query statement below
select contest_id, ROUND(COUNT(*) / (select COUNT(*)
from Users)*100 ,2)as percentage
from Register 
group by contest_id
order by percentage desc, contest_id ASC