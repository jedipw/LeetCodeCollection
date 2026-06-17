# Write your MySQL query statement below
select project_id, round(avg(experience_years), 2) as average_years
from Project j
join Employee e
on j.employee_id = e.employee_id
group by project_id;