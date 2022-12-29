create table if not exists payment (
    id      serial primary key ,
    paydate  timestamp,
    amount  bigint
);

create table if not exists tenant (
    id      serial primary key ,
    tname varchar(255),
    room int4
);
