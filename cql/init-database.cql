CREATE KEYSPACE IF NOT EXISTS ks WITH REPLICATION = { 'class': 'SimpleStrategy', 'replication_factor': 1 };

DROP TABLE ks.users;
DROP TYPE ks.basic_info;

CREATE TYPE ks.basic_info (
    birthday date,
    nationality text,
    weight int,
    height int
);

CREATE TABLE ks.users (
    user_id uuid,
    name text,
    strength int,
    personal_info basic_info,
    PRIMARY KEY(user_id, name)
);