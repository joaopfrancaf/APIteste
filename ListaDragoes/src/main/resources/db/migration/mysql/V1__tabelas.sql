DROP TABLE IF EXISTS dragao;

CREATE TABLE dragao (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  career VARCHAR(250)
);

INSERT INTO billionaires (first_name, last_name) VALUES
  ('lolzin', 'wyvern'),
  ('Bill', 'Gates'),
  ('Folrunsho', 'Alakija');