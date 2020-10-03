CREATE TABLE IF NOT EXISTS `book` (
    `id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `name` varchar(MAX),
    `annotation` varchar(MAX),
    `author` varchar(2000),
    `year` varchar(1000),
    `isbn` varchar(200)
);
insert into book values(1, 'The Tartar Steppe', 'Cooking book', 'Sancho M.T Lopes', '2002', 'ISDF-23435');