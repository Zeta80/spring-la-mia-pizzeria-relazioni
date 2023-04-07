INSERT INTO pizzas (nome, descrizione, prezzo) VALUES('capricciosa', 'roba mista', 16.00);
INSERT INTO pizzas (nome, descrizione, prezzo) VALUES('margherita', 'roba semplice', 10.00);
INSERT INTO pizzas (nome, descrizione, prezzo) VALUES('diavola', 'roba piccantina', 15.00);

INSERT INTO offers (offer_start_date, offer_end_date, offer_name, pizza_id) VALUES('2022-01-01', '2023-02-01', 'offerta uno', 1);
INSERT INTO offers (offer_start_date, offer_end_date, offer_name, pizza_id) VALUES('2023-01-01', '2023-02-01', 'offerta due', 2);
INSERT INTO offers (offer_start_date, offer_end_date, offer_name, pizza_id) VALUES('2023-01-01', '2023-02-01','offerta tre', 3);

INSERT INTO ingredients (name) VALUES('pomodorino');
INSERT INTO ingredients (name) VALUES('mozzarella');
INSERT INTO ingredients (name) VALUES('farina');