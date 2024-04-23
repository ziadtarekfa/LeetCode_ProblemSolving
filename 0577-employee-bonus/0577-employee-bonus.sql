# Write your MySQL query statement below
select Employee.name, Bonus.bonus
from Employee
LEFT OUTER JOIN Bonus
ON Employee.empId = Bonus.empId
where bonus<1000 || bonus is NULL
