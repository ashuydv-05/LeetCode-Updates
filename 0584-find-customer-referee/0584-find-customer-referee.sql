# Write your MySQL query statement below
-- SELECT id FROM Customer WHERE referee_id NOT IN(2) OR referee_id = null ;

-- SELECT id FROM Customer WHERE referee_id IN(1,null) ;
SELECT name FROM Customer WHERE referee_id NOT IN(2) OR referee_id is NULL ;