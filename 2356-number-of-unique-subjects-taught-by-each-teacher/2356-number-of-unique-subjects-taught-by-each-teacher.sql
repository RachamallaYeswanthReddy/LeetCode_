# Write your MySQL query statement below

SELECT Teacher_id,COUNT(DISTINCT SUBJECT_ID) AS cnt FROM Teacher 
GROUP BY Teacher_id;