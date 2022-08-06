# Write your MySQL query statement below


select a.customer_number
from(
select customer_number, count(distinct order_number) as cnt
from orders
group by customer_number
order by cnt desc) a
limit 1
;