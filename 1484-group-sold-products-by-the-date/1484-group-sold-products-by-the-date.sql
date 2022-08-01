# Write your MySQL query statement below


# select a.sell_date , 
#     count(a.product) num_sold,
#     string_agg(a.product,',') within group( order by a.product)  products
# from (select distinct sell_date, product from activities) a
# group by a.sell_date
# order by a.sell_date;

SELECT 
    sell_date,
    COUNT(DISTINCT product) AS num_sold,
    GROUP_CONCAT(DISTINCT product ORDER BY product) AS products
FROM Activities
GROUP BY sell_date;