USE Labor_SQL;
SELECT DISTINCT maker FROM Product
WHERE type='PC' AND maker NOT IN 
(SELECT maker FROM Product WHERE NOT EXISTS 
(SELECT * FROM PC WHERE PC.model=Product.model) AND type= 'PC'); 
