# Write your MySQL query statement below

SELECT customer_id 
from Customer
group by customer_id
having COUNT(DISTINCT product_key) >= (
SELECT COUNT(*)
FROM Product
)
