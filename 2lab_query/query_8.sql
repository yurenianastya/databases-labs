USE Labor_SQL;
SELECT maker, max(price) FROM PC
INNER JOIN Product 
ON Product.model=PC.model 
GROUP BY maker;