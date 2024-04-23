# Write your MySQL query statement below
# filter employees to employees with salaries less than 30000
# INNER join these employees where manager_id = employee_id


SELECT emp.employee_id
from employees emp
LEFT JOIN employees manag
ON emp.manager_id = manag.employee_id
where emp.salary < 30000 AND emp.manager_id is not null AND manag.employee_id is NULL
ORDER BY emp.employee_id