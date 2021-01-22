create table tasks(
    id integer not null auto_increment,
    taskname varchar(255) not null,
    taskdescription varchar(255),
    userid integer not null,
    primary key (id),
    foreign key (userid) references users(id)
) engine=InnoDB;
