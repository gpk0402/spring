SELECT * FROM actor;

SELECT * FROM film 
WHERE release_year = 2006;

SELECT COUNT(*) FROM customer;

SELECT * FROM actor 
ORDER BY last_name;

SELECT * FROM film 
WHERE release_year = 2006;
LIMIT 10;

SELECT film.title, actor.first_name, actor.last_name
FROM film_actor
INNER JOIN film ON film_actor.film_id = film.film_id
INNER JOIN actor ON film_actor.actor_id = actor.actor_id;

SELECT category_id, COUNT(*) AS film_count
FROM film_category
GROUP BY category_id;

SELECT * FROM film 
WHERE rental_rate BETWEEN 2.50 AND 4.00;


SELECT AVG(amount) AS avg_payment_amount
FROM payment;

SELECT c.customer_id, c.first_name, COUNT(r.rental_id) AS num_rentals
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
GROUP BY c.customer_id
ORDER BY num_rentals DESC;

SELECT * FROM film 
ORDER BY length DESC 
LIMIT 1 
OFFSET 1;

SELECT c.*
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
WHERE f.title = 'SWEET BROTHERHOOD';





