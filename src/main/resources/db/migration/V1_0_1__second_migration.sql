CREATE TABLE IF NOT EXISTS `cat` (
    `id` BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    `model` varchar(MAX),
    `year` TIMESTAMP,
    `owner` varchar(2000)
);