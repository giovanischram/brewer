CREATE TABLE `style` (
  `id` bigint(20) PRIMARY KEY AUTO_INCREMENT,
  `name` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `beer` (
    `id` BIGINT(20) PRIMARY KEY AUTO_INCREMENT,
    `sku` VARCHAR(50) NOT NULL,
    `name` VARCHAR(80) NOT NULL,
    `description` TEXT NOT NULL,
    `amount` DECIMAL(10, 2) NOT NULL,
    `alcoholicContent` DECIMAL(10, 2) NOT NULL,
    `commission` DECIMAL(10, 2) NOT NULL,
    `stock` int(11) NOT NULL,
    `flavor` VARCHAR(50) NOT NULL,
    `origin` VARCHAR(50) NOT NULL,
    `styleid` BIGINT(20) NOT NULL,
    FOREIGN KEY (styleid) REFERENCES style(id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

INSERT INTO style VALUES (id, 'Amber Lager');
INSERT INTO style VALUES (id, 'Dark Lager');
INSERT INTO style VALUES (id, 'Pale Lager');
INSERT INTO style VALUES (id, 'Pilsner');
