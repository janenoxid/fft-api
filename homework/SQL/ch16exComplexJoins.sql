SELECT * 
FROM seeds
INNER JOIN garden_bed ON seeds.plant_id = garden_bed.plant_id
INNER JOIN plant ON seeds.plant_id = plant.plant_id;

INSERT INTO seeds (expiration_date, quantity, reorder, plant_id)
VALUES ("2021-08-05", 100, false, (SELECT plant_id FROM plant WHERE (plant_name LIKE 'Hosta')));