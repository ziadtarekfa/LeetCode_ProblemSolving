# Write your MySQL query statement below
select project_id, ROUND(AVG(experience_years),2) as average_years
from Project
INNER JOIN Employee
ON Project.employee_id = Employee.employee_id
group by project_id
