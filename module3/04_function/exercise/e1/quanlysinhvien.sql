-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
-- SET GLOBAL sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
select any_value(s.name) as 'subject name',max(s.credit) as credit from subject s;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select any_value(s.name) as 'subject name', max(m.mark) from subject s
join mark m on m.sub_id= s.id;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.name, s.phone, s.address, avg(mark) from student s
join mark m on m.student_id= s.id
group by s.id
ORDER BY avg(mark) DESC;





