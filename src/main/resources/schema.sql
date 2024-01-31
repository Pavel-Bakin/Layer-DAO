CREATE TABLE CUSTOMERS
(
    id           SERIAL PRIMARY KEY,
    name         VARCHAR,
    surname      VARCHAR,
    age          INT,
    phone_number VARCHAR
);

insert into CUSTOMERS (name, surname, age, phone_number)
VALUES ('Petya', 'Petrov', '26', '+79426543215');

insert into CUSTOMERS (name, surname, age, phone_number)
VALUES ('Polina', 'Petrova', '33', '+79526822133');

insert into CUSTOMERS (name, surname, age, phone_number)
VALUES ('Pavel', 'Pavlov', '29', '+79117454164');

insert into CUSTOMERS (name, surname, age, phone_number)
VALUES ('Tanya', 'Noskova', '18', '+79618545590');

insert into CUSTOMERS (name, surname, age, phone_number)
VALUES ('Kolya', 'Popov', '40', '+79536543371');

insert into CUSTOMERS (name, surname, age, phone_number)
VALUES ('Katya', 'Katina', '36', '+79996845216');

insert into CUSTOMERS (name, surname, age, phone_number)
VALUES ('Vasya', 'Vasin', '41', '+79960885291');

insert into CUSTOMERS (name, surname, age, phone_number)
VALUES ('Alexey', 'Popovich', '23', '+79012228449');

CREATE TABLE ORDERS
(
    id           SERIAL PRIMARY KEY,
    data         VARCHAR,
    customer_id  INT,
    product_name VARCHAR,
    amount       INT,
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS (id)
);

insert into ORDERS (data, customer_id, product_name, amount)
VALUES ('12-01-2024', '1', 'Potato', '25');

insert into ORDERS (data, customer_id, product_name, amount)
VALUES ('20-12-2023', '2', 'Tomato', '50');

insert into ORDERS (data, customer_id, product_name, amount)
VALUES ('22-12-2023', '3', 'Zucchini', '100');

insert into ORDERS (data, customer_id, product_name, amount)
VALUES ('10-01-2023', '4', 'Cucumber', '70');

insert into ORDERS (data, customer_id, product_name, amount)
VALUES ('29-11-2023', '5', 'Corn', '120');

insert into ORDERS (data, customer_id, product_name, amount)
VALUES ('20-11-2023', '8', 'Greek', '60');