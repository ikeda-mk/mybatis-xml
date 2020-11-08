
INSERT INTO `product` (`id`, `name`) VALUES (1, 'windows');
INSERT INTO `product` (`id`, `name`) VALUES (2, 'mac');
INSERT INTO `product` (`id`, `name`) VALUES (3, 'IntelliJ');
INSERT INTO `product` (`id`, `name`) VALUES (4, 'Xcode');
INSERT INTO `product` (`id`, `name`) VALUES (5, 'VSCode');

INSERT INTO `order_status` (`id`, `status`, `status_name`) VALUES (1, 'new', '新規受付');
INSERT INTO `order_status` (`id`, `status`, `status_name`) VALUES (2, 'pay_wait', '入金待ち');
INSERT INTO `order_status` (`id`, `status`, `status_name`) VALUES (3, 'cancel', 'キャンセル');
INSERT INTO `order_status` (`id`, `status`, `status_name`) VALUES (4, 'back_order', '取り寄せ中');
INSERT INTO `order_status` (`id`, `status`, `status_name`) VALUES (5, 'delivered', '発送済み');
INSERT INTO `order_status` (`id`, `status`, `status_name`) VALUES (6, 'pre_end', '入金済み');
INSERT INTO `order_status` (`id`, `status`, `status_name`) VALUES (7, 'pending', '決済処理中');

INSERT INTO `country` (`id`, `country_code`) VALUES (1, 'JP');
INSERT INTO `country` (`id`, `country_code`) VALUES (2, 'US');
INSERT INTO `country` (`id`, `country_code`) VALUES (3, 'CN');
INSERT INTO `country` (`id`, `country_code`) VALUES (4, 'DE');

INSERT INTO `customer` (`id`, `name`, `country_id`) VALUES (1, 'customer1', 2);
INSERT INTO `customer` (`id`, `name`, `country_id`) VALUES (2, 'customer2', 1);
INSERT INTO `customer` (`id`, `name`, `country_id`) VALUES (3, 'customer3', 3);


INSERT INTO `orders` (`id`, `ordered_at`, `delivered_at`, `customer_id`, `order_status_id`) VALUES (1, '2020-09-10 10:10:00', NULL, 1, 2);
INSERT INTO `orders` (`id`, `ordered_at`, `delivered_at`, `customer_id`, `order_status_id`) VALUES (2, '2020-10-01 12:00:00', '2020-10-01 19:00:00', 2, 5);
INSERT INTO `orders` (`id`, `ordered_at`, `delivered_at`, `customer_id`, `order_status_id`) VALUES (3, '2020-10-02 08:00:00', NULL, 2, 1);

INSERT INTO `order_has_product` (`order_id`, `product_id`) VALUES (1, 2);
INSERT INTO `order_has_product` (`order_id`, `product_id`) VALUES (1, 3);
INSERT INTO `order_has_product` (`order_id`, `product_id`) VALUES (2, 1);
INSERT INTO `order_has_product` (`order_id`, `product_id`) VALUES (2, 2);
INSERT INTO `order_has_product` (`order_id`, `product_id`) VALUES (2, 3);
INSERT INTO `order_has_product` (`order_id`, `product_id`) VALUES (3, 2);