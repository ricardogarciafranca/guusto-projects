CREATE TYPE "JSONB" AS json; 

DROP TABLE IF EXISTS tb_merchant;

CREATE TABLE tb_merchant (
id_merchant SERIAL PRIMARY KEY,
name VARCHAR not null,
locations text not null,
denominations text not null,
website VARCHAR null,
image VARCHAR not null,
country VARCHAR not null);