create table users(
    id integer not null auto_increment,
    username varchar(255) not null,
    password varchar(255) not null,
    primary key (id)
) engine=InnoDB;