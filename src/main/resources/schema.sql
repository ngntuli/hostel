create table if not exists payment (
    id      serial primary key ,
    month   varchar(50),
    amount  bigint
);
