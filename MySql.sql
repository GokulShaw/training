use classicmodels;

select customerNumber, customerName, city, state from customers;
SELECT DISTINCT city FROM customers;
SELECT * FROM customers;
SELECT * FROM customers WHERE COUNTRY = 'USA' AND STATE = 'CA';
SELECT * FROM customers WHERE contactFirstName = 'JULIE' OR contactFirstName = 'SUSAN' ;
SELECT * FROM customers order by COUNTRY ASC, STATE DESC;
SELECT * FROM customers order by customerNumber DESC;
SELECT * FROM customers WHERE NOT COUNTRY = 'USA' AND STATE = 'CA';
INSERT INTO customers (customerNumber, customerName, contactLastName, contactFirstName, phone, addressLine1, addressLine2, city, state, postalCode, country, salesRepEmployeeNumber,creditLimit)
 VALUES ('25','GOKUL','SHAWARMA','GOKL','8989898989', 'NO:99','VPK','CHENNAI','TN','600096','INDIA', '8080', '10000');
INSERT INTO employees (employeeNumber,lastName,firstName,extension,email,officeCode,reportsTo,jobTitle) VALUES ('252', 'GKU', 'SHAW','@1010','SHAWARMA@GMAIL.COM','0204','8080', 'TRAINEE');
SELECT * FROM employees;
SELECT * FROM offices;
INSERT INTO offices (officeCode,city,phone,addressLine1,addressLine2,state,country,postalCode,territory) VALUES ('0204','DELHI','8484848484','98','PLPOK STREET', 'KERALA', 'INDIA', '548246', 'A&N ISLAND');
DELETE FROM EMPLOYEES WHERE employeeNumber = '808';
SELECT * FROM EMPLOYEES;
SELECT * FROM customers;