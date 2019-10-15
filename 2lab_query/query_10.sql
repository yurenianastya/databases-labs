SELECT class, count(name) FROM Ships 
GROUP BY class HAVING count(name)>2
UNION
SELECT class, count(ship) FROM Outcomes, Classes 
WHERE Classes.class=Outcomes.ship 
GROUP BY class HAVING count(ship)>2