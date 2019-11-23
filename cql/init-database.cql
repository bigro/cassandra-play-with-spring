CREATE KEYSPACE IF NOT EXISTS ks WITH REPLICATION = { 'class': 'SimpleStrategy', 'replication_factor': 1 };

DROP TABLE IF EXISTS ks.users;
DROP TYPE IF EXISTS ks.basic_info;

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
    teams map<int,text>,
    PRIMARY KEY(user_id, name)
);
