# Write your MySQL query statement below
select Signups.user_id ,
ROUND(SUM(CASE WHEN Confirmations.action = 'confirmed' THEN 1 ELSE 0 END) 
/ COUNT(*),2) AS confirmation_rate
from Signups
LEFT OUTER JOIN Confirmations 
ON Signups.user_id = Confirmations.user_id
group by Signups.user_id