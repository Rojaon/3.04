create schema airline;
use airline;

create table customer(
customer_id int auto_increment not null,
customer_name VARCHAR(255),
customer_status VARCHAR(255),
total_customer_mileage int,
PRIMARY KEY (customer_id)
);

create table flight(
flight_id int auto_increment not null,
flight_number VARCHAR(255),
aircraft VARCHAR(255),
total_aircraft_seats int,
flight_mileage int,
PRIMARY KEY (flight_id)
);

create table flight_booking(
booking_id int auto_increment not null,
customer_id int,
flight_id int,
PRIMARY KEY (booking_id),
FOREIGN KEY (customer_id) REFERENCES customer(customer_id),
FOREIGN KEY (flight_id) REFERENCES flight(flight_id)
);

INSERT INTO customer (customer_name,customer_status,total_customer_mileage) VALUES
('Agustine Riviera','Silver',115235),
('Alaina Sepulvida','None',6008),
('Tom Jones','Gold',205767),
('Sam Rio','None',2653),
('Jessica James','Silver',127656),
('Ana Janco','Silver',136773),
('Jennifer Cortez','Gold',300582),
('Christian Janco','Silver',14642);

INSERT INTO flight (flight_number,aircraft,total_aircraft_seats,flight_mileage) VALUES
('DL143','Boeing 747',400,135),
('DL122','Airbus A330',236,4370),
('DL53','Boeing 777',264,2078),
('DL222','Boeing 777',264,1765),
('DL37','Boeing 747',400,531);

INSERT INTO flight_booking (customer_id,flight_id) VALUES
(1,1),
(1,2),
(2,2),
(3,2),
(3,3),
(4,1),
(3,4),
(5,1),
(6,4),
(7,4),
(5,2),
(4,5),
(8,4);

select * from customer;
select * from flight;
select * from flight_booking;

















