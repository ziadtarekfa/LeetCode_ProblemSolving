# Write your MySQL query statement below
SELECT user_id ,  CONCAT(UPPER(SUBSTRING(name,1,1)),LOWER(SUBSTRING(name FROM 2))) as name
FROM Users
order by user_id