USE Labor_SQL;
SELECT DISTINCT Product.model, Product.maker 
FROM PC 
INNER JOIN Product 
ON PC.model = Product.model 
WHERE price <= 600;