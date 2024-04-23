# Write your MySQL query statement below

SELECT product_name, SUM(unit) as unit
FROM products
JOIN Orders
ON Products.product_id = Orders.product_id
where LEFT(order_date,7)= '2020-02'
group by Products.product_id 
having SUM(unit) >= 100