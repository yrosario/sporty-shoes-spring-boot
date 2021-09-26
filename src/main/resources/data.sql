
INSERT INTO user(user_name, password, active, roles)
VALUES ("admin", "password", true, "ROLE_ADMIN"),
("test", "test", true, "ROLE_ADMIN");


INSERT INTO customer(first_name, last_name, address, birthday, email)
VALUES("John", "Gomes", "653 Yello Street", "1983-11-01", "jgomes@gmailc.om"),
("Matis", "Irvin", "33 Boston Street", "1992-09-04", "mirvin@gmail.com"),
("Marry", "Gomes", "653 Yello Street", "1981-02-09", "mgomes@gmail.com"),
("Thomas", "Wark", "653 Washington street", "1963-03-27", "twark@aol.com"),
("Thomas", "Jefferson", "124 Harrion Ave", "1967-09-23", "mirvin@gmail.com"),
("Michael", "Jorda", "89 Oak Road", "1963-11-11", "mjordan@aol.com"),
("Jennifer", "Baez", "2313 Lafayette Ave", "2001-02-15", "jbaez@gmail.com"),
("Sussan", "Lally", "78 Tremont", "1956-09-04", "slally@mail.com"),
("Jill", "Abraham", "823 Blue Hill", "1934-02-09", "jabraham@gmail.com"),
("Lewis", "Walker", "823 Apple Street", "1909-02-11", "lwalker@mail.com"),
("Rose", "Marry", "33 Orenge Ave", "1999-09-27", "rmary@mail.com"),
("Joe", "Mop", "653 Sesame Street", "2008-08-08", "jmop@mail.com");


INSERT INTO product(name, gender, category, brand, size, price, qty)
VALUES("Trail Blazers", "M", "trail-shoes", "Nike", 12, 80, 56),
("Trail Blazers", "F", "trail-shoes", "Nike", 7, 60, 45),
("Air runners", "F", "Cross Trainers", "Nike", 5, 90, 156),
("Air runners", "M", "trail-shoes", "Nike", 10, 56, 45),
("Air Jordans", "F", "cour-shoes", "Nike", 6, 180, 45),
("Air Jordans", "M", "cour-shoes", "Nike", 11.5, 200, 143),
("Soccer cleats", "F", "cleats", "Addidas", 6.5, 60, 500),
("Soccer cleats", "M", "cleats", "Puma", 5.5, 30, 90),
("Baseball cleats", "M", "cleats", "Rebook", 8.5, 45, 500),
("Baseball cleats", "F", "cleats", "Rebook", 5.5, 50, 500),
("Mountain climbers", "F", "mountain-shoes", "La Spirtuva", 10, 109, 400),
("Mountain climbers", "F", "mountain-shoes", "La Spirtuva", 8.5, 150, 500);


INSERT INTO receipt(cost, customer_id)
VALUES(500, 4),
(300, 5),
(100, 6),
(104, 12);

INSERT INTO line_order_item(order_id, product_id, purchased_date)
VALUES(1, 1, Now()),
(1, 4, Now()),
(1, 5, Now()),
(1, 5, Now()),
(2, 6, Now()),
(2, 7, Now()),
(2, 8, Now()),
(3, 3, Now()),
(3, 10, Now()),
(3, 9, Now()),
(2, 7, Now()),
(2, 8, "2021-07-21"),
(3, 3, "2021-07-21"),
(3, 10, "2021-07-21"),
(3, 9, "2021-07-21"),
(2, 8, "2021-07-20"),
(3, 3, "2021-07-20"),
(3, 10, "2021-07-20"),
(3, 9, "2021-07-20");


