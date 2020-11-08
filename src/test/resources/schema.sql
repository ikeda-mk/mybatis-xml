-- MySQL Workbench Forward Engineering



-- -----------------------------------------------------
-- Table `ec`.`country`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `country` (
  `id` INT NOT NULL,
  `country_code` VARCHAR(2) NULL,
  PRIMARY KEY (`id`)
);


-- -----------------------------------------------------
-- Table `customer`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `customer` (
  `id` BIGINT NOT NULL,
  `name` VARCHAR(45) NULL,
  `country_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_customer_country1` FOREIGN KEY (`country_id`) REFERENCES `country` (`id`)
);

CREATE INDEX `fk_customer_country1_idx` ON customer (`country_id`);



-- -----------------------------------------------------
-- Table `order_status`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `order_status` (
  `id` INT NOT NULL,
  `status` VARCHAR(24) NULL,
  `status_name` VARCHAR(24) NULL,
  PRIMARY KEY (`id`),
  UNIQUE INDEX `status_UNIQUE` (`status`),
  UNIQUE INDEX `status_name_UNIQUE` (`status_name`)
);


-- -----------------------------------------------------
-- Table `orders`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `orders` (
  `id` BIGINT NOT NULL,
  `ordered_at` DATETIME NOT NULL,
  `delivered_at` DATETIME NULL,
  `customer_id` BIGINT NOT NULL,
  `order_status_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `fk_order_customer1`
    FOREIGN KEY (`customer_id`)
    REFERENCES `customer` (`id`),
  CONSTRAINT `fk_order_order_status1`
    FOREIGN KEY (`order_status_id`)
    REFERENCES `order_status` (`id`)
);
CREATE INDEX `fk_order_customer1_idx` ON `orders` (`customer_id` ASC);
CREATE INDEX `fk_order_order_status1_idx` ON `orders` (`order_status_id` ASC);



-- -----------------------------------------------------
-- Table `product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `product` (
  `id` BIGINT NOT NULL,
  `name` VARCHAR(64) NULL,
  PRIMARY KEY (`id`)
);


-- -----------------------------------------------------
-- Table `order_has_product`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `order_has_product` (
  `order_id` BIGINT NOT NULL,
  `product_id` BIGINT NOT NULL,
  PRIMARY KEY (`order_id`, `product_id`),
  CONSTRAINT `fk_order_has_product_order1`
    FOREIGN KEY (`order_id`)
    REFERENCES `orders` (`id`),
  CONSTRAINT `fk_order_has_product_product1`
    FOREIGN KEY (`product_id`)
    REFERENCES `product` (`id`)
);

CREATE INDEX `fk_order_has_product_product1_idx` ON `order_has_product` (`product_id` ASC);
CREATE INDEX `fk_order_has_product_order1_idx` ON `order_has_product` (`order_id` ASC);

