-- 2
SELECT
	*
FROM
	employee
WHERE
	SUBSTRING_INDEX(fullname, ' ', - 1)
	REGEXP '^[HTK]'
	AND LENGTH(fullname) <= 15;

-- 3
SELECT
	*
FROM
	employee
WHERE
	YEAR(now()) - YEAR(birthday) BETWEEN 18 AND 50
	and(address = 'Quang Tri'
		OR address = 'Quang Nam');

-- 4
SELECT
	cu.fullname,
	count(co.customer_id) number_booking
FROM
	customer cu
	JOIN customer_type ct ON ct.id = cu.customer_type_id
	JOIN contract co ON co.customer_id = cu.id
WHERE
	ct. `name` = 'Diamond'
GROUP BY
	co.customer_id
ORDER BY
	number_booking;

-- 5
SET GLOBAL sql_mode = (
SELECT
	REPLACE(@@ sql_mode, 'ONLY_FULL_GROUP_BY', ''));

SELECT
	cu.id,
	cu.fullname,
	ct. `name`,
	co.id,
	se. `name`,
	co.start_date,
	co.end_date,
	sum(se.price + cd.quantity * a.price) AS total
FROM
	customer cu
	LEFT JOIN customer_type ct ON ct.id = cu.customer_type_id
	LEFT JOIN contract co ON co.customer_id = cu.id
	LEFT JOIN service se ON se.id = co.service_id
	LEFT JOIN contract_detail cd ON cd.contract_id = co.id
	LEFT JOIN attach_service a ON a.id = cd.attach_service_id
GROUP BY
	co.customer_id;

-- 6
SELECT
	se.id,
	se. `name`,
	se.area,
	se.price,
	st. `name`
FROM
	service se
	JOIN service_type st ON st.id = se.service_type_id
WHERE
	NOT EXISTS (
		SELECT
			*
		FROM
			contract
		WHERE
			service_id = se.id
			AND start_date BETWEEN '2021-01-01'
			AND '2021-03-31');

-- 7
SELECT
	se.id,
	se. `name`,
	se.area,
	se.price,
	se.max_people,
	st. `name`
FROM
	service se
	JOIN service_type st ON st.id = se.service_type_id
WHERE
	EXISTS (
		SELECT
			*
		FROM
			contract
		WHERE
			service_id = se.id
			AND YEAR(start_date) = '2020'
			AND YEAR(start_date))
		AND NOT EXISTS (
			SELECT
				*
			FROM
				contract
			WHERE
				service_id = se.id
				AND YEAR(start_date) = '2021'
				AND YEAR(start_date));

-- 8
SELECT DISTINCT
	fullname
FROM
	customer;

SELECT
	fullname
FROM
	customer
GROUP BY
	fullname;

SELECT
	fullname
FROM
	customer
UNION
SELECT
	fullname
FROM
	customer;

-- 9
SELECT
	tmp.month,
	co.NoOfCustomers
FROM (
	SELECT
		1 AS `month`
	UNION
	SELECT
		2 AS `month`
	UNION
	SELECT
		3 AS `month`
	UNION
	SELECT
		4 AS `month`
	UNION
	SELECT
		5 AS `month`
	UNION
	SELECT
		6 AS `month`
	UNION
	SELECT
		7 AS `month`
	UNION
	SELECT
		8 AS `month`
	UNION
	SELECT
		9 AS `month`
	UNION
	SELECT
		10 AS `month`
	UNION
	SELECT
		11 AS `month`
	UNION
	SELECT
		12 AS `month`) AS tmp
	LEFT JOIN (
		SELECT
			month(start_date) AS month,
			count(customer_id) AS NoOfCustomers
		FROM
			contract
		WHERE
			YEAR(start_date) = '2020'
		GROUP BY
			month) AS co ON co.month = tmp.month;

-- 10
SELECT
	co.id,
	co.start_date,
	co.end_date,
	co.down_payment,
	COUNT(cd.attach_service_id) numOfAttachService
FROM
	contract co
	LEFT JOIN contract_detail cd ON cd.contract_id = co.id
GROUP BY
	co.id;

-- 11
SELECT
	cu.fullname,
	a. `name`,
	a.price,
	a.status,
	a.unit
FROM
	service se
	JOIN contract co ON co.service_id = se.id
	JOIN contract_detail cd ON cd.contract_id = co.id
	JOIN attach_service a ON a.id = cd.attach_service_id
	JOIN customer cu ON cu.id = co.customer_id
	JOIN customer_type ct ON ct.id = cu.customer_type_id
WHERE
	ct. `name` = 'Diamond'
	AND cu.address in('Vinh', 'Quang Ngai');

-- 12
SELECT
	co.id,
	ep.fullname,
	cu.fullname,
	cu.phone,
	se. `name`,
	sum(cd.attach_service_id),
	co.down_payment
FROM
	service se
	JOIN contract co ON co.service_id = se.id
	JOIN employee ep ON ep.id = co.empployee_id
	JOIN customer cu ON cu.id = co.customer_id
	JOIN contract_detail cd ON cd.contract_id = co.id
	JOIN attach_service a ON a.id = cd.attach_service_id
WHERE (co.start_date BETWEEN '2020-10-01'
	AND '2020-12-30')
and(co.start_date NOT BETWEEN '2021-01-01'
	AND '2021-06-30')
GROUP BY
	co.id
	-- 13.  Hiển thị thông tin các Dịch vụ đi kèm được sử dụng nhiều nhất bởi các Khách hàng đã đặt phòng. (Lưu ý là có thể có nhiều dịch vụ có số lần sử dụng nhiều như nhau).
	-- CREATE TEMPORARY TABLE if not EXISTS tmp
	-- SELECT  a.`name`, count(cd.attach_service_id) numOfAttachServer FROM attach_service a
	-- JOIN contract_detail cd on cd.attach_service_id= a.id
	-- GROUP BY cd.attach_service_id;
	-- SELECT * from tmp;
	-- CREATE TEMPORARY TABLE if not EXISTS tmp1
	-- SELECT max(numOfAttachServer) numOfAttachServer FROM tmp;
	-- SELECT * FROM tmp1;
	-- SELECT tmp.name, tmp.numOfAttachServer FROM tmp
	-- JOIN tmp1 on tmp1.numOfAttachServer= tmp.numOfAttachServer;
	-- SELECT * FROM tmp
	-- WHERE numOfAttachServer in (select max(numOfAttachServer) from tmp);
	CREATE TABLE IF NOT EXISTS mostused AS
		SELECT
			a.name,
			a.id,
			count(
			*) AS amount
		FROM
			attach_service a
			JOIN contract_detail cd ON cd.attach_service_id = a.id
		GROUP BY
			a.name;

SELECT
	m.name,
	amount
FROM
	mostused m
WHERE
	m.amount = (
		SELECT
			max(amount)
		FROM
			mostused);

DROP TABLE mostused;

-- 14.  Hiển thị thông tin tất cả các Dịch vụ đi kèm chỉ mới được sử dụng một lần duy nhất. Thông tin hiển thị bao gồm ma_hop_dong, ten_loai_dich_vu, ten_dich_vu_di_kem, so_lan_su_dung (được tính dựa trên việc count các ma_dich_vu_di_kem).
SELECT
	co.id,
	se. `name`,
	a. `name`,
	count(cd.attach_service_id) amount
FROM
	attach_service a
	JOIN contract_detail cd ON cd.attach_service_id = a.id
	JOIN contract co ON co.id = cd.contract_id
	JOIN service se ON se.id = co.service_id
GROUP BY
	a. `name`
HAVING
	amount = 1;

-- 15.  Hiển thi thông tin của tất cả nhân viên bao gồm ma_nhan_vien, ho_ten, ten_trinh_do, ten_bo_phan, so_dien_thoai, dia_chi mới chỉ lập được tối đa 3 hợp đồng từ năm 2020 đến 2021.
SELECT
	ep.fullname,
	de. `name`,
	dp. `name`,
	ep.phone,
	ep.address,
	count(ep.id) amount
FROM
	employee ep
	JOIN `degree` de ON de.id = ep.degree_id
	JOIN department dp ON dp.id = ep.department_id
	JOIN contract co ON co.empployee_id = ep.id
WHERE
	YEAR(co.start_date) BETWEEN '2020'
	AND '2021'
GROUP BY
	ep.id
HAVING
	amount <= 3;

-- 16.	Xóa những Nhân viên chưa từng lập được hợp đồng nào từ năm 2019 đến năm 2021.
DELETE FROM employee
WHERE id NOT in(
		SELECT
			-- can't specify target table
			tmp.id FROM ( SELECT DISTINCT
					ep.id FROM employee ep
					JOIN contract co ON co.empployee_id = ep.id
				WHERE
					YEAR(co.start_date) BETWEEN 2019 AND 2021) AS tmp);

DELETE FROM employee
WHERE NOT EXISTS (
		SELECT
			*
		FROM
			contract
		WHERE
			empployee_id = employee.id
			AND YEAR(contract.start_date) BETWEEN 2019 AND 2021);

-- 17.	Cập nhật thông tin những khách hàng có ten_loai_khach từ Platinum lên Diamond, chỉ cập nhật những khách hàng đã từng đặt phòng với Tổng Tiền thanh toán trong năm 2021 là lớn hơn 10.000.000 VNĐ
UPDATE
	customer
SET
	customer_type_id = 1
WHERE
	id in(
		SELECT
			tmp.id FROM ( SELECT DISTINCT
					cu.id, sum(se.price + a.price * cd.quantity) AS total_pay FROM customer cu
					JOIN contract co ON co.customer_id = cu.id
					JOIN service se ON se.id = co.service_id
					JOIN contract_detail cd ON cd.contract_id = co.id
					JOIN attach_service a ON a.id = cd.attach_service_id
				WHERE
					cu.customer_type_id = 2
					AND YEAR(co.start_date) = 2021
				GROUP BY
					co.id
				HAVING
					total_pay > 100) AS tmp);