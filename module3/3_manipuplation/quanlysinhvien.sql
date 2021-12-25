CREATE DATABASE IF NOT EXISTS quanlysinhvien;

use quanlysinhvien;

CREATE TABLE IF NOT EXISTS class (
	id INT PRIMARY KEY,
	`name` VARCHAR(50) NOT NULL,
	start_date DATETIME NOT NULL,
	`status` BIT
);

ALTER TABLE `class` CHANGE COLUMN `id` `id` INT(11) AUTO_INCREMENT;

CREATE TABLE IF NOT EXISTS student (
	id int PRIMARY KEY NOT NULL AUTO_INCREMENT,
	`name` varchar(30) NOT NULL,
	address varchar(50),
	phone varchar(20),
	`status` bit,
	class_id int NOT NULL,
	FOREIGN KEY (class_id) REFERENCES class (id)
);

CREATE TABLE IF NOT EXISTS `subject` (
	id int PRIMARY KEY AUTO_INCREMENT,
	`name` VARCHAR(30) NOT NULL,
	credit tinyint NOT NULL DEFAULT 1,
	`status` bit DEFAULT 1,
	CHECK (Credit >= 1)
);

CREATE TABLE IF NOT EXISTS mark (
	id int PRIMARY KEY AUTO_INCREMENT,
	sub_id int NOT NULL,
	student_id int NOT NULL,
	mark float DEFAULT 0,
	exam_times tinyint DEFAULT 1,
	UNIQUE (sub_id, student_id),
CHECK (mark BETWEEN 0 AND 100),
FOREIGN KEY (sub_id) REFERENCES `subject` (id),
FOREIGN KEY (student_id) REFERENCES student (id)
);

-- insert classs
INSERT INTO class (`name`, start_date, `status`) value ('C0420G1', '2020-12-15', 1);
INSERT INTO class value (2, 'C0420G1', '2020-12-15', 1);
UPDATE CLASS set `name`= 'C03' WHERE id=1;

insert into student (`name`, address, phone, `status`, class_id) VALUE('quoc', '19 le do', '0708', 1, 1);
insert into student (`name`, address, phone, `status`, class_id) VALUE('dung', '19 le do', '0708', 1, 2);
SELECT * from student;
SELECT `name` from student;

SELECT * from student s
INNER JOIN class c on s.class_id= c.id;

insert into `subject` (name, credit, `status`) VALUE('java', 10, 1);
insert into mark(sub_id, student_id, mark, exam_times) VALUE(1, 1, 8.5, 2);

-- 1
select * from student
where `name` like 'h%';

-- 2
select * from class
where month(start_date) = 12;

-- 3
select * from subject
where credit between 3 and 5;

-- 4
update student set id= 2 where `name`= 'Hung';

-- 5
select s.name as 'Student Name', u.name as 'Subject Name', m.mark from mark m
inner join student s on s.id= m.student_id
inner join subject u on u.id= m.sub_id
order by m.mark desc, s.name asc;





