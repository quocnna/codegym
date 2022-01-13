CREATE DATABASE product_management;

use product_management;

CREATE TABLE customer (
	id int PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(50),
	age int
);

CREATE TABLE
`order` (
	id int PRIMARY KEY AUTO_INCREMENT,
	customer_id int,
	`date` datetime,
	total_price float,
	FOREIGN KEY (customer_id) REFERENCES customer (id)
);

CREATE TABLE product (
	id int PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(50),
	price FLOAT
);

CREATE TABLE order_detail (
	order_id int,
	product_id int,
	quantity SMALLINT,
	PRIMARY KEY (order_id, product_id)
);


-- insert data customer
INSERT INTO customer (`name`, age) VALUE('Minhh Quan', 10);
INSERT INTO customer (`name`, age) VALUE('Ngoc Oanh', 20);
INSERT INTO customer (`name`, age) VALUE('Hong Ha', 50);


-- insert data order
insert INTO `order` (customer_id, `date`) VALUE(1, '2006-03-21');
insert INTO `order` (customer_id, `date`) VALUE(2, '2006-03-23');
insert INTO `order` (customer_id, `date`) VALUE(1, '2006-03-21');

-- insert data product
INSERT into product (`name`, price) VALUE('may giat', 3);
INSERT into product (`name`, price) VALUE('tu lanh', 5);
INSERT into product (`name`, price) VALUE('dieu hoa', 7);
INSERT into product (`name`, price) VALUE('quat', 1);
INSERT into product (`name`, price) VALUE('bep dien', 2);

-- insert data order detail
INSERT INTO order_detail (order_id, product_id, quantity) VALUE(1,1,3);
INSERT INTO order_detail (order_id, product_id, quantity) VALUE(1,3,7);
INSERT INTO order_detail (order_id, product_id, quantity) VALUE(1,4,2);
INSERT INTO order_detail (order_id, product_id, quantity) VALUE(3,1,8);
INSERT INTO order_detail (order_id, product_id, quantity) VALUE(2,5,4);
INSERT INTO order_detail (order_id, product_id, quantity) VALUE(2,3,3);

-- 1
SELECT * from `order`;


-- 2
SELECT c.name, p.name FROM customer c
INNER JOIN `order` o on o.customer_id= c.id
INNER JOIN order_detail d on d.order_id= o.id
INNER JOIN product p on p.id= d.product_id;


-- 3
SELECT * from customer
WHERE id not in (SELECT customer_id FROM `order`);

SELECT * FROM customer c
LEFT JOIN `order` o on o.customer_id= c.id
WHERE o.id is NULL


-- 4
SELECT o.id as `code`, o.date as `date`, sum(p.price* d.quantity) as total from `order` o
INNER JOIN order_detail d on d.order_id= o.id
INNER JOIN product p on p.id= d.product_id
GROUP BY o.id




