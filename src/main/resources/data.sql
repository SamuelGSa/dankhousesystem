CREATE TABLE IF NOT EXISTS product (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    product_code VARCHAR(255) NOT NULL,
    category VARCHAR(255) NOT NULL,
    brand VARCHAR(255) NOT NULL,
    name VARCHAR(255) NOT NULL,
    quantity INT NOT NULL,
    unit_purchase_price DOUBLE NOT NULL,
    unit_sales_price DOUBLE NOT NULL,
    markup DOUBLE
);



---- Inserir dados na tabela product
INSERT INTO product (product_code, category,brand, name,quantity, unit_purchase_price, unit_sales_price, markup)
VALUES
('0011','Seda','ZOMO','Seda ZOMO Loren', 100,16.08,23.90,33.2),
('0012','Seda','ZOMO','batatinha', 100,16.08,23.90,33.2),
('0013','Seda','ZOMO','BATAta', 100,16.08,23.90,33.2),
('0014','Seda','ZOMO','Seda ZOMO Loren', 100,16.08,23.90,33.2),
('0015','Seda','ZOMO','Seda ZOMO Loren', 100,16.08,23.90,33.2),
('0016','Seda','ZOMO','Seda ZOMO Loren', 100,16.08,23.90,33.2),
('0017','Seda','ZOMO','BATATurma', 100,16.08,23.90,33.2);
