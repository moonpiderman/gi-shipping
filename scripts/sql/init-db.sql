CREATE DATABASE gi_base;
CREATE USER 'gi-owner'@'localhost' IDENTIFIED BY 'gi-owner';
GRANT ALL PRIVILEGES ON gi_base.* TO 'gi-owner'@'localhost';
