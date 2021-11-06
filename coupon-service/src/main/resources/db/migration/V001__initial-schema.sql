drop table if exists coupon;
drop table if exists product;

create table if not exists product(
id int AUTO_INCREMENT PRIMARY KEY,
name varchar(20) unique,
description varchar(100),
price decimal(8,3)
);

create table if not exists coupon(
id int AUTO_INCREMENT PRIMARY KEY,
code varchar(20) unique,
discount decimal(8,3),
exp_date datetime
);
