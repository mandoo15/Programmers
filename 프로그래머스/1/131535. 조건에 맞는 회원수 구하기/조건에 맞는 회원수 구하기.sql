-- 코드를 입력하세요
SELECT COUNT(USER_ID)
FROM USER_INFO
WHERE AGE BETWEEN 20 AND 29
AND YEAR(JOINED) = 2021;
