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