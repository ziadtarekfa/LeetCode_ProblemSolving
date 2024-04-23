
select manag.employee_id, manag.name, COUNT(*) as reports_count , ROUND(AVG(emp.age)) as average_age
from Employees emp
LEFT JOIN Employees manag
ON emp.reports_to = manag.employee_id
where manag.employee_id is not null
group by manag.employee_id
order by manag.employee_id