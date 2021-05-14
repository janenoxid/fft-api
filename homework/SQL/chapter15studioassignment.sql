SELECT title
FROM movies;

SELECT title, year_released
FROM movies
ORDER BY year_released;

SELECT * 
FROM directors
ORDER BY country ASC;

SELECT * 
FROM directors
ORDER BY country ASC, last_name ASC;

INSERT INTO directors (first_name, last_name, country)
VALUES ("Rob", "Reiner", "USA");

SELECT last_name, director_id
FROM directors
WHERE last_name="Reiner"; 

INSERT INTO movies (title, year_released, director_id)
VALUES ("The Princess Bride", 1987, 11);

SELECT * 
FROM movies
INNER JOIN directors ON movies.director_id = directors.director_id;

SELECT *
FROM movies
INNER JOIN directors ON movies.director_id = directors.director_id;

SELECT title, first_name, last_name
FROM directors
RIGHT JOIN movies ON directors.director_id = movies.director_id
ORDER BY last_name;

select first_name, last_name
FROM movies, directors
WHERE title = "The Incredibles" AND movies.director_id = directors.director_id;

SELECT last_name, country
FROM directors
INNER JOIN movies ON directors.director_id = movies.director_id AND movies.title = "Roma";

DELETE FROM movies WHERE movie_id = 4;

DELETE FROM directors WHERE director_id = 1;