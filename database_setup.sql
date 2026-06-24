CREATE DATABASE IF NOT EXISTS school_db;
USE school_db;

CREATE TABLE IF NOT EXISTS students (
    student_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    course VARCHAR(50) NOT NULL
);


INSERT INTO students (name, email, course) VALUES 
('Rahul Sharma', 'rahul@example.com', 'Computer Science'),
('Priya Das', 'priya@example.com', 'Information Technology'),
('Bishal Keora', 'bishal@example.com', 'Mechanical Engineering'),
('Prithwiraj Dubey', 'prithwiraj@example.com', 'Electrical Engineering'),
('Manas Majee', 'manas@example.com', 'Civil Engineering');
