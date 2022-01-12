DROP TABLE IF EXISTS tb_merchant;

CREATE TABLE tb_merchant (
id_merchant SERIAL PRIMARY KEY,
name VARCHAR not null,
locations jsonb not null,
denominations jsonb not null,
website VARCHAR null,
image VARCHAR not null,
country VARCHAR not null);

INSERT INTO tb_merchant (id_merchant, name, locations, denominations, website, image, country) 
VALUES ((SELECT nextval('tb_merchant_id_merchant_seq')), 'Amazon', '["In-store", "Online"]', 
'[5, 1000]', 'https://www.amazon.ca/', 'http://images.guusto.com/guusto/img/116.png', 'CAN');

INSERT INTO tb_merchant (id_merchant, name, locations, denominations, website, image, country) 
VALUES ((SELECT nextval('tb_merchant_id_merchant_seq')), 'Airbnb', '["In-store", "Online"]', 
'[25, 500]', 'https://www.airbnb.com/', 'http://images.guusto.com/guusto/img/212.png', 'USA');