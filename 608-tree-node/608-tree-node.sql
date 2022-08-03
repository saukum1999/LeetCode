# Write your MySQL query statement below


select id As 'Id',
    case
        when id = (select a.id from tree a where a.p_id is null) then 'Root'
        when id in (select b.p_id from tree b) then 'Inner'
        else  'Leaf'
    end as type
from tree
order by id;