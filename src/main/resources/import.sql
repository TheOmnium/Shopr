INSERT INTO `Shopr`.`book` (`type`, `price`, `supplier_id`, `title`, `author`, `isbn`, `pages`, `description`) VALUES ('FICTION', '9.99', '1', 'Animal stage', 'George Orwell', '9781840228038', '100', 'Animal book');
INSERT INTO `Shopr`.`book` (`type`, `price`, `supplier_id`, `title`, `author`, `isbn`, `pages`, `description`) VALUES ('FICTION', '29.99', '1', 'Harry Potter', 'JK Rowling', '9780439136358', '488', 'Prisoner of Azkaban');
INSERT INTO `Shopr`.`book` (`type`, `price`, `supplier_id`, `title`, `author`, `isbn`, `pages`, `book_subject`) VALUES ('NON_FICTION', '12.80', '1', 'How to do nothing', 'Jenny Odell', '978-0709049456', '55', 'DANCE');
INSERT INTO `Shopr`.`book` (`type`, `price`, `supplier_id`, `title`, `author`, `isbn`, `pages`, `book_subject`) VALUES ('NON_FICTION', '29.00', '1', 'After the fall', 'Ben Rhodes', '9781984856050', '299', 'DANCE');


INSERT INTO `Shopr`.`lp` (`price`, `supplier_id`, `title`, `type`, `lp_genre`, `producer`) VALUES ('4.99', '3', 'My beautiful dark twisted fantasy', 'LP', 'HIPHOP', 'Kanye West');
INSERT INTO `Shopr`.`lp` (`price`, `supplier_id`, `title`, `type`, `lp_genre`, `producer`) VALUES ('25.99', '3', 'Invincible', 'LP', 'POP', 'Michael Jackson');
INSERT INTO `Shopr`.`lp` (`price`, `supplier_id`, `title`, `type`, `lp_genre`, `producer`) VALUES ('19.99', '3', 'Elvis is back', 'LP', 'POP', 'Elvis Presley');


INSERT INTO `Shopr`.`game` (`price`, `supplier_id`, `title`, `type`, `game_genre`, `min_age`, `publisher`) VALUES ('39.99', '2', 'Battlefield', 'GAME', 'FPS', '16', 'DICE');
INSERT INTO `Shopr`.`game` (`price`, `supplier_id`, `title`, `type`, `game_genre`, `min_age`, `publisher`) VALUES ('69.99', '2', 'GTA V', 'GAME', 'FPS', '18', 'ROCKSTAR');
INSERT INTO `Shopr`.`game` (`price`, `supplier_id`, `title`, `type`, `game_genre`, `min_age`, `publisher`) VALUES ('29.99', '2', 'FIFA 22', 'GAME', 'FPS', '12', 'EA Sports');

INSERT INTO `Shopr`.`user` (`logged_in`, `user_name`) VALUES (b'0', 'Admin');
INSERT INTO `Shopr`.`user` (`logged_in`, `user_name`) VALUES (b'0', 'Customer1');