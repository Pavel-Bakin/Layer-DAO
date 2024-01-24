CREATE TABLE CUSTOMERS
(
    id           SERIAL PRIMARY KEY,
    name         VARCHAR,
    surname      VARCHAR,
    age          INT,
    phone_number VARCHAR
);

CREATE TABLE ORDERS
(
    id           SERIAL PRIMARY KEY,
    data         VARCHAR,
    customer_id  INT,
    product_name VARCHAR,
    amount       INT,
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS (id)
);