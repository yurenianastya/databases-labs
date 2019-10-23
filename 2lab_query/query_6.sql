USE Labor_SQL;
SELECT
SUBSTRING(place, 1, 1) AS place_num,
SUBSTRING(place, 2, 1) AS place_letter
FROM Pass_in_trip;