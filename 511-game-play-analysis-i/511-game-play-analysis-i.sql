# Write your MySQL query statement below

select player_id, min(event_date) as first_login
from activity
group by 1
order by 1;