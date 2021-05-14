UPDATE seeds
SET use_by = 2021
WHERE seed_id = 1;

UPDATE seeds
set use_by = 2086, crop = "forsythia"
WHERE seed_id = 4;

ALTER TABLE seeds
ADD expired boolean;

UPDATE seeds
SET expired = false
WHERE use_by > 2021;