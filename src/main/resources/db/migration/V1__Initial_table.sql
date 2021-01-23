create table users(
    id integer not null auto_increment,
    username varchar(255) not null,
    password varchar(255) not null,
    primary key (id)
) engine=InnoDB;
create table tasks (
    id integer not null auto_increment,
    taskdescription varchar(255),
    taskname varchar(255) not null,
    taskcomplete boolean default false,
    user_id integer,
    primary key (id)
) engine=InnoDB;
Insert into users (username,password)
VALUES
("Jan", "Kowalski"),
("Tomasz", "Nowak"),
("Jerzy", "Waszyngton");
INSERT INTO tasks
(taskdescription,taskname,user_id)
VALUES
("", "Wynieś śmieci",1),
("", "Zrób pranie",1),
("Nr 0-700-880-774", "Zadzwoń do dentysty",2),
("", "Wynieś śmieci",2),
("", "Wyprowadź psa",3),
("", "Wynieś śmieci",3);
