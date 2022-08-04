# Write your MySQL query statement below

select w.id from
weather w ,weather a
where w.temperature > a.temperature and to_days(w.recorddate)-to_days(a.recorddate)=1;