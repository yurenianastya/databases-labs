USE Labor_SQL;
SELECT DISTINCT p1.maker,
CASE 
  WHEN(SELECT count(model) FROM Printer WHERE model IN
  (SELECT p2.model FROM Product p2 WHERE p2.maker=p1.maker)) 
  THEN concat('yes(', 
  ((SELECT count(model)FROM Printer WHERE model IN
  (SELECT p2.model FROM Product p2 WHERE p2.maker = p1.maker))) ,')')
  ELSE 'no' 
END Printer
FROM Product p1 GROUP BY p1.maker