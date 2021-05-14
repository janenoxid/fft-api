SELECT title, isbn 
FROM book, genre
WHERE genre.genres = "mystery";

SELECT title, first_name, last_name
FROM book
INNER JOIN author ON book.author_id = author.author_id
WHERE deathday IS NULL;

UPDATE book
SET available = false;

INSERT INTO loan 
VALUES (CURRENT DATE, )