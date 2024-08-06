CREATE TABLE IF NOT EXISTS product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    quantity VARCHAR(255) NOT NULL
);



---- Inserir dados na tabela product
INSERT INTO product (name, quantity)
VALUES
('João', 'Silva'),
('Maria', 'Oliveira');