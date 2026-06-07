create database pharmacydb;
use pharmacydb;
CREATE TABLE medicine(
    id INT PRIMARY KEY,
    name VARCHAR(50),
    quantity INT,
    price DOUBLE,
    expiry VARCHAR(20)
);
select* from medicine;