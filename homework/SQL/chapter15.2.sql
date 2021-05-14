CREATE TABLE li_wedding (
	guest_id INT,
    last_name VARCHAR(255), 
    first_name VARCHAR(255),
    attending BOOL, 
    diet VARCHAR(255)
);

CREATE TABLE johnson_vow_renewal
AS SELECT guest_id, last_name, first_name, attending, diet
FROM li_wedding
WHERE attending = 1;

INSERT INTO johnson_vow_renewal
VALUES (107, "Johnson", "Frank", 1, "Vegan");

INSERT INTO johnson_vow_renewal (guest_id, last_name, first_name)
VALUES (186, "Johnson", "Felicity");

ALTER TABLE li_wedding
ADD can_drink boolean;

SELECT last_name, first_name
FROM johnson_vow_renewal
WHERE (attending = 1) AND (diet = "Vegan");

SELECT * 
FROM johnson_vow_renewal;

UPDATE johnson_vow_renewal
SET diet="vegetarian"
WHERE guest_id=185;

DELETE FROM johnson_vow_renewal WHERE guest_id=107;