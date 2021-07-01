




CREATE TABLE Customers ( 
    CustomerID int, 
    CustomerName varchar(52), 
    ContactName varchar(32), 
    Address varchar(255), 
    City varchar(50), 
    PostalCode varchar(20), 
    Country varchar(20) 
);

CREATE DATABASE activities 
 
 









CREATE TABLE Customer ( 
    CustomerID int, 
    CustomerName varchar(52), 
    ContactName varchar(32), 
    Address varchar(255), 
    City varchar(50), 
    PostalCode varchar(20), 
    Country varchar(20) 
);

Drop table Customer;




CREATE TABLE Customer ( 
    CustomerID int, 
    CustomerName varchar(52), 
    ContactName varchar(32), 
    Address varchar(255), 
    City varchar(50), 
    PostalCode varchar(20), 
    Country varchar(20) 
);






CREATE TABLE salesman( 
salesman_id int, 
salesman_name varchar2(20), 
salesman_city varchar2(20), 
commision int);

desc salesman


describe salesman



INSERT INTO salesman 
VALUES (5001, 'james hoog', 'newyork', 15);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
SELECT 1 FROM DUAL;

SELECT * FROM salesman;

ALTER TABLE Salesman 
ADD DateOfBirth date;

SELECT * FROM salesman;



UPDATE salesman 
SET salesman_name='Juan' 
WHERE salesman_city='Paris';

SELECT * FROM salesman;

DELETE FROM salesman WHERE salesman_name='Juan';

SELECT * FROM salesman;

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

SELECT * FROM salesman 
ORDER BY salesman_name;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

 INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select order_no from orders 
order by order_date;

select  distinct salesman_id from orders;

select order_no from orders 
order by purchase_amount desc;

