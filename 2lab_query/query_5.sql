SELECT class FROM Ships, Outcomes
WHERE Outcomes.ship = Ships.name AND result='sunk'
UNION
SELECT class FROM Classes, Outcomes
WHERE Outcomes.ship = Classes.class AND result='sunk'; 
