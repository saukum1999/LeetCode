/* Write your T-SQL query statement below */


select distinct viewer_id as id
from views
where
author_id = viewer_id
