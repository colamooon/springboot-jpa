CREATE USER 'colamoon'@'%' IDENTIFIED WITH mysql_native_password BY 'colamoonwas@!local';
CREATE DATABASE cola;

GRANT ALL ON cola.* TO 'colamoon'@'%';

FLUSH PRIVILEGES;
