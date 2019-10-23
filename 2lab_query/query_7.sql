USE Labor_SQL;
SELECT Product.maker, MIN(Printer.price) FROM Printer, Product
WHERE Product.type = "Printer";