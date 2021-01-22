DROP DATABASE IF exists magazines;
CREATE DATABASE magazines;
use magazines;
create table user(
                     id int not null auto_increment primary key,
                     first_name VARCHAR(120) not null,
                     last_name VARCHAR(120) not null,
                     number_phone int not null,
                     adress VARCHAR(120)
);
create table magazine(
                         id int not null auto_increment primary key,
                         name_magazines VARCHAR(120) not null,
                         description text not null,
                         price double not null
);