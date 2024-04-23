# Write your MySQL query statement below

select activity_date as day, COUNT(DISTINCT user_id) as active_users
from activity
where activity_date between '2019-06-28' AND '2019-07-27'
group by activity_date